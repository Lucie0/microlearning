package cz.mendelu.pef.microlearning.ui.screens.question

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import cz.mendelu.pef.microlearning.R
import cz.mendelu.pef.microlearning.architecture.BaseViewModel
import cz.mendelu.pef.microlearning.architecture.CommunicationResult
import cz.mendelu.pef.microlearning.communication.api.IRemoteRepository
import cz.mendelu.pef.microlearning.communication.api.NetworkInterceptor
import cz.mendelu.pef.microlearning.model.Modes
import cz.mendelu.pef.microlearning.model.TestState
import cz.mendelu.pef.microlearning.model.api.Question
import cz.mendelu.pef.microlearning.model.UiState
import cz.mendelu.pef.microlearning.model.actualNodeInGraph
import cz.mendelu.pef.microlearning.model.graph
import cz.mendelu.pef.microlearning.model.lessonsToStudy
import cz.mendelu.pef.microlearning.model.mode
import cz.mendelu.pef.microlearning.model.response.ArrayResponse
import cz.mendelu.pef.microlearning.model.todoNodes
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject
import kotlin.random.Random

@HiltViewModel
class QuestionScreenVM @Inject constructor(
    private val remoteRepository: IRemoteRepository
) : BaseViewModel() {

    // uistate
    val uiState: MutableState<UiState<QuestionScreenData, QuestionsErrors>> =
        mutableStateOf(UiState())

    var lessonId = -1L
    var nodeId = -1L

    var testState: TestState = TestState.NOT_EVALUATED
    var data: QuestionScreenData = QuestionScreenData()

    // mutable state kvuli radiobuttonu -- jinak se pri rekompozici zapomene :)
//    val selectedOption = mutableStateOf("")

    // selectedOptions = hashmap[zneniOtazky] = vybranaOdpoved
    // selectedOptions = hashmap[question_id.option_group_id] = vybranaOdpoved
    var selectedOptions = hashMapOf<String, String>()

    // correctOptions = hashmap[zneniOtazky] = spravnaOdpoved
    // correctOptions = hashmap[question_id.option_group_id] = spravnaOdpoved
    var correctOptions = hashMapOf<String, String>()

    // app context -- nemam
    // suspend fce
    fun getData(dispatcher: CoroutineDispatcher = Dispatchers.IO) {
        if (NetworkInterceptor.isNetworkConnected()) {
//        getQuestions()
            if (mode.value == Modes.Testing.name || mode.value == Modes.Tuition.name) {
                getQuestionsByLessonIdsTestingMode(dispatcher)
            }
//            else { // to je revision mode, kde se nemaji co stahovat otazky prece...?
//                getQuestionsByLessonId()
//            }
        } else {
            println("Network not connected")
            uiState.value = UiState(
                loading = false,
                data = null,
                errors = QuestionsErrors(R.string.network_is_not_connected) // "communication error" resource code
            )
        }
    }

    // neni suspend
    fun isTestCorrect(): Boolean {
        // otazky CLOZE -- ukladam je s pomocnymi cisilky, tak je pak podle toho musim vyhodnocovat
        //{Seřaďte podle pořadí vyhodnocování: [1]=Závorky, Vyřešte výraz: 9 / 3 × (2 - 1)² - 4 = ...=-1,  [2]=Mocniny a odmocniny, Jakou operaci vyhodnocujeme jako poslední v matematickém výrazu?=Sčítání a odčítání, Jakou operaci vyhodnocujeme po závorkách?=Mocniny a odmocniny, Vyřešte výraz:  (8 / 2) × (4 - 2)² = ...=16,  [3]=Násobení a dělení, Jakou operaci vyhodnocujeme jako první v matematickém výrazu?=Závorky, Vyřešte výraz: 8 / 4 × 2² - 4 = ...=4,  [4]=Sčítání a odčítání, Vyřešte výraz:  5 × 6 / 2 - 8 ²/ 4 = ...=-1}

        // Pokud už byl test vyhodnocen, vrať uložený výsledek
        if (testState != TestState.NOT_EVALUATED) {
            return testState == TestState.PASSED
        }

        // Vyhodnocení výsledků
        val results = correctOptions.map { (key, correctValue) ->
            selectedOptions[key] == correctValue
        }

        println("correctOpt: $correctOptions")
        println("selectedOpt: $selectedOptions")
        println("results: $results")

        val countOfCorrect = results.count { it }
        val countOfIncorrect = results.size - countOfCorrect

        val isOk = countOfIncorrect == 0 && countOfCorrect > 0

        // Uložení stavu testu
        testState = if (isOk) TestState.PASSED else TestState.FAILED

        // ---------------------------------
        // Zápis do grafu (Testing / Tuition)
        // ---------------------------------
        if (mode.value == Modes.Testing.name || mode.value == Modes.Tuition.name) {

            val node = graph.map[nodeId]

            if (node != null) {
                node.countOfCorrectAnswers += countOfCorrect
                node.countOfIncorrectAnswers += countOfIncorrect
                node.walkThrough = true
                node.successfullyCompleted = isOk
                graph.map[nodeId] = node

                println("Graph[$nodeId]:$node")

                // Pokud jsme v Tuition a student neuspěl -> přidat jeho předchůdce
                if (mode.value == Modes.Tuition.name && !isOk) {
                    val previousNodes = graph.map[actualNodeInGraph]?.previousNodesIds ?: emptyList()
                    lessonsToStudy.addAll(previousNodes)
                    println("VM, lessonsToStudy:$lessonsToStudy")
                }
            }
        }

        return isOk
    }

    fun correctAnswers(): List<String> {
        return correctOptions.filter { (k, v) -> selectedOptions[k] != v }.keys.toList()
    }

    // neni suspend
    // graph.previousNodeIds, todonodes, actualNodeInGraph
    fun getNextNodeId(): Long {
        // pokud jsou nejaci predci uzlu, pridej je vsechny do todoNodes, odstran prvni a ten predej
        // jinak vrat -1

        val ids = graph.map[actualNodeInGraph]?.previousNodesIds ?: return -1L
//        var nextNodeId = -1L

        if (ids.isNotEmpty()) {
            todoNodes.addAll(ids)
            val nextNodeId = todoNodes.first()
            todoNodes.remove(nextNodeId)

//            println("todoNodes:$todoNodes")
//            println("ids:$ids")

            return nextNodeId
        } else {
//            println("todoNodes:$todoNodes")
            return -1L
        }
    }

    fun answerKey(questionId: Long, group: Int = 0) =
        "${questionId}.$group"

    fun getSelected(
        questionId: Long,
        group: Int
    ): String {
        return selectedOptions[answerKey(questionId, group)] ?: ""
    }

    fun setSelected(
        questionId: Long,
        group: Int,
        value: String
    ) {
        selectedOptions[answerKey(questionId, group)] = value
    }

    /*
    fun isTestCorrect(): Boolean {
        // otazky CLOZE -- ukladam je s pomocnymi cisilky, tak je pak podle toho musim vyhodnocovat
        //{Seřaďte podle pořadí vyhodnocování: [1]=Závorky, Vyřešte výraz: 9 / 3 × (2 - 1)² - 4 = ...=-1,  [2]=Mocniny a odmocniny, Jakou operaci vyhodnocujeme jako poslední v matematickém výrazu?=Sčítání a odčítání, Jakou operaci vyhodnocujeme po závorkách?=Mocniny a odmocniny, Vyřešte výraz:  (8 / 2) × (4 - 2)² = ...=16,  [3]=Násobení a dělení, Jakou operaci vyhodnocujeme jako první v matematickém výrazu?=Závorky, Vyřešte výraz: 8 / 4 × 2² - 4 = ...=4,  [4]=Sčítání a odčítání, Vyřešte výraz:  5 × 6 / 2 - 8 ²/ 4 = ...=-1}
        if (testOk == 0) {
            var isOk = true
            testOk = 1
            var countOfCorrect = 0
            var countOfIncorrect = 0
//        println("* IsTestCorrect()")
//        println(correctOptions)
//        println(selectedOptions)
            correctOptions.keys.forEach { key ->
                if (selectedOptions[key] != correctOptions[key]) {
                    countOfIncorrect += 1
                    isOk = false
                    testOk = -1
                } else countOfCorrect += 1
            }

            if (mode.value == Modes.Testing.name || mode.value == Modes.Tuition.name) {
                // zapsat do graphu
                graph.map[nodeId]?.countOfCorrectAnswers =
                    (graph.map[nodeId]?.countOfCorrectAnswers ?: 0) + countOfCorrect
                graph.map[nodeId]?.countOfIncorrectAnswers =
                    (graph.map[nodeId]?.countOfIncorrectAnswers ?: 0) + countOfIncorrect
                graph.map[nodeId]?.walkThrough = true
                graph.map[nodeId]?.successfullyCompleted = isOk && countOfCorrect != 0
                println("Graph[$nodeId]:${graph.map[nodeId]}")

                if (mode.value == Modes.Tuition.name && !isOk) {
//            graph.map[nodeId]?.previousNodesIds?.let { lessonsToStudy.addAll(it) }
                    // pridej do seznamu lekce k dostudovani
                    lessonsToStudy.addAll(graph.map[actualNodeInGraph]?.previousNodesIds!!)
                    println("VM, lessonsToStudy:$lessonsToStudy")
                }
            }

            return isOk && countOfCorrect != 0
        } else return testOk == 1
    }
    */

    // neni suspend
    // data questionsList
    private fun reduceQuestions(){
        val listArrayResponses = mutableListOf<Question>()

        data.questionsList.forEach{
            val arrayResponse = it.items!!.toMutableList()

            while (arrayResponse.size > 3) {
                arrayResponse.removeAt(Random.nextInt(0,arrayResponse.size - 1))
            }
            listArrayResponses.addAll(arrayResponse)//, arrayResponse.size, it.version))
        }

        data.questions = ArrayResponse(listArrayResponses, listArrayResponses.size, 1)

        println("listArrayResponses:$listArrayResponses")
//        data.questions?.items = data.questionsList[0].items
    }

    // suspend do remote repo
    private fun getQuestionsByLessonIdsTestingMode(dispatcher: CoroutineDispatcher) {
//        // aktualni node -- jeho prechoduci -- pro kazdy
//        println("Graph:${graph}")
        var count = graph.map[nodeId]?.previousNodesIds?.size ?: 0
//        println("count previousNodesIds:$count")
//        println("Graph[102]:${graph.map[102]?.previousNodesIds}")

        if (count > 0) {
            graph.map[nodeId]?.previousNodesIds?.forEach { id ->
                println("nodeID:$id")
                if (graph.map[id] != null && graph.map[id]!!.lessonId != null) {
//                    println("!!!" + graph.map[id])
                    launch {
                        val result = withContext(dispatcher) {
                            remoteRepository.getQuestionsByLessonId(graph.map[id]!!.lessonId!!)
                        }

                        when (result) {
                            is CommunicationResult.Success -> {
                                if (result.data.items != null) {
//                                data.items.addAll(result.data.items)
                                    data.questionsList.addAll(listOf(result.data))
                                    count -= 1
                                    println("count:$count")

                                    if (count == 0) {
                                        reduceQuestions()
                                    }
                                    uiState.value = UiState(
                                        loading = false,
                                        data = data,
                                        errors = null
                                    )
                                } else {
                                    uiState.value = UiState(
                                        loading = false,
                                        data = null,
                                        errors = QuestionsErrors(R.string.no_data) // "exception" resource code
                                    )
                                }
                            }

                            else -> {
                                println("Result:$result")
                            }

//                        is CommunicationResult.ConnectionError -> TODO()
//                        is CommunicationResult.Error -> TODO()
//                        is CommunicationResult.Exception -> TODO()
                        }

                    }
                } else {
                    println(" --------- ERROR: Neexistuje map[id] nebo map[id].lessonId -------------")
                }
            }
        } else {
            uiState.value = UiState(
                loading = false,
                data = null,
                errors = QuestionsErrors(R.string.no_testing_questions_for_this_domain)
            )
        }
    }

    // suspend fce do remote repo
    private fun getQuestionsByLessonId(dispatcher: CoroutineDispatcher) {
        if (lessonId != -1L) {
            launch {
                val result = withContext(dispatcher) {
                    remoteRepository.getQuestionsByLessonId(lessonId)
                }
                when (result) {
                    is CommunicationResult.ConnectionError -> {
                        uiState.value = UiState(
                            loading = false,
                            data = null,
                            errors = QuestionsErrors(R.string.communication_error) // "communication error" resource code
                        )
                    }

                    is CommunicationResult.Error -> {
                        println(result.error)
                        when (result.error.code) {
                            500 -> {
                                uiState.value = UiState(
                                    loading = false,
                                    data = null,
                                    errors = QuestionsErrors(R.string.some_unexpected_error) // "exception" resource code
                                )
                            }

                            404 -> {
                                uiState.value = UiState(
                                    loading = false,
                                    data = null,
                                    errors = QuestionsErrors(R.string.not_found) // "not found" resource code
                                )
                            }

                            else -> {
                                uiState.value = UiState(
                                    loading = false,
                                    data = null,
                                    errors = QuestionsErrors(R.string.something_went_wrong_please_reload_screen)
                                )
                                println(result.error.message)
                            }
                        }
                    }

                    is CommunicationResult.Exception -> {
                        uiState.value = UiState(
                            loading = false,
                            data = null,
                            errors = QuestionsErrors(R.string.unknown_error) // "exception" resource code
                        )
                    }

                    is CommunicationResult.Success -> {
                        if (result.data.items != null) {
                            data.questions = result.data
                            uiState.value = UiState(
                                loading = false,
                                data = data,
                                errors = null
                            )
                        } else {
                            uiState.value = UiState(
                                loading = false,
                                data = null,
                                errors = QuestionsErrors(R.string.no_data) // "exception" resource code
                            )
                        }
                    }
                }
            }
        }
    }

    private fun getNodeIdToContinue(actualNodeId: Long): Long {
        val previous = graph.map[actualNodeId]?.previousNodesIds

        if (previous?.size!! > 0) {
            // pokud jsou rodice
            todoNodes.addAll(previous.subList(1, previous.size - 1))
            // vrat prvniho na rada
            return previous[0]
        } else {
            // pokuid nejsou rodicovske uzly
            // projit todoNodes, jestli je prazdny
            if (todoNodes.size > 0) {
                // kdyz neni, vyber prvni v seznamu, odstran ho a vrat jako navratovou hodnotu
                val item = todoNodes.iterator().next()
                todoNodes.remove(item)
                return item
            } else {
                // kdyz je todoNodes prazdny
                // dosazeno prvniho nodu
                // todo predelat, vracet nejake presmerovani jinam
                return actualNodeId
            }
        }
    }

//    fun correctAnswers(): List<String> {
//        val list = mutableListOf<String>()
//
//        correctOptions.keys.forEach { key ->
//            if (selectedOptions[key] != correctOptions[key]) {
//                println(correctOptions[key])
//                list.add(key) //= string + questionText + " " + correctOptions[questionText] + ",\n"
//            }
//        }
//        println("list:$list")
//        return list
//    }
}
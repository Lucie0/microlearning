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
import cz.mendelu.pef.microlearning.model.UiState
import cz.mendelu.pef.microlearning.model.actualNodeInGraph
import cz.mendelu.pef.microlearning.model.api.Node
import cz.mendelu.pef.microlearning.model.api.Question
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
            if (mode.value == Modes.TESTING.ordinal || mode.value == Modes.TUITION.ordinal) {
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
        if (mode.value == Modes.TESTING.ordinal || mode.value == Modes.TUITION.ordinal) {

            val node = graph.map[nodeId]

            if (node != null) {
                node.countOfCorrectAnswers += countOfCorrect
                node.countOfIncorrectAnswers += countOfIncorrect
                node.walkThrough = true
                node.successfullyCompleted = isOk
                graph.map[nodeId] = node

                println("Graph[$nodeId]:$node")

                // Pokud jsme v Tuition a student neuspěl -> přidat jeho předchůdce
                if (mode.value == Modes.TUITION.ordinal && !isOk) {
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

        val ids = graph.map[actualNodeInGraph]?.previousNodesIds?.filter { graph.map[it]?.walkThrough == false } ?: listOf()
        var nextNodeId: Long

        if (ids.isNotEmpty()) {
//            todoNodes.addAll(ids)
//            nextNodeId = todoNodes.first()

            // vybrat jednoho rodice
            nextNodeId = ids.first()

            // ostatni rodice pridat do todoNodes -- pridat ale pouze ty, ktere nejsou jiz projite
            todoNodes.addAll(ids)
            todoNodes.remove(nextNodeId) // bez toho vybraneho rodice

            // pokud je nextNode Id korenovy uzel
            // tak jit na nejstarsiho rodice
            // a pak vvv
            // todo return nextNodeId

//            println("todoNodes:$todoNodes")

            // pokud je ordinal number 0 (cili je to korenovy uzel) a je jeste v todoNodes nejaky dalsi node, tak pokracuj na ten dalsi uzel
            if (graph.map[nextNodeId]?.lessonOrdinalNumber != null && graph.map[nextNodeId]?.lessonOrdinalNumber == 0 && todoNodes.size > 0) {
//                println("todoNodes:$todoNodes")

                nextNodeId = todoNodes.first()
                todoNodes.remove(nextNodeId)

            } // jinak se zobrazi tento node, a tim nebudou otazky a jde z testu jen odejit
            else if (graph.map[nextNodeId]?.lessonOrdinalNumber != null && graph.map[nextNodeId]?.lessonOrdinalNumber == 0) {
//                println("todoNodes:$todoNodes")

                nextNodeId = -1
            } else {
//                todoNodes.remove(nextNodeId)
            }

//            println("todoNodes:$todoNodes")
//            println("ids:$ids")

            return nextNodeId
        } else if (todoNodes.isNotEmpty()){
//            println("todoNodes:$todoNodes")

            nextNodeId = todoNodes.first()
            todoNodes.remove(nextNodeId)

            return nextNodeId

        } else {
            println("nejsou rodicove uzlu")
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

        data.questionsList.forEach {
            val arrayResponse = it.items!!.toMutableList()

            while (arrayResponse.size > 3) {
                arrayResponse.removeAt(Random.nextInt(0,arrayResponse.size - 1))
            }
            listArrayResponses.addAll(arrayResponse)//, arrayResponse.size, it.version))
        }

        data.questions = ArrayResponse(listArrayResponses, listArrayResponses.size, 1)

        println("listArrayResponses:${listArrayResponses.map { it1 -> it1.options.items?.filter { it.correctAnswer == true } } }}")
//        data.questions?.items = data.questionsList[0].items
    }

    fun getNextLessonToStudy(): Node? {
        println("test neni ok")
        println("LessonToStudy:$lessonsToStudy")
        // test neni OK

        //  1. zobrazit vsechny lekce (ted jen prvni, ostatni se musi zacyklit v lessonScreene)
        //     predku ,
        //todo     tzn. pridat tyto vsechny lekce to __lessonsToStudy__
        graph.map[actualNodeInGraph]?.previousNodesIds?.forEach { nId ->
            if (graph.map[nId] != null && graph.map[nId]!!.lessonId != null) {
                lessonsToStudy.add(graph.map[nId]!!.lessonId!!)
            }
        }
        println("LessonToStudy:$lessonsToStudy")

        //  2. pak se budu zase snazit o vstup do uzlu (po lekcich navigovani na
        //     Pretest -> rozhodnuti -> lekce),
        //todo      tzn. pridat vsechny tyto uzly do __todoNodes__
        todoNodes.addAll(
            graph.map[actualNodeInGraph]?.previousNodesIds
                ?: listOf()
        )

        //  todo 3. navigovat do lekce (radeji osetrit, ze lessonsToStudy neni prazdny, ale to jen, aby to nespadlo)
        val lId = lessonsToStudy.iterator().next()
        lessonsToStudy.remove(lId)


        return graph.map.values
            .firstOrNull { it.lessonId == lId }
    }

    // suspend do remote repo
    private fun getQuestionsByLessonIdsTestingMode(dispatcher: CoroutineDispatcher) {
//        // aktualni node -- jeho predchudci -- pro kazdy stahnout otazky
//        println("Graph:${graph}")
        var count = graph.map[nodeId]?.previousNodesIds?.size ?: 0
        println("count previousNodesIds:$count")
        println("Graph[$nodeId]:${graph.map[nodeId]?.previousNodesIds}")

        if (count > 0) {
            graph.map[nodeId]?.previousNodesIds?.forEach { id ->
                println("nodeID:$id")
                println("lessonId:${graph.map[id]!!.lessonId}")

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

                                    // jakmile jsou stazeny otazky ze vsech uzlu
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
                        }
                    }
                } else {
                    println(" --------- ERROR: Neexistuje map[id] nebo map[id].lessonId -------------")
                    uiState.value = UiState(
                        loading = false,
                        data = null,
                        errors = QuestionsErrors(R.string.not_found)
                    )
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
}
package cz.mendelu.pef.microlearning.ui.screens.question

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import cz.mendelu.pef.microlearning.R
import cz.mendelu.pef.microlearning.architecture.BaseViewModel
import cz.mendelu.pef.microlearning.architecture.CommunicationResult
import cz.mendelu.pef.microlearning.communication.api.NetworkInterceptor
import cz.mendelu.pef.microlearning.communication.api.RemoteRepositoryImpl
import cz.mendelu.pef.microlearning.model.Modes
import cz.mendelu.pef.microlearning.model.api.Question
import cz.mendelu.pef.microlearning.model.UiState
import cz.mendelu.pef.microlearning.model.actualNodeInGraph
import cz.mendelu.pef.microlearning.model.graph
import cz.mendelu.pef.microlearning.model.lessonsToStudy
import cz.mendelu.pef.microlearning.model.mode
import cz.mendelu.pef.microlearning.model.response.ArrayResponse
import cz.mendelu.pef.microlearning.model.todoNodes
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject
import kotlin.random.Random

@HiltViewModel
class QuestionScreenVM @Inject constructor(
    private val remoteRepository: RemoteRepositoryImpl
) : BaseViewModel() {

    // uistate
    val uiState: MutableState<UiState<QuestionScreenData, QuestionsErrors>> =
        mutableStateOf(UiState())
    var lessonId = -1L
    var nodeId = -1L

    //
    var data: QuestionScreenData = QuestionScreenData()

    // mutable state kvuli radiobuttonu -- jinak se pri rekompozici zapomene :)
    val selectedOption = mutableStateOf("")

    // selectedOptions = hashmap[zneniOtazky] = vybranaOdpoved    
    // selectedOptions = hashmap[question_id.option_group_id] = vybranaOdpoved
    val selectedOptions = hashMapOf<String, String>()

    // correctOptions = hashmap[zneniOtazky] = spravnaOdpoved
    // correctOptions = hashmap[question_id.option_group_id] = spravnaOdpoved
    val correctOptions = hashMapOf<String, String>()

    init {
        if (NetworkInterceptor.isNetworkConnected()) {
//        getQuestions()
        } else {
            println("Network not connected")
            uiState.value = UiState(
                loading = false,
                data = null,
                errors = QuestionsErrors(R.string.network_is_not_connected) // "communication error" resource code
            )
        }
    }

    fun getData() {
        if (mode.value == Modes.TESTING.name || mode.value == Modes.TUITION.name) {
            getQuestionsByLessonIdsTestingMode()
        } else {
            getQuestionsByLessonId()
        }
    }

    fun isTestCorrect(): Boolean {
        // otazky CLOZE -- ukladam je s pomocnymi cisilky, tak je pak podle toho musim vyhodnocovat
        //{Seřaďte podle pořadí vyhodnocování: [1]=Závorky, Vyřešte výraz: 9 / 3 × (2 - 1)² - 4 = ...=-1,  [2]=Mocniny a odmocniny, Jakou operaci vyhodnocujeme jako poslední v matematickém výrazu?=Sčítání a odčítání, Jakou operaci vyhodnocujeme po závorkách?=Mocniny a odmocniny, Vyřešte výraz:  (8 / 2) × (4 - 2)² = ...=16,  [3]=Násobení a dělení, Jakou operaci vyhodnocujeme jako první v matematickém výrazu?=Závorky, Vyřešte výraz: 8 / 4 × 2² - 4 = ...=4,  [4]=Sčítání a odčítání, Vyřešte výraz:  5 × 6 / 2 - 8 ²/ 4 = ...=-1}
        var isOk = true
        var countOfCorrect = 0
        var countOfIncorrect = 0
//        println("* IsTestCorrect()")
//        println(correctOptions)
//        println(selectedOptions)
        correctOptions.keys.forEach { key ->
            if (selectedOptions[key] != correctOptions[key]) {
                countOfIncorrect += 1
                isOk = false
            } else countOfCorrect += 1
        }

        if (mode.value == Modes.TESTING.name) {
            // zapsat do graphu
            graph.map[nodeId]?.countOfCorrectAnswers = (graph.map[nodeId]?.countOfCorrectAnswers ?: 0) + countOfCorrect
            graph.map[nodeId]?.countOfIncorrectAnswers = (graph.map[nodeId]?.countOfIncorrectAnswers ?: 0) + countOfIncorrect
            graph.map[nodeId]?.walkThrough = true
            graph.map[nodeId]?.successfullyCompleted = isOk && countOfCorrect != 0
            println("Graph[$nodeId]:${graph.map[nodeId]}")
        } else if (mode.value == Modes.TUITION.name){
            graph.map[nodeId]?.previousNodesIds?.let { lessonsToStudy.addAll(it) }
        }

        return isOk && countOfCorrect != 0
    }

    fun getNodeIdToContinue(actualNodeId: Long): Long {
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
                return todoNodes.removeAt(0)
            } else {
                // kdyz je todoNodes prazdny
                // dosazeno prvniho nodu
                // todo predelat, vracet nejake presmerovani jinam
                return actualNodeId
            }
        }
    }

//    fun correctAnswers(): String {
//        var string = ""
//        correctOptions.keys.forEach { questionText ->
//            if (selectedOptions[questionText] != correctOptions[questionText]) {
//                println(correctOptions[questionText])
//                string = string + questionText + " " + correctOptions[questionText] + ",\n"
//            }
//        }
//        return string.substring(0, string.length - 1)
//    }

    fun correctAnswers(): List<String> {
        val list = mutableListOf<String>()

        correctOptions.keys.forEach { key ->
            if (selectedOptions[key] != correctOptions[key]) {
                println(correctOptions[key])
                list.add(key) //= string + questionText + " " + correctOptions[questionText] + ",\n"
            }
        }
        println("list:$list")
        return list
    }

    private fun getQuestionsByLessonIdsTestingMode() {
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
                        val result = withContext(Dispatchers.IO) {
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


    private fun reduceQuestions(){
        val listArrayResponses = mutableListOf<Question>()

        data.questionsList.forEach{
            val arrayResponse = it.items!!.toMutableList()
            while (arrayResponse.size > 3) {
                val random = Random.nextInt(0,arrayResponse.size - 1)
                arrayResponse.removeAt(random)
            }
            listArrayResponses.addAll(arrayResponse)//, arrayResponse.size, it.version))
        }

        data.questions = ArrayResponse(listArrayResponses, listArrayResponses.size, 1)

        println("listArrayResponses:$listArrayResponses")
//        data.questions?.items = data.questionsList[0].items
    }

    private fun getQuestionsByLessonId() {
        if (lessonId != -1L) {
            launch {
                val result = withContext(Dispatchers.IO) {
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

    fun getNextNodeId(): Long {
        val ids = graph.map[actualNodeInGraph]?.previousNodesIds
        var nextNodeId = -1L

        if (!ids.isNullOrEmpty()) {

            todoNodes.addAll(ids)
            nextNodeId = todoNodes.removeAt(0)
            println("todoNodes:$todoNodes")
            println("ids:$ids")
        }

        println("todoNodes:$todoNodes")

        return nextNodeId
    }
}
package cz.mendelu.pef.microlearning.ui.screens.chooseLesson

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import cz.mendelu.pef.microlearning.R
import cz.mendelu.pef.microlearning.architecture.BaseViewModel
import cz.mendelu.pef.microlearning.architecture.CommunicationResult
import cz.mendelu.pef.microlearning.communication.api.IRemoteRepository
import cz.mendelu.pef.microlearning.communication.api.NetworkInterceptor
import cz.mendelu.pef.microlearning.model.Modes
import cz.mendelu.pef.microlearning.model.UiState
import cz.mendelu.pef.microlearning.model.api.Graph
import cz.mendelu.pef.microlearning.model.api.Node
import cz.mendelu.pef.microlearning.model.graph
import cz.mendelu.pef.microlearning.model.lessonsToStudy
import cz.mendelu.pef.microlearning.model.mode
import cz.mendelu.pef.microlearning.model.revisionLessonList
import cz.mendelu.pef.microlearning.model.todoNodes
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject


@HiltViewModel
class ChooseLessonVM @Inject constructor(
    private val remoteRepository: IRemoteRepository
) : BaseViewModel() {

    // uistate
    val uiState: MutableState<UiState<ChooseLessonData, ChooseLessonErrors>> = mutableStateOf(UiState())

    var data = ChooseLessonData()
    var topicId = 0L
    var topicName = "no name"

    //vola suspend
    fun getData(dispatcher: CoroutineDispatcher = Dispatchers.IO) {
        // vycisteni seznamu
        todoNodes = mutableSetOf()
        lessonsToStudy = mutableSetOf()

        if (NetworkInterceptor.isNetworkConnected()) {
            getLessonsByTopic(dispatcher)
            // nacist graf
//            getGraph()
            if (mode.value == Modes.TESTING.ordinal && graph.topicId != topicId) {
                // vynulovani graphu
                graph = Graph(this.topicId, this.topicName, mutableMapOf())
                // pokud testing mode -> nacist graf: Nody dle topicu
                getNodesByTopic(dispatcher)
                // pokud testing mode -> stahnout pro kazdy node predchudce a nasledniky
//                getPreviousAndSubsequentNodes()
            } else if (mode.value == Modes.TESTING.ordinal) {
                // promazat graf co se tyce poctu odpovedi, walkthrough, succesfully completed
                println("Cisteni grafu")
                graph.map.values.forEach {
                    it.walkThrough = false
                    it.successfullyCompleted = false
                    it.countOfCorrectAnswers = 0
                    it.countOfIncorrectAnswers = 0
                }
            } else if (mode.value == Modes.TUITION.ordinal && graph.topicId != topicId){
                // vynulovani graphu
                graph = Graph(this.topicId, this.topicName, mutableMapOf())
                // pokud tuition mode -> nacist graf: Nody dle topicu
                getNodesByTopic(dispatcher)
            } else if (mode.value == Modes.REVISION.ordinal) {
                graph = Graph(this.topicId, this.topicName, mutableMapOf())
            }
        } else {
            println("Network not connected")
            uiState.value = UiState(
                loading = false,
                data = null,
                errors = ChooseLessonErrors(R.string.network_is_not_connected) // "communication error" resource code
            )
        }
    }

    // suspend do remote repo
    private fun getLessonsByTopic(dispatcher: CoroutineDispatcher) {
        println("Fun get LESSON ByTOPIC()")
        if (topicId != 0L) {
            launch {
                val result =
                    withContext(dispatcher) {
                        remoteRepository.getLessonsShorterByTopicId(topicId)
                    }

                when (result) {
                    is CommunicationResult.ConnectionError -> {
                        uiState.value = UiState(
                            loading = false,
                            data = null,
                            errors = ChooseLessonErrors(R.string.communication_error) // "communication error" resource code
                        )
                    }

                    is CommunicationResult.Error -> {
                        println(result.error)
                        when (result.error.code) {
                            500 -> {
                                uiState.value = UiState(
                                    loading = false,
                                    data = null,
                                    errors = ChooseLessonErrors(R.string.some_unexpected_error) // "exception" resource code
                                )
                            }

                            404 -> {
                                uiState.value = UiState(
                                    loading = false,
                                    data = null,
                                    errors = ChooseLessonErrors(R.string.not_found) // "not found" resource code
                                )
                            }

                            else -> {
                                uiState.value = UiState(
                                    loading = false,
                                    data = null,
                                    errors = ChooseLessonErrors(R.string.something_went_wrong_please_reload_screen)
                                )
                            }
                        }
                    }

                    is CommunicationResult.Exception -> {
                        uiState.value = UiState(
                            loading = false,
                            data = null,
                            errors = ChooseLessonErrors(R.string.unknown_error) // "exception" resource code
                        )
                    }

                    is CommunicationResult.Success -> {
                        if (result.data.items != null && result.data.items!!.isNotEmpty()) {
                            println("*** Success ChLVM")
//                            println(result.data)
                            data.lessons = result.data
                            getGraph()
                            uiState.value = UiState(
                                loading = false,
                                data = data,
                                errors = null
                            )
                        } else {
                            uiState.value = UiState(
                                loading = false,
                                data = null,
                                errors = ChooseLessonErrors(R.string.no_data) // "exception" resource code
                            )
                        }
                    }
                }
            }
        }
    }

    // neni suspend
    // naplneni grafu v revision
    // revisionLessonList
    // data.lessons
    private fun getGraph(){
        when (mode.value) {
            Modes.REVISION.ordinal -> {
                revisionLessonList = mutableMapOf()
                data.lessons?.items?.forEach {
                    revisionLessonList[it.ordinalNumber!!] = it.id!!
                }
            }
            Modes.TESTING.ordinal -> {
                println("Testing mode, graph:$graph")
            }

            Modes.TUITION.ordinal -> {
                println("Tuition mode, graph:$graph")
            }
        }
        println("revisionLessonList:$revisionLessonList")
    }

    // suspend do remote repo
    private fun getNodesByTopic(dispatcher: CoroutineDispatcher) {
        if (topicId != 0L) {
//            graph.topicId = topicId
            println("Fun get NODE ByTOPIC()")
            launch {
                val result =
                    withContext(dispatcher) {
                        remoteRepository.getNodesByTopic(topicId)
                    }

                when (result) {
                    is CommunicationResult.ConnectionError -> {
                        uiState.value = UiState(
                            loading = false,
                            data = null,
                            errors = ChooseLessonErrors(R.string.communication_error) // "communication error" resource code
                        )
                    }

                    is CommunicationResult.Error -> {
                        println(result.error)
                        when (result.error.code) {
                            500 -> {
                                uiState.value = UiState(
                                    loading = false,
                                    data = null,
                                    errors = ChooseLessonErrors(R.string.some_unexpected_error) // "exception" resource code
                                )
                            }

                            404 -> {
                                uiState.value = UiState(
                                    loading = false,
                                    data = null,
                                    errors = ChooseLessonErrors(R.string.not_found) // "not found" resource code
                                )
                            }

                            else -> {
                                uiState.value = UiState(
                                    loading = false,
                                    data = null,
                                    errors = ChooseLessonErrors(R.string.something_went_wrong_please_reload_screen)
                                )
                            }
                        }
                    }

                    is CommunicationResult.Exception -> {
                        uiState.value = UiState(
                            loading = false,
                            data = null,
                            errors = ChooseLessonErrors(R.string.unknown_error) // "exception" resource code
                        )
                    }

                    is CommunicationResult.Success -> {
                        if (result.data.items != null && result.data.items!!.isNotEmpty()) {
                            println("*** Success ChLVM nodes")
                            println("data: " + result.data)
                            data.nodes = result.data
                            getPreviousAndSubsequentNodes()
                            uiState.value = UiState(
                                loading = false,
                                data = data,
                                errors = null
                            )
                        } else {
                            uiState.value = UiState(
                                loading = false,
                                data = null,
                                errors = ChooseLessonErrors(R.string.no_data) // "exception" resource code
                            )
                        }
                    }
                }
            }
        }
    }

    // vola suspend
    // data.nodes potreba
    private fun getPreviousAndSubsequentNodes() {
        println(data.nodes?.items?.size)
        data.nodes?.items?.forEach{
            getPrevAndSubNodes(it)
        }
        println(graph)
    }

    //suspend do remote repo
    private fun getPrevAndSubNodes(actualNode: Node){
        launch {
            val result =
                withContext(Dispatchers.IO) {
                    remoteRepository.getNodesBefore(actualNode.id!!)
                }

            when(result) {
                is CommunicationResult.Success -> {
                    println("Comm. res Prev SUCCESS ${actualNode.id}")
                    if (result.data.count != 0 && result.data.items != null) {
                        actualNode.previousNodesIds = result.data.items!!.map { link -> link.beforeNodeId }
                    } else {
                        println("EMPTY LIST prev")
                        actualNode.previousNodesIds = listOf()
                    }

                    if (graph.map.containsKey(actualNode.id!!)) {
                        graph.map[actualNode.id!!]!!.previousNodesIds = actualNode.previousNodesIds
                    } else {
                        graph.map[actualNode.id!!] = actualNode
                    }
                }

                is CommunicationResult.ConnectionError -> TODO()
                is CommunicationResult.Error -> TODO()
                is CommunicationResult.Exception -> TODO()
            }
//        }
//    }
//
//    private fun getSubsequentNodes(actualNode: Node) {
//        launch {
            val result2 =
                withContext(Dispatchers.IO) {
                    remoteRepository.getNodesAfter(actualNode.id!!)
                }

            when (result2) {
                is CommunicationResult.Success -> {
                    println("Comm.res SUB SUCCESS ${actualNode.id}")
                    if (result2.data.count != 0 && result2.data.items != null) {
                        graph.map[actualNode.id]?.subsequentNodeIds = result2.data.items!!.map { link -> link.nextNodeId }
                    } else {
                        println("EMPTY LIST sub")
                        actualNode.subsequentNodeIds = listOf()
                    }

                    if (graph.map.containsKey(actualNode.id!!)) {
                        graph.map[actualNode.id!!]!!.subsequentNodeIds = actualNode.subsequentNodeIds
                    } else {
                        graph.map[actualNode.id!!] = actualNode
                    }
                }

                is CommunicationResult.ConnectionError -> TODO()
                is CommunicationResult.Error -> TODO()
                is CommunicationResult.Exception -> TODO()
            }
        }
    }

    // neni suspend
    // graph, lessonId (v parametru)
    fun getNodeFromGraphByLesson(lessonId: Long) : Long {
        println(graph)
        if (graph.map.values.filter { it.lessonId == lessonId }.isNotEmpty())
        return graph.map.values.filter { it.lessonId == lessonId }[0].id!!
        else return -1L
    }
}
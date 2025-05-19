package cz.mendelu.pef.microlearning.ui.screens.chooseLesson

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import cz.mendelu.pef.microlearning.R
import cz.mendelu.pef.microlearning.architecture.BaseViewModel
import cz.mendelu.pef.microlearning.architecture.CommunicationResult
import cz.mendelu.pef.microlearning.communication.NetworkInterceptor
import cz.mendelu.pef.microlearning.communication.RemoteRepositoryImpl
import cz.mendelu.pef.microlearning.model.Graph
import cz.mendelu.pef.microlearning.model.Modes
import cz.mendelu.pef.microlearning.model.Node
import cz.mendelu.pef.microlearning.model.UiState
import cz.mendelu.pef.microlearning.model.graph
import cz.mendelu.pef.microlearning.model.mode
import cz.mendelu.pef.microlearning.model.revisionLessonList
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject


@HiltViewModel
class ChooseLessonVM @Inject constructor(
    private val remoteRepository: RemoteRepositoryImpl
) : BaseViewModel() {

    // uistate
    val uiState: MutableState<UiState<ChooseLessonData, ChooseLessonErrors>> = mutableStateOf(UiState())

    var data = ChooseLessonData()
    var topicId = 0L

    fun getData() {
        if (NetworkInterceptor.isNetworkConnected()) {
            getLessonsByTopic()
            // nacist graf
//            getGraph()
            if (mode.value == Modes.TESTING.name && graph.topicId != topicId) {
                // vynulovani graphu
                graph = Graph(this.topicId, mutableMapOf())
                // pokud testing mode -> nacist graf: Nody dle topicu
                getNodesByTopic()
                // pokud testing mode -> stahnout pro kazdy node predchudce a nasledniky
                getPreviousAndSubsequentNodes()
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

    private fun getLessonsByTopic() {
        println("Fun get LESSON ByTOPIC()")
        if (topicId != 0L) {
            launch {
                val result =
                    withContext(Dispatchers.IO) {
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

    private fun getGraph(){
        when (mode.value) {
            Modes.REVISION.name -> {// && lessonList.isEmpty()) {
                revisionLessonList = mutableMapOf()
                data.lessons?.items?.forEach {
                    revisionLessonList[it.ordinalNumber!!] = it.id!!
                }
            }
            Modes.TESTING.name -> {
                println("Testing mode, graph:$graph")
            }

            Modes.TUITION.name -> TODO("Tuition mode -> not yet implemented")
        }
        println("revisionLessonList:$revisionLessonList")
    }

    private fun getNodesByTopic() {
        if (topicId != 0L) {
//            graph.topicId = topicId
            println("Fun get NODE ByTOPIC()")
            launch {
                val result =
                    withContext(Dispatchers.IO) {
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
                            println("data:"+result.data)
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

    private fun getPreviousAndSubsequentNodes() {
        data.nodes?.items?.forEach{
            getPreviousNodes(it)
            getSubsequentNodes(it)
        }
        println(graph)
    }

    private fun getPreviousNodes(actualNode: Node){
        launch {
            val result =
                withContext(Dispatchers.IO) {
                    remoteRepository.getNodesBefore(actualNode.id!!)
                }

            when(result) {
                is CommunicationResult.Success -> {
                    println("Comm. res Prev SUCCESS")
                    if (result.data.count != 0 && result.data.items != null) {
                        actualNode.previousNodesIds = result.data.items!!.map { link -> link.beforeNodeId }
                        graph.map[actualNode.id!!] = actualNode

//                        println("prev:${actualNode.previousNodesIds}")
//                        println("Graph[${actualNode.id}]: ${graph[actualNode.id!!]}")
                    } else {
                        actualNode.previousNodesIds = listOf()
                        graph.map[actualNode.id!!] = actualNode
                    }
                }

                is CommunicationResult.ConnectionError -> TODO()
                is CommunicationResult.Error -> TODO()
                is CommunicationResult.Exception -> TODO()
            }
        }
    }

    private fun getSubsequentNodes(actualNode: Node) {
        launch {
            val result =
                withContext(Dispatchers.IO) {
                    remoteRepository.getNodesAfter(actualNode.id!!)
                }

            when (result) {
                is CommunicationResult.Success -> {
                    println("Comm.res SUB SUCCESS")
                    if (result.data.count != 0 && result.data.items != null) {
                        graph.map[actualNode.id]?.subsequentNodeIds = result.data.items!!.map { link -> link.nextNodeId }
                    } else {
                        actualNode.previousNodesIds = listOf()
                        graph.map[actualNode.id!!] = actualNode
                    }
                }

                is CommunicationResult.ConnectionError -> TODO()
                is CommunicationResult.Error -> TODO()
                is CommunicationResult.Exception -> TODO()
            }
        }
    }

    fun getNodeFromGraphByLesson(lessonId: Long) : Long {
        println(graph)
        if (graph.map.values.filter { it.lessonId == lessonId }.isNotEmpty())
        return graph.map.values.filter { it.lessonId == lessonId }[0].id!!
        else return -1L
    }
}
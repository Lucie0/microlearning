package cz.mendelu.pef.microlearning.ui.screens.showResults

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import cz.mendelu.pef.microlearning.R
import cz.mendelu.pef.microlearning.architecture.BaseViewModel
import cz.mendelu.pef.microlearning.architecture.CommunicationResult
import cz.mendelu.pef.microlearning.communication.api.RemoteRepositoryImpl
import cz.mendelu.pef.microlearning.model.api.LessonShorter
import cz.mendelu.pef.microlearning.model.UiState
import cz.mendelu.pef.microlearning.model.graph
import cz.mendelu.pef.microlearning.model.response.ArrayResponse
import cz.mendelu.pef.microlearning.model.startingNode
import cz.mendelu.pef.microlearning.ui.screens.chooseLesson.ChooseLessonErrors
import cz.mendelu.pef.microlearning.ui.screens.question.QuestionScreenData
import cz.mendelu.pef.microlearning.ui.screens.question.QuestionsErrors
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject


@HiltViewModel
class ResultVM @Inject constructor(
    private val remoteRepository: RemoteRepositoryImpl
) : BaseViewModel() {

    // uistate
    val uiState: MutableState<UiState<ArrayResponse<LessonShorter>, ResultErrors>> =
        mutableStateOf(UiState())

    var topicId = graph.topicId

    // map[lessonId] = nodeId
    val mapOfLesson: MutableMap<Long, Long> = mutableMapOf()


    fun getData() {
        getLessonsByTopic()
        getMap()
    }

    private fun getLessonsByTopic() {
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
                            errors = ResultErrors(R.string.communication_error) // "communication error" resource code
                        )
                    }

                    is CommunicationResult.Error -> {
                        println(result.error)
                        when (result.error.code) {
                            500 -> {
                                uiState.value = UiState(
                                    loading = false,
                                    data = null,
                                    errors = ResultErrors(R.string.some_unexpected_error) // "exception" resource code
                                )
                            }

                            404 -> {
                                uiState.value = UiState(
                                    loading = false,
                                    data = null,
                                    errors = ResultErrors(R.string.not_found) // "not found" resource code
                                )
                            }

                            else -> {
                                uiState.value = UiState(
                                    loading = false,
                                    data = null,
                                    errors = ResultErrors(R.string.something_went_wrong_please_reload_screen)
                                )
                            }
                        }
                    }

                    is CommunicationResult.Exception -> {
                        uiState.value = UiState(
                            loading = false,
                            data = null,
                            errors = ResultErrors(R.string.unknown_error) // "exception" resource code
                        )
                    }

                    is CommunicationResult.Success -> {
                        if (result.data.items != null && result.data.items!!.isNotEmpty()) {
                            println("*** Success result")
//                            println(result.data)
                            uiState.value = UiState(
                                loading = false,
                                data = result.data,
                                errors = null
                            )
                        } else {
                            uiState.value = UiState(
                                loading = false,
                                data = null,
                                errors = ResultErrors(R.string.no_data) // "exception" resource code
                            )
                        }
                    }
                }
            }
        }
    }

    private fun getMap(){
        graph.map.values.forEach{
            mapOfLesson[it.lessonId!!] = it.id!!
        }
    }


    fun getScalarResult(): Int {
        var points = 0
//        graph.map.keys.forEach {key ->
//            if (graph.map[key]!!.walkThrough == true) {
//                if (graph.map[key]!!.countOfIncorrectAnswers == 0) {
//                    points += 1
//                } else {
//                    points -= 1
//                }
//            }
//        }

        if (graph.map[startingNode]?.countOfIncorrectAnswers == 0) {
            points += getCountOfNodes(startingNode)
        } else {
            graph.map[startingNode]?.previousNodesIds?.forEach{
                points += getCountOfNodesIf(it)
            }
        }

        println("point:$points")
        return points
    }

    private fun getCountOfNodesIf(nodeId: Long): Int {
        var count = 0
        if (graph.map[nodeId]?.countOfIncorrectAnswers == 0) {
            count += getCountOfNodes(nodeId)
        } else {
            graph.map[nodeId]?.previousNodesIds?.forEach{
                count += getCountOfNodesIf(it)
            }
        }
        return count
    }

    private fun getCountOfNodes(nodeId: Long): Int {
        var count = 0
        count += graph.map[nodeId]?.previousNodesIds?.size ?: 0
        println("nID: $nodeId, count:$count")

        graph.map[nodeId]?.previousNodesIds?.forEach {
            count += getCountOfNodes(it)
        }

        return if (graph.map[nodeId]?.walkThrough != true) {
            graph.map[nodeId]?.walkThrough = true
            count
        } else {
            0
        }
    }

    fun getGraphResult(): String {
        var result = ""

        if (graph.map[startingNode]?.countOfIncorrectAnswers == 0) {
            result += getWalkThroughGraph(startingNode)
        } else {
            graph.map[startingNode]?.previousNodesIds?.forEach{
                result += getWalkThroughGraph(it)
            }
        }

        return result
    }

    private fun getWalkThroughGraph(nodeId: Long): MutableSet<String> {
        val result = mutableSetOf<String>()
        result.add(graph.map[nodeId]?.result() ?: "")

        graph.map[nodeId]?.previousNodesIds?.forEach { id ->
            result.addAll(getWalkThroughGraph(id))
        }

        return result
    }
}
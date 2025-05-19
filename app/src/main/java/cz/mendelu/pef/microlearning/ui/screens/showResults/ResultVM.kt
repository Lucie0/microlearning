package cz.mendelu.pef.microlearning.ui.screens.showResults

import cz.mendelu.pef.microlearning.architecture.BaseViewModel
import cz.mendelu.pef.microlearning.communication.RemoteRepositoryImpl
import cz.mendelu.pef.microlearning.model.graph
import cz.mendelu.pef.microlearning.model.startingNode
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class ResultVM @Inject constructor(
    private val remoteRepository: RemoteRepositoryImpl
) : BaseViewModel() {

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
//            points += graph.map[startingNode]?.previousNodesIds?.size ?: 0
//            graph.map[startingNode]?.previousNodesIds?.forEach{id ->
//                points += graph.map[id]?.previousNodesIds?.size ?: 0
            points += getCountOfNodes(startingNode)
        }

        println("point:$points")
        return points
    }

    private fun getCountOfNodes(nodeId: Long): Int {
        var count = 0
        count += graph.map[nodeId]?.previousNodesIds?.size ?: 0
        println("nID: $nodeId, count:$count")

        graph.map[nodeId]?.previousNodesIds?.forEach {
            count += getCountOfNodes(it)
        }

        return count
    }

    fun getGraphResult(): String {
        var result = ""

        if (graph.map[startingNode]?.countOfIncorrectAnswers == 0) {
            result += getWalkThroughGraph(startingNode)
        }

        return result
    }

    private fun getWalkThroughGraph(nodeId: Long): String {
        var result = ""
        result += graph.map[nodeId]?.result()

        graph.map[nodeId]?.previousNodesIds?.forEach { id ->
            result += "\n --> ${getWalkThroughGraph(id)}"
        }

        return result
    }
}
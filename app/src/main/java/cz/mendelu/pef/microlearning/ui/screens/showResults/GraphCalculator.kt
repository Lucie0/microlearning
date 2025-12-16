package cz.mendelu.pef.microlearning.ui.screens.showResults

import cz.mendelu.pef.microlearning.model.graph
import cz.mendelu.pef.microlearning.model.startingNode

class GraphCalculator(
//    private val graph: Graph,
//    private val startingNode: Long
) {

    fun getScalarResult(): Int {
        var points = 0

        if (graph.map[startingNode]?.countOfIncorrectAnswers == 0) {
            points += getCountOfNodes(startingNode)
        } else {
            graph.map[startingNode]?.previousNodesIds?.forEach {
                points += getCountOfNodesIf(it)
            }
        }

        return points
    }

    private fun getCountOfNodesIf(nodeId: Long): Int {
        var count = 0
        if (graph.map[nodeId]?.countOfIncorrectAnswers == 0) {
            count += getCountOfNodes(nodeId)
        } else {
            graph.map[nodeId]?.previousNodesIds?.forEach {
                count += getCountOfNodesIf(it)
            }
        }
        return count
    }

    private fun getCountOfNodes(nodeId: Long): Int {
        var count = graph.map[nodeId]?.previousNodesIds?.size ?: 0

        graph.map[nodeId]?.previousNodesIds?.forEach {
            count += getCountOfNodes(it)
        }

        if (graph.map[nodeId]?.walkThrough != true) {
            // todo po resetu v choose lesson VM to v result screene zobrazuje porad projite uzly,
            //  i kdyz byly nastaveny walkThrough na false -- prepisou se na true nasledujicim prikazem
            //  netusim proc -- je to kvuli mapOfLesson, ale nechapu
            graph.map[nodeId]?.walkThrough = true
            return count
        }

        return 0
    }

    fun getGraphResult(): String {
        val result = mutableListOf<String>()
        if (graph.map[startingNode]?.countOfIncorrectAnswers == 0) {
            result.addAll(getWalkThroughGraph(startingNode))
        } else {
            graph.map[startingNode]?.previousNodesIds?.forEach {
                result.addAll(getWalkThroughGraph(it))
            }
        }
        return result.joinToString(", ")
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

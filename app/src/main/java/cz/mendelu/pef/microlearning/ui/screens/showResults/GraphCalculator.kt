package cz.mendelu.pef.microlearning.ui.screens.showResults

import cz.mendelu.pef.microlearning.model.graph
import cz.mendelu.pef.microlearning.model.startingNode

class GraphCalculator(
//    private val graph: Graph,
//    private val startingNode: Long
) {
    var result = -1

    fun getScalarResult(): Int {
        println("GET RESULT")
        var points = 0

        println("result: $result")
        if (result != -1) return result

        if (graph.map[startingNode]?.countOfIncorrectAnswers == 0) {
            points += getCountOfNodes(startingNode)
            println("if1: $points")
        } else {
            graph.map[startingNode]?.previousNodesIds?.forEach {
                points += getCountOfNodesIf(it)
                println("else1:$points")
            }
        }

        result = points
        return points
    }

    private fun getCountOfNodesIf(nodeId: Long): Int {
        println("COUNT IF")

        var count = 0
        if (graph.map[nodeId]?.countOfIncorrectAnswers == 0) {
            count += getCountOfNodes(nodeId)
            println("CountIf if:$count")
        } else {
            graph.map[nodeId]?.previousNodesIds?.forEach {
                count += getCountOfNodesIf(it)
                println("CountIf else:$count")
            }
        }
        return count
    }

    private fun getCountOfNodes(nodeId: Long): Int {
        println("COUNT")

        var count = graph.map[nodeId]?.previousNodesIds?.size ?: 0

        graph.map[nodeId]?.previousNodesIds?.forEach {
            count += getCountOfNodes(it)
        }

        println("Count: $count")
        if (graph.map[nodeId]?.walkThrough != true) {
            // todo po resetu v choose lesson VM to v result screene zobrazuje porad projite uzly,
            //  i kdyz byly nastaveny walkThrough na false -- prepisou se na true nasledujicim prikazem
            //  netusim proc -- je to kvuli mapOfLesson, ale nechapu
            graph.map[nodeId]?.walkThrough = true
            return count
        }

        println("Count else: 0")
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

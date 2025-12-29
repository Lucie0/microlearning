package cz.mendelu.pef.microlearning.ui.screens.showResults

import cz.mendelu.pef.microlearning.model.api.Graph
import cz.mendelu.pef.microlearning.model.api.Node
import cz.mendelu.pef.microlearning.model.graph
import cz.mendelu.pef.microlearning.model.startingNode

class GraphCalculator(
//    private val graph: Graph,
//    private val startingNode: Long
) {
    var result = -1

    fun markWalkthroughParents() {
        if (graph.map[startingNode]?.countOfIncorrectAnswers == 0) {
            markNodes(startingNode)
        } else {
            graph.map[startingNode]?.previousNodesIds?.forEach {
                markNodesIf(it)
            }
        }
    }

    private fun markNodesIf(nodeId: Long) {
        if (graph.map[nodeId]?.countOfIncorrectAnswers == 0) {
            markNodes(nodeId)

        } else {
            graph.map[nodeId]?.previousNodesIds?.forEach {
                markNodesIf(it)
            }
        }
    }

    private fun markNodes(nodeId: Long) {

        graph.map[nodeId]?.previousNodesIds?.forEach {
            markNodes(it)
        }

        if (graph.map[nodeId]?.walkThrough != true) {
            graph.map[nodeId]?.walkThrough = true
        }
    }

    fun countPoints() : Int {
        val walkAndTestOK = graph.map.values.filter{
            it.walkThrough == true && it.countOfIncorrectAnswers == 0 && it.lessonOrdinalNumber != 0
        }.size

        val walkAndTestNotOk = graph.map.values.filter {
            it.walkThrough == true && it.countOfIncorrectAnswers != 0 && it.lessonOrdinalNumber != 0
        }.size

        return walkAndTestOK - walkAndTestNotOk
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

    // ---------------------------

    data class DfsResult(
        val walkthroughNodes: List<Node>,
        val successfullyCompletedNodes: List<Node>
    )

    fun dfsAnalyzeGraphUpwards(graph: Graph, startId: Long): DfsResult {
        val visited = mutableSetOf<Long>()

        val walkthroughNodes = mutableListOf<Node>()
        val successfullyCompletedNodes = mutableListOf<Node>()

        dfsUpwards(
            nodeId = startId,
            graph = graph,
            visited = visited,
            walkthroughNodes = walkthroughNodes,
            successfullyCompletedNodes = successfullyCompletedNodes
        )

        return DfsResult(
            walkthroughNodes = walkthroughNodes,
            successfullyCompletedNodes = successfullyCompletedNodes
        )
    }
    private fun dfsUpwards(
        nodeId: Long,
        graph: Graph,
        visited: MutableSet<Long>,
        walkthroughNodes: MutableList<Node>,
        successfullyCompletedNodes: MutableList<Node>
    ) {
        if (visited.contains(nodeId)) return

        val node = graph.map[nodeId] ?: return
        visited.add(nodeId)

        // vyhodnocení uzlu
        if (node.walkThrough == true) {
            walkthroughNodes.add(node)
        }

        if (node.successfullyCompleted == true) {
            successfullyCompletedNodes.add(node)
        }

        // DFS proti směru hran (k rodičům)
        for (parentId in node.previousNodesIds) {
            dfsUpwards(
                nodeId = parentId,
                graph = graph,
                visited = visited,
                walkthroughNodes = walkthroughNodes,
                successfullyCompletedNodes = successfullyCompletedNodes
            )
        }
    }



    fun main(startId: Long) : DfsResult {
        val result: DfsResult = dfsAnalyzeGraphUpwards(graph, startId)

        println("\nWalkthrough uzly (${result.walkthroughNodes.size}):")
        result.walkthroughNodes.forEach { println(it) }

        println("\nSuccessfully completed uzly (${result.successfullyCompletedNodes.size}):")
        result.successfullyCompletedNodes.forEach { println(it) }

        return result
    }

}

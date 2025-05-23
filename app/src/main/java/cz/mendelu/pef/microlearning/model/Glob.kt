package cz.mendelu.pef.microlearning.model

import androidx.compose.runtime.mutableStateOf
import cz.mendelu.pef.microlearning.model.api.Graph

var mode = mutableStateOf(Modes.TUITION.name)

//TESTING + TUITION
// node_id, node
var graph: Graph = Graph(0, mutableMapOf())
var todoNodes = mutableListOf<Long>()
var actualNodeInGraph: Long = -1L
var startingNode: Long = -1L

// TUITION
var lessonsToStudy = mutableSetOf<Long>()
//var walkThroughNodes = listOf<Long>()

// REVISION
// ordinal number, lesson_id
var revisionLessonList = mutableMapOf<Int, Long>()

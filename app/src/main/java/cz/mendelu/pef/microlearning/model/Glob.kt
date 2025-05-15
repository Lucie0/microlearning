package cz.mendelu.pef.microlearning.model

import androidx.compose.runtime.mutableStateOf

var mode = mutableStateOf(Modes.TESTING.name)



//TESTING + TUITION
// node_id, node
var graph: Graph = Graph(0, mutableMapOf())
var lessonsToStudy = mutableListOf<Long>()
var walkThroughNodes = listOf<Long>()

// REVISION
// ordinal number, lesson_id
var lessonList = mutableMapOf<Int, Long>()

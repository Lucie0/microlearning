package cz.mendelu.pef.microlearning.model

import androidx.compose.runtime.mutableStateOf
import cz.mendelu.pef.microlearning.model.api.Graph

// poradove cislo modu
var mode = mutableStateOf(Modes.TUITION.ordinal)

//TESTING + TUITION
// node_id, node
var graph: Graph = Graph(0, "no name", mutableMapOf())

var todoNodes = mutableSetOf<Long>()

var actualNodeInGraph: Long = -1L
// uzel, ktery byl vybran na zacatku
var startingNode: Long = -1L
// uzel, do ktereho se vratit pri zasmyckovani
var educationalNode = -1L

// TUITION
// set of lessonIds
var lessonsToStudy = mutableSetOf<Long>()
//var walkThroughNodes = listOf<Long>()

// REVISION
// ordinal number, lesson_id
var revisionLessonList = mutableMapOf<Int, Long>()

var showHint = mutableStateOf(false)


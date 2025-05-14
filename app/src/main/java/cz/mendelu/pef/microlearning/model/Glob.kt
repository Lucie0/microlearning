package cz.mendelu.pef.microlearning.model

import androidx.compose.runtime.mutableStateOf

var mode = mutableStateOf(Modes.TUITION.name)

var walkThroughNodes = listOf<Long>()
var graph = mutableMapOf<Long, Node>()
// ordinal number, lesson_id
var lessonList = mutableMapOf<Int, Long>()
var lessonsToStudy = mutableListOf<Long>()
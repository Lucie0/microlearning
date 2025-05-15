package cz.mendelu.pef.microlearning.ui.screens.chooseLesson

import cz.mendelu.pef.microlearning.model.LessonShorter
import cz.mendelu.pef.microlearning.model.Node
import cz.mendelu.pef.microlearning.model.response.ArrayResponse

data class ChooseLessonData(
    var lessons: ArrayResponse<LessonShorter>? = null,
    var nodes: ArrayResponse<Node>? = null
)

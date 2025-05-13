package cz.mendelu.pef.microlearning.ui.screens.chooseLesson

import cz.mendelu.pef.microlearning.model.Lesson
import cz.mendelu.pef.microlearning.model.LinkAfter
import cz.mendelu.pef.microlearning.model.LinkBefore
import cz.mendelu.pef.microlearning.model.Node
import cz.mendelu.pef.microlearning.model.Topic
import cz.mendelu.pef.microlearning.model.response.ArrayResponse
import cz.mendelu.pef.microlearning.model.response.ObjectResponse

data class ChooseLessonData(
    var lessons: ArrayResponse<Lesson>? = null
)

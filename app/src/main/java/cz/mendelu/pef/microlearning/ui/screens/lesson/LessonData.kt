package cz.mendelu.pef.microlearning.ui.screens.lesson

import cz.mendelu.pef.microlearning.model.Lesson
import cz.mendelu.pef.microlearning.model.LinkAfter
import cz.mendelu.pef.microlearning.model.Node
import cz.mendelu.pef.microlearning.model.response.ArrayResponse
import cz.mendelu.pef.microlearning.model.response.ObjectResponse

data class LessonData(
    var nextNodeId: Long?,
    var linkAfter: ArrayResponse<LinkAfter>?,
    var lesson: ObjectResponse<Lesson>?
)

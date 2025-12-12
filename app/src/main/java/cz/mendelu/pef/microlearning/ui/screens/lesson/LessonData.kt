package cz.mendelu.pef.microlearning.ui.screens.lesson

import cz.mendelu.pef.microlearning.model.api.Lesson
import cz.mendelu.pef.microlearning.model.api.LinkAfter
import cz.mendelu.pef.microlearning.model.api.Node
import cz.mendelu.pef.microlearning.model.response.ArrayResponse
import cz.mendelu.pef.microlearning.model.response.ObjectResponse
import java.io.Serializable

data class LessonData(
//    var nextNodeId: Long?,
    var linkAfter: ArrayResponse<LinkAfter>? = null,
//    var linkBefore: ArrayResponse<LinkBefore>?,
    var lesson: ObjectResponse<Lesson>? = null,
    var nextNode: ObjectResponse<Node>? = null
): Serializable

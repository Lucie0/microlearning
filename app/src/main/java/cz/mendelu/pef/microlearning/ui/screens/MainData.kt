package cz.mendelu.pef.microlearning.ui.screens

import cz.mendelu.pef.microlearning.model.api.Node
import cz.mendelu.pef.microlearning.model.api.Topic
import cz.mendelu.pef.microlearning.model.db.SavedTopic
import cz.mendelu.pef.microlearning.model.response.ArrayResponse
import cz.mendelu.pef.microlearning.model.response.ObjectResponse

data class MainData(
    var node: ObjectResponse<Node>? = null,
    var topics: ArrayResponse<Topic>? = null,
    var myTopics: List<Topic>? = null
)

package cz.mendelu.pef.microlearning.ui.screens.question

import cz.mendelu.pef.microlearning.model.api.Question
import cz.mendelu.pef.microlearning.model.response.ArrayResponse

data class QuestionScreenData(
    var questionsList: MutableList<ArrayResponse<Question>> = mutableListOf(),
    var questions: ArrayResponse<Question>? = null,
)

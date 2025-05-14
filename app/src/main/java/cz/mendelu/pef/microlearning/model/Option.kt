package cz.mendelu.pef.microlearning.model

import com.squareup.moshi.JsonClass
import cz.mendelu.pef.microlearning.model.response.ArrayResponse
import java.io.Serializable

@JsonClass(generateAdapter = true)
data class Option(
    var id: Long?,
    var oText: String?,
    var correctAnswer: Boolean?,
    var groupNumber: Int?,
    var questionId: Long?
): Serializable {
}
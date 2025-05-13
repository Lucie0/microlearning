package cz.mendelu.pef.microlearning.model

import com.squareup.moshi.JsonClass
import cz.mendelu.pef.microlearning.model.response.ArrayResponse
import java.io.Serializable

@JsonClass(generateAdapter = true)
data class Lesson(
    var id: Long?,
    var name: String?,
    var ordinalNumber: Int?,
    var content: String?,

    var nodeId: Long?,
    var questions: ArrayResponse<Question>?,
    var topic: String?
): Serializable {
}
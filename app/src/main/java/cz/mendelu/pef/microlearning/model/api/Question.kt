package cz.mendelu.pef.microlearning.model.api

import com.squareup.moshi.JsonClass
import cz.mendelu.pef.microlearning.model.response.ArrayResponse
import java.io.Serializable

@JsonClass(generateAdapter = true)
data class Question(
    var id: Long?,
    var questionType: String?,
    var text: String?,
    var points: Int?,
    var ordinalNumber: Int?,
    var options: ArrayResponse<Option>
): Serializable {
}
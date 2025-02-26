package cz.mendelu.pef.microlearning.model

import com.squareup.moshi.JsonClass
import cz.mendelu.pef.microlearning.model.response.ArrayResponse
import java.io.Serializable

@JsonClass(generateAdapter = true)
data class Question(
    var id: Long?,
    var text: String?,
    var points: Int?,
    var number: Int?,
    var options: ArrayResponse<Option>
): Serializable {
}
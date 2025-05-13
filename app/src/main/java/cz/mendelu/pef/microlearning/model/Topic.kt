package cz.mendelu.pef.microlearning.model

import com.squareup.moshi.JsonClass
import cz.mendelu.pef.microlearning.model.response.ArrayResponse
import java.io.Serializable

@JsonClass(generateAdapter = true)
data class Topic(
    var id: Long?,
    var name: String?
): Serializable {
}
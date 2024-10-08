package cz.mendelu.pef.microlearning.model

import com.squareup.moshi.JsonClass
import java.io.Serializable

@JsonClass(generateAdapter = true)
data class Lesson(
    var id: Long?,
    var name: String?,
    var content: String?
): Serializable {
}
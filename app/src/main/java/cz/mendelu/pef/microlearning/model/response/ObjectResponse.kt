package cz.mendelu.pef.microlearning.model.response

import com.squareup.moshi.JsonClass
import java.io.Serializable

@JsonClass(generateAdapter = true)
data class ObjectResponse<T> (
    var content: T,
    var version: Int
): Serializable{
}
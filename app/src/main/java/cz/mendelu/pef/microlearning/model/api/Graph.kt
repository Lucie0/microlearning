package cz.mendelu.pef.microlearning.model.api

import com.squareup.moshi.JsonClass
import java.io.Serializable

@JsonClass(generateAdapter = true)
data class Graph(
    var topicId: Long,
    var map: MutableMap<Long, Node>
): Serializable {
}
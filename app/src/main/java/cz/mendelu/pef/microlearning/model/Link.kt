package cz.mendelu.pef.microlearning.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import cz.mendelu.pef.microlearning.model.response.ArrayResponse
import java.io.Serializable

@JsonClass(generateAdapter = true)
data class LinkAfter(
    var id: Long?,
    var actualNodeId: Long,
    var nextNodeId: Long,
): Serializable {
}

@JsonClass(generateAdapter = true)
data class LinkBefore(
    var id: Long?,
    var beforeNodeId: Long,
    var actualNodeId: Long,
): Serializable {
}
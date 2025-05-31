package cz.mendelu.pef.microlearning.model.api

import com.squareup.moshi.JsonClass
import java.io.Serializable

@JsonClass(generateAdapter = true)
data class Topic(
    var id: Long?,
    var name: String?,
    var firstNodeId: Long?,
    var dbActualNode: Long? = null
): Serializable {
}
package cz.mendelu.pef.microlearning.model.response

import com.squareup.moshi.JsonClass
import java.io.Serializable

@JsonClass(generateAdapter = true)
data class ArrayResponse<T>(

    var items: List<T>?,
    var count: Int,
    var version: Int

) : Serializable
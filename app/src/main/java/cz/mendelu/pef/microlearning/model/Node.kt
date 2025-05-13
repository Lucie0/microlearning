package cz.mendelu.pef.microlearning.model

import com.squareup.moshi.JsonClass
import cz.mendelu.pef.microlearning.model.response.ArrayResponse
import java.io.Serializable


@JsonClass(generateAdapter = true)
data class Node(
    var id: Long?,
    var testId: Long?,
    var testName: String?,
    var lessonId: Long?,
    var lessonName: String?,
    var walkThrough: Boolean?,
    var successfullyCompleted: Boolean?,
): Serializable {
    var countOfCorrectAnswers: Long = 0
    var countOfIncorrectAnswers: Long = 0

    // predci
    var previousNodes: List<Long> = listOf()

    // naslednici
    var subsequentNode: List<Long> = listOf()

//    fun setCount(count: Long) {
//        countOfCorrectAnswers = count
//    }

//    fun getId(): Long? {
//        return id
//    }

}


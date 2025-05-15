package cz.mendelu.pef.microlearning.model

import com.squareup.moshi.JsonClass
import java.io.Serializable


@JsonClass(generateAdapter = true)
data class Node(
    var id: Long?,

//    var testId: Long?,
//    var testName: String?,

    var lessonId: Long?,
    var lessonName: String?,
    var lessonOrdinalNumber: Int?,

    var level: Int?,

    var questionDepth: Int?,
    var levelDepth: Int?,

    var walkThrough: Boolean?,
    var successfullyCompleted: Boolean?,
): Serializable {
    var countOfCorrectAnswers: Long = 0
    var countOfIncorrectAnswers: Long = 0

    // predci
    var previousNodesIds: List<Long> = mutableListOf()

    // naslednici
    var subsequentNodeIds: List<Long> = mutableListOf()

//    fun setCount(count: Long) {
//        countOfCorrectAnswers = count
//    }

//    fun getId(): Long? {
//        return id
//    }

}


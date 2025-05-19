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
    var countOfCorrectAnswers: Int = 0
    var countOfIncorrectAnswers: Int = 0

    // predci
    var previousNodesIds: List<Long> = mutableListOf()

    // naslednici
    var subsequentNodeIds: List<Long> = mutableListOf()

    override fun toString(): String {
        return "Node{id=$id, lessonId=$lessonId, lessonName=$lessonName, lessonOrdinalNumber=$lessonOrdinalNumber,\n" +
                "walkThrough=$walkThrough\n" +
                "countOfCorrectAnswers=$countOfCorrectAnswers, countOfIncorrectAnswers= $countOfIncorrectAnswers, " +
                "previousNodesIds=$previousNodesIds, subsequentNodeIds=$subsequentNodeIds"
    }

    fun result(): String {
        return "Node{id=$id, lessonName=$lessonName}"
    }
}


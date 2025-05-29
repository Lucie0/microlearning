package cz.mendelu.pef.microlearning.model.db

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.squareup.moshi.JsonClass
import cz.mendelu.pef.microlearning.model.api.Node
import java.io.Serializable

@Entity(tableName = "node", primaryKeys = ["node_id", "saved_topic_id"])
data class NodeDB(
//    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "node_id")
    var nodeId: Long,

    @ColumnInfo(name = "saved_topic_id")
    var savedTopicId: Long
): Serializable {
    @ColumnInfo(name = "walk_through")
    var walkThrough: Boolean = false

    @ColumnInfo(name = "successfully_completed")
    var successfullyCompleted: Boolean = false

    @ColumnInfo(name = "count_of_correct_answers")
    var countOfCorrectAnswers: Int = 0

    @ColumnInfo(name = "count_of_incorrect_answers")
    var countOfIncorrectAnswers: Int = 0
    // dostahuju z API
    //    // predci
//    var previousNodesIds: List<Long> = mutableListOf()
//
//    // naslednici
//    var subsequentNodeIds: List<Long> = mutableListOf()

    override fun toString(): String {
        return "NodeDB {nodeId=$nodeId,"+
                "walkThrough=$walkThrough, successfullyCompleted=$successfullyCompleted\n" +
                "countOfCorrectAnswers=$countOfCorrectAnswers, countOfIncorrectAnswers= $countOfIncorrectAnswers}"
//                "previousNodesIds=$previousNodesIds, subsequentNodeIds=$subsequentNodeIds"
    }

    fun fromNode(node: Node){
        this.nodeId = node.id ?: -1L
        this.countOfCorrectAnswers = node.countOfCorrectAnswers
        this.countOfIncorrectAnswers = node.countOfIncorrectAnswers

        this.successfullyCompleted = node.successfullyCompleted ?: false
        this.walkThrough = node.walkThrough ?: false
    }
}


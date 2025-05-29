package cz.mendelu.pef.microlearning.model.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "saved_topic")
data class SavedTopic(
    @ColumnInfo(name = "topic")
    var topicId: Long,

    @ColumnInfo(name = "name")
    var name: String,

    @ColumnInfo(name = "actual_node_id")
    // id nodu, ze ktereho mam pokracovat dale
    var actualNodeId: Long,

    @ColumnInfo(name = "mode_number")
    // cislo modu, ke kteremu se rozpracovany graf vaze
    var modeNumber: Int

) : Serializable {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: Int? = null
}

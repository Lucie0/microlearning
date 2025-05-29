package cz.mendelu.pef.microlearning.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import cz.mendelu.pef.microlearning.model.db.NodeDB
import cz.mendelu.pef.microlearning.model.db.SavedTopic
import kotlinx.coroutines.flow.Flow

@Dao
interface MicrolearningDao {
//    @Query("SELECT * FROM labels ORDER BY name")
//    fun getAllLabels(): Flow<List<Label>>
//
//    @Query("SELECT * FROM places ORDER BY name")
//    fun getAllPlaces(): Flow<List<Place>>
//
//    @Insert
//    suspend fun insertPlace(item: Place): Long
//
//    @Delete
//    suspend fun deletePlace(item: Place)
//
//    @Query("SELECT * FROM places WHERE name = :name AND vicinity = :vicinity LIMIT 1")
//    suspend fun findPlace(name: String, vicinity: String): Place?

    @Query("SELECT * FROM saved_topic")
    fun getAllSavedTopics(): Flow<List<SavedTopic>>

    @Insert
    suspend fun insertSavedTopic(item: SavedTopic): Long

    @Delete
    suspend fun deleteSavedTopic(item: SavedTopic)

    @Query("SELECT * FROM node")
    fun getAllNodes(): Flow<List<NodeDB>>

    @Insert
    suspend fun insertNode(item: NodeDB): Long

    @Delete
    suspend fun deleteNode(item: NodeDB)
}

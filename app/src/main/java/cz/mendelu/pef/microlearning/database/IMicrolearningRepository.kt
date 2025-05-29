package cz.mendelu.pef.microlearning.database

import cz.mendelu.pef.microlearning.model.db.NodeDB
import cz.mendelu.pef.microlearning.model.db.SavedTopic
import kotlinx.coroutines.flow.Flow

interface IMicrolearningRepository {

    fun getAllSavedTopics(): Flow<List<SavedTopic>>
    suspend fun insertSavedTopic(item: SavedTopic): Long
    suspend fun deleteSavedTopic(item: SavedTopic)

    fun getAllNodes(): Flow<List<NodeDB>>
    suspend fun insertNode(item: NodeDB): Long
    suspend fun deleteNode(item: NodeDB)



//    fun getAllLabels(): Flow<List<Label>>
//
//    fun getAllPlaces(): Flow<List<Place>>
//    suspend fun insertPlace(item: Place): Long
//    suspend fun deletePlace(item: Place)
//    suspend fun findPlace(item: Place): Place?
}

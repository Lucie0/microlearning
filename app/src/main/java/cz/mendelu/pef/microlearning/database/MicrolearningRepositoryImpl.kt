package cz.mendelu.pef.microlearning.database

import cz.mendelu.pef.microlearning.model.db.NodeDB
import cz.mendelu.pef.microlearning.model.db.SavedTopic
import kotlinx.coroutines.flow.Flow

class MicrolearningRepositoryImpl(private val dao: MicrolearningDao) : IMicrolearningRepository {
    //    override fun getAllLabels(): Flow<List<Label>> {
//        return dao.getAllLabels()
//    }
//
//    override fun getAllPlaces(): Flow<List<Place>> {
//        return dao.getAllPlaces()
//    }
//
//    override suspend fun insertPlace(item: Place): Long {
//        return dao.insertPlace(item)
//    }
//
//    override suspend fun deletePlace(item: Place) {
//        return dao.deletePlace(item)
//    }
//
//    override suspend fun findPlace(item: Place): Place? {
//        return dao.findPlace(item.name, item.vicinity)
//    }
    override fun getAllSavedTopics(): Flow<List<SavedTopic>> {
        return dao.getAllSavedTopics()
    }

    override suspend fun insertSavedTopic(item: SavedTopic): Long {
        return dao.insertSavedTopic(item)
    }

    override suspend fun deleteSavedTopic(item: SavedTopic) {
        return dao.deleteSavedTopic(item)
    }

    override fun getAllNodes(): Flow<List<NodeDB>> {
        return dao.getAllNodes()
    }

    override suspend fun insertNode(item: NodeDB): Long {
        return dao.insertNode(item)
    }

    override suspend fun deleteNode(item: NodeDB) {
        return dao.deleteNode(item)
    }

}

package cz.mendelu.pef.microlearning.communication

import cz.mendelu.pef.microlearning.architecture.CommunicationResult
import cz.mendelu.pef.microlearning.model.Lesson
import cz.mendelu.pef.microlearning.model.response.ArrayResponse
import cz.mendelu.pef.microlearning.model.response.ObjectResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class RemoteRepositoryImpl @Inject constructor(private val api: API) : IRemoteRepository {

    override suspend fun getLessons(): CommunicationResult<ArrayResponse<Lesson>> {
        return processResponse(
            withContext(Dispatchers.IO) { // zpracovani bude bezet na vlakne pro zbracovani veci na pozadi -- DB, ....
                api.getLessons()
            }
        )
    }

    override suspend fun getLessonById(id: Long): CommunicationResult<ObjectResponse<Lesson>> {
        return processResponse(
            withContext(Dispatchers.IO) { // zpracovani bude bezet na vlakne pro zbracovani veci na pozadi -- DB, ....
                api.getLessonById(id)
            }
        )
    }

}
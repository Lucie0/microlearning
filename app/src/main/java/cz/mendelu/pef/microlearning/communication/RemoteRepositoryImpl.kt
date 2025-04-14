package cz.mendelu.pef.microlearning.communication

import cz.mendelu.pef.microlearning.architecture.CommunicationResult
import cz.mendelu.pef.microlearning.model.Lesson
import cz.mendelu.pef.microlearning.model.LinkAfter
import cz.mendelu.pef.microlearning.model.LinkBefore
import cz.mendelu.pef.microlearning.model.Node
import cz.mendelu.pef.microlearning.model.Question
import cz.mendelu.pef.microlearning.model.Test
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

    override suspend fun getQuestions(): CommunicationResult<ArrayResponse<Question>> {
        return processResponse(
            withContext(Dispatchers.IO) {
                api.getQuestions()
            }
        )
    }

    override suspend fun getQuestionById(id: Long): CommunicationResult<ObjectResponse<Question>> {
        return processResponse(
            withContext(Dispatchers.IO) {
                api.getQuestionById(id)
            }
        )
    }

    override suspend fun getNodes(): CommunicationResult<ArrayResponse<Node>> {
        return processResponse(
            withContext(Dispatchers.IO) {
                api.getNodes()
            }
        )
    }

    override suspend fun getNodeById(id: Long): CommunicationResult<ObjectResponse<Node>> {
        return processResponse(
            withContext(Dispatchers.IO) {
                api.getNodeById(id)
            }
        )
    }

    override suspend fun getNodeAfter(id: Long): CommunicationResult<ArrayResponse<LinkAfter>> {
        return processResponse(
            withContext(Dispatchers.IO) {
                api.getNodeAfter(id)
            }
        )
    }

    override suspend fun getNodeBefore(id: Long): CommunicationResult<ArrayResponse<LinkBefore>> {
        return processResponse(
            withContext(Dispatchers.IO) {
                api.getNodeBefore(id)
            }
        )
    }


    override suspend fun getTests(): CommunicationResult<ArrayResponse<Test>> {
        return processResponse(
            withContext(Dispatchers.IO) {
                api.getTests()
            }
        )
    }

    override suspend fun getTestById(id: Long): CommunicationResult<ObjectResponse<Test>> {
        return processResponse(
            withContext(Dispatchers.IO) {
                api.getTestById(id)
            }
        )
    }

}
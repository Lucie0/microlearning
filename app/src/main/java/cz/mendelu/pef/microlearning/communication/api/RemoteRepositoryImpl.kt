package cz.mendelu.pef.microlearning.communication.api

import cz.mendelu.pef.microlearning.architecture.CommunicationResult
import cz.mendelu.pef.microlearning.model.api.Lesson
import cz.mendelu.pef.microlearning.model.api.LessonShorter
import cz.mendelu.pef.microlearning.model.api.LinkAfter
import cz.mendelu.pef.microlearning.model.api.LinkBefore
import cz.mendelu.pef.microlearning.model.api.Node
import cz.mendelu.pef.microlearning.model.api.Question
import cz.mendelu.pef.microlearning.model.api.Test
import cz.mendelu.pef.microlearning.model.api.Topic
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

    override suspend fun getLessonsShorter(): CommunicationResult<ArrayResponse<LessonShorter>> {
        return processResponse(
            withContext(Dispatchers.IO) {
                api.getLessonsShorter()
            }
        )
    }

    override suspend fun getLessonsShorterByTopicId(topicId: Long): CommunicationResult<ArrayResponse<LessonShorter>> {
        return processResponse(
            withContext(Dispatchers.IO) {
                api.getLessonsShorterByTopicId(topicId)
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

    override suspend fun getLessonsByTopicId(topicId: Long): CommunicationResult<ArrayResponse<Lesson>> {
        return processResponse(
            withContext(Dispatchers.IO) {
                api.getLessonsByTopicId(topicId)
            }
        )
    }

    override suspend fun getLessonsByTopicIdAndOrdinalNumber(
        topicId: Long,
        ordinalNumber: Int
    ): CommunicationResult<ObjectResponse<Lesson>> {
        return processResponse(
            withContext(Dispatchers.IO) {
                api.getLessonByIdByTopicIdAndOrdinalNumber(topicId, ordinalNumber)
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

    override suspend fun getQuestionsByLessonId(lessonId: Long): CommunicationResult<ArrayResponse<Question>> {
        return processResponse(
            withContext(Dispatchers.IO) {
                api.getQuestionsByLessonId(lessonId)
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

    override suspend fun getNodesAfter(id: Long): CommunicationResult<ArrayResponse<LinkAfter>> {
        return processResponse(
            withContext(Dispatchers.IO) {
                api.getNodeAfter(id)
            }
        )
    }

    override suspend fun getNodesBefore(id: Long): CommunicationResult<ArrayResponse<LinkBefore>> {
        return processResponse(
            withContext(Dispatchers.IO) {
                api.getNodeBefore(id)
            }
        )
    }

    override suspend fun getNodesByTopic(topicId: Long): CommunicationResult<ArrayResponse<Node>> {
        return processResponse(
            withContext(Dispatchers.IO) {
                api.getNodesByTopic(topicId)
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

    override suspend fun getTopics(): CommunicationResult<ArrayResponse<Topic>> {
        return processResponse(
            withContext(Dispatchers.IO) {
                api.getTopics()
            }
        )
    }

    override suspend fun getTopicById(id: Long): CommunicationResult<ObjectResponse<Topic>> {
        return processResponse(
            withContext(Dispatchers.IO) {
                api.getTopicById(id)
            }
        )    }


}
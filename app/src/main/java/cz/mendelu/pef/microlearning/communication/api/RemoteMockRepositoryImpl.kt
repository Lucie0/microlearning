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

class RemoteMockRepositoryImpl() : IRemoteRepository {

    var exception: Boolean = false
    var connectionError: Boolean = false
    var error: Boolean = false

    override suspend fun getLessons(): CommunicationResult<ArrayResponse<Lesson>> {
        return CommunicationResult.Success(
            ArrayResponse(
                items = listOf(
                    Lesson(
                        content = "Content of Lesson",
                        id = 1,
                        name = "Hello World",
//                        nodeId = 1,
                        ordinalNumber = 2,
//                        questions = null,
                        topic = "Main Topic"
                    )
                ),
                count = 0,
                version = 1
            )
        )
    }

    override suspend fun getLessonsShorter(): CommunicationResult<ArrayResponse<LessonShorter>> {
        TODO("Not yet implemented")
    }

    override suspend fun getLessonsShorterByTopicId(topicId: Long): CommunicationResult<ArrayResponse<LessonShorter>> {
        TODO("Not yet implemented")
    }

    override suspend fun getLessonById(id: Long): CommunicationResult<ObjectResponse<Lesson>> {
        return CommunicationResult.Success(
            ObjectResponse(Lesson(1, "lesson", 1,"content",  "Main Topic"), version = 1)
        )
    }

    override suspend fun getQuestions(): CommunicationResult<ArrayResponse<Question>> {
        TODO("Not yet implemented")
    }

    override suspend fun getQuestionById(id: Long): CommunicationResult<ObjectResponse<Question>> {
        TODO("Not yet implemented")
    }

    override suspend fun getQuestionsByLessonId(lessonId: Long): CommunicationResult<ArrayResponse<Question>> {
        TODO("Not yet implemented")
    }

    override suspend fun getNodes(): CommunicationResult<ArrayResponse<Node>> {
        TODO("Not yet implemented")
    }

    override suspend fun getNodeById(id: Long): CommunicationResult<ObjectResponse<Node>> {
        TODO("Not yet implemented")
    }

    override suspend fun getNodesAfter(id: Long): CommunicationResult<ArrayResponse<LinkAfter>> {
        TODO("Not yet implemented")
    }

    override suspend fun getNodesBefore(id: Long): CommunicationResult<ArrayResponse<LinkBefore>> {
        TODO("Not yet implemented")
    }

    override suspend fun getNodesByTopic(topicId: Long): CommunicationResult<ArrayResponse<Node>> {
        TODO("Not yet implemented")
    }

    override suspend fun getTests(): CommunicationResult<ArrayResponse<Test>> {
        TODO("Not yet implemented")
    }

    override suspend fun getTestById(id: Long): CommunicationResult<ObjectResponse<Test>> {
        TODO("Not yet implemented")
    }

    override suspend fun getTopics(): CommunicationResult<ArrayResponse<Topic>> {
        TODO("Not yet implemented")
    }

    override suspend fun getLessonsByTopicId(topicId: Long): CommunicationResult<ArrayResponse<Lesson>> {
        TODO("Not yet implemented")
    }

    override suspend fun getLessonsByTopicIdAndOrdinalNumber(
        topicId: Long,
        ordinalNumber: Int
    ): CommunicationResult<ObjectResponse<Lesson>> {
        TODO("Not yet implemented")
    }
}
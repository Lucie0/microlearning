package cz.mendelu.pef.microlearning.communication.api

import cz.mendelu.pef.microlearning.architecture.CommunicationResult
import cz.mendelu.pef.microlearning.architecture.IBaseRemoteRepository
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
import retrofit2.http.Path


interface IRemoteRepository : IBaseRemoteRepository {

    suspend fun getLessons() : CommunicationResult<ArrayResponse<Lesson>>
    suspend fun getLessonsShorter() : CommunicationResult<ArrayResponse<LessonShorter>>
    suspend fun getLessonsShorterByTopicId(@Path("topicId") topicId: Long) : CommunicationResult<ArrayResponse<LessonShorter>>

    suspend fun getLessonById(@Path("id") id: Long) : CommunicationResult<ObjectResponse<Lesson>>
    suspend fun getLessonsByTopicId(@Path("id") topicId: Long): CommunicationResult<ArrayResponse<Lesson>>
    suspend fun getLessonsByTopicIdAndOrdinalNumber(
        @Path("topicId") topicId: Long,
        @Path("ordinalNumber") ordinalNumber: Int
    ): CommunicationResult<ObjectResponse<Lesson>>


    suspend fun getQuestions() : CommunicationResult<ArrayResponse<Question>>
    suspend fun getQuestionById(@Path("id") id: Long) : CommunicationResult<ObjectResponse<Question>>
    suspend fun getQuestionsByLessonId(@Path("lessonId") lessonId: Long) : CommunicationResult<ArrayResponse<Question>>

    suspend fun getNodes() : CommunicationResult<ArrayResponse<Node>>
    suspend fun getNodeById(@Path("id") id: Long) : CommunicationResult<ObjectResponse<Node>>
    suspend fun getNodesAfter(@Path("id") id: Long) : CommunicationResult<ArrayResponse<LinkAfter>>
    suspend fun getNodesBefore(@Path("id") id: Long) : CommunicationResult<ArrayResponse<LinkBefore>>
    suspend fun getNodesByTopic(@Path("topicId") topicId: Long) : CommunicationResult<ArrayResponse<Node>>

    suspend fun getTests() : CommunicationResult<ArrayResponse<Test>>
    suspend fun getTestById(@Path("id") id: Long) : CommunicationResult<ObjectResponse<Test>>

    suspend fun getTopics() : CommunicationResult<ArrayResponse<Topic>>
    suspend fun getTopicById(id: Long) : CommunicationResult<ObjectResponse<Topic>>


}

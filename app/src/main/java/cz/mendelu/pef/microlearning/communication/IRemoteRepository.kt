package cz.mendelu.pef.microlearning.communication

import cz.mendelu.pef.microlearning.architecture.CommunicationResult
import cz.mendelu.pef.microlearning.architecture.IBaseRemoteRepository
import cz.mendelu.pef.microlearning.model.response.ArrayResponse
import cz.mendelu.pef.microlearning.model.Lesson
import cz.mendelu.pef.microlearning.model.Node
import cz.mendelu.pef.microlearning.model.Question
import cz.mendelu.pef.microlearning.model.Test
import cz.mendelu.pef.microlearning.model.response.ObjectResponse
import retrofit2.Response
import retrofit2.http.Path


interface IRemoteRepository : IBaseRemoteRepository {

    suspend fun getLessons() : CommunicationResult<ArrayResponse<Lesson>>
    suspend fun getLessonById(@Path("id") id: Long) : CommunicationResult<ObjectResponse<Lesson>>
    suspend fun getQuestions() : CommunicationResult<ArrayResponse<Question>>
    suspend fun getQuestionById(@Path("id") id: Long) : CommunicationResult<ObjectResponse<Question>>

    suspend fun getNodes() : CommunicationResult<ArrayResponse<Node>>
    suspend fun getNodeById(@Path("id") id: Long) : CommunicationResult<ObjectResponse<Node>>
    suspend fun getTests() : CommunicationResult<ArrayResponse<Test>>
    suspend fun getTestById(@Path("id") id: Long) : CommunicationResult<ObjectResponse<Test>>

}

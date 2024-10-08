package cz.mendelu.pef.microlearning.communication

import cz.mendelu.pef.microlearning.architecture.CommunicationResult
import cz.mendelu.pef.microlearning.architecture.IBaseRemoteRepository
import cz.mendelu.pef.microlearning.model.response.ArrayResponse
import cz.mendelu.pef.microlearning.model.Lesson
import cz.mendelu.pef.microlearning.model.response.ObjectResponse
import retrofit2.Response
import retrofit2.http.Path


interface IRemoteRepository : IBaseRemoteRepository {

    suspend fun getLessons() : CommunicationResult<ArrayResponse<Lesson>>
    suspend fun getLessonById(@Path("id") id: Long) : CommunicationResult<ObjectResponse<Lesson>>

}

package cz.mendelu.pef.microlearning.communication

import cz.mendelu.pef.microlearning.model.response.ArrayResponse
import cz.mendelu.pef.microlearning.model.Lesson
import cz.mendelu.pef.microlearning.model.LinkAfter
import cz.mendelu.pef.microlearning.model.LinkBefore
import cz.mendelu.pef.microlearning.model.Node
import cz.mendelu.pef.microlearning.model.Question
import cz.mendelu.pef.microlearning.model.Test
import cz.mendelu.pef.microlearning.model.response.ObjectResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path

// todo network / timeout interceptor?
// nerozjet DB, pritom jedouci BE a zkusit zobrazit lekci,
// vyhodi to SockektTimeoutException --  jak to osetrit?


interface API {

    // base url + / + lessons
    // localhost:8090/lessons
    // https://d600-195-113-216-27.ngrok-free.app/lessons/1

    @Headers("ngrok-skip-browser-warning: 1")
    @GET("/lessons")
    suspend fun getLessons() : Response<ArrayResponse<Lesson>>

    @Headers("ngrok-skip-browser-warning: true")
    @GET("/lessons/{id}")
    suspend fun getLessonById(@Path("id") id: Long) : Response<ObjectResponse<Lesson>>

    @Headers("ngrok-skip-browser-warning: true")
    @GET("/questions")
    suspend fun getQuestions() : Response<ArrayResponse<Question>>

    @Headers("ngrok-skip-browser-warning: true")
    @GET("/questions/{id}")
    suspend fun getQuestionById(@Path("id") id: Long) : Response<ObjectResponse<Question>>

    @Headers("ngrok-skip-browser-warning: true")
    @GET("/nodes")
    suspend fun getNodes() : Response<ArrayResponse<Node>>

    @Headers("ngrok-skip-browser-warning: true")
    @GET("/nodes/{id}")
    suspend fun getNodeById(@Path("id") id: Long) : Response<ObjectResponse<Node>>

    @Headers("ngrok-skip-browser-warning: true")
    @GET("/links/after/{id}")
    suspend fun getNodeAfter(@Path("id") id: Long) : Response<ArrayResponse<LinkAfter>>

    @Headers("ngrok-skip-browser-warning: true")
    @GET("/links/before/{id}")
    suspend fun getNodeBefore(@Path("id") id: Long) : Response<ArrayResponse<LinkBefore>>

    @Headers("ngrok-skip-browser-warning: true")
    @GET("/tests")
    suspend fun getTests() : Response<ArrayResponse<Test>>

    @Headers("ngrok-skip-browser-warning: true")
    @GET("/tests/{id}")
    suspend fun getTestById(@Path("id") id: Long) : Response<ObjectResponse<Test>>

}
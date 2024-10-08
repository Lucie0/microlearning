package cz.mendelu.pef.microlearning.communication

import cz.mendelu.pef.microlearning.model.response.ArrayResponse
import cz.mendelu.pef.microlearning.model.Lesson
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

}
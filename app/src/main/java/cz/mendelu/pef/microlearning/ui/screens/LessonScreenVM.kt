package cz.mendelu.pef.microlearning.ui.screens

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import cz.mendelu.pef.microlearning.R
import cz.mendelu.pef.microlearning.architecture.BaseViewModel
import cz.mendelu.pef.microlearning.architecture.CommunicationResult
import cz.mendelu.pef.microlearning.communication.RemoteRepositoryImpl
import cz.mendelu.pef.microlearning.model.Lesson
import cz.mendelu.pef.microlearning.model.UiState
import cz.mendelu.pef.microlearning.model.response.ArrayResponse
import cz.mendelu.pef.microlearning.model.response.ObjectResponse
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

@HiltViewModel
class LessonScreenVM @Inject constructor(
    private val remoteRepository: RemoteRepositoryImpl
) : BaseViewModel() {

    // uistate
    val lessonsUiState: MutableState<UiState<ObjectResponse<Lesson>, LessonsErrors>> = mutableStateOf(UiState())
    var lessonId: Long? = null

    init {
        getLessonById()
    }

    //  getLessons + getLesson
    fun getLessonById() {
        if (lessonId != null) {
            launch {
                val result =
                    withContext(Dispatchers.IO) {
                        remoteRepository.getLessonById(lessonId!!)
                    }

                when (result) {
                    is CommunicationResult.ConnectionError -> {
                        lessonsUiState.value = UiState(
                            loading = false,
                            data = null,
                            errors = LessonsErrors(R.string.communication_error) // "communication error" resource code
                        )
                    }

                    is CommunicationResult.Error -> {
                        println(result.error)
                        if (result.error.code == 500) {
                            lessonsUiState.value = UiState(
                                loading = false,
                                data = null,
                                errors = LessonsErrors(R.string.some_unexpected_error) // "exception" resource code
                            )
                        } else if (result.error.code == 404) {
                            lessonsUiState.value = UiState(
                                loading = false,
                                data = null,
                                errors = LessonsErrors(R.string.wrong_lesson_id) // "exception" resource code
                            )
                        }
                    }

                    is CommunicationResult.Exception -> {
                        lessonsUiState.value = UiState(
                            loading = false,
                            data = null,
                            errors = LessonsErrors(R.string.unknown_error) // "exception" resource code
                        )
                    }

                    is CommunicationResult.Success -> {
                        if (result.data != null) {
                            lessonsUiState.value = UiState(
                                loading = false,
                                data = result.data,
                                errors = null
                            )
                        } else {
                            lessonsUiState.value = UiState(
                                loading = false,
                                data = null,
                                errors = LessonsErrors(R.string.no_data) // "exception" resource code
                            )
                        }
                    }
                }
            }
        }
    }

//    fun getLessons() {
//        launch {
//            val result =
//                withContext(Dispatchers.IO) {
//                    remoteRepository.getLessons()
//                }
//            when (result) {
//                is CommunicationResult.ConnectionError -> {
//                    lessonsUiState.value = UiState(
//                        loading = false,
//                        data = null,
//                        errors = LessonsErrors(R.string.communication_error) // "communication error" resource code
//                    )
//
//                }
//
//                is CommunicationResult.Error -> {
//                    lessonsUiState.value = UiState(
//                        loading = false,
//                        data = null,
//                        errors = LessonsErrors(R.string.some_error) // "exception" resource code
//                    )
//                }
//
//                is CommunicationResult.Exception -> {
//                    lessonsUiState.value = UiState(
//                        loading = false,
//                        data = null,
//                        errors = LessonsErrors(R.string.unknown_error) // "exception" resource code
//                    )
//                }
//
//                is CommunicationResult.Success -> {
//                    if (result.data.items?.isNotEmpty() == true) {
//                        // neprazdny list
//                        lessonsUiState.value = UiState(
//                            loading = false,
//                            data = result.data,
//                            errors = null
//                        )
//                    } else {
//                        // prazdny list
//                        lessonsUiState.value = UiState(
//                            loading = false,
//                            data = null,
//                            errors = LessonsErrors(R.string.empty_list)
//                        )
//                    }
//                }
//            }
//        }
//    }


}
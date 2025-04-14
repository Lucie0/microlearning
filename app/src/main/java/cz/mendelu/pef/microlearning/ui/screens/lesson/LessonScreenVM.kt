package cz.mendelu.pef.microlearning.ui.screens.lesson

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import cz.mendelu.pef.microlearning.R
import cz.mendelu.pef.microlearning.architecture.BaseViewModel
import cz.mendelu.pef.microlearning.architecture.CommunicationResult
import cz.mendelu.pef.microlearning.communication.RemoteRepositoryImpl
import cz.mendelu.pef.microlearning.model.Lesson
import cz.mendelu.pef.microlearning.model.LinkAfter
import cz.mendelu.pef.microlearning.model.UiState
import cz.mendelu.pef.microlearning.model.response.ObjectResponse
import cz.mendelu.pef.microlearning.ui.screens.MainErrors
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
    val lessonsUiState: MutableState<UiState<LessonData, LessonsErrors>> =
        mutableStateOf(UiState())
//    val linkAfterUiState: MutableState<UiState<ObjectResponse<LinkAfter>, LessonsErrors>> =
//        mutableStateOf(UiState())

    var data = LessonData(null, null, null)
    var lessonId: Long? = null

    var actualNodeId: Long? = null
    var nextNodeId: Long? = null

//    init {
//        getLessonById()
//    }


    fun getData(){
        getLessonById()
        getNextNodeId()
    }
    //  getLesson
    private fun getLessonById() {
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
                        when (result.error.code) {
                            500 -> {
                                lessonsUiState.value = UiState(
                                    loading = false,
                                    data = null,
                                    errors = LessonsErrors(R.string.some_unexpected_error) // "exception" resource code
                                )
                            }

                            404 -> {
                                lessonsUiState.value = UiState(
                                    loading = false,
                                    data = null,
                                    errors = LessonsErrors(R.string.not_found) // "not found" resource code
                                )
                            }

                            else -> {
                                lessonsUiState.value = UiState(
                                    loading = false,
                                    data = null,
                                    errors = LessonsErrors(R.string.something_went_wrong_please_reload_screen)
                                )
                            }
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
                            data.lesson = result.data

                            lessonsUiState.value = UiState(
                                loading = false,
                                data = data,
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

    private fun getNextNodeId() {
        if (actualNodeId != null) {
            launch {
                val result = withContext(Dispatchers.IO) {
                    remoteRepository.getNodeAfter(actualNodeId!!)
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
                        when (result.error.code) {
                            500 -> {
                                lessonsUiState.value = UiState(
                                    loading = false,
                                    data = null,
                                    errors = LessonsErrors(R.string.some_unexpected_error) // "exception" resource code
                                )
                            }

                            404 -> {
                                lessonsUiState.value = UiState(
                                    loading = false,
                                    data = null,
                                    errors = LessonsErrors(R.string.not_found) // "not found" resource code
                                )
                            }

                            else -> {
                                lessonsUiState.value = UiState(
                                    loading = false,
                                    data = null,
                                    errors = LessonsErrors(R.string.something_went_wrong_please_reload_screen)
                                )
                            }
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
                            data.linkAfter = result.data
//                            nextNodeId = result.data.items?.getOrNull(0)?.nextNodeId

                            lessonsUiState.value = UiState(
                                loading = false,
                                data = data,
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

//    private suspend fun getNodeById(nextNodeId: Long) {
////        launch {
//            val result =
//                withContext(Dispatchers.IO) {
//                    remoteRepository.getNodeById(nextNodeId)
//                }
//
//            when (result) {
//                is CommunicationResult.ConnectionError -> {
//                    lessonsUiState.value = UiState(
//                        loading = false,
//                        data = null,
//                        errors = MainErrors(R.string.communication_error) // "communication error" resource code
//                    )
//                }
//
//                is CommunicationResult.Error -> {
//                    println(result.error)
//                    when (result.error.code) {
//                        500 -> {
//                            mainUiState.value = UiState(
//                                loading = false,
//                                data = null,
//                                errors = MainErrors(R.string.some_unexpected_error) // "exception" resource code
//                            )
//                        }
//
//                        404 -> {
//                            mainUiState.value = UiState(
//                                loading = false,
//                                data = null,
//                                errors = MainErrors(R.string.not_found) // "not found" resource code
//                            )
//                        }
//
//                        else -> {
//                            mainUiState.value = UiState(
//                                loading = false,
//                                data = null,
//                                errors = MainErrors(R.string.something_went_wrong_please_reload_screen)
//                            )
//                        }
//                    }
//                }
//
//                is CommunicationResult.Exception -> {
//                    mainUiState.value = UiState(
//                        loading = false,
//                        data = null,
//                        errors = MainErrors(R.string.unknown_error) // "exception" resource code
//                    )
//                }
//
//                is CommunicationResult.Success -> {
//                    if (result.data != null) {
//                        mainUiState.value = UiState(
//                            loading = false,
//                            data = result.data,
//                            errors = null
//                        )
//                    } else {
//                        mainUiState.value = UiState(
//                            loading = false,
//                            data = null,
//                            errors = MainErrors(R.string.no_data) // "exception" resource code
//                        )
//                    }
//                }
//            }
//        }
//    }
}
package cz.mendelu.pef.microlearning.ui.screens.lesson

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import cz.mendelu.pef.microlearning.R
import cz.mendelu.pef.microlearning.architecture.BaseViewModel
import cz.mendelu.pef.microlearning.architecture.CommunicationResult
import cz.mendelu.pef.microlearning.communication.IRemoteRepository
import cz.mendelu.pef.microlearning.communication.NetworkInterceptor
import cz.mendelu.pef.microlearning.communication.RemoteMockRepositoryImpl
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
    private val remoteRepository: IRemoteRepository
) : BaseViewModel() {

    // uistate
    val lessonsUiState: MutableState<UiState<LessonData, LessonsErrors>> =
        mutableStateOf(UiState())
//    val linkAfterUiState: MutableState<UiState<ObjectResponse<LinkAfter>, LessonsErrors>> =
//        mutableStateOf(UiState())

    var data = LessonData()
    var lessonId: Long? = null
    var actualNodeId: Long? = null
    var lessonOrdinalNumber: Int? = null
    var topicId: Long? = null

    var nextNodeId: Long? = null

//    init {
//        getLessonById()
//    }

    fun getData(){
        if (NetworkInterceptor.isNetworkConnected()) {
            if (lessonId != null) {
                // Tuition a testing mode -- kombinace lessonId a nodeId
                getLessonById()
                getNextNodeId()
            }
            if (lessonOrdinalNumber != null){
                // todo kdyz je revision mode -- stahnout lekci dle kobinace ordinalNumber--topicId
            }
        } else {
            println("Network not connected")
            lessonsUiState.value = UiState(
                loading = false,
                data = null,
                errors = LessonsErrors(R.string.network_is_not_connected) // "communication error" resource code
            )
        }
    }

    //  getLesson
    private fun getLessonById() {
        if (lessonId != null) {
            launch {
                sGetLessonById()
            }
        }
    }

    suspend fun sGetLessonById(){
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

    fun getNextNodeId() {
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
                            println("ac:$actualNodeId")
                            println("count:" + data.linkAfter?.count)
                            if (result.data.count > 0) {
                                getNodeById(result.data.items?.get(0)?.nextNodeId!!)
                            }
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

    private suspend fun getNodeById(nextNodeId: Long) {
        launch {
            val result =
                withContext(Dispatchers.IO) {
                    remoteRepository.getNodeById(nextNodeId)
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
                        data.nextNode = result.data
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
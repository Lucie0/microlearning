package cz.mendelu.pef.microlearning.ui.screens.chooseLesson

import android.content.Context
import android.net.ConnectivityManager
import android.net.wifi.WifiManager
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.core.content.ContextCompat.getSystemService
import cz.mendelu.pef.microlearning.MainApplication
import cz.mendelu.pef.microlearning.R
import cz.mendelu.pef.microlearning.architecture.BaseViewModel
import cz.mendelu.pef.microlearning.architecture.CommunicationResult
import cz.mendelu.pef.microlearning.communication.NetworkInterceptor
import cz.mendelu.pef.microlearning.communication.RemoteRepositoryImpl
import cz.mendelu.pef.microlearning.model.Node
import cz.mendelu.pef.microlearning.model.UiState
import cz.mendelu.pef.microlearning.model.response.ObjectResponse
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject


@HiltViewModel
class ChooseLessonVM @Inject constructor(
    private val remoteRepository: RemoteRepositoryImpl
) : BaseViewModel() {

    // uistate
    val uiState: MutableState<UiState<ChooseLessonData, ChooseLessonErrors>> = mutableStateOf(UiState())

    var data = ChooseLessonData()
    var topicId = 0L;

    fun getData() {
        if (NetworkInterceptor.isNetworkConnected()) {
            getLessonsByTopic()
        } else {
            println("Network not connected")
            uiState.value = UiState(
                loading = false,
                data = null,
                errors = ChooseLessonErrors(R.string.network_is_not_connected) // "communication error" resource code
            )
        }
    }

    private fun getLessonsByTopic() {
        if (topicId != 0L) {
            launch {
                val result =
                    withContext(Dispatchers.IO) {
                        remoteRepository.getLessonsByTopicId(topicId)
                    }

                when (result) {
                    is CommunicationResult.ConnectionError -> {
                        uiState.value = UiState(
                            loading = false,
                            data = null,
                            errors = ChooseLessonErrors(R.string.communication_error) // "communication error" resource code
                        )
                    }

                    is CommunicationResult.Error -> {
                        println(result.error)
                        when (result.error.code) {
                            500 -> {
                                uiState.value = UiState(
                                    loading = false,
                                    data = null,
                                    errors = ChooseLessonErrors(R.string.some_unexpected_error) // "exception" resource code
                                )
                            }

                            404 -> {
                                uiState.value = UiState(
                                    loading = false,
                                    data = null,
                                    errors = ChooseLessonErrors(R.string.not_found) // "not found" resource code
                                )
                            }

                            else -> {
                                uiState.value = UiState(
                                    loading = false,
                                    data = null,
                                    errors = ChooseLessonErrors(R.string.something_went_wrong_please_reload_screen)
                                )
                            }
                        }
                    }

                    is CommunicationResult.Exception -> {
                        uiState.value = UiState(
                            loading = false,
                            data = null,
                            errors = ChooseLessonErrors(R.string.unknown_error) // "exception" resource code
                        )
                    }

                    is CommunicationResult.Success -> {
                        if (result.data.items != null && result.data.items!!.isNotEmpty()) {
                            println("*** Success")
//                            println(result.data)
                            data.lessons = result.data
                            uiState.value = UiState(
                                loading = false,
                                data = data,
                                errors = null
                            )
                        } else {
                            uiState.value = UiState(
                                loading = false,
                                data = null,
                                errors = ChooseLessonErrors(R.string.no_data) // "exception" resource code
                            )
                        }
                    }
                }
            }
        }
    }
//
//    private fun getNodeById() {
//        launch {
//            val result =
//                withContext(Dispatchers.IO) {
//                    remoteRepository.getNodeById(nodeId)
//                }
//
//            when (result) {
//                is CommunicationResult.ConnectionError -> {
//                    uiState.value = UiState(
//                        loading = false,
//                        data = null,
//                        errors = ChooseLessonErrors(R.string.communication_error) // "communication error" resource code
//                    )
//                }
//
//                is CommunicationResult.Error -> {
//                    println(result.error)
//                    when (result.error.code) {
//                        500 -> {
//                            uiState.value = UiState(
//                                loading = false,
//                                data = null,
//                                errors = ChooseLessonErrors(R.string.some_unexpected_error) // "exception" resource code
//                            )
//                        }
//
//                        404 -> {
//                            uiState.value = UiState(
//                                loading = false,
//                                data = null,
//                                errors = ChooseLessonErrors(R.string.not_found) // "not found" resource code
//                            )
//                        }
//
//                        else -> {
//                            uiState.value = UiState(
//                                loading = false,
//                                data = null,
//                                errors = ChooseLessonErrors(R.string.something_went_wrong_please_reload_screen)
//                            )
//                        }
//                    }
//                }
//
//                is CommunicationResult.Exception -> {
//                    uiState.value = UiState(
//                        loading = false,
//                        data = null,
//                        errors = ChooseLessonErrors(R.string.unknown_error) // "exception" resource code
//                    )
//                }
//
//                is CommunicationResult.Success -> {
//                    if (result.data != null) {
//                        println("*** Success")
//                        println(result.data)
//                        data.node = result.data
//                        uiState.value = UiState(
//                            loading = false,
//                            data = data,
//                            errors = null
//                        )
//                    } else {
//                        uiState.value = UiState(
//                            loading = false,
//                            data = null,
//                            errors = ChooseLessonErrors(R.string.no_data) // "exception" resource code
//                        )
//                    }
//                }
//            }
//        }
//    }
//
//
//    private fun getAllTopics() {
//
//        launch {
//            val result =
//                withContext(Dispatchers.IO) {
//                    remoteRepository.getTopics()
//                }
//
//            when (result) {
//                is CommunicationResult.ConnectionError -> {
//                    uiState.value = UiState(
//                        loading = false,
//                        data = null,
//                        errors = ChooseLessonErrors(R.string.communication_error) // "communication error" resource code
//                    )
//                }
//
//                is CommunicationResult.Error -> {
//                    println(result.error)
//                    when (result.error.code) {
//                        500 -> {
//                            uiState.value = UiState(
//                                loading = false,
//                                data = null,
//                                errors = ChooseLessonErrors(R.string.some_unexpected_error) // "exception" resource code
//                            )
//                        }
//
//                        404 -> {
//                            uiState.value = UiState(
//                                loading = false,
//                                data = null,
//                                errors = ChooseLessonErrors(R.string.not_found) // "not found" resource code
//                            )
//                        }
//
//                        else -> {
//                            uiState.value = UiState(
//                                loading = false,
//                                data = null,
//                                errors = ChooseLessonErrors(R.string.something_went_wrong_please_reload_screen)
//                            )
//                        }
//                    }
//                }
//
//                is CommunicationResult.Exception -> {
//                    uiState.value = UiState(
//                        loading = false,
//                        data = null,
//                        errors = ChooseLessonErrors(R.string.unknown_error) // "exception" resource code
//                    )
//                }
//
//                is CommunicationResult.Success -> {
//                    if (result.data != null) {
//                        data.topics = result.data
//
//                        uiState.value = UiState(
//                            loading = false,
//                            data = data,
//                            errors = null
//                        )
//                    } else {
//                        uiState.value = UiState(
//                            loading = false,
//                            data = null,
//                            errors = ChooseLessonErrors(R.string.no_data) // "exception" resource code
//                        )
//                    }
//                }
//            }
//        }
//    }
//

}
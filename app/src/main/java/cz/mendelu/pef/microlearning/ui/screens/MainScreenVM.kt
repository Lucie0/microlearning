package cz.mendelu.pef.microlearning.ui.screens

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import cz.mendelu.pef.microlearning.R
import cz.mendelu.pef.microlearning.architecture.BaseViewModel
import cz.mendelu.pef.microlearning.architecture.CommunicationResult
import cz.mendelu.pef.microlearning.communication.api.NetworkInterceptor
import cz.mendelu.pef.microlearning.communication.api.RemoteRepositoryImpl
import cz.mendelu.pef.microlearning.database.IMicrolearningRepository
import cz.mendelu.pef.microlearning.database.MicrolearningRepositoryImpl
import cz.mendelu.pef.microlearning.model.UiState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject


@HiltViewModel
class MainScreenVM @Inject constructor(
    private val remoteRepository: RemoteRepositoryImpl
) : BaseViewModel() {

    // uistate
    val mainUiState: MutableState<UiState<MainData, MainErrors>> = mutableStateOf(UiState())
//    var lessonId: Long? = null

    var data = MainData()
    var myLLId: Long = 1L
    var nodeId: Long = 101L

//    private val context = getApplication<Application>().applicationContext

    init {
        if (NetworkInterceptor.isNetworkConnected()) {
            getNodeById()
            getAllTopics()
        } else {
            println("Network not connected")
            mainUiState.value = UiState(
                loading = false,
                data = null,
                errors = MainErrors(R.string.network_is_not_connected) // "communication error" resource code
            )
        }
    }

    private fun getNodeById() {
        launch {
            val result =
                withContext(Dispatchers.IO) {
                    remoteRepository.getNodeById(nodeId)
                }

            when (result) {
                is CommunicationResult.ConnectionError -> {
                    mainUiState.value = UiState(
                        loading = false,
                        data = null,
                        errors = MainErrors(R.string.communication_error) // "communication error" resource code
                    )
                }

                is CommunicationResult.Error -> {
                    println(result.error)
                    when (result.error.code) {
                        500 -> {
                            mainUiState.value = UiState(
                                loading = false,
                                data = null,
                                errors = MainErrors(R.string.some_unexpected_error) // "exception" resource code
                            )
                        }

                        404 -> {
                            mainUiState.value = UiState(
                                loading = false,
                                data = null,
                                errors = MainErrors(R.string.not_found) // "not found" resource code
                            )
                        }

                        else -> {
                            mainUiState.value = UiState(
                                loading = false,
                                data = null,
                                errors = MainErrors(R.string.something_went_wrong_please_reload_screen)
                            )
                        }
                    }
                }

                is CommunicationResult.Exception -> {
                    mainUiState.value = UiState(
                        loading = false,
                        data = null,
                        errors = MainErrors(R.string.unknown_error) // "exception" resource code
                    )
                }

                is CommunicationResult.Success -> {
                    if (result.data.content.id != null) {
                        println("*** Success MSVM")
                        println(result.data)
                        data.node = result.data
                        mainUiState.value = UiState(
                            loading = false,
                            data = data,
                            errors = null
                        )
                    } else {
                        mainUiState.value = UiState(
                            loading = false,
                            data = null,
                            errors = MainErrors(R.string.no_data) // "exception" resource code
                        )
                    }
                }
            }
        }
    }


    private fun getAllTopics() {

        launch {
            val result =
                withContext(Dispatchers.IO) {
                    remoteRepository.getTopics()
                }

            when (result) {
                is CommunicationResult.ConnectionError -> {
                    mainUiState.value = UiState(
                        loading = false,
                        data = null,
                        errors = MainErrors(R.string.communication_error) // "communication error" resource code
                    )
                }

                is CommunicationResult.Error -> {
                    println(result.error)
                    when (result.error.code) {
                        500 -> {
                            mainUiState.value = UiState(
                                loading = false,
                                data = null,
                                errors = MainErrors(R.string.some_unexpected_error) // "exception" resource code
                            )
                        }

                        404 -> {
                            mainUiState.value = UiState(
                                loading = false,
                                data = null,
                                errors = MainErrors(R.string.not_found) // "not found" resource code
                            )
                        }

                        else -> {
                            mainUiState.value = UiState(
                                loading = false,
                                data = null,
                                errors = MainErrors(R.string.something_went_wrong_please_reload_screen)
                            )
                        }
                    }
                }

                is CommunicationResult.Exception -> {
                    mainUiState.value = UiState(
                        loading = false,
                        data = null,
                        errors = MainErrors(R.string.unknown_error) // "exception" resource code
                    )
                }

                is CommunicationResult.Success -> {
                    if (result.data.items != null) {
                        data.topics = result.data

                        mainUiState.value = UiState(
                            loading = false,
                            data = data,
                            errors = null
                        )
                    } else {
                        mainUiState.value = UiState(
                            loading = false,
                            data = null,
                            errors = MainErrors(R.string.no_data) // "exception" resource code
                        )
                    }
                }
            }
        }
    }


}
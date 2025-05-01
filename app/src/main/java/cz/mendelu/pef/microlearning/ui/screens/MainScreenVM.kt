package cz.mendelu.pef.microlearning.ui.screens

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
class MainScreenVM @Inject constructor(
    private val remoteRepository: RemoteRepositoryImpl
) : BaseViewModel() {

    // uistate
    val mainUiState: MutableState<UiState<ObjectResponse<Node>, MainErrors>> = mutableStateOf(UiState())
//    var lessonId: Long? = null

    var myLLId: Long = 1L
    var nodeId: Long = 1L

//    private val context = getApplication<Application>().applicationContext

    init {
        if (NetworkInterceptor.isNetworkConnected()) {
            getNodeById()
        } else {
            println("Network not connected")
            mainUiState.value = UiState(
                loading = false,
                data = null,
                errors = MainErrors(R.string.network_is_not_connected) // "communication error" resource code
            )
        }
    }


    //todo fce pro overeni, ze je zapnuta wifi na zarizeni -- k tomu je potreba context,
    // zakomentovano


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
                    if (result.data != null) {
                        mainUiState.value = UiState(
                            loading = false,
                            data = result.data,
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
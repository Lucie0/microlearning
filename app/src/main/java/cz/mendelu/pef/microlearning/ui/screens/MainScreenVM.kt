package cz.mendelu.pef.microlearning.ui.screens

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.viewModelScope
import cz.mendelu.pef.microlearning.R
import cz.mendelu.pef.microlearning.architecture.BaseViewModel
import cz.mendelu.pef.microlearning.architecture.CommunicationResult
import cz.mendelu.pef.microlearning.communication.api.IRemoteRepository
import cz.mendelu.pef.microlearning.communication.api.NetworkInterceptor
import cz.mendelu.pef.microlearning.database.IMicrolearningRepository
import cz.mendelu.pef.microlearning.model.Modes
import cz.mendelu.pef.microlearning.model.UiState
import cz.mendelu.pef.microlearning.model.api.Topic
import cz.mendelu.pef.microlearning.model.mode
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

@HiltViewModel
class MainScreenVM @Inject constructor(
    private val remoteRepository: IRemoteRepository,
    private val localRepository: IMicrolearningRepository
) : BaseViewModel() {

    // uistate
    val mainUiState: MutableState<UiState<MainData, MainErrors>> = mutableStateOf(UiState())
//    var lessonId: Long? = null

    var data = MainData()
//    var myLLId: Long = 1L
//    var nodeId: Long = 101L

    // vola suspend fce
    fun getData() {
        if (NetworkInterceptor.isNetworkConnected()) {
            get()
        } else {
            println("Network not connected")
            mainUiState.value = UiState(
                loading = false,
                data = null,
                errors = MainErrors(R.string.network_is_not_connected) // "communication error" resource code
            )
        }
    }

    private fun get() {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                // spusteni async fci paralelne
                val apiDeferred = async { remoteRepository.getTopics() }
                val dbDeferred = async {
                    localRepository.getAllSavedTopicsByMode(Modes.valueOf(mode.value).ordinal)
                        .first()

                }
                // cekani na dokonceni uloh
                val resultApi = apiDeferred.await()
                val resultDb = dbDeferred.await()

                // po dokonceni zpracovat vysledky na hlavnim vlakne
                withContext(Dispatchers.Main) {
                    // Zde můžeš aktualizovat UI, např.: println("User Info: $userInfo") println("Products: $products")
//                        db ... List<savedTopics>
                    when (resultApi) {
                        is CommunicationResult.ConnectionError -> {
                            mainUiState.value = UiState(
                                loading = false,
                                data = null,
                                errors = MainErrors(R.string.communication_error) // "communication error" resource code
                            )
                        }

                        is CommunicationResult.Error -> {
                            println(resultApi.error)
                            when (resultApi.error.code) {
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
                            if (resultApi.data.items != null) {
                                // konverze
                                val list = resultDb.map { st ->
                                    Topic(
                                        id = st.topicId,
                                        name = st.name,
                                        firstNodeId = null,
                                        dbActualNode = st.actualNodeId
                                    )
                                }
                                // MainData
                                data.topics = resultApi.data
                                data.myTopics = list

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
            } catch (e: Exception) {
                // Zpracování chyby
                withContext(Dispatchers.Main) {
                    println("Chyba při volání API: ${e.message}")
                }
            }
        }
    }

    /*
    // suspend do remote repo
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

    // suspned do local repo
    fun getFromDB(){
        launch {
            localRepository.getAllSavedTopicsByMode(Modes.valueOf(mode.value.uppercase()).ordinal).collect {
                println("localRepo: $it")
                val list = mutableListOf<Topic>()
                it.forEach {st ->
                    list.add(Topic(
                        id = st.topicId,
                        name = st.name,
                        firstNodeId = null,
                        dbActualNode = st.actualNodeId)
                    )
                }
                data.myTopics = list
                mainUiState.value = UiState(
                    loading = false,
                    data = data,
                    errors = null
                )
            }
        }
    }
    */


    /*
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
 */
}
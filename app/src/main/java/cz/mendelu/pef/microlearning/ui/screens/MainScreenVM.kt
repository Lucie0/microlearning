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
import cz.mendelu.pef.microlearning.model.db.SavedTopic
import cz.mendelu.pef.microlearning.model.mode
import cz.mendelu.pef.microlearning.model.response.ArrayResponse
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.toList
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

@HiltViewModel
class MainScreenVM @Inject constructor(
    private val remoteRepository: IRemoteRepository,
    private val localRepository: IMicrolearningRepository,
) : BaseViewModel() {

    // uistate
    val mainUiState: MutableState<UiState<MainData, MainErrors>> = mutableStateOf(UiState())
//    var lessonId: Long? = null

    var data = MainData()
//    var myLLId: Long = 1L
//    var nodeId: Long = 101L

    // vola suspend fce
    fun getData(dispatcher: CoroutineDispatcher = Dispatchers.IO) {
        if (NetworkInterceptor.isNetworkConnected()) {
            fetchData(dispatcher)
        } else {
            println("Network not connected")
            mainUiState.value = UiState(
                loading = false,
                data = null,
                errors = MainErrors(R.string.network_is_not_connected) // "communication error" resource code
            )
        }
    }

    private fun fetchData(dispatcher: CoroutineDispatcher) {
        viewModelScope.launch {
            try {
                // spusteni async fci paralelne
                val apiDeferred = async(dispatcher) { remoteRepository.getTopics() }
                val dbDeferred = async(dispatcher) {
                    localRepository.getAllSavedTopicsByMode(Modes.valueOf(mode.value).ordinal)
                        .first()

                }
                // cekani na dokonceni uloh
                val resultApi = apiDeferred.await()
                val resultDb = dbDeferred.await()

                handleResults(resultApi, resultDb)

            } catch (e: Exception) {
                // Zpracování chyby
//                withContext(Dispatchers.Main) {
                    println("Chyba při volání API: ${e.message}")
//                }
            }
        }
    }

    private fun handleResults(
        apiResult: CommunicationResult<ArrayResponse<Topic>>,
        dbResult: List<SavedTopic>
    ) {
        // po dokonceni zpracovat vysledky na hlavnim vlakne
        when (apiResult) {
            is CommunicationResult.Success -> {
                val myTopics = dbResult.map { st ->
                    Topic(
                        id = st.topicId,
                        name = st.name,
                        firstNodeId = null,
                        dbActualNode = st.actualNodeId
                    )
                }
                data.topics = apiResult.data
                data.myTopics = myTopics

                mainUiState.value = UiState(
                    loading = false,
                    data = data,
                    errors = null
                )
            }

            is CommunicationResult.ConnectionError -> {
                mainUiState.value = UiState(
                    loading = false,
                    data = null,
                    errors = MainErrors(R.string.communication_error)
                )
            }

            is CommunicationResult.Error -> {
                val errorRes = when (apiResult.error.code) {
                    500 -> R.string.some_unexpected_error
                    404 -> R.string.not_found
                    else -> R.string.something_went_wrong_please_reload_screen
                }
                mainUiState.value = UiState(
                    loading = false,
                    data = null,
                    errors = MainErrors(errorRes)
                )
            }

            is CommunicationResult.Exception -> {
                mainUiState.value = UiState(
                    loading = false,
                    data = null,
                    errors = MainErrors(R.string.unknown_error)
                )
            }
        }
    }
}
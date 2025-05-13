package cz.mendelu.pef.microlearning.ui.screens.question

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import cz.mendelu.pef.microlearning.R
import cz.mendelu.pef.microlearning.architecture.BaseViewModel
import cz.mendelu.pef.microlearning.architecture.CommunicationResult
import cz.mendelu.pef.microlearning.communication.NetworkInterceptor
import cz.mendelu.pef.microlearning.communication.RemoteRepositoryImpl
import cz.mendelu.pef.microlearning.model.Question
import cz.mendelu.pef.microlearning.model.UiState
import cz.mendelu.pef.microlearning.model.response.ArrayResponse
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

@HiltViewModel
class QuestionScreenVM @Inject constructor(
    private val remoteRepository: RemoteRepositoryImpl
) : BaseViewModel() {

    // uistate
    val uiState: MutableState<UiState<ArrayResponse<Question>, QuestionsErrors>> = mutableStateOf(UiState())

    // mutable state kvuli radiobuttonu -- jinak se pri rekompozici zapomene :)
    val selectedOption = mutableStateOf("")

    // selectedOptions = hashmap[zneniOtazky] = vybranaOdpoved
    val selectedOptions = hashMapOf<String, String>()
    // correctOptions = hashmap[zneniOtazky] = spravnaOdpoved
    val correctOptions = hashMapOf<String, String>()

    init {
        if (NetworkInterceptor.isNetworkConnected()) {
//        getQuestions()
        } else {
            println("Network not connected")
            uiState.value = UiState(
                loading = false,
                data = null,
                errors = QuestionsErrors(R.string.network_is_not_connected) // "communication error" resource code
            )
        }
    }

    fun getQuestions() {
        launch {
            val result = withContext(Dispatchers.IO) {
                remoteRepository.getQuestions()
            }
            when(result) {
                is CommunicationResult.ConnectionError -> {
                    uiState.value = UiState(
                        loading = false,
                        data = null,
                        errors = QuestionsErrors(R.string.communication_error) // "communication error" resource code
                    )
                }

                is CommunicationResult.Error -> {
                    println(result.error)
                    when (result.error.code) {
                        500 -> {
                            uiState.value = UiState(
                                loading = false,
                                data = null,
                                errors = QuestionsErrors(R.string.some_unexpected_error) // "exception" resource code
                            )
                        }
                        404 -> {
                            uiState.value = UiState(
                                loading = false,
                                data = null,
                                errors = QuestionsErrors(R.string.not_found) // "not found" resource code
                            )
                        }
                        else -> {
                            uiState.value = UiState(
                                loading = false,
                                data = null,
                                errors = QuestionsErrors(R.string.something_went_wrong_please_reload_screen)
                            )
                            println(result.error.message)
                        }
                    }
                }

                is CommunicationResult.Exception -> {
                    uiState.value = UiState(
                        loading = false,
                        data = null,
                        errors = QuestionsErrors(R.string.unknown_error) // "exception" resource code
                    )
                }

                is CommunicationResult.Success -> {
                    if (result.data != null) {
                        uiState.value = UiState(
                            loading = false,
                            data = result.data,
                            errors = null
                        )
                    } else {
                        uiState.value = UiState(
                            loading = false,
                            data = null,
                            errors = QuestionsErrors(R.string.no_data) // "exception" resource code
                        )
                    }
                }
            }
        }
    }

    fun isTestCorrect(): Boolean {
        var isOk = true
        correctOptions.keys.forEach { questionText ->
            if (selectedOptions[questionText] != correctOptions[questionText]) {
                isOk = false
            }
        }
        return isOk
    }

    fun correctAnswers(): String {
        var string = ""
        correctOptions.keys.forEach { questionText ->
            if (selectedOptions[questionText] != correctOptions[questionText]) {
                println(correctOptions[questionText])
                string = string + questionText + " " + correctOptions[questionText] + ","
            }
        }
        return string.substring(0,string.length-1)
    }
}
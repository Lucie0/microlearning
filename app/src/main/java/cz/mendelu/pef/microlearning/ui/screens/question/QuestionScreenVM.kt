package cz.mendelu.pef.microlearning.ui.screens.question

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import cz.mendelu.pef.microlearning.R
import cz.mendelu.pef.microlearning.architecture.BaseViewModel
import cz.mendelu.pef.microlearning.architecture.CommunicationResult
import cz.mendelu.pef.microlearning.communication.RemoteRepositoryImpl
import cz.mendelu.pef.microlearning.model.Question
import cz.mendelu.pef.microlearning.model.UiState
import cz.mendelu.pef.microlearning.model.response.ArrayResponse
import cz.mendelu.pef.microlearning.model.response.ObjectResponse
import cz.mendelu.pef.microlearning.ui.screens.lesson.LessonsErrors
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

    init {
//        getQuestions()
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
                    if (result.error.code == 500) {
                        uiState.value = UiState(
                            loading = false,
                            data = null,
                            errors = QuestionsErrors(R.string.some_unexpected_error) // "exception" resource code
                        )
                    } else if (result.error.code == 404) {
                        uiState.value = UiState(
                            loading = false,
                            data = null,
                            errors = QuestionsErrors(R.string.wrong_lesson_id) // "exception" resource code
                        )
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

}
package cz.mendelu.pef.microlearning.ui.screens.question

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import cz.mendelu.pef.microlearning.model.Option
import cz.mendelu.pef.microlearning.model.Question
import cz.mendelu.pef.microlearning.model.UiState
import cz.mendelu.pef.microlearning.model.response.ArrayResponse
import cz.mendelu.pef.microlearning.navigation.INavigationRouter
import cz.mendelu.pef.microlearning.ui.elements.BaseScreen
import cz.mendelu.pef.microlearning.ui.elements.HtmlText

@RequiresApi(Build.VERSION_CODES.P)
@Composable
fun QuestionScreen(
    title: String,
    navigation: INavigationRouter
){
    // VM
    val viewModel = hiltViewModel<QuestionScreenVM>()

    LaunchedEffect(key1 = 1, block = { viewModel.getQuestions() })

    val uiState: MutableState<UiState<ArrayResponse<Question>, QuestionsErrors>> = rememberSaveable { mutableStateOf(
        UiState()
    ) } // rememberSaveable si ulozi data i pri zmene orientace obrazovky

    // poslech nad uistatem
    viewModel.uiState.value.let {
        uiState.value = it
    }

    BaseScreen(
        topBarText = title,
        placeholderScreenContent = null,
        drawFullScreenContent = true,
        showLoading = uiState.value.loading,
        onBackClick = { navigation.navigateBack() } // todo navigation to main screen se zapamatovanim stavu
    ) {
        QuestionScreenContent(
            paddingValues = it,
            questionText = uiState.value.data?.items?.get(0)?.text ?: "No data",
//            radioOptions = listOf("Calls", "Missed", "Friends"))
            options = uiState.value.data?.items?.get(0)?.options?.items)
    }

}

@RequiresApi(Build.VERSION_CODES.P)
@Composable
fun QuestionScreenContent(
    paddingValues: PaddingValues,
    questionText: String,
    options: List<Option>?
){

    val radioOptions: List<String?> = options?.map { o -> o.text } ?: listOf()

    LazyColumn(
        modifier = Modifier.padding(paddingValues)
    ) {
        item{
            HtmlText(string = questionText, fontSize = MaterialTheme.typography.titleLarge.fontSize)

            RadioButtonSingleSelection(
//                modifier = Modifier.padding(paddingValues),
                radioOptions = radioOptions
            )
        }
    }
}

@Composable
fun RadioButtonSingleSelection(
    modifier: Modifier = Modifier,
    radioOptions: List<String?>) {
    val (selectedOption, onOptionSelected) = remember { mutableStateOf("") }
    // Note that Modifier.selectableGroup() is essential to ensure correct accessibility behavior
    Column(modifier.selectableGroup()) {
        radioOptions.forEach { text ->
            Row(
                Modifier
                    .fillMaxWidth()
                    .height(56.dp)
                    .selectable(
                        selected = (text == selectedOption),
                        onClick = {
                            if (text != null) {
                                onOptionSelected(text)
                            }
                        },
                        role = Role.RadioButton
                    )
                    .padding(horizontal = 16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                RadioButton(
                    selected = (text == selectedOption),
                    onClick = null // null recommended for accessibility with screen readers
                )
                Text(
                    text = text ?: "null",
                    style = MaterialTheme.typography.bodyLarge,
                    modifier = Modifier.padding(start = 16.dp)
                )
            }
        }

        Text(text = selectedOption)
    }
}
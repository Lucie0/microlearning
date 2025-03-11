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
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import cz.mendelu.pef.microlearning.model.Option
import cz.mendelu.pef.microlearning.model.Question
import cz.mendelu.pef.microlearning.model.UiState
import cz.mendelu.pef.microlearning.model.response.ArrayResponse
import cz.mendelu.pef.microlearning.navigation.INavigationRouter
import cz.mendelu.pef.microlearning.ui.elements.BaseScreen
import cz.mendelu.pef.microlearning.ui.elements.CheckBoxMultipleSelection
import cz.mendelu.pef.microlearning.ui.elements.Dropdown
import cz.mendelu.pef.microlearning.ui.elements.HtmlText
import cz.mendelu.pef.microlearning.ui.elements.PlaceholderScreenContent
import cz.mendelu.pef.microlearning.ui.elements.RadioButtonSingleSelection

@RequiresApi(Build.VERSION_CODES.P)
@Composable
fun QuestionScreen(
    title: String,
    navigation: INavigationRouter
){
    // VM
    val viewModel = hiltViewModel<QuestionScreenVM>()

    LaunchedEffect(key1 = 1, block = { viewModel.getQuestions() })

    // uistate
    val uiState: MutableState<UiState<ArrayResponse<Question>, QuestionsErrors>> = rememberSaveable { mutableStateOf(
        UiState()
    ) }

    // poslech nad uistatem
    viewModel.uiState.value.let {
        uiState.value = it
    }

    BaseScreen(
        topBarText = "$title – Test",
        placeholderScreenContent = if (uiState.value.errors != null) {
            PlaceholderScreenContent(
                image = null,
//                image = R.drawable.undraw_warning,
                text = stringResource(id = uiState.value.errors!!.communicationError)
            )
        } else null,
        showLoading = uiState.value.loading,
        drawFullScreenContent = true,
        onBackClick = { navigation.navigateBack() } // todo navigation to main screen se zapamatovanim stavu
    ) {
        QuestionScreenContent(
            paddingValues = it,
            question = uiState.value.data?.items?.get(5), // todo cislo je napevno!!!!
//            questionText = uiState.value.data?.items?.get(0)?.text ?: "No data",
//            options = uiState.value.data?.items?.get(0)?.options?.items
        )
    }

}

@OptIn(ExperimentalMaterial3Api::class)
@RequiresApi(Build.VERSION_CODES.P)
@Composable
fun QuestionScreenContent(
    paddingValues: PaddingValues,
    question: Question?,
){
    val questionText: String = question?.text ?: "No data"
    val options: List<Option>? = question?.options?.items
    val radioOptions: List<String?> = options?.map { o -> o.text } ?: listOf()

    val answer = remember { mutableStateOf("") }

    LazyColumn(
        modifier = Modifier.padding(paddingValues)
    ) {
        if (question != null) {
            when (question.questionType) {
                "ONE_FROM_N" -> {
                    item {
                        // otazka
                        HtmlText(
                            string = questionText,
                            fontSize = MaterialTheme.typography.titleLarge.fontSize
                        )

                        //moznosti
                        RadioButtonSingleSelection(
                            radioOptions = radioOptions
                        )
                    }
                }
                "MORE_FROM_N" -> {
                    // pravdepodobne se nepouzije
                    item {
                        // otazka
                        HtmlText(
                            string = questionText,
                            fontSize = MaterialTheme.typography.titleLarge.fontSize
                        )

                        //moznosti
                        CheckBoxMultipleSelection()
                    }
                }
                "CLOZE" -> {
                    item {
                        // doplnovacka
                        // dropdown
                        // text, dropdown, text, ...
                        // text.forEach {...}
                        val dividedSentence = listOf(
                            "The main function represents",
                            "of C-program. Its declaration consists of ",
                            "type, identifier \"main\", parameters and body. The body of main " +
                                    "function contains statement for ",
                            ".")
                        val listOptions = listOf(
                            "whole program",
                            "alternative part",
                            "int",
                            "string",
                            "returned value",
                            "clear screen",
                            "clear input buffer").sorted()

                        for (sentence in dividedSentence.subList(0,dividedSentence.size-1)) {
                            HtmlText(
                                string = sentence,
                                fontSize = MaterialTheme.typography.titleLarge.fontSize
                            )
                            Dropdown(listOptions)
                        }
                        HtmlText(string = dividedSentence[dividedSentence.size-1])


//                        Text()
//                        Dropdown()
//        OutlinedTextField(
//            value = listOfVars[0] ?: "",
//            onValueChange = {},
//            readOnly = true
//        )
////        OutlinedTextField(
////            value = var1,
////            onValueChange = {},
////            readOnly = true
////        )
//                        Text()
//                        Dropdown()
////        OutlinedTextField(value = if (listOfVars.size > 1) listOfVars[1] else "", onValueChange = {}, enabled = false)
//        OutlinedTextField(value = listOfVars[1] ?: "", onValueChange = {}, enabled = false)
////        OutlinedTextField(value = var2, onValueChange = {}, enabled = false)
//                        Text()
//                        Row {
//                            Dropdown()
//        OutlinedTextField(value = listOfVars[2] ?: "", onValueChange = {}, enabled = false)
////        OutlinedTextField(value = var3, onValueChange = {}, enabled = false)
//                            Text(".")
//                        }

                    }
                }
                "OPEN" -> {
                    // otevrena otazka
                    item {
                        HtmlText(
                            string = questionText,
                            fontSize = MaterialTheme.typography.titleLarge.fontSize
                        )
                        OutlinedTextField(
                            value = answer.value,
                            onValueChange = { answer.value = it },
                            label = { Text("Answer")},
                            modifier = Modifier
                                .padding(16.dp)
                                .fillMaxWidth(),
                            minLines = 1
                        )
                    }
                }
            }

        }
    }
}


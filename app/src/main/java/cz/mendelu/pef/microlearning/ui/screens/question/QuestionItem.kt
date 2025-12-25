package cz.mendelu.pef.microlearning.ui.screens.question

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import cz.mendelu.pef.microlearning.R
import cz.mendelu.pef.microlearning.model.api.Option
import cz.mendelu.pef.microlearning.model.api.Question
import cz.mendelu.pef.microlearning.model.showHint
import cz.mendelu.pef.microlearning.ui.elements.CheckBoxMultipleSelection
import cz.mendelu.pef.microlearning.ui.elements.Dropdown
import cz.mendelu.pef.microlearning.ui.elements.HtmlText
import cz.mendelu.pef.microlearning.ui.elements.RadioButtonSingleSelection
import cz.mendelu.pef.microlearning.ui.theme.basicTextColor
import cz.mendelu.pef.microlearning.ui.theme.getCorrectAnswersColor
import cz.mendelu.pef.microlearning.ui.theme.getErrorColor
import cz.mendelu.pef.microlearning.ui.theme.getPrimaryColor

@RequiresApi(Build.VERSION_CODES.P)
@Composable
fun QuestionItem(
    paddingValues: PaddingValues,
    question: Question?,
    nodeId: Long?,
//    lessonId: Long?,
    viewModel: QuestionScreenVM,
    onSubmitClicked: MutableState<Boolean>,
    showCorrectAnswers: Boolean = false,
) {

    val questionText: String = question?.text ?: stringResource(R.string.txt_no_data)
    val options: List<Option>? = question?.options?.items
//    val correctAnswers = hashMapOf<String, String>()

    if (!options.isNullOrEmpty()) {// && options[0].groupNumber == 0) {

        options.filter { it.correctAnswer == true }.forEach { opt ->
            viewModel.correctOptions["${question.id}.${opt.groupNumber}"] = opt.text ?: ""
        }

        // todo nasledne else by se nemelo vubec provadet a byt potreba -- SMAZAT
    }
    /*
//    else if (!options.isNullOrEmpty()) { // pokud je to CLOZE
//        val dividedSentence = questionText.split("""\[\[[0-9]+\]\]""".toRegex())
//        val result = options.filter { it.correctAnswer == true }
//            .zip(dividedSentence.subList(0, dividedSentence.size - 1))
//        var count = 1
//        for (paar in result) {
//             uloz spravne odpovedi do VM
//            viewModel.correctOptions[paar.second + "[[$count"] = paar.first.text ?: ""
//            count += 1
//        }
//    }
*/

//    println("opt:$options")
//    println("corr:$correctAnswers")
//    println("corrVM:${viewModel.correctOptions}")

    val radioOptions: List<String?> = options?.map { o -> o.text } ?: listOf()

    val answer = remember { mutableStateOf("") }

    // LazyColumn()
    Column(
        modifier = Modifier.padding(16.dp)
    ) {
        if (question != null) {
            when (question.questionType) {
                "ONE_FROM_N" -> {

                    OneFromNQuestion(
                        question = question,
                        options = options ?: emptyList(),
                        viewModel = viewModel,
                        onSubmit = onSubmitClicked.value,
                        showCorrect = showCorrectAnswers
                    )

                }

                "CLOZE" -> {

                    ClozeQuestion(
                        question = question,
                        viewModel = viewModel,
                        onSubmit = onSubmitClicked.value,
                        showCorrect = showCorrectAnswers
                    )

                }

                "OPEN" -> {

                    OpenQuestion(
                        question = question,
                        viewModel = viewModel,
                        onSubmit = onSubmitClicked.value,
                        showCorrect = showCorrectAnswers
                    )

                }

                "MORE_FROM_N" -> {
                    // pravdepodobne se nepouzije
//                    item {
                    // otazka
                    HtmlText(
                        string = questionText,
                        textColor = if (showCorrectAnswers) getCorrectAnswersColor() else basicTextColor(),
                        fontSize = MaterialTheme.typography.titleLarge.fontSize
                    )

                    //moznosti
                    CheckBoxMultipleSelection()
                }
            }
        }
    }
}


@Composable
private fun AnswerResult(
    isCorrect: Boolean,
    correctAnswer: String?,
    showCorrect: Boolean
) {
    if (isCorrect) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = stringResource(R.string.well_done_answers_are_correct),
                modifier = Modifier.padding(8.dp),
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.Bold,
                color = getCorrectAnswersColor()
            )
        }
    } else {
//        Box(
//            modifier = Modifier.fillMaxSize(),
//            contentAlignment = Alignment.Center
//        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Text(
                    text = stringResource(R.string.answer_is_not_correct),
                    modifier = Modifier.padding(start = 16.dp, end = 16.dp),
                    color = getErrorColor()
                )

                if (showCorrect && correctAnswer != null) {
                    Text(
                        text = stringResource(R.string.correct_answers_following) +
                                if (showHint()) correctAnswer
                                else correctAnswer.replace(" ✅ ", ""),
                        Modifier.padding(start = 16.dp, end = 16.dp),
                        color = getPrimaryColor()
                    )
//                    Text(
//                        text = correctAnswer,
//                        color = getCorrectAnswersColor(),
//                        modifier = Modifier.padding(start = 16.dp)
//                    )
                }
//            }
        }
    }
}


//ONE_FROM_N
@RequiresApi(Build.VERSION_CODES.P)
@Composable
private fun OneFromNQuestion(
    question: Question,
    options: List<Option>,
    viewModel: QuestionScreenVM,
    onSubmit: Boolean,
    showCorrect: Boolean
) {

    val radioOptions = options.map { it.text ?: "" }
    val selected = remember { mutableStateOf(viewModel.getSelected( question.id ?: 0, 0)) }

    HtmlText(
        string = question.text ?: "",
        textColor = basicTextColor(),
        fontSize = MaterialTheme.typography.titleLarge.fontSize
    )

    RadioButtonSingleSelection(
        enabled = !onSubmit,
        radioOptions = radioOptions,
        selectedOption = selected,
        onClickAfter = {
            // pod klic se znenim otazky je ulozena hodnota odpovedi
            viewModel.setSelected(question.id ?: 0, 0, selected.value)
        }
    )

    if (onSubmit) {
        val correct = viewModel.correctOptions[viewModel.answerKey(question.id ?: 0, 0)]
        AnswerResult(
            isCorrect = (selected.value == correct),
            correctAnswer = correct,
            showCorrect = showCorrect
        )
    }
}

//OPEN
@OptIn(ExperimentalMaterial3Api::class)
@RequiresApi(Build.VERSION_CODES.P)
@Composable
private fun OpenQuestion(
    question: Question,
    viewModel: QuestionScreenVM,
    onSubmit: Boolean,
    showCorrect: Boolean
) {
    val answer = remember { mutableStateOf(viewModel.getSelected( question.id ?: 0, 0)) }
    val isInt = question.options.items?.get(0)?.text?.toInt()

    HtmlText(
        string = if (showHint()) question.text ?: "" else question.text?.replace("""\{[-0-9]+\}""".toRegex(), "") ?: "",
        textColor = basicTextColor(),
        fontSize = MaterialTheme.typography.titleLarge.fontSize
    )

    OutlinedTextField(
        value = answer.value,
        keyboardOptions = if (isInt != null) KeyboardOptions(keyboardType = KeyboardType.Number) else KeyboardOptions.Default,
        onValueChange = {
            answer.value = it
            viewModel.setSelected( question.id ?: 0, 0, it)
        },
        label = { Text(stringResource(R.string.label_answer)) },
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth(),
        readOnly = onSubmit
    )

    if (onSubmit) {
        val correct = viewModel.correctOptions[viewModel.answerKey(question.id ?: 0, 0)]
        AnswerResult(
            isCorrect = (answer.value == correct),
            correctAnswer = correct,
            showCorrect = showCorrect
        )
    }
}

//CLOZE
@RequiresApi(Build.VERSION_CODES.P)
@Composable
private fun ClozeQuestion(
    question: Question,
    viewModel: QuestionScreenVM,
    onSubmit: Boolean,
    showCorrect: Boolean
) {
    // rozdeli vetu, v mistech vynechavky vypise dropdown
    val parts = question.text?.split("]]") ?: return
    var group = 1

    for (part in parts.dropLast(1)) {

        val prefix = part.substringBeforeLast("[[")
        val keyNumber = part.substringAfter("[[")

        HtmlText(
            string = prefix,
            textColor = basicTextColor(),
            fontSize = MaterialTheme.typography.titleLarge.fontSize
        )

        // moznosti pro danou skupinu
        val list = question.options.items
            ?.filter { it.groupNumber == group }
            ?.map { it.text ?: "" } ?: emptyList()

        val selected = remember {
            mutableStateOf(viewModel.getSelected(question.id ?: 0, keyNumber.toInt()))
        }

        // vyberovy seznam
        Dropdown(
            enabled = !onSubmit,
            options = list,
            selected = selected,
            onClickAfter = {
                viewModel.setSelected(question.id ?: 0, keyNumber.toInt(), selected.value)
            }
        )

        if (onSubmit) {
            val correct = viewModel.correctOptions[viewModel.answerKey(question.id ?: 0, keyNumber.toInt())]
            AnswerResult(
                isCorrect = selected.value == correct,
                correctAnswer = correct,
                showCorrect = showCorrect
            )
        }

        group++
    }

    HtmlText(string = parts.last())
}
package cz.mendelu.pef.microlearning.ui.screens.question

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import cz.mendelu.pef.microlearning.R
import cz.mendelu.pef.microlearning.model.TestState
import cz.mendelu.pef.microlearning.model.api.Option
import cz.mendelu.pef.microlearning.model.api.Question
import cz.mendelu.pef.microlearning.navigation.INavigationRouter
import cz.mendelu.pef.microlearning.ui.elements.CheckBoxMultipleSelection
import cz.mendelu.pef.microlearning.ui.elements.Dropdown
import cz.mendelu.pef.microlearning.ui.elements.HtmlText
import cz.mendelu.pef.microlearning.ui.elements.RadioButtonSingleSelection
import cz.mendelu.pef.microlearning.ui.theme.basicTextColor
import cz.mendelu.pef.microlearning.ui.theme.getCorrectAnswersColor
import cz.mendelu.pef.microlearning.ui.theme.getErrorColor
import cz.mendelu.pef.microlearning.ui.theme.getPrimaryColor

@OptIn(ExperimentalMaterial3Api::class)
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
    navigation: INavigationRouter,
) {
    val questionText: String = question?.text ?: stringResource(R.string.txt_no_data)
    val options: List<Option>? = question?.options?.items
//    val correctAnswers = hashMapOf<String, String>()

    // pokud je to typ otazek jinych nez CLOZE
    if (!options.isNullOrEmpty()) {// && options[0].groupNumber == 0) {

        options.filter { it.correctAnswer == true }.forEach { opt ->
            viewModel.correctOptions["${question.id}.${opt.groupNumber}"] = opt.text ?: ""
        }

        // todo nasledne else by se nemelo vubec provadet a byt potreba -- SMAZAT
    }
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

                    val selectedOption = remember { mutableStateOf("") }

//                    item {
                    // otazka
                    HtmlText(
                        string = questionText,
                        textColor = if (showCorrectAnswers) getCorrectAnswersColor() else basicTextColor(),
                        fontSize = MaterialTheme.typography.titleLarge.fontSize
                    )

                    //moznosti
                    RadioButtonSingleSelection(
                        enabled = !onSubmitClicked.value,
                        radioOptions = radioOptions,
                        // popis:
                        // pokud uz je klic obsazen v hashmape, tak do MutableStatu uloz jeho
                        // hodnotu, pokud ne, nic nedelej, kazdopadne odesli do fce RadioButton
                        // promennou selectedOption
                        // FUNGUJE !!!
                        selectedOption = /*if (showCorrectAnswers) {
                            selectedOption.value =
                                viewModel.correctOptions["${question.id}.0"]!!
                            selectedOption
                        } else */if (viewModel.selectedOptions.keys.contains("${question.id}.0")) {
                            selectedOption.value =
                                viewModel.selectedOptions["${question.id}.0"]!!
                            selectedOption
                        } else selectedOption,
                        onClickAfter = {
                            // pod klic se znenim otazky je ulozena hodnota odpovedi
                            viewModel.selectedOptions["${question.id}.0"] = selectedOption.value
                            println("QItem VM.selected: ${viewModel.selectedOptions}")
                        }
                    )

                    // --------------------- po kliknuti na tlacitko Submit -- vyhodnoceni ---------
                    if (onSubmitClicked.value) {
                        if (viewModel.testState == TestState.PASSED) {
                            Text(
                                stringResource(R.string.well_done_answers_are_correct),
                                Modifier.padding(8.dp)
                            )
                        } else { // option TEST STATE = FAILED
                            if (viewModel.correctOptions["${question.id}.0"] == viewModel.selectedOptions["${question.id}.0"]) {
                                Text(
                                    stringResource(R.string.well_done_answers_are_correct),
                                    Modifier.padding(8.dp)
                                )
                            } else {
                                Text(
                                    stringResource(R.string.answer_is_not_correct),
                                    modifier = Modifier.padding(start = 16.dp, end = 16.dp),
                                    color = getErrorColor()
                                )

                                if (showCorrectAnswers) {
                                    Text(
                                        text = stringResource(R.string.correct_answers_following),
                                        modifier = Modifier.padding(start = 16.dp, end = 16.dp),
                                        color = getPrimaryColor()
                                    )
                                    Text(
                                        text = viewModel.correctOptions["${question.id}.0"]!!,
                                        color = getCorrectAnswersColor()
                                    )
                                }
                            }
                        }
                    }

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

                "CLOZE" -> {
//                    item {
                    // doplnovacka
                    var groupNumber = 1

//                    val listOptions: List<Option?>? = question.options.items

                    // rozdeli vetu, v mistech vynechavky vypise dropdown
//                    val dividedSentence = question.text?.split("""\[\[[0-9]+\]\]""".toRegex())
                    val dividedSentence = question.text?.split("]]")

                        for (sentence in dividedSentence!!.subList(0, dividedSentence.size - 1)) {
                            val selectedOption = remember { mutableStateOf("") }
                            // text
//                            HtmlText(
//                                string = sentence,
//                                fontSize = MaterialTheme.typography.titleLarge.fontSize
//                            )
                            HtmlText(
//                            modifier = Modifier.padding(start = 16.dp, end = 16.dp),
                                string = sentence.substring(0, sentence.length - 3 - 1),
                                textColor = if (showCorrectAnswers) getCorrectAnswersColor() else basicTextColor(),
                                fontSize = MaterialTheme.typography.titleLarge.fontSize
                            )

                            // z Options vyfiltrovana dana skupina a vybran pouze zneni moznosti
                            val listStrings = // listOptions. ...
                                question.options.items?.filter { opt -> opt.groupNumber == groupNumber }
                                    ?.map { opt -> opt.text }

                            // okenko pro vyberovy seznam
                            if (listStrings != null)
                                Dropdown(
                                    enabled = !onSubmitClicked.value,
                                    options = listStrings,
                                    selected = /*if (showCorrectAnswers) {
                                        selectedOption.value =
                                            viewModel.correctOptions["${question.id}.${
                                                sentence.substringAfter("[[")
                                            }"]!!
                                        selectedOption
                                    } else*/ if (viewModel.selectedOptions.keys.contains(
                                            "${question.id}.${
                                                sentence.substringAfter(
                                                    "[["
                                                )
                                            }"
                                        )
                                    ) {
                                        selectedOption.value =
                                            viewModel.selectedOptions["${question.id}.${
                                                sentence.substringAfter("[[")
                                            }"]!!
                                        selectedOption
                                    } else selectedOption,
                                    onClickAfter = {
                                        // pod klic se znenim casti otazky otazky je ulozena hodnota
                                        // odpovedi
                                        viewModel.selectedOptions["${question.id}.${
                                            sentence.substringAfter(
                                                "[["
                                            )
                                        }"] = selectedOption.value
                                        println(viewModel.selectedOptions)
                                    }
                                )

                            // --------------------- po kliknuti na tlacitko Submit -- vyhodnoceni ---------
                            if (onSubmitClicked.value) {
                                if (viewModel.testState == TestState.PASSED) {
                                    Text(
                                        stringResource(R.string.well_done_answers_are_correct),
                                        Modifier.padding(8.dp)
                                    )
                                } else { // option TEST STATE = FAILED
                                    if (viewModel.correctOptions["${question.id}.${sentence.substringAfter("[[")}"]
                                        == viewModel.selectedOptions["${question.id}.${sentence.substringAfter("[[")}"]
                                        ) {
                                        Text(
                                            stringResource(R.string.well_done_answers_are_correct),
                                            Modifier.padding(8.dp)
                                        )
                                    } else {
                                        Text(
                                            stringResource(R.string.answer_is_not_correct),
                                            modifier = Modifier.padding(start = 16.dp, end = 16.dp),
                                            color = getErrorColor()
                                        )

                                        if (showCorrectAnswers) {
                                            Text(
                                                text = stringResource(R.string.correct_answers_following),
                                                modifier = Modifier.padding(start = 16.dp, end = 16.dp),
                                                color = getPrimaryColor()
                                            )

                                            Text(
                                                text = viewModel.correctOptions["${question.id}.${sentence.substringAfter("[[")}"]!!,
                                                modifier = Modifier.padding(start = 16.dp, end = 16.dp),
                                                color = getPrimaryColor()
                                            )
//                                            for (sentence in dividedSentence.subList(0, dividedSentence.size - 1)) {
//                                                Text(
//                                                    text = viewModel.correctOptions["${question.id}.${
//                                                        sentence.substringAfter("[[")}"]!!,
//                                                    color = getCorrectAnswersColor()
//                                                )
//                                            }
                                        }
                                    }
                                }
                            }


                            // zvyseni na dalsi skupinu
                            groupNumber += 1
                        }

                        // posledni blok textu, pote uz nenasleduje vyberovy seznam
                        HtmlText(string = dividedSentence[dividedSentence.size - 1])


                }

                "OPEN" -> {
                    // otevrena otazka
//                    item {

                        HtmlText(
                            string = questionText,
                            textColor = if (showCorrectAnswers) getCorrectAnswersColor() else basicTextColor(),
                            fontSize = MaterialTheme.typography.titleLarge.fontSize
                        )

                        OutlinedTextField(
                            value = /*if (showCorrectAnswers) {
                                answer.value = viewModel.correctOptions["${question.id}.0"]!!
                                answer.value
                            } else*/ if (viewModel.selectedOptions.keys.contains("${question.id}.0")) {
                                answer.value = viewModel.selectedOptions["${question.id}.0"]!!
                                answer.value
                            } else answer.value,
                            onValueChange = {
                                println("it: $it")
                                answer.value = it
                                viewModel.selectedOptions["${question.id}.0"] = it
                            },
                            label = { if (showCorrectAnswers) Text("Correct answer") else Text("Answer") },
                            modifier = Modifier
                                .padding(8.dp)
                                .fillMaxWidth(),
                            minLines = 1,
                            readOnly = onSubmitClicked.value
                        )


                    // --------------------- po kliknuti na tlacitko Submit -- vyhodnoceni ---------
                    if (onSubmitClicked.value) {
                        if (viewModel.testState == TestState.PASSED) {
                            Text(
                                stringResource(R.string.well_done_answers_are_correct),
                                Modifier.padding(8.dp)
                            )
                        } else { // option TEST STATE = FAILED
                            if (viewModel.correctOptions["${question.id}.0"] == viewModel.selectedOptions["${question.id}.0"]) {
                                Text(
                                    stringResource(R.string.well_done_answers_are_correct),
                                    Modifier.padding(8.dp)
                                )
                            } else {
                                Text(
                                    stringResource(R.string.answer_is_not_correct),
                                    modifier = Modifier.padding(start = 16.dp, end = 16.dp),
                                    color = getErrorColor()
                                )

                                if (showCorrectAnswers) {
                                    Text(
                                        text = stringResource(R.string.correct_answers_following),
                                        modifier = Modifier.padding(start = 16.dp, end = 16.dp),
                                        color = getPrimaryColor()
                                    )
                                    Text(
                                        text = viewModel.correctOptions["${question.id}.0"]!!,
                                        color = getCorrectAnswersColor()
                                    )
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
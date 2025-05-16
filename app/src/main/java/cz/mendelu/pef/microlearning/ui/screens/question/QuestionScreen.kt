package cz.mendelu.pef.microlearning.ui.screens.question

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import cz.mendelu.pef.microlearning.model.Modes
import cz.mendelu.pef.microlearning.model.Option
import cz.mendelu.pef.microlearning.model.Question
import cz.mendelu.pef.microlearning.model.UiState
import cz.mendelu.pef.microlearning.model.mode
import cz.mendelu.pef.microlearning.model.response.ArrayResponse
import cz.mendelu.pef.microlearning.navigation.INavigationRouter
import cz.mendelu.pef.microlearning.ui.elements.BaseScreen
import cz.mendelu.pef.microlearning.ui.elements.CheckBoxMultipleSelection
import cz.mendelu.pef.microlearning.ui.elements.Dropdown
import cz.mendelu.pef.microlearning.ui.elements.HtmlText
import cz.mendelu.pef.microlearning.ui.elements.HtmlToNormalText
import cz.mendelu.pef.microlearning.ui.elements.PlaceholderScreenContent
import cz.mendelu.pef.microlearning.ui.elements.RadioButtonSingleSelection
import cz.mendelu.pef.microlearning.ui.theme.getCorrectAnswersColor

@RequiresApi(Build.VERSION_CODES.P)
@Composable
fun QuestionScreen(
//    title: String? = null,
    nodeId: Long?,// v jakem uzlu se nachazim
//    testId: Long?, // jaky test mam zobrazovat
    lessonId: Long?,
//    lessonName: String? = null,
    navigation: INavigationRouter
) {
    // VM
    val viewModel = hiltViewModel<QuestionScreenVM>()
    viewModel.lessonId = lessonId!!
//    viewModel.nodeId = nodeId!!

    LaunchedEffect(key1 = 1, block = { viewModel.getData() })

    // todo lesson Id je zatim null, potrebuju rozhodovani, jak dopadl test -- PREDELAT
    // lesson Id  nastaveno napevno
//    val myLessonId = 1L

//    val uiState: MutableState<UiState<QuestionScreenData, QuestionsErrors>> =
// uistate

    val uiState: MutableState<UiState<QuestionScreenData, QuestionsErrors>> =
        rememberSaveable {
            mutableStateOf(
                UiState()
            )
        }

    // poslech nad uistatem
    viewModel.uiState.value.let {
        uiState.value = it
    }

//    viewModel.correctOptions


    BaseScreen(
        topBarText = "Test nodu $nodeId",
        placeholderScreenContent = if (uiState.value.errors != null) {
            PlaceholderScreenContent(
                image = null,
                text = stringResource(id = uiState.value.errors!!.communicationError)
            )
        } else null,
        showLoading = uiState.value.loading,
        drawFullScreenContent = true,
        onBackClick = {
            // TODO navigation to main screen  se zapamatovanim stavu
            navigation.navigateBack()
        }
    ) {
        QuestionScreenContent(
            paddingValues = it,
//            question = uiState.value.data?.items?.get(1), // todo cislo je napevno!!!! --
            // todo bude to id otazky, ktera bude prirazena k danemu testu, ktery se predava
            //  v args obrazovky
            nodeId = nodeId,
            lessonId = lessonId,
//                    lessonName = lessonName,
            uiState = uiState,
            viewModel = viewModel,
            navigation = navigation
        )

    }
}

@RequiresApi(Build.VERSION_CODES.P)
@Composable
fun QuestionScreenContent(
    paddingValues: PaddingValues,
//    question: Question?,
    nodeId: Long?,
    lessonId: Long?,
//    lessonName: String?,
    uiState: MutableState<UiState<QuestionScreenData, QuestionsErrors>>,
    viewModel: QuestionScreenVM,
    navigation: INavigationRouter,
) {
    val onSubmitClicked = remember { mutableStateOf(false) }

    LazyColumn {
//        item {
            /*
            QuestionScreenContent(
                paddingValues = it,
                question = uiState.value.data?.items?.get(5), // todo cislo je napevno!!!!
//            questionText = uiState.value.data?.items?.get(0)?.text ?: "No data",
//            options = uiState.value.data?.items?.get(0)?.options?.items
                lessonId = myLessonId,
                nodeId = nodeId,
                viewModel = viewModel,
                navigation = navigation
            )

             */
//        }
        uiState.value.data?.questions?.items?.forEach {
            // todo omezit na pocet 3 otazky na uzel
            item {
                QuestionItem(
                    paddingValues = paddingValues,
                    question = it,
                    nodeId = nodeId,
                    lessonId = lessonId,
                    viewModel = viewModel,
                    navigation = navigation
                )
            }
        }
//            item {
//                QuestionScreenContent(
//                    paddingValues = it,
//                    question = uiState.value.data?.items?.get(3), // todo cislo je napevno!!!!
////            questionText = uiState.value.data?.items?.get(0)?.text ?: "No data",
////            options = uiState.value.data?.items?.get(0)?.options?.items
//                    lessonId = myLessonId,
//                    lessonName = lessonName,
//                    nodeId = nodeId,
//                    viewModel = viewModel,
//                    navigation = navigation
//                )
//            }


//            item {
//                QuestionScreenContent(
//                    paddingValues = it,
//                    question = uiState.value.data?.items?.get(6), // todo cislo je napevno!!!!
////            questionText = uiState.value.data?.items?.get(0)?.text ?: "No data",
////            options = uiState.value.data?.items?.get(0)?.options?.items
//                    lessonId = myLessonId,
//                    lessonName = lessonName,
//                    nodeId = nodeId,
//                    viewModel = viewModel,
//                    navigation = navigation
//                )
//            }

//            item {
//                QuestionScreenContent(
//                    paddingValues = it,
//                    question = uiState.value.data?.items?.get(8), // todo cislo je napevno!!!!
////            questionText = uiState.value.data?.items?.get(0)?.text ?: "No data",
////            options = uiState.value.data?.items?.get(0)?.options?.items
//                    lessonId = myLessonId,
//                    lessonName = lessonName,
//                    nodeId = nodeId,
//                    viewModel = viewModel,
//                    navigation = navigation
//                )
//
//                QuestionScreenContent(
//                    paddingValues = it,
//                    question = uiState.value.data?.items?.get(4), // todo cislo je napevno!!!!
////            questionText = uiState.value.data?.items?.get(0)?.text ?: "No data",
////            options = uiState.value.data?.items?.get(0)?.options?.items
//                    lessonId = myLessonId,
//                    lessonName = lessonName,
//                    nodeId = nodeId,
//                    viewModel = viewModel,
//                    navigation = navigation
//                )
//            }
        item {
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                if (onSubmitClicked.value) {
                    if (viewModel.isTestCorrect()) {
                        Text("Well done!", Modifier.padding(8.dp))
                    } else {
                        Text("Answers are not correct.", Modifier.padding(8.dp))
                        Text(
                            "Correct answers: \n ${viewModel.correctAnswers()}",
                            Modifier.padding(8.dp),
                            color = getCorrectAnswersColor()
                        )

                    }

//                    Button(onClick = {
//                        navigation.navigateToLessonScreen(
//                            lessonId = lessonId,
//                            nodeId = nodeId
//                        )
//                    }) {
//                        Text("Continue")
//                    }
                }

                Button(
                    modifier = Modifier.padding(8.dp),
                    // todo enablovat tlacitko, az kdyz jsou vsechny odpovedi vyplnene
                    //  -- cislo, ktere se meni, musi byt v mutableState, jinak se to nepropise
                    enabled = /*!onSubmitClicked.value && */ lessonId != null && nodeId != null,// viewModel.selectedOptions.size == 1
                    onClick = {
                        // vyhodnotit, jak dopadl test, podle toho pokracovat dal
                        // pokud je test OK
                        // todo gettnout lekci, ktera nasleduje po tomto testu z uzlu
                        // presmerovat se na lekci
                        // jinak presmerovat na jinou lekci (sousedni uzel, resp. uzly, pote soused
                        // rodice a tak porad dokola

                        if (!onSubmitClicked.value) {
                            // kliknuto na Submit
                            onSubmitClicked.value = true
                        } else {
                            when (mode.value) {
                                Modes.TESTING.name -> {
                                    if (viewModel.isTestCorrect()) {
                                        // testovani je ukonceno a je zobrazen vysledek
                                        // todo
                                    } else {
                                        // pokracovani na rodicovske uzly s otazkami
                                        navigation.navigateToQuestionScreen(
                                            nodeId = nodeId,
                                            lessonId = lessonId
                                        )
                                    }
                                }
                                Modes.TUITION.name -> {
                                    navigation.navigateToLessonScreen(
                                        nodeId = nodeId,
                                        lessonId = lessonId
                                    )
                                }
                            }

                        }

                    }) {
                    if (!onSubmitClicked.value) {
                        Text("Submit")
                    } else  {
                        Text("Continue")
                    }
                }


            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@RequiresApi(Build.VERSION_CODES.P)
@Composable
fun QuestionItem(
    paddingValues: PaddingValues,
    question: Question?,
    nodeId: Long?,
    lessonId: Long?,
    viewModel: QuestionScreenVM,
    navigation: INavigationRouter,
) {
    val questionText: String = question?.text ?: "No data"
    val options: List<Option>? = question?.options?.items
    val correctAnswers = hashMapOf<String, String>()

    // todo problem s ot 6 -- doplnovacka -> prepisuju moznosti tou posledni,
    //  protoze je tam stejny klic = nerozdelena otazka, zustavaji tam znacky [[x]]
    //  --> rozparsovat

    // pokud je to typ otazek jinych nez CLOZE
//    if (question?.questionType != "CLOZE") {
    if (!options.isNullOrEmpty() && options[0].groupNumber == 0) {
//        println("jiny nez cloze")
        options.filter { it.correctAnswer == true }.forEach { opt ->
            viewModel.correctOptions[questionText] = opt.text ?: ""
            correctAnswers[questionText] = opt.text ?: ""
        }
    } else if (!options.isNullOrEmpty()) { // pokud je to CLOZE
        val dividedSentence = questionText.split("""\[\[[0-9]+\]\]""".toRegex())
        val result = options.filter { it.correctAnswer == true }
            .zip(dividedSentence.subList(0, dividedSentence.size - 1))
        var count = 1
        for (paar in result) {
            // uloz spravne odpovedi do VM
            viewModel.correctOptions[paar.second + "[[$count"] = paar.first.text ?: ""
            correctAnswers[paar.second + "[[$count"] = paar.first.text ?: ""
            count += 1
        }
    }

    println("opt:$options")
    println("corr:$correctAnswers")
    println("corrVM:${viewModel.correctOptions}")

    val radioOptions: List<String?> = options?.map { o -> o.text } ?: listOf()

    val answer = remember { mutableStateOf("") }

    // LazyColumn()
    Column(
        modifier = Modifier.padding(paddingValues)
    ) {
        if (question != null) {
            when (question.questionType) {
                "ONE_FROM_N" -> {
                    val selectedOption = remember { mutableStateOf("") }

//                    item {
                    // otazka
                    HtmlText(
                        string = questionText,
                        fontSize = MaterialTheme.typography.titleLarge.fontSize
                    )

                    //moznosti
                    RadioButtonSingleSelection(
                        radioOptions = radioOptions,
                        // popis:
                        // pokud uz je klic obsazen v hashmape, tak do MutableStatu uloz jeho
                        // hodnotu, pokud ne, nic nedelej, kazdopadne odesli do fce RadioButton
                        // promennou selectedOption
                        // FUNGUJE !!!
                        selectedOption = if (viewModel.selectedOptions.keys.contains(questionText)) {
                            selectedOption.value = viewModel.selectedOptions[questionText]!!
                            selectedOption
                        } else selectedOption,
                        onClickAfter = {
                            // pod klic se znenim otazky je ulozena hodnota odpovedi
                            viewModel.selectedOptions[questionText] = selectedOption.value
                            println(viewModel.selectedOptions)
                        }
                    )
//                }
                }

                "MORE_FROM_N" -> {
                    // pravdepodobne se nepouzije
//                    item {
                    // otazka
                    HtmlText(
                        string = questionText,
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
                        HtmlToNormalText(
                            modifier = Modifier.padding(start = 16.dp, end = 16.dp),
                            text = sentence,
                            fontSize = MaterialTheme.typography.titleLarge.fontSize
                        )

                        // z Options vyfiltrovana dana skupina a vybran pouze zneni moznosti
                        val listStrings = // listOptions. ...
                            question.options.items?.filter { opt -> opt.groupNumber == groupNumber }
                                ?.map { opt -> opt.text }

                        // okenko pro vyberovy seznam
                        if (listStrings != null)
                            Dropdown(
                                options = listStrings,
                                selected = if (viewModel.selectedOptions.keys.contains(sentence)) {
                                    selectedOption.value = viewModel.selectedOptions[sentence]!!
                                    selectedOption
                                } else selectedOption,
                                onClickAfter = {
                                    // pod klic se znenim casti otazky otazky je ulozena hodnota
                                    // odpovedi
                                    viewModel.selectedOptions[sentence] = selectedOption.value
                                    println(viewModel.selectedOptions)
                                }
                            )

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
                        fontSize = MaterialTheme.typography.titleLarge.fontSize
                    )

                    OutlinedTextField(
                        value = if (viewModel.selectedOptions.keys.contains(questionText)) {
                            answer.value = viewModel.selectedOptions[questionText]!!
                            answer.value
                        } else answer.value,
                        onValueChange = {
                            println("it: $it")
                            answer.value = it
                            viewModel.selectedOptions[questionText] = it
                        },
                        label = { Text("Answer") },
                        modifier = Modifier
                            .padding(8.dp)
                            .fillMaxWidth(),
                        minLines = 1
                    )
//                    }
                }
            }
        }
    }
}


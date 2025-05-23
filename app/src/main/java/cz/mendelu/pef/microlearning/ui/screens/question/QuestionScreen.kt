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
import cz.mendelu.pef.microlearning.model.api.Option
import cz.mendelu.pef.microlearning.model.api.Question
import cz.mendelu.pef.microlearning.model.UiState
import cz.mendelu.pef.microlearning.model.actualNodeInGraph
import cz.mendelu.pef.microlearning.model.graph
import cz.mendelu.pef.microlearning.model.lessonsToStudy
import cz.mendelu.pef.microlearning.model.mode
import cz.mendelu.pef.microlearning.model.todoNodes
import cz.mendelu.pef.microlearning.navigation.INavigationRouter
import cz.mendelu.pef.microlearning.ui.elements.BaseScreen
import cz.mendelu.pef.microlearning.ui.elements.CheckBoxMultipleSelection
import cz.mendelu.pef.microlearning.ui.elements.Dropdown
import cz.mendelu.pef.microlearning.ui.elements.HtmlText
import cz.mendelu.pef.microlearning.ui.elements.PlaceholderScreenContent
import cz.mendelu.pef.microlearning.ui.elements.RadioButtonSingleSelection
import cz.mendelu.pef.microlearning.ui.theme.basicTextColor
import cz.mendelu.pef.microlearning.ui.theme.getCorrectAnswersColor
import cz.mendelu.pef.microlearning.ui.theme.getErrorColor

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
    viewModel.lessonId = lessonId ?: graph.map[actualNodeInGraph]?.lessonId!!
    viewModel.nodeId = nodeId ?: actualNodeInGraph

    println("---* ACTUAL NODE Qs:$actualNodeInGraph")
    println("lessonId=$lessonId,nodeId=$nodeId")

    LaunchedEffect(key1 = 1, block = { viewModel.getData() })

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

    BaseScreen(
        topBarText = "Pretest of node $nodeId",
        placeholderScreenContent = if (uiState.value.errors != null) {
            PlaceholderScreenContent(
                image = null,
                text = stringResource(id = uiState.value.errors!!.communicationError)
            )
        } else null,
        showLoading = uiState.value.loading,
        drawFullScreenContent = true,
        onBackClick = {
            navigation.navigateBack()
        }
    ) {
        QuestionScreenContent(
            paddingValues = it,
            nodeId = nodeId,
//            lessonId = lessonId,
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
//    lessonId: Long?,
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
//                    lessonId = lessonId,
                    viewModel = viewModel,
                    onSubmitClicked = onSubmitClicked,
                    showCorrectAnswers = false,
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
                        Text(
                            "Answers are not correct.", Modifier.padding(8.dp),
                            color = getErrorColor()
                        )
//                        Text(
//                            "Correct answers: \n ${viewModel.correctAnswers()}",
//                            Modifier.padding(8.dp),
//                            color = getCorrectAnswersColor()
//                        )

                        if (mode.value == Modes.TUITION.name) {
                            // zobrazeni spravnych odpovedi
                            uiState.value.data?.questions?.items?.forEach {
//                            if (viewModel.correctAnswers().contains(it.text)) {
//                        viewModel.correctAnswers().forEach{
                                QuestionItem(
                                    paddingValues = paddingValues,
                                    question = it,
                                    nodeId = nodeId,
//                                    lessonId = lessonId,
                                    viewModel = viewModel,
                                    onSubmitClicked = onSubmitClicked,
                                    showCorrectAnswers = true,
                                    navigation = navigation
                                )
                            }
                        }
                    }
//                    }

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
                    enabled = /*lessonId != null &&*/ nodeId != null,// || (mode.value == Modes.TUITION.name && graph.map[actualNodeInGraph]?.subsequentNodeIds?.get(0) != null),// viewModel.selectedOptions.size == 1
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
                                        if (todoNodes.isEmpty()) {
                                            // testovani je ukonceno a je zobrazen vysledek
                                            navigation.navigateToResultScreen()
                                        } else {
                                            println("todoNodes:$todoNodes")
                                            actualNodeInGraph = todoNodes.removeAt(0)

                                            navigation.navigateToQuestionScreen(
                                                nodeId = actualNodeInGraph,
                                                lessonId = graph.map[actualNodeInGraph]?.lessonId
                                            )
                                        }
                                    } else {
                                        // pokracovani na rodicovske uzly s otazkami
                                        actualNodeInGraph = viewModel.getNextNodeId()

                                        navigation.navigateToQuestionScreen(
                                            nodeId = actualNodeInGraph,
                                            lessonId = graph.map[actualNodeInGraph]?.lessonId
                                        )
                                    }
                                }

                                Modes.TUITION.name -> {
                                    println("actualNodeInGraph=$actualNodeInGraph\n" +
                                            "graph[actual].lessonId=${graph.map[actualNodeInGraph]?.lessonId}\n" +
                                            "lessonsToStudy=$lessonsToStudy\n" +
                                            "todoNodes=$todoNodes")

                                    if (viewModel.isTestCorrect()) {
                                        if (lessonsToStudy.isEmpty()) {
                                            // todo  pokracuje se niz v grafu
                                            println("todo pokracuje se niz v grafu")

//                                            if (graph.map[actualNodeInGraph]?.subsequentNodeIds?.get(0) != null)
//                                                actualNodeInGraph = graph.map[actualNodeInGraph]?.subsequentNodeIds?.get(0)!!

                                            navigation.navigateToLessonScreen(
                                                nodeId = actualNodeInGraph,
                                                lessonId = graph.map[actualNodeInGraph]?.lessonId
                                            )

                                        } else {
                                            println("TEST NOT OK, lessonsToStudy:$lessonsToStudy")
                                            val lessonToStudy = lessonsToStudy.iterator().next()
                                            lessonsToStudy.remove(lessonToStudy)
//                                            actualNodeInGraph = lessonsToStudy.removeAt(0)

                                            navigation.navigateToLessonScreen(
//                                                nodeId = actualNodeInGraph,
                                                nodeId = actualNodeInGraph,
//                                                lessonId = graph.map[actualNodeInGraph]?.lessonId
                                                lessonId = lessonToStudy
                                            )
                                        }
                                    } else {
                                        // todo kdyz test neni vyplnen spravne
                                        // todo navigovat na lekce rodicovskych uzlu
                                        val lessonToStudy = lessonsToStudy.iterator().next()
                                        lessonsToStudy.remove(lessonToStudy)
                                        println("Removing lessonToStudy:$lessonToStudy from $lessonsToStudy")

                                        navigation.navigateToLessonScreen(
                                            nodeId = -1L, // node je null -- debugger ok
                                            lessonId = lessonToStudy
                                        )
                                    }
                                }
                            }
                        }
                    }) {
                    if (!onSubmitClicked.value) {
                        Text("Submit")
                    } else {
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
//    lessonId: Long?,
    viewModel: QuestionScreenVM,
    onSubmitClicked: MutableState<Boolean>,
    showCorrectAnswers: Boolean = false,
    navigation: INavigationRouter,
) {
    val questionText: String = question?.text ?: "No data"
    val options: List<Option>? = question?.options?.items
//    val correctAnswers = hashMapOf<String, String>()

    // pokud je to typ otazek jinych nez CLOZE
//    if (question?.questionType != "CLOZE") {
    if (!options.isNullOrEmpty()) {// && options[0].groupNumber == 0) {
//        println("jiny nez cloze")
        options.filter { it.correctAnswer == true }.forEach { opt ->
//            viewModel.correctOptions[questionText] = opt.text ?: ""
            viewModel.correctOptions["${question.id}.${opt.groupNumber}"] = opt.text ?: ""

//            correctAnswers[questionText] = opt.text ?: ""
//            correctAnswers["${question.id}.${opt.groupNumber}"] = opt.text ?: ""
        }
        println("VM correctOptions:${viewModel.correctOptions}")
        // todo nasledne else by se nemelo vubec provadet a byt potreba -- SMAZAT
    } else if (!options.isNullOrEmpty()) { // pokud je to CLOZE
        val dividedSentence = questionText.split("""\[\[[0-9]+\]\]""".toRegex())
        val result = options.filter { it.correctAnswer == true }
            .zip(dividedSentence.subList(0, dividedSentence.size - 1))
        var count = 1
        for (paar in result) {
            // uloz spravne odpovedi do VM
            viewModel.correctOptions[paar.second + "[[$count"] = paar.first.text ?: ""
//            correctAnswers[paar.second + "[[$count"] = paar.first.text ?: ""
            count += 1
        }
    }

    println("opt:$options")
//    println("corr:$correctAnswers")
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
                        selectedOption = if (showCorrectAnswers) {
                            selectedOption.value = viewModel.correctOptions["${question.id}.0"]!!
                            selectedOption
                        } else if (viewModel.selectedOptions.keys.contains("${question.id}.0")) {
                            selectedOption.value = viewModel.selectedOptions["${question.id}.0"]!!
                            selectedOption
                        } else selectedOption,
                        onClickAfter = {
                            // pod klic se znenim otazky je ulozena hodnota odpovedi
                            viewModel.selectedOptions["${question.id}.0"] = selectedOption.value
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
                            string = sentence.substring(0,sentence.length-3-1),
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
                                selected = if (showCorrectAnswers) {
                                    selectedOption.value = viewModel.correctOptions["${question.id}.${sentence.substringAfter("[[")}"]!!
                                    selectedOption
                                } else if (viewModel.selectedOptions.keys.contains("${question.id}.${sentence.substringAfter("[[")}")) {
                                    selectedOption.value = viewModel.selectedOptions["${question.id}.${sentence.substringAfter("[[")}"]!!
                                    selectedOption
                                } else selectedOption,
                                onClickAfter = {
                                    // pod klic se znenim casti otazky otazky je ulozena hodnota
                                    // odpovedi
                                    viewModel.selectedOptions["${question.id}.${sentence.substringAfter("[[")}"] = selectedOption.value
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
                        textColor = if (showCorrectAnswers) getCorrectAnswersColor() else basicTextColor(),
                        fontSize = MaterialTheme.typography.titleLarge.fontSize
                    )

                    OutlinedTextField(
                        value = if (showCorrectAnswers) {
                            answer.value = viewModel.correctOptions["${question.id}.0"]!!
                            answer.value
                        } else if (viewModel.selectedOptions.keys.contains("${question.id}.0")) {
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
//                    }
                }
            }
        }
    }
}


package cz.mendelu.pef.microlearning.ui.screens.question

import android.os.Build
import androidx.activity.compose.BackHandler
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
import cz.mendelu.pef.microlearning.R
import cz.mendelu.pef.microlearning.model.Modes
import cz.mendelu.pef.microlearning.model.UiState
import cz.mendelu.pef.microlearning.model.actualNodeInGraph
import cz.mendelu.pef.microlearning.model.api.Option
import cz.mendelu.pef.microlearning.model.api.Question
import cz.mendelu.pef.microlearning.model.educationalNode
import cz.mendelu.pef.microlearning.model.graph
import cz.mendelu.pef.microlearning.model.lessonsToStudy
import cz.mendelu.pef.microlearning.model.mode
import cz.mendelu.pef.microlearning.model.todoNodes
import cz.mendelu.pef.microlearning.navigation.INavigationRouter
import cz.mendelu.pef.microlearning.ui.elements.AlertDialog
import cz.mendelu.pef.microlearning.ui.elements.BaseScreen
import cz.mendelu.pef.microlearning.ui.elements.CheckBoxMultipleSelection
import cz.mendelu.pef.microlearning.ui.elements.Dropdown
import cz.mendelu.pef.microlearning.ui.elements.HtmlText
import cz.mendelu.pef.microlearning.ui.elements.PlaceholderScreenContent
import cz.mendelu.pef.microlearning.ui.elements.RadioButtonSingleSelection
import cz.mendelu.pef.microlearning.ui.theme.basicTextColor
import cz.mendelu.pef.microlearning.ui.theme.getCorrectAnswersColor
import cz.mendelu.pef.microlearning.ui.theme.getErrorColor
import cz.mendelu.pef.microlearning.ui.theme.getPrimaryColor

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

    val openAlertDialog = remember { mutableStateOf(false) }

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

    BackHandler {
        println("Navigating by BACK HANDLER")
        openAlertDialog.value = true
    }

    BaseScreen(
        topBarText = stringResource(R.string.pretest_of_lesson) + graph.map[actualNodeInGraph]?.lessonOrdinalNumber,
        placeholderScreenContent = if (uiState.value.errors != null) {
            PlaceholderScreenContent(
                image = null,
                text = stringResource(id = uiState.value.errors!!.communicationError)
            )
        } else null,
        showLoading = uiState.value.loading,
        drawFullScreenContent = true,
        onBackClick = {
            openAlertDialog.value = true
//            navigation.navigateBack()
        }
    ) {
//        BackHandler(enabled = true) {
//            // Zde můžete definovat vlastní akci při stisknutí tlačítka Zpět
//            println("Tlačítko Zpět bylo stisknuto!")
//        }

        QuestionScreenContent(
            paddingValues = it,
            nodeId = nodeId,
//            lessonId = lessonId,
            uiState = uiState,
            viewModel = viewModel,
            navigation = navigation,
            openAlertDialog = openAlertDialog
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
    openAlertDialog: MutableState<Boolean>
) {
    val onSubmitClicked = remember { mutableStateOf(false) }

    when {
        // ...
        openAlertDialog.value -> {

            AlertDialog(
                onDismissRequest = {
                    openAlertDialog.value = false
                    println("DISMISS: Staying in tests")
//                    navigation.navigateToMainScreen()
                },
                onConfirmation = {
                    openAlertDialog.value = false
                    println("CONFIRM: Testing left")
                    navigation.navigateToMainScreen()
                },
                dialogTitle = stringResource(R.string.testing_will_be_ended),
                dialogText = stringResource(R.string.do_you_really_want_to_leave_testing),
                icon = null
//                icon = Icons.Default.Info

            )
        }
    }

    LazyColumn (modifier = Modifier.padding(paddingValues)) {
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
                    if (viewModel.testOk == 1) {
                        Text(stringResource(R.string.well_done_answers_are_correct), Modifier.padding(8.dp))
                    } else if (viewModel.testOk == -1) {
                        Text(
                            stringResource(R.string.answers_are_not_correct),
                            modifier = Modifier.padding(8.dp),
                            color = getErrorColor()
                        )
//                        Text(
//                            "Correct answers: \n ${viewModel.correctAnswers()}",
//                            Modifier.padding(8.dp),
//                            color = getCorrectAnswersColor()
//                        )

                        if (mode.value.uppercase() == Modes.TUITION.name) {
                            // zobrazeni spravnych odpovedi
                            Text(
                                text = "List of correct answers is following",
                                color = getPrimaryColor()
                            )
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
                            Text(
                                text = stringResource(R.string.prerequisites_are_not_sufficient_previous_lessons_need_to_be_reviewed),
                                color = getPrimaryColor()
                            )
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
                            viewModel.isTestCorrect()
                        } else {
                            when (mode.value.uppercase()) {
                                Modes.TESTING.name -> {
                                    if (viewModel.isTestCorrect()) {
                                        if (todoNodes.isEmpty()) {
                                            // testovani je ukonceno a je zobrazen vysledek
                                            navigation.navigateToResultScreen()
                                        } else {
                                            println("todoNodes:$todoNodes")
                                            actualNodeInGraph = todoNodes.iterator().next()
                                            todoNodes.remove(actualNodeInGraph)

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
                                    if (viewModel.isTestCorrect()) {

                                        // kontrola korenoveho uzlu -- musi probehnout kazdopadne
                                        if (todoNodes.isNotEmpty()) {
                                            val item = todoNodes.iterator().next()
                                            if (graph.map[item]?.lessonOrdinalNumber == 0) {
                                                // pokud seznam obsahuje na prvnim indexu korenovy uzel
                                                // odstranit ho
                                                todoNodes.remove(item)
                                            }
                                        }

                                        if (todoNodes.isEmpty()) {
                                            println("TUITION>Test OK>todoNodes(empty): $todoNodes")
                                            // test OK, nejsou uzly k projiti
                                            // a) prave zacinam -> zobrazim odpovidajici lekci k pretestu
                                            // b) dostala jsem se ze smycky a vratila se ke startovacimu uzlu -> zobrazim odpovidajici lekci
                                            // c) mam bezproblemovy pruchod grafem -> zobrazim odpovidajici lekci
                                            // a = c

                                            if ((graph.map[actualNodeInGraph]?.lessonOrdinalNumber ?: 0)  < (graph.map[educationalNode]?.lessonOrdinalNumber ?: 0)){
                                                // pokud ordinal number aktualniho uzlu < ord.n.edukacniho uzlu,
                                                //  jit do edukacniho uzlu (actual = educational) a zobrazit otazky
                                                actualNodeInGraph = educationalNode

                                                // navigateToQuestionScreen()
                                                navigation.navigateToQuestionScreen(
                                                    nodeId = actualNodeInGraph,
                                                    lessonId = graph.map[actualNodeInGraph]?.lessonId
                                                )
                                            } else {
                                                // jinak (pravdepodobne, ze se rovnaji)
                                                println("actualNodeOrdinalNum (${graph.map[actualNodeInGraph]?.lessonOrdinalNumber}) " +
                                                        ">= educationalNodeOrdinalNum (${graph.map[educationalNode]?.lessonOrdinalNumber})")

                                                // zobrazit lekci aktualniho uzlu
                                                // navigation.navigateToLessonScreen()
                                                navigation.navigateToLessonScreen(
                                                    nodeId = actualNodeInGraph,
                                                    lessonId = graph.map[actualNodeInGraph]?.lessonId
                                                )
                                            }

                                        } else {
                                            // test je OK a jsou uzly k projiti v todoNodes
                                            println("TUITION>Test OK>todoNodes(!empty): $todoNodes")

                                            //  zobrazeni dalsiho uzlu z todoNodes, resp. pretestu
                                                //// navigation.navigateToQuestionScreen()
                                            actualNodeInGraph = todoNodes.iterator().next()
                                            todoNodes.remove(actualNodeInGraph)
//                                            if (graph.map[actualNodeInGraph]?.lessonOrdinalNumber == 0){
//                                                // pokud by nasledny uzel mel byt korenovy -- preskoc na dalsi uzel
//                                                actualNodeInGraph = todoNodes.removeAt(0)
//                                            }

                                            navigation.navigateToQuestionScreen(
                                                nodeId = actualNodeInGraph,
                                                lessonId = graph.map[actualNodeInGraph]?.lessonId
                                            )



//        ------------------------------------------- nasledujici je original z TESTING modu -------
//                                            actualNodeInGraph = todoNodes.removeAt(0)

                                            // naviguje se na otazky uzlu z todoNodes
                                            // dany uzel s odpovidajici lekci
//                                            navigation.navigateToQuestionScreen(
//                                                nodeId = actualNodeInGraph,
//                                                lessonId = graph.map[actualNodeInGraph]?.lessonId
//                                            )
                                            // -----------------------------------------------------
                                        }
                                    } else {
                                        // test neni OK

                                        //  1. zobrazit vsechny lekce (ted jen prvni, ostatni se musi zacyklit v lessonScreene)
                                        //     predku ,
                                        //todo     tzn. pridat tyto vsechny lekce to __lessonsToStudy__
                                        graph.map[actualNodeInGraph]?.previousNodesIds?.forEach{ nId ->
                                            if (graph.map[nId] != null && graph.map[nId]!!.lessonId != null) {
                                                lessonsToStudy.add(graph.map[nId]!!.lessonId!!)
                                            }
                                        }

                                        //  2. pak se budu zase snazit o vstup do uzlu (po lekcich navigovani na
                                        //     Pretest -> rozhodnuti -> lekce),
                                        //todo      tzn. pridat vsechny tyto uzly do __todoNodes__
                                        todoNodes.addAll(graph.map[actualNodeInGraph]?.previousNodesIds ?: listOf())

                                        //  todo 3. navigovat do lekce (radeji osetrit, ze lessonsToStudy neni prazdny, ale to jen, aby to nespadlo)
                                        val lId = lessonsToStudy.iterator().next()
                                        lessonsToStudy.remove(lId)

                                        var nId: Long? = null
                                        graph.map.values.forEach {
                                            if (it.lessonId == lId) nId = it.id
                                        }

                                        navigation.navigateToLessonScreen(
                                            nodeId = nId, // bylo -1L misto null, zajima me hlavne lekce
                                            lessonId = lId
                                        )

                                        //  4. pokud lessonsToStudy je prazdny -> NENASTANE, po spatnych odpovedich VZDY prichazi LEKCE
                                        // todo     !! musi se osetrit korenovy uzel !!
                                            // navigation.navigateToLessonScreen()

                                        /*
                                        actualNodeInGraph = viewModel.getNextNodeId()

                                        if (actualNodeInGraph != -1L) {
                                            navigation.navigateToQuestionScreen(
                                                nodeId = actualNodeInGraph,
                                                lessonId = graph.map[actualNodeInGraph]?.lessonId
                                            )
                                        } else {
                                            println("NEJSOU PREDCHUDCI, vm.getNextNodeId() returns -1L")
                                        }
                                    }
                                         */
                                    }

                                /* // cast slessons to study
                                Modes.TUITION.name -> {
                                    println("actualNodeInGraph=$actualNodeInGraph\n" +
                                            "graph[actual].lessonId=${graph.map[actualNodeInGraph]?.lessonId}\n" +
                                            "lessonsToStudy=$lessonsToStudy\n" +
                                            "todoNodes=$todoNodes")

                                    if (viewModel.isTestCorrect()) {
                                        if (lessonsToStudy.isEmpty()) {
                                            // pokracuje se niz v grafu
                                            println("pokracuje se niz v grafu")

//                                            if (graph.map[actualNodeInGraph]?.subsequentNodeIds?.get(0) != null)
//                                                actualNodeInGraph = graph.map[actualNodeInGraph]?.subsequentNodeIds?.get(0)!!

                                            navigation.navigateToLessonScreen(
                                                nodeId = actualNodeInGraph,
                                                lessonId = graph.map[actualNodeInGraph]?.lessonId
                                            )

                                        } else {
                                            // lessonsToStudy is not empty
                                            println("TEST OK, lessonsToStudy:$lessonsToStudy")
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
                                        // to do kdyz test neni vyplnen spravne
                                        // to do navigovat na lekce rodicovskych uzlu
                                        val lessonToStudy = lessonsToStudy.iterator().next()
                                        lessonsToStudy.remove(lessonToStudy)
                                        println("Removing lessonToStudy:$lessonToStudy from $lessonsToStudy")

                                        navigation.navigateToLessonScreen(
                                            nodeId = -1L, // node je null -- debugger ok
                                            lessonId = lessonToStudy
                                        )
                                    }
                                 */
                                }
                            }
                        }
                    }) {
                    if (!onSubmitClicked.value) {
                        Text(stringResource(R.string.submit))
                    } else {
                        Text(stringResource(R.string.txt_continue))
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
    val questionText: String = question?.text ?: stringResource(R.string.txt_no_data)
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
        modifier = Modifier.padding(8.dp)
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
                        fontSize = MaterialTheme.typography.bodyLarge.fontSize
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
                        fontSize = MaterialTheme.typography.bodyLarge.fontSize
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
                            fontSize = MaterialTheme.typography.bodyLarge.fontSize
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
                        fontSize = MaterialTheme.typography.bodyLarge.fontSize
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
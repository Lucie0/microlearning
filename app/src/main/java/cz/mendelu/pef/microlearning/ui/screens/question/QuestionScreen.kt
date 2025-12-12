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
import cz.mendelu.pef.microlearning.model.educationalNode
import cz.mendelu.pef.microlearning.model.graph
import cz.mendelu.pef.microlearning.model.lessonsToStudy
import cz.mendelu.pef.microlearning.model.mode
import cz.mendelu.pef.microlearning.model.todoNodes
import cz.mendelu.pef.microlearning.navigation.INavigationRouter
import cz.mendelu.pef.microlearning.ui.elements.AlertDialog
import cz.mendelu.pef.microlearning.ui.elements.BaseScreen
import cz.mendelu.pef.microlearning.ui.elements.PlaceholderScreenContent
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
        if (uiState.value.errors != null) {
            navigation.navigateToMainScreen()
        } else {
            openAlertDialog.value = true
        }
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
        alertDialogContent = {
            if (openAlertDialog.value) {
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
        },
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

//    when {
//        // ...
//        openAlertDialog.value -> {


//        }
//    }

    LazyColumn(modifier = Modifier.padding(paddingValues)) {
//        item {
        /*
            QuestionScreenContent(
                paddingValues = it,
                question = uiState.value.data?.items?.get(5), //  cislo je napevno!!!!
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

            // po kliknuti na tlacitko odeslat -- zobrazeni spravneho vyplneni otazky
            if (onSubmitClicked.value) {
                if (viewModel.testOk == 1) {
                    item {
                        Text(
                            stringResource(R.string.well_done_answers_are_correct),
                            Modifier.padding(8.dp)
                        )
                    }
                } else if (viewModel.testOk == -1) {
                    item {
                        Text(
                            stringResource(R.string.answer_is_not_correct),
                            modifier = Modifier.padding(start = 16.dp, end = 16.dp),
                            color = getErrorColor()
                        )

                        if (mode.value == Modes.Tuition.name) {
                            // zobrazeni spravnych odpovedi
                            Text(
                                text = stringResource(R.string.correct_answers_following),
                                modifier = Modifier.padding(start = 16.dp, end = 16.dp),
                                color = getPrimaryColor()
                            )

                            QuestionItem(
                                paddingValues = paddingValues,
                                question = it,
                                nodeId = nodeId,
                                viewModel = viewModel,
                                onSubmitClicked = onSubmitClicked,
                                showCorrectAnswers = true,
                                navigation = navigation
                            )
                        }
                    }
                }
            }
            // todo zobrazeni spravnych odpovedi pri chybnem vyplneni -- presunout sem
            // if (clicked on submit){
            //      if (isTestOk) { zobrazit well done}
            //      else // test neni ok// { zobrazit ze neni OK a v TUITION modu vypsat take spravnou odpoved }
            // asi jen vypsat spravnou odpoved textem, nevytvaret novy radio buttony, jen obyc text a napsat ho zelene (pouze v tuition modu)
            //}

        }

        item {
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                if (onSubmitClicked.value) {
                    Text(
                        text = stringResource(R.string.prerequisites_are_not_sufficient_previous_lessons_need_to_be_reviewed),
                        color = getPrimaryColor()
                    )
                }
                //  pridat item a v nem zobrazit tlacitko zespodu
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
                            when (mode.value) {
                                Modes.Testing.name -> {
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

                                Modes.Tuition.name -> {
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

                                            if ((graph.map[actualNodeInGraph]?.lessonOrdinalNumber
                                                    ?: 0) < (graph.map[educationalNode]?.lessonOrdinalNumber
                                                    ?: 0)
                                            ) {
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
                                                println(
                                                    "actualNodeOrdinalNum (${graph.map[actualNodeInGraph]?.lessonOrdinalNumber}) " +
                                                            ">= educationalNodeOrdinalNum (${graph.map[educationalNode]?.lessonOrdinalNumber})"
                                                )

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
                                            navigation.navigateToQuestionScreen(
                                                nodeId = actualNodeInGraph,
                                                lessonId = graph.map[actualNodeInGraph]?.lessonId
                                            )
                                        }
                                    } else {
                                        // test neni OK

                                        //  1. zobrazit vsechny lekce (ted jen prvni, ostatni se musi zacyklit v lessonScreene)
                                        //     predku ,
                                        //todo     tzn. pridat tyto vsechny lekce to __lessonsToStudy__
                                        graph.map[actualNodeInGraph]?.previousNodesIds?.forEach { nId ->
                                            if (graph.map[nId] != null && graph.map[nId]!!.lessonId != null) {
                                                lessonsToStudy.add(graph.map[nId]!!.lessonId!!)
                                            }
                                        }

                                        //  2. pak se budu zase snazit o vstup do uzlu (po lekcich navigovani na
                                        //     Pretest -> rozhodnuti -> lekce),
                                        //todo      tzn. pridat vsechny tyto uzly do __todoNodes__
                                        todoNodes.addAll(
                                            graph.map[actualNodeInGraph]?.previousNodesIds
                                                ?: listOf()
                                        )

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
                                    }
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


//            item {
//                QuestionScreenContent(
//                    paddingValues = it,
//                    question = uiState.value.data?.items?.get(3), //  cislo je napevno!!!!
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
//                    question = uiState.value.data?.items?.get(6), //  cislo je napevno!!!!
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
//                    question = uiState.value.data?.items?.get(8), //  cislo je napevno!!!!
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
//                    question = uiState.value.data?.items?.get(4), //  cislo je napevno!!!!
////            questionText = uiState.value.data?.items?.get(0)?.text ?: "No data",
////            options = uiState.value.data?.items?.get(0)?.options?.items
//                    lessonId = myLessonId,
//                    lessonName = lessonName,
//                    nodeId = nodeId,
//                    viewModel = viewModel,
//                    navigation = navigation
//                )
//            }
        /*
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

                        if (mode.value == Modes.Tuition.name) {
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
                            when (mode.value) {
                                Modes.Testing.name -> {
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

                                Modes.Tuition.name -> {
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
        */
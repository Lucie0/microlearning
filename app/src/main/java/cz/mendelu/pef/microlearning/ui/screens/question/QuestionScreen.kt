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
import cz.mendelu.pef.microlearning.model.TestState
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
import cz.mendelu.pef.microlearning.ui.theme.getPrimaryColor

@RequiresApi(Build.VERSION_CODES.P)
@Composable
fun QuestionScreen(
    nodeId: Long?,// v jakem uzlu se nachazim
    lessonId: Long?,
    navigation: INavigationRouter
) {
    // VM
    val viewModel = hiltViewModel<QuestionScreenVM>()
    viewModel.lessonId = lessonId ?: graph.map[actualNodeInGraph]?.lessonId!!
    viewModel.nodeId = nodeId ?: actualNodeInGraph

    val openAlertDialog = remember { mutableStateOf(false) }
    val onSubmitClicked = remember { mutableStateOf(false) }


    println("---* ACTUAL NODE QSc:$actualNodeInGraph")
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
        topBarText = if (!onSubmitClicked.value)
            stringResource(R.string.pretest_of_lesson) + (graph.map[actualNodeInGraph]?.lessonOrdinalNumber ?: "")
        else
            stringResource(R.string.title_evaluation) + stringResource(R.string.pretest_of_lesson) + (graph.map[actualNodeInGraph]?.lessonOrdinalNumber ?: ""),
        placeholderScreenContent = if (nodeId == -1L) {
            PlaceholderScreenContent(
                image = R.drawable.undraw_blank_canvas_a6x5,
                text = stringResource(R.string.no_more_questions_you_need_to_study)
            )
        } else if (uiState.value.errors != null) {
            PlaceholderScreenContent(
                image = when (uiState.value.errors!!.communicationError) {
                    R.string.communication_error -> R.drawable.undraw_server_error_syuz
                    R.string.not_found -> R.drawable.undraw_not_found_6bgl
                    R.string.no_data -> R.drawable.undraw_no_data_ig65
                    R.string.no_testing_questions_for_this_domain -> R.drawable.undraw_blank_canvas_a6x5
                    else -> R.drawable.undraw_dreamer_gb41
                },
                text = stringResource(id = uiState.value.errors!!.communicationError)
            )
        } else null,
        showLoading = uiState.value.loading,
        alertDialogContent = {
            if (openAlertDialog.value) {
                AlertDialog(
                    dialogTitle = stringResource(R.string.testing_will_be_ended),
                    dialogText = stringResource(R.string.do_you_really_want_to_leave_testing),

                    confirmText = stringResource(R.string.dialog_yes),
                    onConfirmButton = {
                        openAlertDialog.value = false
                        println("CONFIRM: Testing left")
                        navigation.navigateToMainScreen()
                    },
                    dismissText = stringResource(R.string.dialog_no),
                    onDismissButton = {
                        openAlertDialog.value = false
                    },
                    onDismissRequest = {
                        openAlertDialog.value = false
                    },
                    icon = null
//                icon = Icons.Default.Info

                )
            }
        },
        drawFullScreenContent = true,
        onBackClick = {
            openAlertDialog.value = true
        }
    ) {
        QuestionScreenContent(
            paddingValues = it,
            nodeId = nodeId,
            uiState = uiState,
            viewModel = viewModel,
            navigation = navigation,
            onSubmitClicked = onSubmitClicked
        )
    }
}

@RequiresApi(Build.VERSION_CODES.P)
@Composable
fun QuestionScreenContent(
    paddingValues: PaddingValues,
    nodeId: Long?,
    uiState: MutableState<UiState<QuestionScreenData, QuestionsErrors>>,
    viewModel: QuestionScreenVM,
    navigation: INavigationRouter,
    onSubmitClicked: MutableState<Boolean>
) {

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

            item {
                QuestionItem(
                    paddingValues = paddingValues,
                    question = it,
                    nodeId = nodeId,
//                    lessonId = lessonId,
                    viewModel = viewModel,
                    onSubmitClicked = onSubmitClicked,
                    showCorrectAnswers = onSubmitClicked.value && mode.value == Modes.TUITION.ordinal
                )
            }

            /*
            // po kliknuti na tlacitko Odeslat --> zobrazeni spravneho vyplneni otazky
            if (onSubmitClicked.value) {
                if (viewModel.testState == TestState.PASSED) {
                    item {
                        Text(
                            stringResource(R.string.well_done_answers_are_correct),
                            Modifier.padding(8.dp)
                        )
                    }
                } else {
                    item {
                        // if ...  if jestli je tato otazka spatne, vypis informaci o tom, pripadne zobraz spravnou odpoved
                        // else jestli je spravne, informuj o tom
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
            */


            //  zobrazeni spravnych odpovedi pri chybnem vyplneni -- presunout sem
            // if (clicked on submit){
            //      if (isTestOk) { zobrazit well done}
            //      else // test neni ok// { zobrazit ze neni OK a v TUITION modu vypsat take spravnou odpoved }
            // asi jen vypsat spravnou odpoved textem, nevytvaret novy radio buttony, jen obyc text a napsat ho zelene (pouze v tuition modu)
            //}

        }

        item {
            when (mode.value) {
                Modes.TUITION.ordinal -> {
                    Column(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        if (onSubmitClicked.value && viewModel.testState == TestState.FAILED) {
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
                            enabled = nodeId != null,// || (mode.value == Modes.TUITION.name && graph.map[actualNodeInGraph]?.subsequentNodeIds?.get(0) != null),// viewModel.selectedOptions.size == 1
                            content = {
                                if (!onSubmitClicked.value) {
                                    Text(stringResource(R.string.submit))
                                } else {
                                    Text(stringResource(R.string.txt_continue))
                                }
                            },
                            onClick = {
                                if (!onSubmitClicked.value) {
                                    // kliknuto na Submit
                                    onSubmitClicked.value = true
                                    viewModel.isTestCorrect()
                                } else {
                                    if (viewModel.isTestCorrect()) {
                                        // kontrola korenoveho uzlu -- musi probehnout kazdopadne
//                                        if (todoNodes.isNotEmpty()) {
//                                            val item = todoNodes.iterator().next()
//                                            if (graph.map[item]?.lessonOrdinalNumber == 0) {
//                                                // pokud seznam obsahuje na prvnim indexu korenovy uzel
//                                                // odstranit ho
//                                                todoNodes.remove(item)
//                                            }
//                                        }

                                        if (todoNodes.isEmpty()) {
                                            println("TUITION>Test OK>todoNodes(empty): $todoNodes")
                                            // test OK, nejsou uzly k projiti
                                            // a) prave zacinam -> zobrazim odpovidajici lekci k pretestu
                                            // b) dostala jsem se ze smycky a vratila se ke startovacimu uzlu -> zobrazim odpovidajici lekci
                                            // c) mam bezproblemovy pruchod grafem -> zobrazim odpovidajici lekci
                                            // a = c

                                            println("actualNode:$actualNodeInGraph \n educationalNode:$educationalNode")
                                            println(
                                                "actualNodeOrdinalNum (${graph.map[actualNodeInGraph]?.lessonOrdinalNumber}) " +
                                                        ">= educationalNodeOrdinalNum (${graph.map[educationalNode]?.lessonOrdinalNumber})"
                                            )

                                            if ((graph.map[actualNodeInGraph]?.lessonOrdinalNumber
                                                    ?: 0) >= (graph.map[educationalNode]?.lessonOrdinalNumber
                                                    ?: 0)
                                            ) {
                                                // pokud ordinal number je rovno (nebo nahodou vetsi) nez edukacni uzel, jdi na lekci
                                                println(
                                                    "actualNodeOrdinalNum (${graph.map[actualNodeInGraph]?.lessonOrdinalNumber}) " +
                                                            ">= educationalNodeOrdinalNum (${graph.map[educationalNode]?.lessonOrdinalNumber})"
                                                )

                                                // zobrazit lekci aktualniho uzlu
                                                // navigation.navigateToLessonScreen()

                                                println(
                                                    "navigateToLessonScreen:" +
                                                            "nodeId = $actualNodeInGraph,\n" +
                                                            "lessonId = ${graph.map[actualNodeInGraph]?.lessonId},\n" +
                                                            "lessonOrdinalNumber = ${graph.map[actualNodeInGraph]?.lessonOrdinalNumber},\n" +
                                                            "topicId = ${graph.topicId}"
                                                )

                                                navigation.navigateToLessonScreen(
                                                    nodeId = actualNodeInGraph,
                                                    lessonId = graph.map[actualNodeInGraph]?.lessonId,
                                                    lessonOrdinalNumber = graph.map[actualNodeInGraph]?.lessonOrdinalNumber,
                                                    topicId = graph.topicId
                                                )
                                            } else {
                                                // pokud ordinal number aktualniho uzlu < ord.n.edukacniho uzlu,
                                                //  jit do edukacniho uzlu (actual = educational) a zobrazit otazky
                                                println("actualNode:$actualNodeInGraph")
                                                actualNodeInGraph = educationalNode

                                                // navigateToQuestionScreen()
                                                navigation.navigateToQuestionScreen(
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
                                        println("test neni ok")
                                        println("LessonToStudy:$lessonsToStudy")
                                        // test neni OK

                                        //  1. zobrazit vsechny lekce (ted jen prvni, ostatni se musi zacyklit v lessonScreene)
                                        //     predku ,
                                        //todo     tzn. pridat tyto vsechny lekce to __lessonsToStudy__
                                        graph.map[actualNodeInGraph]?.previousNodesIds?.forEach { nId ->
                                            if (graph.map[nId] != null && graph.map[nId]!!.lessonId != null) {
                                                lessonsToStudy.add(graph.map[nId]!!.lessonId!!)
                                            }
                                        }
                                        println("LessonToStudy:$lessonsToStudy")

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

                                        val node = graph.map.values
                                            .firstOrNull { it.lessonId == lId }

                                        val nId = node?.id

                                        navigation.navigateToLessonScreen(
                                            nodeId = node?.id, // bylo -1L misto null, zajima me hlavne lekce
                                            lessonId = lId,
                                            lessonOrdinalNumber = node?.lessonOrdinalNumber,
                                            topicId = graph.topicId
                                        )

                                        //  4. pokud lessonsToStudy je prazdny -> NENASTANE, po spatnych odpovedich VZDY prichazi LEKCE
                                    }
                                }
                            }
                        )
                    }
                }

                Modes.TESTING.ordinal -> {
                    Column(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Button(
                            modifier = Modifier.padding(8.dp),
                            // todo enablovat tlacitko, az kdyz jsou vsechny odpovedi vyplnene
                            //  -- cislo, ktere se meni, musi byt v mutableState, jinak se to nepropise
                            enabled = /*lessonId != null &&*/ nodeId != null,// || (mode.value == Modes.TUITION.name && graph.map[actualNodeInGraph]?.subsequentNodeIds?.get(0) != null),// viewModel.selectedOptions.size == 1
                            content = {
                                    Text(stringResource(R.string.btn_check_up))
                            },
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

                                    if (viewModel.isTestCorrect()) {
                                        if (todoNodes.isEmpty()) {
                                            // finalni uzel
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
                                        println("actualNode (cili next node)= $actualNodeInGraph")

                                        if (actualNodeInGraph != -1L) {
                                            navigation.navigateToQuestionScreen(
                                                nodeId = actualNodeInGraph,
                                                lessonId = graph.map[actualNodeInGraph]?.lessonId
                                                    ?: -1
                                            )
                                        } else {
                                            // pokud se jedna o korenovy uzel a uz neni kam dal
                                            navigation.navigateToResultScreen()
                                        }
                                    }
                                }
                            }
                        )
                    }
                }
            }
        }
    }
}
package cz.mendelu.pef.microlearning.ui.screens.lesson

import android.os.Build
import androidx.activity.compose.BackHandler
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import cz.mendelu.pef.microlearning.R
import cz.mendelu.pef.microlearning.model.Modes
import cz.mendelu.pef.microlearning.model.UiState
import cz.mendelu.pef.microlearning.model.actualNodeInGraph
import cz.mendelu.pef.microlearning.model.graph
import cz.mendelu.pef.microlearning.model.lessonsToStudy
import cz.mendelu.pef.microlearning.model.mode
import cz.mendelu.pef.microlearning.model.revisionLessonList
import cz.mendelu.pef.microlearning.model.todoNodes
import cz.mendelu.pef.microlearning.navigation.INavigationRouter
import cz.mendelu.pef.microlearning.ui.elements.AlertDialog
import cz.mendelu.pef.microlearning.ui.elements.BaseScreen
import cz.mendelu.pef.microlearning.ui.elements.HtmlText
import cz.mendelu.pef.microlearning.ui.elements.PlaceholderScreenContent

@RequiresApi(Build.VERSION_CODES.P)
@Composable
fun LessonScreen(
//    title: String? = null,
    lessonId: Long?, // cislo lekce, ktera se ma zobrazit
    nodeId: Long?, // cislo uzlu, ve kterem se nachazim
    lessonOrdinalNumber: Int?,
    topicId: Long?,
    navigation: INavigationRouter
){
    val viewModel = hiltViewModel<LessonScreenVM>()

//    println("GRAPH: ${graph.topicId}, ${graph.map.size}")

    viewModel.lessonId = lessonId
    viewModel.actualNodeId = nodeId
    viewModel.lessonOrdinalNumber = lessonOrdinalNumber
    viewModel.topicId = topicId

    println("---* ACTUAL NODE Ls:$actualNodeInGraph")
    println("lessonId=$lessonId,nodeId=$nodeId")


    val uiState: MutableState<UiState<LessonData, LessonsErrors>> = rememberSaveable { mutableStateOf(UiState()) } // rememberSaveable si ulozi data i pri zmene orientace obrazovky
    val openAlertDialog = remember { mutableStateOf(false) }


    LaunchedEffect(key1 = 1, block = {
        viewModel.getData()
    })

    // poslech nad uistatem
    viewModel.lessonsUiState.value.let {
        uiState.value = it
    }

    BackHandler {
        println("Navigating by BACK HANDLER")
        openAlertDialog.value = true
    }

    // --> text staticky predavat v parametru screeny a uz ho pote neaktualizovat
    BaseScreen(
        topBarText = stringResource(R.string.title_lesson) + (lessonId ?: lessonOrdinalNumber),//+ if (uiState.value.data != null) uiState.value.data!!.content.name else "",
        placeholderScreenContent = if (uiState.value.errors != null) {
            PlaceholderScreenContent(
                image = when (uiState.value.errors!!.communicationError) {
                    R.string.communication_error -> R.drawable.undraw_server_error_syuz
                    R.string.not_found -> R.drawable.undraw_not_found_6bgl
                    R.string.no_data -> R.drawable.undraw_no_data_ig65
                    else -> R.drawable.undraw_dreamer_gb41
                },
//                image = R.drawable.undraw_warning,
                text = stringResource(id = uiState.value.errors!!.communicationError)
            )
        } else null,
        showLoading = uiState.value.loading,
        alertDialogContent = {
            if (openAlertDialog.value) {
                AlertDialog(
                    onDismissRequest = {
                        openAlertDialog.value = false
                        println("DISMISS: Progress not saved")
                        navigation.navigateToMainScreen()
                    },
                    onConfirmation = {
                        openAlertDialog.value = false
                        viewModel.saveActualStateToLocalDB(lessonOrdinalNumber ?: -1)

                        println("CONFIRM: Progress saved")

                        navigation.navigateToMainScreen()
                    },
                    dialogTitle = stringResource(R.string.dialog_progress_not_saved),
                    dialogText = stringResource(R.string.dialog_progress_is_yet_not_saved_do_you_want_to_save_progress),
                    icon = null
//                icon = Icons.Default.Info
                )
            } else null
        },
        drawFullScreenContent = true,
        onBackClick = {
            openAlertDialog.value = true
        }
    ) {
        LessonScreenContent(
            paddingValues = it,
            uiState = uiState,
            lessonId = lessonId,
            nodeId = nodeId,
            lessonOrdinalNumber = lessonOrdinalNumber,
            topicId = topicId,
            viewModel = viewModel,
            navigation = navigation
        )
    }
}

@RequiresApi(Build.VERSION_CODES.P)
@Composable
fun LessonScreenContent(
    paddingValues: PaddingValues,
    uiState: MutableState<UiState<LessonData, LessonsErrors>>,
    lessonId: Long?,
    nodeId: Long?,
    lessonOrdinalNumber: Int?,
    topicId: Long?,
    viewModel: LessonScreenVM,
    navigation: INavigationRouter
) {

//    when {
//        openAlertDialog.value -> {
//    }

    if (uiState.value.data != null) {
        LazyColumn(
            modifier = Modifier
                .padding(top = paddingValues.calculateTopPadding(), bottom = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            item {
                // nadpis
                HtmlText(
                    string = uiState.value.data!!.lesson?.content?.name ?: "",
                    fontSize = MaterialTheme.typography.titleLarge.fontSize,
                    textAlign = TextAlign.Center
                )
            }
            item {
                // samotny content
                HtmlText(string = uiState.value.data!!.lesson?.content?.content ?: stringResource(R.string.txt_no_content))
            }
            item {

                when (mode.value) {
                    // button pro REVISION mode
                    Modes.REVISION.ordinal -> {
                        if (lessonOrdinalNumber != null && topicId != null) {
                            println("lessonList>$revisionLessonList")
                            Row {
                                Button(
                                    modifier = Modifier.padding(8.dp),
                                    enabled = revisionLessonList.containsKey(lessonOrdinalNumber - 1),
                                    onClick = {
                                        navigation.navigateToLessonScreen(
                                            lessonOrdinalNumber = lessonOrdinalNumber - 1,
                                            topicId = topicId,
                                            lessonId = -1L,
                                            nodeId = -1L
                                        )
                                    }
                                ) {
                                    Text(stringResource(R.string.btn_previous_lesson))
                                }

                                Button(
                                    modifier = Modifier.padding(8.dp),
                                    enabled = revisionLessonList.containsKey(lessonOrdinalNumber + 1),
                                    onClick = {
                                        navigation.navigateToLessonScreen(
                                            lessonOrdinalNumber = lessonOrdinalNumber + 1,
                                            topicId = topicId,
                                            lessonId = -1L,
                                            nodeId = -1L
                                        )
                                    }
                                ) {
                                    Text(stringResource(R.string.btn_next_lesson))
                                }
                            }
                        }
                    }

                    // button pro TUITION mode
                    Modes.TUITION.ordinal -> {
                        Button(
//                            enabled = (uiState.value.data!!.linkAfter?.items?.size != null) ?: false,
//                            enabled = (uiState.value.data!!.nextNode?.content?.id != null &&
//                                    uiState.value.data!!.nextNode?.content?.lessonId != null)
//                                    || lessonsToStudy.isNotEmpty(), //&&
                            enabled = graph.map[nodeId]?.subsequentNodeIds?.isNotEmpty() ?: false,
                            onClick = {

                                if (todoNodes.isNotEmpty()) {
                                    val item = todoNodes.iterator().next()
                                    if (graph.map[item]?.lessonOrdinalNumber == 0) {
                                    // pokud list obsahuje na prvnim indexu korenovy uzel
                                    // odstranit ho
                                    todoNodes.remove(item)
//                                    todoNodes.removeAt(0)
                                }
                            }

                                //---------------------------------------------------------------
                                //  kdyz lessonsToStudy neni prazdny, navigovat na lekci z nej
                                //    odstranit ji ze seznamu a predat do paramentru v LessonScreen()
                                if (lessonsToStudy.isNotEmpty()) {
                                    val lId = lessonsToStudy.iterator().next()
                                    lessonsToStudy.remove(lId)

                                    graph.map.values.forEach {
                                        if (it.lessonId == lId) viewModel.actualNodeId = it.id
                                    }

                                    navigation.navigateToLessonScreen(
                                        nodeId = viewModel.actualNodeId, // bylo -1L misto null, zajima me jen lekce
                                        lessonId = lId
                                    )
                                } else if (todoNodes.isNotEmpty()) {// pokud lessonsToStudy je prazdny, zkontrolovat, jestli todoNodes neni prazdny
                                // a navigovat na pretest prvniho nodu
                                    actualNodeInGraph = todoNodes.iterator().next()
                                    todoNodes.remove(actualNodeInGraph)

                                    navigation.navigateToQuestionScreen(
                                        nodeId = actualNodeInGraph,
                                        lessonId = graph.map[actualNodeInGraph]?.lessonId
                                    )
                                } else {
                                    // jinak se posunuju dale na dalsi uzel v graphu -- pretest toho uzlu
                                    actualNodeInGraph = graph.map[actualNodeInGraph]?.subsequentNodeIds?.get(0) ?: -1L// -1L jako uzel nenalezen

                                    println("ActualNode=$actualNodeInGraph (posun z lessonSc dale v graphu do QuestionSc")

                                    navigation.navigateToQuestionScreen(
                                        nodeId = actualNodeInGraph,
                                        lessonId = graph.map[actualNodeInGraph]?.lessonId
                                    )
                                }
                                //---------------------------------------------------------------

                                // pokracovat na dalsi lekci, pokud se k tomuto uzlu bude vazat vice lekci... to do tak co?
                                // pokracovat na test v nasledujicim uzlu
                                // to do co kdyz jich je tam vice? vybirat na zaklade walkThrough? => na zaklade walkthrough
//                                println("nextNodeId:" + uiState.value.data!!.linkAfter?.items?.get(0)?.nextNodeId)
//                                println("Size:${uiState.value.data!!.linkAfter?.items?.size}")

                                /*
                                if (lessonsToStudy.isNotEmpty()) {
                                    val l = lessonsToStudy.iterator().next()
                                    lessonsToStudy.remove(l)

                                    navigation.navigateToLessonScreen(
                                        nodeId = actualNodeInGraph, // -1
                                        lessonId = l
                                    )
                                } else {
//                                actualNodeInGraph = uiState.value.data!!.linkAfter?.items?.get(0)?.nextNodeId!!
                                    if (nodeId != null) { // pokud by byl nodeId null -- tak je tato lekce posledni z tech k dostudovani, vratime se znovu na test, na ktery jsme klikli na zacatku
//                                        jinak se posunujeme dale
                                        actualNodeInGraph =
                                            graph.map[actualNodeInGraph]?.subsequentNodeIds?.get(0)!!
                                    }

                                    navigation.navigateToQuestionScreen(
//                                        nodeId = uiState.value.data!!.nextNode?.content?.id,
                                        nodeId = actualNodeInGraph,
//                                        lessonId = uiState.value.data!!.nextNode?.content?.lessonId,
                                        lessonId = graph.map[actualNodeInGraph]?.lessonId,
//                            testId = uiState.value.data!!.nextNode?.content?.testId,
//                                testId = 1
                                    )
                                }
                                */
                            }
                        ) {
                            Text(stringResource(R.string.btn_continue_to_next_part))
                        }
                    }
                }
            }
        }
    }
}
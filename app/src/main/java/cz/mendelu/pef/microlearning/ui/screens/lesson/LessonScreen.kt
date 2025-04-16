package cz.mendelu.pef.microlearning.ui.screens.lesson

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import cz.mendelu.pef.microlearning.model.UiState
import cz.mendelu.pef.microlearning.navigation.INavigationRouter
import cz.mendelu.pef.microlearning.ui.elements.BaseScreen
import cz.mendelu.pef.microlearning.ui.elements.HtmlText
import cz.mendelu.pef.microlearning.ui.elements.PlaceholderScreenContent

@RequiresApi(Build.VERSION_CODES.P)
@Composable
fun LessonScreen(
//    title: String? = null,
    lessonId: Long?, // cislo lekce, ktera se ma zobrazit
    nodeId: Long?, // cislo uzlu, ve kterem se nachazim
    navigation: INavigationRouter
){
    val viewModel = hiltViewModel<LessonScreenVM>()
    viewModel.lessonId = lessonId
    viewModel.actualNodeId = nodeId

    val uiState: MutableState<UiState<LessonData, LessonsErrors>> = rememberSaveable { mutableStateOf(UiState()) } // rememberSaveable si ulozi data i pri zmene orientace obrazovky

    LaunchedEffect(key1 = 1, block = {
        viewModel.getData()
    })

    // poslech nad uistatem
    viewModel.lessonsUiState.value.let {
        uiState.value = it
    }
//    viewModel.linkAfterUiState.value.let {
//        linkUiState.value = it
//    }

    // neprepisuje se nazev, prestoze se uz prepisoval!!
    // je to kvuli show Loading true -- proooc?
    // --> text staticky predavat v parametru screeny a uz ho pote neaktualizovat
    BaseScreen(
        topBarText = "Lesson $lessonId",//+ if (uiState.value.data != null) uiState.value.data!!.content.name else "",
        placeholderScreenContent = if (uiState.value.errors != null) {
            PlaceholderScreenContent(
                image = null,
//                image = R.drawable.undraw_warning,
                text = stringResource(id = uiState.value.errors!!.communicationError)
            )
        } else null,
        showLoading = uiState.value.loading,
        drawFullScreenContent = true,
        onBackClick = {
//            navigation.navigateBack()
            // lessonId = k zapamatovani stavu
            navigation.navigateToMainScreen(lessonId)
        }
    ) {
        LessonScreenContent(
            paddingValues = it,
            uiState = uiState,
            lessonId = lessonId,
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
    navigation: INavigationRouter
) {
    if (uiState.value != null) {
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
                HtmlText(string = uiState.value.data!!.lesson?.content?.content ?: "No content")
            }
            item {
//                // tlacitko
//                Button(
//                    onClick = {
//                        if (lessonId != null) {
//                            navigation.navigateToLessonScreen(lessonId = lessonId + 1L)
//                        }
//                    }
//                ) {
//                    Text("Next lesson")
//                }

                Button(
                    enabled = uiState.value.data!!.nextNode?.content?.id != null &&
                            uiState.value.data!!.nextNode?.content?.lessonId != null &&
                            uiState.value.data!!.nextNode?.content?.testId != null,
                    onClick = {
                        // pokracovat na dalsi lekci, pokud se k tomuto uzlu bude vazat vice lekci... todo tak co?
                        // pokracovat na test v nasledujicim uzlu
                        // todo co kdyz jich je tam vice? vybirat na zaklade walkThrough? nahodne? ...?
                        println("nextNodeId:" + uiState.value.data!!.linkAfter?.items?.get(0)?.nextNodeId)
                        println("Size:${uiState.value.data!!.linkAfter?.items?.size}")
                        navigation.navigateToQuestionScreen(
                            nodeId = uiState.value.data!!.nextNode?.content?.id,
                            lessonId = uiState.value.data!!.nextNode?.content?.lessonId,
                            testId = uiState.value.data!!.nextNode?.content?.testId,
                        )
                    }
                ) {
                    // todo jiny text
                    Text("Continue")
                }
            }
        }
    }
}
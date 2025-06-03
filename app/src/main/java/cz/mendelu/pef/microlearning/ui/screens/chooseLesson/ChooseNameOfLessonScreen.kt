package cz.mendelu.pef.microlearning.ui.screens.chooseLesson

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ListItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.hilt.navigation.compose.hiltViewModel
import cz.mendelu.pef.microlearning.model.Modes
import cz.mendelu.pef.microlearning.model.UiState
import cz.mendelu.pef.microlearning.model.actualNodeInGraph
import cz.mendelu.pef.microlearning.model.educationalNode
import cz.mendelu.pef.microlearning.model.mode
import cz.mendelu.pef.microlearning.model.startingNode
import cz.mendelu.pef.microlearning.navigation.INavigationRouter
import cz.mendelu.pef.microlearning.ui.elements.BaseScreen
import cz.mendelu.pef.microlearning.ui.elements.PlaceholderScreenContent

@RequiresApi(Build.VERSION_CODES.P)
@Composable
fun ChooseNameOfLessonScreen(
    topicName: String,
    topicId: Long?,
    navigation: INavigationRouter
) {
    val viewModel = hiltViewModel<ChooseLessonVM>()
    viewModel.topicId = topicId!!
    viewModel.topicName = topicName

    val uiState: MutableState<UiState<ChooseLessonData, ChooseLessonErrors>> = rememberSaveable { mutableStateOf(
        UiState()
    ) }

    LaunchedEffect(key1 = 1) {
        viewModel.getData()
    }

    // poslech nad uistatem
    viewModel.uiState.value.let {
        uiState.value = it
    }

    BaseScreen(
        topBarText = topicName,
        showLoading = uiState.value.loading,
        onBackClick = { navigation.navigateBack() },
        placeholderScreenContent = if (uiState.value.errors != null) {
            PlaceholderScreenContent(
                image = null,
                text = stringResource(id = uiState.value.errors!!.communicationError)
            )
        } else null,
        drawFullScreenContent = true
    ) {
        ChooseNameOfLessonScreenContent(
            paddingValues = it,
            uiState = uiState.value,
            topicId = topicId,
            navigation = navigation,
            viewModel = viewModel
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ChooseNameOfLessonScreenContent(
    paddingValues: PaddingValues,
    uiState: UiState<ChooseLessonData, ChooseLessonErrors>,
    topicId: Long?,
    navigation: INavigationRouter,
    viewModel: ChooseLessonVM
) {
    // vypsat vsechny lekce z uistate
    LazyColumn(
        modifier = Modifier.padding(paddingValues)
    ) {
        if (uiState.data?.lessons?.items?.size != 0) {
            uiState.data?.lessons?.items?.forEach {
                item {
                    ListItem(
                        headlineText = { Text(text = if (it.name != null) "${it.id}. ${it.name}" else "Lesson" + it.id) },
                        modifier = Modifier.clickable {
                            when (mode.value) {
                                Modes.REVISION.name -> {
                                    println("Clicked on lesson: " + it.id + ". " + it.name + ", ord " + it.ordinalNumber)
                                    navigation.navigateToLessonScreen(
                                        lessonId = -1L,
                                        nodeId = -1L,
                                        lessonOrdinalNumber = it.ordinalNumber,
                                        topicId = topicId
                                    ) //asi ne... topic id  gettnout z it po vytvoreni modelu LessonNAMES?
                                }

                                Modes.TESTING.name -> {
                                    println("Clicked on title: " + it.id + ". " + it.name + ", ord " + it.ordinalNumber)
                                    //  todo navigate to test 1 apod...
                                    if (viewModel.getNodeFromGraphByLesson(it.id!!) != -1L) {
                                        startingNode = viewModel.getNodeFromGraphByLesson(it.id!!)
                                        actualNodeInGraph =
                                            viewModel.getNodeFromGraphByLesson(it.id!!)

                                        navigation.navigateToQuestionScreen(
                                            lessonId = it.id,
                                            nodeId = startingNode
                                        )
                                    }
                                }

                                Modes.TUITION.name -> {
                                    // TUITION MODE
                                    println("Clicked on lesson: " + it.id + ". " + it.name + ", ord " + it.ordinalNumber)
                                    // todo navigate to lesson, then test apod...
                                    if (viewModel.getNodeFromGraphByLesson(it.id!!) != -1L) {

                                        startingNode = viewModel.getNodeFromGraphByLesson(it.id!!)
                                        actualNodeInGraph = startingNode
                                        educationalNode = startingNode

                                        navigation.navigateToQuestionScreen(
                                            lessonId = it.id,
                                            nodeId = startingNode
                                        )
                                    }
                                }
                            }
                        }
                    )
                }
            }
        } else {
            PlaceholderScreenContent(
                image = null,
                text = "Empty list of lessons, try another topic :)"
            )
        }
    }
}

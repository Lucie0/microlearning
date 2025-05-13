package cz.mendelu.pef.microlearning.ui.screens.chooseLesson

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.Column
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
import cz.mendelu.pef.microlearning.R
import cz.mendelu.pef.microlearning.model.UiState
import cz.mendelu.pef.microlearning.navigation.INavigationRouter
import cz.mendelu.pef.microlearning.ui.elements.BaseScreen
import cz.mendelu.pef.microlearning.ui.elements.PlaceholderScreenContent


@RequiresApi(Build.VERSION_CODES.P)
@Composable
fun ChooseLessonScreen(
    topicName: String,
    topicId: Long?,
    navigation: INavigationRouter
) {
    val viewModel = hiltViewModel<ChooseLessonVM>()
    viewModel.topicId = topicId!!

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
        ChooseLessonScreen(
//            lastLessonId = viewModel.myLLId,
            paddingValues = it,
//            navigation = navigation,
            uiState = uiState.value,
//            nodeId = viewModel.nodeId
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ChooseLessonScreen(
//    lastLessonId: Long,
    paddingValues: PaddingValues,
//    navigation: INavigationRouter,
    uiState: UiState<ChooseLessonData, ChooseLessonErrors>,
//    nodeId: Long
//    list: List<String>
) {

    println("***uistate:" + uiState.data?.lessons)

    val list: List<String> = listOf("tema1", "tema2", "tema3", "tema4")
    // vypsat vsechny lekce z uistate
    LazyColumn(
        modifier = Modifier.padding(paddingValues)
    ) {
        uiState.data?.lessons?.items?.forEach {
            item {
                ListItem(headlineText = { Text(text = it.name ?: ("Lesson" + it.id)) })
            }
        }
    }

}

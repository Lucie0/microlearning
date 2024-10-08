package cz.mendelu.pef.microlearning.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.core.text.HtmlCompat
import androidx.hilt.navigation.compose.hiltViewModel
import cz.mendelu.pef.microlearning.model.Lesson
import cz.mendelu.pef.microlearning.model.UiState
import cz.mendelu.pef.microlearning.model.response.ObjectResponse
import cz.mendelu.pef.microlearning.navigation.INavigationRouter
import cz.mendelu.pef.microlearning.ui.elements.BaseScreen
import cz.mendelu.pef.microlearning.ui.elements.PlaceholderScreenContent

@Composable
fun LessonScreen(
    id: Long?,
    navigation: INavigationRouter
){
    val viewModel = hiltViewModel<LessonScreenVM>()
    viewModel.lessonId = id
    LaunchedEffect(key1 = 1, block = { viewModel.getLessonById() })

    val uiState: MutableState<UiState<ObjectResponse<Lesson>, LessonsErrors>> = rememberSaveable { mutableStateOf(UiState()) } // rememberSaveable si ulozi data i pri zmene orientace obrazovky

    // poslech nad uistatem
    viewModel.lessonsUiState.value.let {
        uiState.value = it
    }

    // todo neprepisuje se nazev, prestoze se uz prepisoval!!
    // je to kvuli show Loading true -- proooc?
    BaseScreen(
        topBarText = "L${viewModel.lessonId} "+ if (uiState.value.data != null) uiState.value.data!!.content.name else "",
        placeholderScreenContent = if (uiState.value.errors != null) {
            PlaceholderScreenContent(
                image = null,
//                image = R.drawable.undraw_warning,
                text = stringResource(id = uiState.value.errors!!.communicationError)
            )
        } else null,
        drawFullScreenContent = true,
//        showLoading = uiState.value.loading,
        onBackClick = {
//            navigation.navigateBack()
            navigation.navigateToMainScreen(id)
        }
    ) {
        LessonScreenContent(
            paddingValues = it,
            uiState = uiState.value,
            id = id,
            navigation = navigation
        )
    }
}

@Composable
fun LessonScreenContent(
    paddingValues: PaddingValues,
    uiState: UiState<ObjectResponse<Lesson>, LessonsErrors>,
    id: Long?,
    navigation: INavigationRouter
){
    // zobrazit lekci z API
//    println("Data: ${uiState.data}")

        if (uiState.data != null) {
        LazyColumn(
            modifier = Modifier
                .padding(PaddingValues(8.dp))
                .padding(top = paddingValues.calculateTopPadding()),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            item {
                Text(text = uiState.data!!.content.content!!, color = Color.White)
            }
            item{
                Button(
                    onClick = {
                        if (id != null) {
                            navigation.navigateToLessonScreen(id = id + 1L)
                        }
                    }
                ) {
                    Text("Next lesson")
                }
            }
        }
    }
}
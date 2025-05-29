package cz.mendelu.pef.microlearning.ui.screens.showResults

import android.annotation.SuppressLint
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import cz.mendelu.pef.microlearning.model.api.LessonShorter
import cz.mendelu.pef.microlearning.model.UiState
import cz.mendelu.pef.microlearning.model.graph
import cz.mendelu.pef.microlearning.model.response.ArrayResponse
import cz.mendelu.pef.microlearning.navigation.INavigationRouter
import cz.mendelu.pef.microlearning.ui.elements.BaseScreen
import cz.mendelu.pef.microlearning.ui.elements.PlaceholderScreenContent
import cz.mendelu.pef.microlearning.ui.theme.basicTextColor
import cz.mendelu.pef.microlearning.ui.theme.getCorrectAnswersColor
import cz.mendelu.pef.microlearning.ui.theme.getErrorColor


@RequiresApi(Build.VERSION_CODES.P)
@Composable
fun ResultScreen(
    navigation: INavigationRouter
) {
    val viewModel = hiltViewModel<ResultVM>()

    val uiState: MutableState<UiState<ArrayResponse<LessonShorter>, ResultErrors>> = rememberSaveable { mutableStateOf(
        UiState()
    ) }

    LaunchedEffect(key1 = 1, block = {
        viewModel.getData()
    })

    // poslech nad uistatem
    viewModel.uiState.value.let {
        uiState.value = it
    }

     BaseScreen(
        topBarText = "Results",
        onBackClick = { navigation.navigateToMainScreen() },
        showLoading = uiState.value.loading,
        placeholderScreenContent = if (uiState.value.errors != null) {
            PlaceholderScreenContent(
                image = null,
                text = stringResource(id = uiState.value.errors!!.communicationError)
            )
        } else null
     ) {
        ResultScreenContent(
//            lastLessonId = viewModel.myLLId,
            paddingValues = it,
            viewModel = viewModel,
            uiState = uiState,
            navigation = navigation,
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("MutableCollectionMutableState")
@RequiresApi(Build.VERSION_CODES.P)
@Composable
fun ResultScreenContent(
//    lastLessonId: Long,
    paddingValues: PaddingValues,
    viewModel: ResultVM,
    uiState: MutableState<UiState<ArrayResponse<LessonShorter>, ResultErrors>>,
    navigation: INavigationRouter,

){

    var points = 0
    Column(modifier = Modifier.padding(start = 8.dp, end = 8.dp)) {
        uiState.value.data?.items?.forEach {
            ListItem(
                headlineText = {
                    Text(
                        text = it.name ?: "",
                        color = if (graph.map[viewModel.mapOfLesson[it.id]]?.walkThrough == true &&
                            graph.map[viewModel.mapOfLesson[it.id]]?.countOfIncorrectAnswers == 0
                        ) {
                            points += 1
                            getCorrectAnswersColor()
                        } else if (graph.map[viewModel.mapOfLesson[it.id]]?.countOfIncorrectAnswers != 0) {
                            points -= 1
                            getErrorColor()
                        } else
                            basicTextColor(),
                        fontWeight = if (graph.map[viewModel.mapOfLesson[it.id]]?.successfullyCompleted == true) FontWeight.Bold else FontWeight.Normal
                    )
                },
            )
        }
        Text("Points: $points ${viewModel.getScalarResult()}")

        Text(text = viewModel.getGraphResult())

        Pok()
    }
}

@Composable
fun Pok(){
    Column {
        Text(text = graph.map.toSortedMap(compareBy{it}).toString())
    }
}
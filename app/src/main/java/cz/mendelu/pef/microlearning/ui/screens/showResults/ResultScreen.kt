package cz.mendelu.pef.microlearning.ui.screens.showResults

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Build
import androidx.activity.compose.BackHandler
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ListItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import cz.mendelu.pef.microlearning.R
import cz.mendelu.pef.microlearning.model.UiState
import cz.mendelu.pef.microlearning.model.api.LessonShorter
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
    BackHandler {
        println("Navigating by BACK HANDLER")
        navigation.navigateToMainScreen()
    }

    BaseScreen(
        topBarText = stringResource(R.string.title_results),
        onBackClick = { navigation.navigateToMainScreen() },
        showLoading = uiState.value.loading,
        placeholderScreenContent = if (uiState.value.errors != null) {
            PlaceholderScreenContent(
                image = R.drawable.undraw_blank_canvas_a6x5,
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

    val context = LocalContext.current
//    val intent = remember { Intent(Intent.ACTION_VIEW, Uri.parse("https://pcx.wz.cz/ML/GraphTopic1.html?score=3&outline=1&fill1=0:0&fill2=0:0&fill3=0:0&fill4=0:0&fill5=12:0&fill6=1:2&fill7=3:3")) }
    val url = "https://pcx.wz.cz/ML/GraphTopic1.html?"
    val urlArguments = remember { mutableStateOf("") }


    Column(modifier = Modifier.padding(start = 8.dp, end = 8.dp)) {

        Button(
            modifier = Modifier.fillMaxWidth(),
            onClick = { context.startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url + "score=$points&outline=1" + urlArguments.value))) }) {
            Text(stringResource(R.string.txt_show_nonscalar_evaluation))
        }

        uiState.value.data?.items?.forEach {
            ListItem(
                headlineText = {
                    Text(
                        text = it.name ?: "",
                        color = if (graph.map[viewModel.mapOfLesson[it.id]]?.walkThrough == true &&
                            graph.map[viewModel.mapOfLesson[it.id]]?.countOfIncorrectAnswers == 0 &&
                            it.ordinalNumber != 0
                        ) {
                            points += 1
                            LaunchedEffect(key1 = 1) {
                                urlArguments.value += "&fill${it.ordinalNumber}=${graph.map[viewModel.mapOfLesson[it.id]]?.countOfCorrectAnswers}:${graph.map[viewModel.mapOfLesson[it.id]]?.countOfIncorrectAnswers}"
                            }
                            getCorrectAnswersColor()
                        } else if (graph.map[viewModel.mapOfLesson[it.id]]?.countOfIncorrectAnswers != 0 &&
                            it.ordinalNumber != 0) {
                            points -= 1
                            LaunchedEffect(key1 = 1) {
                                urlArguments.value += "&fill${it.ordinalNumber}=${graph.map[viewModel.mapOfLesson[it.id]]?.countOfCorrectAnswers}:${graph.map[viewModel.mapOfLesson[it.id]]?.countOfIncorrectAnswers}"
                            }
                            getErrorColor()
                        } else
                            basicTextColor(),
                        fontWeight = if (graph.map[viewModel.mapOfLesson[it.id]]?.successfullyCompleted == true) FontWeight.Bold else FontWeight.Normal
                    )
                },
            )
        }
        var sc = 0
        LaunchedEffect(key1 = 1) {
            sc = viewModel.getScalarResult()
        }
//        Text(urlArguments.value)
        Text(stringResource(R.string.txt_points) + points + " " + sc)

        Text(text = viewModel.getGraphResult())

//        Pok()
    }
}

@Composable
fun Pok(){
    Column {
        Text(text = graph.map.toSortedMap(compareBy{it}).toString())
    }
}
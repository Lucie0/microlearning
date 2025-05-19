package cz.mendelu.pef.microlearning.ui.screens.showResults

import android.annotation.SuppressLint
import android.os.Build
import android.text.SpannableStringBuilder
import androidx.annotation.RequiresApi
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AutoStories
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.core.text.HtmlCompat
import androidx.hilt.navigation.compose.hiltViewModel
import cz.mendelu.pef.microlearning.model.UiState
import cz.mendelu.pef.microlearning.model.graph
import cz.mendelu.pef.microlearning.model.mode
import cz.mendelu.pef.microlearning.navigation.INavigationRouter
import cz.mendelu.pef.microlearning.ui.elements.BaseScreen
import cz.mendelu.pef.microlearning.ui.elements.HtmlText
import cz.mendelu.pef.microlearning.ui.elements.PlaceholderScreenContent
import cz.mendelu.pef.microlearning.ui.elements.TabScreen
import cz.mendelu.pef.microlearning.ui.extensions.toAnnotatedString
import cz.mendelu.pef.microlearning.ui.theme.getPrimaryColor


@RequiresApi(Build.VERSION_CODES.P)
@Composable
fun ResultScreen(
    navigation: INavigationRouter
) {

    val viewModel = hiltViewModel<ResultVM>()

//    val uiState: MutableState<UiState<MainData, MainErrors>> = rememberSaveable { mutableStateOf(
//        UiState()
//    ) }

    // poslech nad uistatem
//    viewModel.mainUiState.value.let {
//        uiState.value = it
//    }

     BaseScreen(
        topBarText = "Results",
        actions = {
                  Icon(
                      imageVector = Icons.Default.Settings,
                      contentDescription = null,
                      modifier = Modifier
                          .clickable { navigation.navigateToSettingsScreen() }
                          .padding(start = 8.dp, end = 16.dp)
                  )
        },
         onBackClick = { navigation.navigateToMainScreen() },
//        showLoading = uiState.value.loading,
//        placeholderScreenContent = if (uiState.value.errors != null) {
//            PlaceholderScreenContent(
//                image = null,
//                text = stringResource(id = uiState.value.errors!!.communicationError)
//            )
//        } else null
    ) {
        ResultScreenContent(
//            lastLessonId = viewModel.myLLId,
            paddingValues = it,
            viewModel = viewModel,
            navigation = navigation,
        )
    }
}

@SuppressLint("MutableCollectionMutableState")
@RequiresApi(Build.VERSION_CODES.P)
@Composable
fun ResultScreenContent(
//    lastLessonId: Long,
    paddingValues: PaddingValues,
    viewModel: ResultVM,
    navigation: INavigationRouter,

){
    Column(  modifier = Modifier.padding(start = 8.dp, end = 8.dp)) {
        Text("Points: ${viewModel.getScalarResult()}")

        Text(text = viewModel.getGraphResult())

//    Pok()
    }
}

@Composable
fun Pok(){
    Column {
        Text(text = graph.toString())
    }
}
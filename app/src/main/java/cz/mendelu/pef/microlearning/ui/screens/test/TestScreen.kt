package cz.mendelu.pef.microlearning.ui.screens.test

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import cz.mendelu.pef.microlearning.model.Option
import cz.mendelu.pef.microlearning.model.Question
import cz.mendelu.pef.microlearning.model.Test
import cz.mendelu.pef.microlearning.model.UiState
import cz.mendelu.pef.microlearning.model.response.ArrayResponse
import cz.mendelu.pef.microlearning.navigation.INavigationRouter
import cz.mendelu.pef.microlearning.ui.elements.BaseScreen
import cz.mendelu.pef.microlearning.ui.elements.CheckBoxMultipleSelection
import cz.mendelu.pef.microlearning.ui.elements.Dropdown
import cz.mendelu.pef.microlearning.ui.elements.HtmlText
import cz.mendelu.pef.microlearning.ui.elements.HtmlToNormalText
import cz.mendelu.pef.microlearning.ui.elements.PlaceholderScreenContent
import cz.mendelu.pef.microlearning.ui.elements.RadioButtonSingleSelection

@RequiresApi(Build.VERSION_CODES.P)
@Composable
fun TestScreen(
    title: String,
    nodeId: Long?,// v jakem uzlu se nachazim
    testId: Long?, // jaky test mam zobrazovat
    lessonId: Long?,
    navigation: INavigationRouter
) {
    // todo VM
//    val viewModel = hiltViewModel<TestScreenVM>()

    // todo ?
//    LaunchedEffect(key1 = 1, block = { viewModel.getQuestions() })

    // todo lesson Id je zatim null, potrebuju rozhodovani, jak dopadl test -- PREDELAT
    // lesson Id  nastaveno napevno
    val myLessonId = 2L

    // todo uistate
//    val uiState: MutableState<UiState<ArrayResponse<Test>, TestErrors>> =
//        rememberSaveable {
//            mutableStateOf(
//                UiState()
//            )
//        }

    // todo poslech nad uistatem
//    viewModel.uiState.value.let {
//        uiState.value = it
//    }

    BaseScreen(
        topBarText = title,
//        placeholderScreenContent = if (uiState.value.errors != null) {
//            PlaceholderScreenContent(
//                image = null,
//                image = R.drawable.undraw_warning,
//                text = stringResource(id = uiState.value.errors!!.communicationError)
//            )
//        } else null,
//        showLoading = uiState.value.loading,
        drawFullScreenContent = true,
        onBackClick = { navigation.navigateBack() } // todo navigation to main screen se zapamatovanim stavu (pozn. z question screen -- nevim, jeslti plati)
    ) {

    }
}

@RequiresApi(Build.VERSION_CODES.P)
@Composable
fun TestScreenContent(
    paddingValues: PaddingValues,
    question: Question?,
    lessonId: Long?,
    nodeId: Long?,
//    viewModel: QuestionScreenVM,
    navigation: INavigationRouter,
){
    val questionText: String = question?.qText ?: "No data"
    val options: List<Option>? = question?.options?.items
    val radioOptions: List<String?> = options?.map { o -> o.oText } ?: listOf()

    val answer = remember { mutableStateOf("") }

    // LazyColumn()
    Column(
        modifier = Modifier.padding(paddingValues)
    ) {
        // QuestionScreenContent -- pouzit na zobrazeni otazky / otazek (v cyklu)
        // odpovedi budou ulozene v QuestionScreenVM -- tady ho tedy asi nainicializovat a navazat,
        // nebo prepsat do TestVM?
        // po kliknuti na tlacitko odpovedi porovnat se spravnymi
        // zjistit, jaka je navazna lekce, respektive kolik jich je
        // na zaklade poctu lekci se rozhodnout, jestli lekci rozvnou zobrazit (kdyz na vyber neni)
        // a nebo, kdyz na vyber je, uzivateli dat seznam pokracujicich lekci
        // TODO tot otazka -- ^ -- nebo vybrat za uivatele a rozhodovani osestrit v appce???

        if (question != null) {
            Button(onClick = {
            // vyhodnotit, jak dopadl test, podle toho pokracovat dal
                // pokud je test OK
                // todo gettnout lekci, ktera nasleduje po tomto testu z uzlu
                // presmerovat se na lekci
                // jinak presmerovat na jinou lekci (sousedni uzel, resp. uzly, pote soused rodice a tak porad dokola

                navigation.navigateToLessonScreen(lessonId = lessonId, nodeId = nodeId)
                  }) {
                Text("Submit")
            }
        } else {
            //todo zobrazit hlasku o tom, ze otzky nejsou, nebo vyhodit error?
        }
    }
}


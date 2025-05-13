package cz.mendelu.pef.microlearning.ui.screens

//import com.mohamedrejeb.richeditor.model.rememberRichTextState


import android.annotation.SuppressLint
import android.os.Build
import android.text.SpannableStringBuilder
import androidx.annotation.RequiresApi
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AutoStories
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.core.text.HtmlCompat
import androidx.hilt.navigation.compose.hiltViewModel
import cz.mendelu.pef.microlearning.MainApplication
import cz.mendelu.pef.microlearning.model.Node
import cz.mendelu.pef.microlearning.model.UiState
import cz.mendelu.pef.microlearning.model.response.ObjectResponse
import cz.mendelu.pef.microlearning.navigation.INavigationRouter
import cz.mendelu.pef.microlearning.ui.elements.BaseScreen
import cz.mendelu.pef.microlearning.ui.elements.HtmlText
import cz.mendelu.pef.microlearning.ui.elements.PlaceholderScreenContent
import cz.mendelu.pef.microlearning.ui.elements.TabScreen
import cz.mendelu.pef.microlearning.ui.extensions.toAnnotatedString
import cz.mendelu.pef.microlearning.ui.theme.getPrimaryColor


// zeptat se Landy na HTML komponentu? Elisky? Gono?
// cili nechat HTML ted byt
// https://spatialhub.mendelu.cz/

@RequiresApi(Build.VERSION_CODES.P)
@Composable
fun MainScreen(
    lastLessonId: Long?,
    navigation: INavigationRouter
) {

    // kdyz se vracim z lesson null stranky, tak to sleti na IllegalArgExc pro mainScreenu?
    // pri vynute wifi i z lesson by id
    // TODO VYRESIT
    // java.lang.IllegalArgumentException: Navigation destination that matches request NavDeepLinkRequest{ uri=android-app://androidx.navigation/main/null } cannot be found in the navigation graph NavGraph(0x0) startDestination={Destination(0x78da56c6) route=main}                                                                                                    java.lang.IllegalArgumentException: Navigation destination that matches request NavDeepLinkRequest{ uri=android-app://androidx.navigation/main/null } cannot be found in the navigation graph NavGraph(0x0) startDestination={Destination(0x78da56c6) route=main}

    val viewModel = hiltViewModel<MainScreenVM>()
    viewModel.myLLId = lastLessonId ?: 1L

    val uiState: MutableState<UiState<MainData, MainErrors>> = rememberSaveable { mutableStateOf(
        UiState()
    ) }

    // poslech nad uistatem
    viewModel.mainUiState.value.let {
        println("*** uistate ")
        println(it.data)
        println("*** uistate node")
        println(it.data?.node)
        uiState.value = it
    }

    // todo hodit do VM
//    var myLLId: Long = lastLessonId ?: 1L
    // moje osetreni pro nepreteceni
    if (viewModel.myLLId > 8) {
        viewModel.myLLId = 1
    }

    // ulozit prichazejici lastLessonId do VM
    // pokud zadne lastLessonId neni, nastavit na 1
    // popripade na jinou inicializacni hodnotu (zacatek grafu, nahodne cislo, ... ???)
    // pote, kdyz chci navigovat na stranku s lekci, tak predavat tam lastLessonId

    BaseScreen(
        topBarText = "",
        actions = {
                  Icon(
                      imageVector = Icons.Default.Settings,
                      contentDescription = null,
                      modifier = Modifier
                          .clickable { navigation.navigateToSettingsScreen() }
                          .padding(start = 8.dp, end = 16.dp)
                  )
        },
        showLoading = uiState.value.loading,
        placeholderScreenContent = if (uiState.value.errors != null) {
            PlaceholderScreenContent(
                image = null,
//                image = R.drawable.undraw_warning,
                text = stringResource(id = uiState.value.errors!!.communicationError)
            )
        } else null
    ) {
        MainScreenContent(
            lastLessonId = viewModel.myLLId,
            paddingValues = it,
            navigation = navigation,
            uiState = uiState.value,
            nodeId = viewModel.nodeId
        )
    }
}

@SuppressLint("MutableCollectionMutableState")
@RequiresApi(Build.VERSION_CODES.P)
@Composable
fun MainScreenContent(
    lastLessonId: Long,
    paddingValues: PaddingValues,
    navigation: INavigationRouter,
    uiState: UiState<MainData, MainErrors>,
    nodeId: Long
){
    Column {
//        HelloWorldScreen()
//        Icons.Outlined
//        Box(modifier = Modifier.fillMaxWidth(1f)) {
//        item {
        Icon(
            imageVector = Icons.Default.AutoStories,
            contentDescription = "NanoStudy",
            modifier = Modifier
                .padding(16.dp)
                .fillMaxSize()
                .size(126.dp),
            tint = getPrimaryColor()
        )
//        }
        TabScreen(navigation, uiState.data?.topics?.items/*.map { i -> i.name }*/, null)

//        HelloWorldScreen()

        Button(
            onClick = {
//                println(uiState.data)
                navigation.navigateToQuestionScreen(
//                    title = uiState.data?.content?.testName ?: "Test",
                    nodeId = nodeId,
//                    testId = uiState.data?.node?.content?.testId,
                    testId = 1, // todo
                    lessonId = uiState.data?.node?.content?.lessonId,
//                    lessonName = uiState.data?.content?.lessonName
                )
//                navigation.navigateToLessonScreen(lessonId = uiState.data?.content?.lessonId, nodeId = nodeId)
            },
            enabled = uiState.data?.node?.content?.lessonId != null
        ) {
            Text(text = "Start")
        }

        Button(onClick = { navigation.navigateToChooseLessonScreen("Programming", 2) }) {
            Text("Choose lesson")
        }
//        }

//        Button(
//            onClick = { navigation.navigateToLessonScreen() }
//        ) {
//            Text(text = "Lesson null")
//        }

//        // predtim misto last lesson id byla 1
//        Button(onClick = { navigation.navigateToLessonScreen(lastLessonId) }) {
//            Text(text = "Lesson by id")
//        }

//        Button(onClick = { navigation.navigateToQuestionScreen("Title") }) {
//            Text(text = "Question")
//        }

        // Html()
        // HtmlText() // zavislost v gradle
    }
}

@RequiresApi(Build.VERSION_CODES.P)
@Composable
fun HelloWorldScreen() {

//    val spannableString = SpannableStringBuilder("<monospace>Nullam non</monospace>" +
    val spannableString = SpannableStringBuilder("<monospace>Nullam non</monospace>" +
            "<typeface>Typeface</typeface><br>" +
            "<font face='code'>Font</font>" +
            " #include &lt;name&gt;" +
            "<h2>HELLO <a href=\"https://google.com/\"> Google</a></h2> <br>" +
            " <p>Diam quis enim lobortis <b>scelerisque</b> fermentum dui. <a href=\"https://medium.com/\">Medium</a> <strong>Massa sapien " +
            "faucibus</strong> et molestie ac. Nullam non nisi est sit amet facilisis magna. Facilisi etiam dignissim diam quis enim " +
            "lobortis scelerisque fermentum dui. Risus nullam eget felis eget nunc. Erat imperdiet sed euismod nisi. Eget " +
            "gravida cum sociis natoque penatibus.</p>\n" +
            "<p>Nisi porta lorem mollis aliquam. <i>Dolor purus non enim praesent.</i> Sed sed <em>risus pretium</em> quam " +
            "vulputate dignissim. " +
            "<u>Ipsum dolor sit</u> amet consectetur adipiscing. <del>Augue</del> mauris <small>augue</small> neque gravida in" +
            " fermentum et <b>sollicitudin. U<i>llamcorper velit sed ullamcorper</i> morbi tincidunt.</b> Consectetur purus ut faucibus " +
            "pulvinar. At <img src='pokus'> imperdiet dui accumsan sit amet.</p>" +
            "" +
            "<ul>" +
//            "  <li>•\t\tCoffee</li>\n" +
//            "  <li>•\t\tTea</li>\n" +
//            "  <li>•\t\tMilk</li>\n" +
            "<li>Coffee</li>" +
            "<li>Tea</li>" +
            "<li>Milk</li>" +
            "</ul>" +
            "<br>" +
            "lerisque fermentum dui. Risus nullam" +
            "<br>" +
            "<ol>" +
            "<li>Coffee</li>" +
            "<li>Tea</li>" +
            "<li>Milk</li>" +
            "</ol>").toString()
            /*.replace("<li>", "<li>\u2022\t\t")
            */


    // funguje link, br, h1
    //jinak nic
//    HtmlText(
//        html = spannableString,
//        linkColor = Color.Red,
//        textColor = Color.Blue,  // todo dynamicky barva
////        fontSize = 16.sp
//    )

    val spanned = HtmlCompat.fromHtml(spannableString, HtmlCompat.FROM_HTML_MODE_COMPACT)
    val annotatedText = spanned.toAnnotatedString()
    //    HtmlText(html = annotatedText)

    //funguje b, strong, i, em, underline, h1, br
    // nefunguje del, ol, ul, small, link

    HtmlText(string = spannableString)

}


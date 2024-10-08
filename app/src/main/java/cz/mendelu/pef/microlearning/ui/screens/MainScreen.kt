package cz.mendelu.pef.microlearning.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.core.text.HtmlCompat
import cz.mendelu.pef.microlearning.navigation.INavigationRouter
import cz.mendelu.pef.microlearning.ui.elements.BaseScreen
import cz.mendelu.pef.microlearning.ui.elements.HtmlText

// todo zeptat se Landy na HTML komponentu? Elisky? Gono?
// cili nechat HTML ted byt
// https://spatialhub.mendelu.cz/

@Composable
fun MainScreen(
    lastLessonId: Long?,
    navigation: INavigationRouter
) {

    // kdyz se vracim z lesson null stranky, tak to sleti na IllegalArgExc pro mainScreenu?
    // pri vynute wifi i z lesson by id
    // TODO VYRESIT
    // java.lang.IllegalArgumentException: Navigation destination that matches request NavDeepLinkRequest{ uri=android-app://androidx.navigation/main/null } cannot be found in the navigation graph NavGraph(0x0) startDestination={Destination(0x78da56c6) route=main}                                                                                                    java.lang.IllegalArgumentException: Navigation destination that matches request NavDeepLinkRequest{ uri=android-app://androidx.navigation/main/null } cannot be found in the navigation graph NavGraph(0x0) startDestination={Destination(0x78da56c6) route=main}

    // todo hodit do VM
    var myLLId: Long = lastLessonId ?: 1L
    // moje osetreni pro nepreteceni
    if (myLLId > 8) {
        myLLId = 1
    }

    // todo VM
    // ulozit prichazejici lastLessonId do VM
    // pokud zadne lastLessonId neni, nastavit na 1
    // popripade na jinou inicializacni hodnotu (zacatek grafu, nahodne cislo, ... ???)
    // pote, kdyz chci navigovat na stranku s lekci, tak predavat tam lastLessonId

    BaseScreen(
        topBarText = "MainScreen"
    ) {
        MainScreenContent(
            lastLessonId = myLLId,
            paddingValues = it,
            navigation = navigation
        )
    }
}

@Composable
fun MainScreenContent(
    lastLessonId: Long,
    paddingValues: PaddingValues,
    navigation: INavigationRouter
){
    Column(
        modifier = Modifier.padding(paddingValues)
    ) {
//        HtmlViewer(htmlContent = "<b>Hello</b>")
        HelloWorldScreen()

        Button(onClick = { navigation.navigateToLessonScreen() }) {
            Text(text = "Lesson null")
        }

        // predtim misto last lesson id byla 1
        Button(onClick = { navigation.navigateToLessonScreen(lastLessonId) }) {
            Text(text = "Lesson by id")
        }

        Button(onClick = { /*TODO navigate to another screen*/ }) {
            Text(text = "Question")
        }

        // Html()
        // HtmlText() // zavislost v gradle

    }
}

@Composable
fun HtmlViewer(htmlContent: String) {
    HtmlCompat.fromHtml("<h1>Hello</h1>", HtmlCompat.FROM_HTML_MODE_COMPACT)
//    HtmlCompat.fromHtml(htmlContent, 0)
}

@Composable
fun HelloWorldScreen() {
    val htmlContent = """
        <h1 style="color:blue;">This <strong>is</strong> a <a href="https://medium.com/">link</a> in HTML.</h1>
        <p>This <strong>is</strong> a <a href="https://medium.com/">link</a> in HTML.</p>
        <p>This <em>is</em> a <a href="https://medium.com/">link</a> in HTML.</p><div>This <i>is</i> a <a href="https://medium.com/">link</a> in HTML.</div>
    """.trimIndent()

    HtmlText(
        html = htmlContent,
        linkColor = Color.Red,
        textColor = Color.White,  // todo dynamicky barva
//        fontSize = 16.sp
    )
}
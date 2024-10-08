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
fun MainScreen(navigation: INavigationRouter) {
    BaseScreen(
        topBarText = "MainScreen"
    ) {
        MainScreenContent(
            paddingValues = it,
            navigation = navigation
        )
    }
}

@Composable
fun MainScreenContent(
    paddingValues: PaddingValues,
    navigation: INavigationRouter
){
    Column(
        modifier = Modifier.padding(paddingValues)
    ) {
//        HtmlViewer(htmlContent = "<b>Hello</b>")
        HelloWorldScreen()

        Button(onClick = { navigation.navigateToLessonScreen() }) {
            Text(text = "Lesson")
        }

        Button(onClick = { navigation.navigateToLessonScreen(1) }) {
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
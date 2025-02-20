package cz.mendelu.pef.microlearning.ui.screens

//import com.mohamedrejeb.richeditor.model.rememberRichTextState


import android.os.Build
import android.text.SpannableStringBuilder
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.ExperimentalTextApi
import androidx.compose.ui.text.ParagraphStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.rememberTextMeasurer
import androidx.compose.ui.text.style.TextIndent
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.core.text.HtmlCompat
import cz.mendelu.pef.microlearning.navigation.INavigationRouter
import cz.mendelu.pef.microlearning.ui.elements.BaseScreen
import cz.mendelu.pef.microlearning.ui.elements.HtmlText
import cz.mendelu.pef.microlearning.ui.extensions.toAnnotatedString
import cz.mendelu.pef.microlearning.ui.theme.primaryDark


// todo zeptat se Landy na HTML komponentu? Elisky? Gono?
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

@RequiresApi(Build.VERSION_CODES.P)
@Composable
fun MainScreenContent(
    lastLessonId: Long,
    paddingValues: PaddingValues,
    navigation: INavigationRouter
){
    Column(
//        modifier = Modifier.padding(paddingValues)
    ) {
        HelloWorldScreen()

        Button(
            onClick = { navigation.navigateToLessonScreen() }
        ) {
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

@RequiresApi(Build.VERSION_CODES.P)
@Composable
fun HelloWorldScreen() {

    val spannableString = SpannableStringBuilder("<h2>HELLO <a href=\"https://google.com/\"> Google</a></h2> <br>" +
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
            "</ol>").toString().replace("<li>", "<li>\u2022\t\t")

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
    //funguje b, strong, i, em, underline, h1, br
    // nefunguje del, ol, ul, small, link
//    Text(text = annotatedText)
//    println(spannableString)
//    println(spanned)

//    Text("Clickable text")
    HtmlText(html = annotatedText)

}



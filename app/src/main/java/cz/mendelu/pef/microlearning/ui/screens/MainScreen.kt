package cz.mendelu.pef.microlearning.ui.screens

//import com.mohamedrejeb.richeditor.model.rememberRichTextState


import android.annotation.SuppressLint
import android.os.Build
import android.text.SpannableStringBuilder
import androidx.annotation.RequiresApi
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.SuggestionChip
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.toSize
import androidx.core.text.HtmlCompat
import cz.mendelu.pef.microlearning.navigation.INavigationRouter
import cz.mendelu.pef.microlearning.ui.elements.BaseScreen
import cz.mendelu.pef.microlearning.ui.elements.Dropdown
import cz.mendelu.pef.microlearning.ui.elements.HtmlText
import cz.mendelu.pef.microlearning.ui.elements.PlaceHolderScreen
import cz.mendelu.pef.microlearning.ui.elements.PlaceholderScreenContent
import cz.mendelu.pef.microlearning.ui.elements.TabScreen
import cz.mendelu.pef.microlearning.ui.extensions.toAnnotatedString


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

@SuppressLint("MutableCollectionMutableState")
@RequiresApi(Build.VERSION_CODES.P)
@Composable
fun MainScreenContent(
    lastLessonId: Long,
    paddingValues: PaddingValues,
    navigation: INavigationRouter
){
    Column {
        HelloWorldScreen()

        TabScreen()

        Button(
            onClick = { navigation.navigateToLessonScreen() }
        ) {
            Text(text = "Lesson null")
        }

        // predtim misto last lesson id byla 1
        Button(onClick = { navigation.navigateToLessonScreen(lastLessonId) }) {
            Text(text = "Lesson by id")
        }

        Button(onClick = { navigation.navigateToQuestionScreen("Title") }) {
            Text(text = "Question")
        }
//
//        val list = listOf("whole program","alternative part","int","string","returned value","clear screen","clear input buffer")

        // Html()
        // HtmlText() // zavislost v gradle


    }
}

//todo dat do VM
private fun onClickSuggestionChip(){

}

@RequiresApi(Build.VERSION_CODES.P)
@Composable
fun HelloWorldScreen() {

    val spannableString = SpannableStringBuilder("<monospace>Nullam non</monospace>" +
            "<typeface>Typeface</typeface><br>" +
            "<font face='code'>Font</font>" +
            " #include &lt;name&gt;")/*<h2>HELLO <a href=\"https://google.com/\"> Google</a></h2> <br>" +
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
            "</ol>")*/.toString()
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


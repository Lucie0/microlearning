package cz.mendelu.pef.microlearning.ui.screens

//import com.mohamedrejeb.richeditor.model.rememberRichTextState


import android.os.Build
import android.text.SpannableStringBuilder
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.Button
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.ExperimentalTextApi
import androidx.compose.ui.text.ParagraphStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.rememberTextMeasurer
import androidx.compose.ui.text.style.TextIndent
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.viewinterop.AndroidView
import androidx.core.text.HtmlCompat
import cz.mendelu.pef.microlearning.navigation.INavigationRouter
import cz.mendelu.pef.microlearning.ui.elements.BaseScreen
import cz.mendelu.pef.microlearning.ui.elements.HtmlText
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

@RequiresApi(Build.VERSION_CODES.P)
@Composable
fun HelloWorldScreen() {
//    val htmlContent = """
//        <h1 style="color:blue;">This <strong>is</strong> a <a href="https://medium.com/">link</a> in HTML.</h1>
//        <p>This <strong>is</strong> a <a href="https://medium.com/">link</a> in HTML.</p>
//        <p>This <em>is</em> a <a href="https://medium.com/">link</a> in HTML.</p><div>This <i>is</i> a <a href="https://medium.com/">link</a> in HTML.</div>
//    """.trimIndent()


    val spannableString = SpannableStringBuilder("<h2>HELLO <a href=\"https://google.com/\"> Google</a></h2> <br>" +
            " <p>Diam quis enim lobortis <b>scelerisque</b> fermentum dui. <a href=\"https://medium.com/\">Medium</a> <strong>Massa sapien faucibus</strong> et molestie ac. Nullam non nisi est sit amet facilisis magna. Facilisi etiam dignissim diam quis enim lobortis scelerisque fermentum dui. Risus nullam eget felis eget nunc. Erat imperdiet sed euismod nisi. Eget gravida cum sociis natoque penatibus.</p>\n" +
            "<p>Nisi porta lorem mollis aliquam. <i>Dolor purus non enim praesent.</i> Sed sed <em>risus pretium</em> quam vulputate dignissim. " +
            "<u>Ipsum dolor sit</u> amet consectetur adipiscing. <del>Augue</del> mauris <small>augue</small> neque gravida in fermentum et sollicitudin. Ullamcorper velit sed ullamcorper morbi tincidunt. Consectetur purus ut faucibus pulvinar. At imperdiet dui accumsan sit amet.</p>" +
            "" +
            "<ul>\n" +
            "  <li>•\t\tCoffee</li>\n" +
            "  <li>•\t\tTea</li>\n" +
            "  <li>•\t\tMilk</li>\n" +
            "</ul>" +
            "<br>" +
            "<ol>\n" +
            "\t<li>Coffee</li>\n" +
            "  <li>Tea</li>\n" +
            "  <li>Milk</li>\n" +
            "</ol>").toString()

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

//
//    // funguje link, b, strong, i, em, del, small, ul
//    //nefunguje ul a vlastni nastaveni dalsich tagu, nezmenila jsem ani barvu
//    MyHtml(text = "TextView:<br>$spannableString")

//    val spanned2 = HtmlCompat.fromHtml(spannableString, HtmlCompat.FROM_HTML_MODE_LEGACY, null, CustomTagHandler())
//    val text = buildAnnotatedString {
//        append(spanned2.toString())
//    }
//
//    Text(text = text, style = androidx.compose.ui.text.TextStyle(fontSize = 16.sp))


//    Text(text = spannableString.toRichHtmlString())
}


@OptIn(ExperimentalTextApi::class)
@Composable
fun makeBulletedList(items: List<String>): AnnotatedString {
    val bulletString = "\u2022\t\t"
    val textStyle = LocalTextStyle.current
    val textMeasurer = rememberTextMeasurer()
    val bulletStringWidth = remember(textStyle, textMeasurer) {
        textMeasurer.measure(text = bulletString, style = textStyle).size.width
    }
    val restLine = with(LocalDensity.current) { bulletStringWidth.toSp() }
    val paragraphStyle = ParagraphStyle(textIndent = TextIndent(restLine = restLine))

    return buildAnnotatedString {
        items.forEach { text ->
            withStyle(style = paragraphStyle) {
                append(bulletString)
                append(text)
            }
        }
    }
}


//val spannableString = SpannableStringBuilder("<b>Hello</b> <i>World</i>").toString()
//val spanned = HtmlCompat.fromHtml(spannableString, HtmlCompat.FROM_HTML_MODE_COMPACT)
//
//Text(text = spanned.toAnnotatedString())

// mohamedrejeb rich editor
//@Composable
//fun String.toRichHtmlString(): AnnotatedString {
//    val state = rememberRichTextState()
//
//    LaunchedEffect(this) {
//        state.setHtml(this@toRichHtmlString)
//    }
//
//    return state.annotatedString
//}

@Composable
fun MyHtml(text: String) {
    AndroidView(factory = { context ->
        TextView(context).apply {
            setText(HtmlCompat.fromHtml(text, HtmlCompat.FROM_HTML_MODE_LEGACY))
        }
    })
}

/*
class CustomTagHandler : Html.TagHandler {
    override fun handleTag(opening: Boolean, tag: String, output: Editable, xmlReader: XMLReader) {
        if (tag.equals("customtag", ignoreCase = true)) {
            println("CustomTag")
            if (opening) {
                val len = output.length
                output.setSpan(ForegroundColorSpan(android.graphics.Color.RED), len, len, Editable.SPAN_MARK_MARK)
            } else {
                val len = output.length
                val obj = getLast(output, ForegroundColorSpan::class.java)
                val where = output.getSpanStart(obj)
                output.removeSpan(obj)
                if (where != len) {
                    output.setSpan(ForegroundColorSpan(android.graphics.Color.RED), where, len, Editable.SPAN_EXCLUSIVE_EXCLUSIVE)
                }
            }
        }
    }

    private fun <T> getLast(text: Editable, kind: Class<T>): T? {
        val objs = text.getSpans(0, text.length, kind)
        if (objs.isEmpty()) {
            return null
        } else {
            for (i in objs.size - 1 downTo 0) {
                if (text.getSpanFlags(objs[i]) == Editable.SPAN_MARK_MARK) {
                    return objs[i]
                }
            }
            return null
        }
    }
}*/
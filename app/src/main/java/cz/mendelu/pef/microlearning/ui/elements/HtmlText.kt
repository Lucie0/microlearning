package cz.mendelu.pef.microlearning.ui.elements

import android.content.Intent
import android.net.Uri
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.BaselineShift
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.text.HtmlCompat
import cz.mendelu.pef.microlearning.ui.extensions.toAnnotatedString
import cz.mendelu.pef.microlearning.ui.theme.aBeeZeeFontFamily
import cz.mendelu.pef.microlearning.ui.theme.basicTextColor
import cz.mendelu.pef.microlearning.ui.theme.onSecondaryDark
import cz.mendelu.pef.microlearning.ui.theme.robotoFontFamily

// umi strong, b, i, em, linky do prohlizece, podtrzeni, button list
// todo cislovany seznam
// todo obrazky

@RequiresApi(Build.VERSION_CODES.P)
@Composable
fun HtmlText(
    string: String,
//    html: AnnotatedString?,
    modifier: Modifier = Modifier,
    linkColor: Color = Color.Blue, // Default link color
    textColor: Color = basicTextColor(),
    fontSize: TextUnit = MaterialTheme.typography.bodyLarge.fontSize,
    fontWeight: FontWeight = MaterialTheme.typography.bodyLarge.fontWeight ?: FontWeight.Normal,
    baselineShift: BaselineShift = BaselineShift.Subscript,
    textAlign: TextAlign? = null
) {
    val context = LocalContext.current

    val html = HtmlCompat.fromHtml(
        string
            .replace("<li>", "<li>\u2022\t\t") // bullets
//            .replace("\n", "<br>") // new line
            .replace("<ul>", "")
            .replace("  ", "\t"), // tabs
        HtmlCompat.FROM_HTML_MODE_COMPACT
    ).toAnnotatedString()

    ClickableText(
        text = html,
        modifier = Modifier.padding(start = 16.dp, end = 16.dp, bottom = 16.dp),
        onClick = { offset ->
            html.getStringAnnotations(tag = "URL", start = offset, end = offset)
                .firstOrNull()?.let { annotation ->
                    val intent = Intent(Intent.ACTION_VIEW, Uri.parse(annotation.item))
                    context.startActivity(intent)
                }
        },
        style = TextStyle(
//            textAlign = textAlign,
            color = textColor,
            fontSize = fontSize,
            fontWeight = fontWeight,
            baselineShift = baselineShift,
        )
    )
}





//@Composable
//fun HtmlText(
//    html: String,
//    linkColor: Color = Color(0xFF6200EE), // Default link color
//    textColor: Color = Color.DarkGray,
//    fontSize: TextUnit = 11.sp,
//    fontWeight: FontWeight = FontWeight.Normal
//) {
//    val context = LocalContext.current
//    val annotatedText = remember(html) {
//        val spanned = HtmlCompat.fromHtml(html, HtmlCompat.FROM_HTML_MODE_LEGACY)
//        println("Spanned: $spanned")
//        val text = spanned.toString()
//        println("Text: $text")
//        buildAnnotatedString {
//            append(text)
//            val urlSpans = spanned.getSpans(0, spanned.length, android.text.style.URLSpan::class.java)
//            urlSpans.forEach { urlSpan ->
//                val start = spanned.getSpanStart(urlSpan)
//                val end = spanned.getSpanEnd(urlSpan)
//                val url = urlSpan.url
//                addStyle(
//                    style = SpanStyle(
//                        color = linkColor,
//                        fontSize = fontSize,
//                        fontWeight = FontWeight.SemiBold,
//                        textDecoration = TextDecoration.Underline
//                    ), start = start, end = end
//                )
//                addStringAnnotation(
//                    tag = "URL",
//                    annotation = url,
//                    start = start,
//                    end = end
//                )
//            }
//        }
//    }
//
//    ClickableText(
//        text = annotatedText,
//        onClick = { offset ->
//            annotatedText.getStringAnnotations(tag = "URL", start = offset, end = offset)
//                .firstOrNull()?.let { annotation ->
//                    val intent = Intent(Intent.ACTION_VIEW, Uri.parse(annotation.item))
//                    context.startActivity(intent)
//                }
//        },
//        style = TextStyle(
//            color = textColor,
//            fontSize = fontSize,
//            fontWeight = fontWeight
//        )
//    )
//}

//Jaké HTML tagy podporuje funkce HtmlCompat.fromHtml ve třídě AndroidView?
//<a>
//<b>
//<big>
//<blockquote>
//<br>
//<cite>
//<dfn>
//<div>
//<em>
//<font>
//<h1> až <h6>
//<i>
//<img>
//<p>
//<small>
//<strike>
//<strong>
//<sub>
//<sup>
//<tt>
//<u>
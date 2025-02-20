package cz.mendelu.pef.microlearning.ui.elements

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.ClickableText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.BaselineShift
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cz.mendelu.pef.microlearning.ui.theme.basicTextColor
import cz.mendelu.pef.microlearning.ui.theme.onSecondaryDark

// umi strong, b, i, em, linky do prohlizece, podtrzeni, button list
// todo cislovany seznam
// todo obrazky

@Composable
fun HtmlText(
    html: AnnotatedString,
    linkColor: Color = Color.Red, // Default link color
    textColor: Color = basicTextColor(),
    fontSize: TextUnit = 16.sp,
    fontWeight: FontWeight = FontWeight.Normal
) {
    val context = LocalContext.current

    ClickableText(
        text = html,
        modifier = Modifier.padding(start = 16.dp, end = 16.dp),
        onClick = { offset ->
            html.getStringAnnotations(tag = "URL", start = offset, end = offset)
                .firstOrNull()?.let { annotation ->
                    val intent = Intent(Intent.ACTION_VIEW, Uri.parse(annotation.item))
                    context.startActivity(intent)
                }
        },
        style = TextStyle(
            color = textColor,
            fontSize = fontSize,
            baselineShift = BaselineShift.Subscript
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
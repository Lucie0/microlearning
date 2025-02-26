package cz.mendelu.pef.microlearning.ui.extensions

import android.graphics.Typeface
import android.os.Build
import android.text.Spanned
import android.text.style.BulletSpan
import android.text.style.ForegroundColorSpan
import android.text.style.ImageSpan
import android.text.style.RelativeSizeSpan
import android.text.style.StrikethroughSpan
import android.text.style.StyleSpan
import android.text.style.TypefaceSpan
import android.text.style.URLSpan
import android.text.style.UnderlineSpan
import androidx.annotation.RequiresApi
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.ExperimentalTextApi
import androidx.compose.ui.text.ParagraphStyle
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextIndent
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp


//https://stackoverflow.com/questions/66494838/android-compose-how-to-use-html-tags-in-a-text-view
@RequiresApi(Build.VERSION_CODES.P)
fun Spanned.toAnnotatedString(): AnnotatedString = buildAnnotatedString {
    val spanned = this@toAnnotatedString
//    var string = ""
//    var lastIndex = 0
//
//    println("string:$string")
//
//    getSpans(0, spanned.length, android.text.style.BulletSpan::class.java).forEach {bulletSpan ->
////        println(bulletSpan.spanTypeId)
//        val start = getSpanStart(bulletSpan)
//        val end = getSpanEnd(bulletSpan)
//        println("$start, $end")
////        println(spanned.length)
//        println("lI:$lastIndex")
//        append(spanned.subSequence(lastIndex, start))
//        println("t1:${spanned.subSequence(lastIndex, start)}")
//        append("\u2022\t\t")
//        append(spanned.subSequence(start,end))
//        println("t2:${spanned.subSequence(start,end)}")
//        lastIndex = end
//        println("lI:$lastIndex")
//        println(this.length)
//        println("-------------------")
////        val text1 = spanned.subSequence(0, start)
////        val append = "\u2022\t\t"
////        val text2 = spanned.subSequence(start, string.length-1)
////        string = "$text1$append$text2"
////        println(string.subSequence(start, end))
//    }
//
//    println(spanned.subSequence(0, spanned.length))
//    println("string:$string")

    append(spanned.toString())

    getSpans(0, spanned.length, Any::class.java).forEach { span ->
        val start = getSpanStart(span)
        val end = getSpanEnd(span)

        println("Type:$span")
        println("start:$start, end: $end")
        println("lenght:${spanned.length}")

        when (span) {
            is StyleSpan -> {
                println(span.style)
                when (span.style) {
                    Typeface.BOLD -> addStyle(SpanStyle(fontWeight = FontWeight.Bold), start, end)
                    Typeface.ITALIC -> addStyle(SpanStyle(fontStyle = FontStyle.Italic), start, end)
                    Typeface.BOLD_ITALIC -> addStyle(
                        SpanStyle(
                            fontWeight = FontWeight.Bold,
                            fontStyle = FontStyle.Italic
                        ), start, end
                    )
                }
//                append(spanned.subSequence(start, end))
            }
            is UnderlineSpan -> {
                println(span.describeContents())
                addStyle(SpanStyle(textDecoration = TextDecoration.Underline), start, end)
//                append(spanned.subSequence(start, end))
            }
            is ForegroundColorSpan -> {
                println(span.foregroundColor)
                println(span.describeContents())
                addStyle(SpanStyle(color = Color(span.foregroundColor)), start, end)
//                append(spanned.subSequence(start, end))
            }
            is RelativeSizeSpan -> {
                println(span.sizeChange)
                println(span.describeContents())
                addStyle(SpanStyle(fontSize = span.sizeChange.em), start, end)
//                append(spanned.subSequence(start, end))
            }
            // is URLSpan
            is URLSpan -> {
                println(span.url)
                addStyle(SpanStyle(color = Color.Red, textDecoration = TextDecoration.Underline), start, end)
                // todo add onclick -- htmltext to dela pomoci elementu clickable text v composu
                addStringAnnotation(
                    tag = "URL",
                    annotation = span.url,
                    start = start,
                    end = end
                )

//                append(spanned.subSequence(start, end))
            }
            //StrikethroughSpan = deleted text -- neni asi potreba
            is StrikethroughSpan -> {
                println(span.underlying)
//                append(spanned.subSequence(start, end))
            }
            //BulletSpan
            is BulletSpan -> {
                // todo co s temi puntiky pred textem v seznamu
                println("gap:${span.gapWidth}")
                println("start:$start, end: $end")
                println("len:${this.length}")
                println("string:${spanned.subSequence(start, end)}")

//                println()

//                append("\u2022")
//                append("\t\t")

//                println("start:$start, end: $end")

                val text1 = spanned.subSequence(0, start)
                val text2 = spanned.subSequence(end, spanned.length)
//                this.withStyle(ParagraphStyle(textIndent = TextIndent(firstLine = span.gapWidth.sp))) {
//
//                }
                addStyle(
                    style = ParagraphStyle(textIndent = TextIndent(firstLine = (span.gapWidth*4).sp)),
                    start,
                    end
                )

//                append("\u2022\t\t")


//                buildAnnotatedString {
//                    withStyle(
//                        style = ParagraphStyle(textIndent = TextIndent(restLine = 12.sp)),
//                        start,
//                        end
//                    ) {
//                        append("\u2022")
//                        append("\t\t")
//                    }
//                }
            }
            is ImageSpan -> {
                // todo osetrit obrazky
                println(span.source)

//                AsyncImage(
//                    model = "https://example.com/image.jpg",
//                    contentDescription = "Translated description of what the image contains"
//                )
            }
            is TypefaceSpan -> {
                println(span.family)
                println(span.typeface)
                when(span.family){
                    "code" -> addStyle(SpanStyle(fontFamily = FontFamily.Monospace), start, end)

                }
//                when(span.family.toString()){
//                    "code" -> addStyle(TypefaceSpan(FontFamily.Monospace,start,end))
//                }
            }
            // todo pridat?
//            else -> {
//                append(spanned.subSequence(start, end))
//            }
        }
    }
}
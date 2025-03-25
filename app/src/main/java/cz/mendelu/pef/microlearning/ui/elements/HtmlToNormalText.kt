package cz.mendelu.pef.microlearning.ui.elements

import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextLayoutResult
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.TextUnit

//non-breaking space	&nbsp;	&#160;
//<	less than	&lt;	&#60;
//>	greater than	&gt;	&#62;
//&	ampersand	&amp;	&#38;
//"	double quotation mark	&quot;	&#34;
//'	single quotation mark	&apos;	&#39;
//¢	cent	&cent;	&#162;
//£	pound	&pound;	&#163;
//¥	yen	&yen;	&#165;
//€	euro	&euro;	&#8364;
//©	copyright	&copy;	&#169;
//®	registered trademark	&reg;	&#174;
//™	trademark   &trade;	&#8482;

//seznam vsech entit
//https://www.freeformatter.com/html-entities.html

@Composable
fun HtmlToNormalText(
    text: String,
    modifier: Modifier = Modifier,
    color: Color = Color.Unspecified,
    fontSize: TextUnit = TextUnit.Unspecified,
    fontStyle: FontStyle? = null,
    fontWeight: FontWeight? = null,
    fontFamily: FontFamily? = null,
    letterSpacing: TextUnit = TextUnit.Unspecified,
    textDecoration: TextDecoration? = null,
    textAlign: TextAlign? = null,
    lineHeight: TextUnit = TextUnit.Unspecified,
    overflow: TextOverflow = TextOverflow.Clip,
    softWrap: Boolean = true,
    maxLines: Int = Int.MAX_VALUE,
    minLines: Int = 1,
    onTextLayout: (TextLayoutResult) -> Unit = {},
    style: TextStyle = LocalTextStyle.current
){
    val newText = text
        .replace("&nbsp;", " ")
        .replace("&lt;", "<")
        .replace("&gt;", ">")
        .replace("&amp;", "&")
        .replace("&quot;", "\"")
        .replace("&apos;", "'")
        .replace("&cent;", "¢")
        .replace("&pound;", "£")
        .replace("&yen;", "¥")
        .replace("&euro;", "€")
        .replace("&copy;", "©")
        .replace("&reg;", "®")
        .replace("&trade;", "™")

    Text(
        text = newText,
        modifier,
        color,
        fontSize,
        fontStyle,
        fontWeight,
        fontFamily,
        letterSpacing,
        textDecoration,
        textAlign,
        lineHeight,
        overflow,
        softWrap,
        maxLines,
        minLines,
        onTextLayout,
        style
    )
}
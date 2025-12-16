package cz.mendelu.pef.microlearning.ui.elements

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

data class PlaceholderScreenContent(
    val image: Int?,
    val text: String?
)

@Composable
fun PlaceHolderScreen(
    modifier: Modifier,
    modifierImage: Modifier = Modifier,
    content: PlaceholderScreenContent){
    Box(modifier = modifier.fillMaxSize()) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
            .fillMaxWidth()
            .align(Alignment.Center)
            .padding(16.dp)) {

            if (content.image != null) {
                Image(
                    contentScale = ContentScale.FillWidth,
                    modifier = modifierImage.width(300.dp),
                    painter = painterResource(id = content.image),
                    contentDescription = null)
            }
            Spacer(modifier = Modifier.height(16.dp))

            if (content.text != null){
                Text(text = content.text,
                    textAlign = TextAlign.Center)
            }
        }
    }
}
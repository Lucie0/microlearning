package cz.mendelu.pef.microlearning.ui.elements

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.SuggestionChip
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalLayoutApi::class, ExperimentalMaterial3Api::class)
@Composable
fun MyLessons(lessons: List<String>) {

    if (lessons.isNotEmpty()) {
        FlowRow(
            modifier = Modifier.padding(8.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            lessons.forEach { lesson ->
                SuggestionChip(onClick = { }, label = { Text(text = lesson) })
            }
        }
    } else {
        PlaceHolderScreen(
            modifier = Modifier.fillMaxWidth(),
            content = PlaceholderScreenContent(null, "No lessons in progress")
        )
    }

}
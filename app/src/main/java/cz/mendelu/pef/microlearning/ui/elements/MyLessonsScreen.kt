package cz.mendelu.pef.microlearning.ui.elements

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ListItem
import androidx.compose.material3.SuggestionChip
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyLessons(lessons: List<String>, placeholderText: String?) {

    if (lessons.isNotEmpty()) {
//        Column {
            lessons.forEach { lesson ->

                ListItem(headlineText = { Text(lesson) }, modifier = Modifier.clickable {
                    println("Clicked on $lesson")
                })

            }
//        }
    } else {
        PlaceHolderScreen(
            modifier = Modifier.fillMaxWidth(),
            content = PlaceholderScreenContent(null, placeholderText ?: "No lessons")
        )
    }

}
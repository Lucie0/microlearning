package cz.mendelu.pef.microlearning.ui.elements

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier


@Composable
fun TabScreen(allLessons: List<String?>?, myLessons: List<String>?) {
    var tabIndex by remember { mutableStateOf(0) }

    val tabs = listOf("All Lessons", "My Lessons")

    Column(modifier = Modifier.fillMaxWidth()) {
        TabRow(selectedTabIndex = tabIndex) {
            tabs.forEachIndexed { index, title ->
                Tab(text = { Text(title) },
                    selected = tabIndex == index,
                    onClick = { tabIndex = index }
                )
            }
        }
        when (tabIndex) {
            0 -> MyLessons(allLessons ?: listOf(), "No lessons available")
            1 -> MyLessons(listOf("AP", "ALG", "DBaaa", "Python", "Java", "TZI"), "No lessons in progress")
        }
    }
}
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
import cz.mendelu.pef.microlearning.model.Topic
import cz.mendelu.pef.microlearning.navigation.INavigationRouter


@Composable
fun TabScreen(
    navigation: INavigationRouter,
    allTopics: List<Topic?>?,
    myTopics: List<String>?,
    ) {
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
            0 -> MyTopics(
                navigation,
                allTopics ?: listOf(),
                "No lessons available"
            )
            1 -> MyTopics(
                navigation,
                listOf()/*listOf("AP", "ALG", "DBaaa", "Python", "Java", "TZI")*/,
                "No lessons in progress"
            )
        }
    }
}
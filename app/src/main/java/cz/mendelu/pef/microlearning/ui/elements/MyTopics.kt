package cz.mendelu.pef.microlearning.ui.elements

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ListItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import cz.mendelu.pef.microlearning.model.Topic
import cz.mendelu.pef.microlearning.navigation.INavigationRouter
import cz.mendelu.pef.microlearning.navigation.NavigationRouterImpl

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyTopics(
    navigation: INavigationRouter,
    topics: List<Topic?>,
    placeholderText: String?
) {

    if (topics.isNotEmpty()) {
//        Column {
            topics.forEach { topic ->
                if (topic != null) {
                    ListItem(headlineText = { Text(topic.name ?: ("Lesson" + topic.id))}, modifier = Modifier.clickable {
                        println("Clicked on ${topic.name}")
                        navigation.navigateToChooseLessonScreen(topic.name, topic.id)
                    })
                }

            }
//        }
    } else {
        PlaceHolderScreen(
            modifier = Modifier.fillMaxWidth(),
            content = PlaceholderScreenContent(null, placeholderText ?: "No lessons")
        )
    }

}
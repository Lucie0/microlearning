package cz.mendelu.pef.microlearning.ui.elements

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ListItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import cz.mendelu.pef.microlearning.R
import cz.mendelu.pef.microlearning.model.api.Topic
import cz.mendelu.pef.microlearning.navigation.INavigationRouter

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
                    if (topic.dbActualNode != null) {
                        // jestli je to zalozka my lessons (rozpracovane lekce) --> zobrazeni nazvu + cislo aktualni lekce / nodu
                        ListItem(
                            headlineText = { Text("${topic.name} (${topic.dbActualNode})") },
                            modifier = Modifier.clickable {
                                println("Clicked on ${topic.name}")

                                navigation.navigateToChooseNameOfLessonScreen(
                                    topicName = topic.name ?: "Topic ${topic.id}",
                                    topicId = topic.id
                                )
                                // todo revision mode nacitani z db pridano vvv
                                navigation.navigateToLessonScreen(
                                    lessonId = -1L,
                                    nodeId = -1L,
                                    lessonOrdinalNumber = topic.dbActualNode!!.toInt(),
                                    topicId = topic.id
                                )
                            })
                    } else {
                        ListItem(
                            headlineText = { Text(topic.name ?: ("Topic " + topic.id)) },
                            modifier = Modifier.clickable {
                                println("Clicked on ${topic.name}")
                                navigation.navigateToChooseNameOfLessonScreen(
                                    topic.name ?: "Topic ${topic.id}", topic.id
                                )
                            })
                    }
                }

            }
//        }
    } else {
        PlaceHolderScreen(
            modifier = Modifier.fillMaxWidth(),
            content = PlaceholderScreenContent(null, placeholderText ?: stringResource(R.string.no_lessons))
        )
    }

}
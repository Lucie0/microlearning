package cz.mendelu.pef.microlearning.navigation

sealed class Destination(val route: String) {
    object MainScreen: Destination(route = "main")
    object LessonScreen: Destination(route = "lesson")
    object QuestionScreen: Destination(route = "question")
    object TestScreen: Destination(route = "test")
}
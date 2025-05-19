package cz.mendelu.pef.microlearning.navigation

sealed class Destination(val route: String) {
    object MainScreen: Destination(route = "main")
    object LessonScreen: Destination(route = "lesson")
    object QuestionScreen: Destination(route = "question")
    object QuestionScreen1: Destination(route = "question1")
    object TestScreen: Destination(route = "test")
    object SettingsScreen: Destination(route = "settings")
    object ModesScreen: Destination(route = "modes")
    object ChooseNameOfLessonScreen: Destination(route = "chooseLesson")
    object ResultScreen: Destination(route = "results")
}
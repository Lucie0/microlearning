package cz.mendelu.pef.microlearning.navigation

import androidx.navigation.NavController
import cz.mendelu.pef.microlearning.model.Node
import cz.mendelu.pef.microlearning.navigation.Destination
import cz.mendelu.pef.microlearning.navigation.INavigationRouter

class NavigationRouterImpl(private val navController: NavController) : INavigationRouter {

    override fun getNavController(): NavController = navController

    override fun navigateBack() {
        navController.popBackStack()
    }

    override fun navigateToLessonScreen(lessonId: Long?, nodeId: Long?) {
        navController.navigate(Destination.LessonScreen.route + "/" + lessonId + "/" + nodeId)
    }

    override fun navigateToLessonScreen(lessonId: Long?, nodeId: Long?, lessonOrdinalNumber: Int?, topicId: Long?) {
        navController.navigate(Destination.LessonScreen.route + "/" + lessonId + "/" + nodeId + "/" + lessonOrdinalNumber + "/" + topicId)
    }

//    override fun navigateToLessonScreen() {
//        navController.navigate(Destination.LessonScreen.route)
//    }
//
//    override fun navigateToLessonScreen(lessonId: Long?) {
//        navController.navigate(Destination.LessonScreen.route + "/" + lessonId)
//    }
//
//    override fun navigateToLessonScreen(title: String?, lessonId: Long?) {
//        navController.navigate(Destination.LessonScreen.route + "/" + title + "/" + lessonId)
//    }

//    override fun navigateToLessonScreen(title: String?, lessonId: Long?, nodeId: Long?) {
//        navController.navigate(Destination.LessonScreen.route + "/" + title + "/" + lessonId + "/" + nodeId)
//    }

//    override fun navigateToLessonScreen(lessonId: Long?, nodeId: Long?) {
//        return TODO("not yet implemented")
//    }

    override fun navigateToChooseLessonScreen(topicName: String?, topicId: Long?) {
        navController.navigate(Destination.ChooseLessonScreen.route + "/" + topicName + "/" + topicId)
    }

    override fun navigateToMainScreen(lastLessonId: Long?) {
        navController.navigate(Destination.MainScreen.route + "/" + lastLessonId)
    }

//    override fun navigateToQuestionScreen(title: String) {
//        navController.navigate(Destination.QuestionScreen.route + "/" + title)
//    }
//
//    override fun navigateToQuestionScreen(title: String, nodeId: Long?) {
//        navController.navigate(Destination.QuestionScreen.route + "/" + title + "/" + nodeId)
//    }
//
//    override fun navigateToQuestionScreen(title: String, nodeId: Long?, testId: Long?) {
//        navController.navigate(Destination.QuestionScreen.route + "/" + title + "/" + nodeId + "/" + testId)
//    }
//
//    override fun navigateToQuestionScreen(
//        title: String,
//        nodeId: Long?,
//        testId: Long?,
//        lessonId: Long?
//    ) {
//        navController.navigate(Destination.QuestionScreen.route + "/" + title + "/" + nodeId + "/" + testId + "/" + lessonId)
//    }

//    override fun navigateToQuestionScreen(
//        title: String,
//        nodeId: Long?,
//        testId: Long?,
//        lessonId: Long?,
//        lessonName: String?
//    ) {
//        navController.navigate(Destination.QuestionScreen.route + "/" + title + "/" + nodeId + "/" + testId + "/" + lessonId + "/" + lessonName)
//    }

    override fun navigateToQuestionScreen(nodeId: Long?, testId: Long?, lessonId: Long?) {
        navController.navigate(Destination.QuestionScreen.route + "/" + nodeId + "/" + testId + "/" + lessonId)
    }

    override fun navigateToTestScreen() {
        navController.navigate(Destination.TestScreen.route)
    }

    override fun navigateToSettingsScreen() {
        navController.navigate(Destination.SettingsScreen.route)
    }

    override fun navigateToModesScreen() {
        navController.navigate(Destination.ModesScreen.route)
    }

//    override fun navigateToTestScreen(title: String) {
//     navController.navigate(Destination.TestScreen.route + "/" + title)
//    }


//    override fun navigateToGameScreen() {
//        navController.navigate(Destination.GameScreen.route)
//    }
//
//    override fun navigateToMyCardsScreen() {
//        navController.navigate(Destination.MyCardsScreen.route)
//    }
//
//    override fun navigateToCardDetailScreen(id: Long?) {
//        navController.navigate(Destination.CardsDetailScreen.route + "/" + id)
//    }
//
//    override fun navigateToRulesScreen() {
//        navController.navigate(Destination.RulesScreen.route)
//    }
//
//    override fun navigateToSavedGamesScreen() {
//        navController.navigate(Destination.SavedGamesListScreen.route)
//    }
//
//    override fun navigateToTransactionsHistoryScreen() {
//        navController.navigate(Destination.TransactionsHistoryScreen.route)
//    }
//
    // ---------------------------------------------------------
//    override fun navigateToAddAccountScreen(id: Long?) {
//        navController.navigate(Destination.AddAccountScreen.route + "/" + id)
//    }

}
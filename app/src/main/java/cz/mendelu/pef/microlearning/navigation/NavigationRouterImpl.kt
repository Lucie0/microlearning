package cz.mendelu.pef.microlearning.navigation

import androidx.navigation.NavController
import cz.mendelu.pef.microlearning.navigation.Destination
import cz.mendelu.pef.microlearning.navigation.INavigationRouter

class NavigationRouterImpl(private val navController: NavController) : INavigationRouter {

    override fun getNavController(): NavController = navController

    override fun navigateBack() {
        navController.popBackStack()
    }

    override fun navigateToLessonScreen() {
        navController.navigate(Destination.LessonScreen.route)
    }

    override fun navigateToLessonScreen(id: Long?) {
        navController.navigate(Destination.LessonScreen.route + "/" + id)
    }

    override fun navigateToMainScreen(lastLessonId: Long?) {
        navController.navigate(Destination.MainScreen.route + "/" + lastLessonId)
    }

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
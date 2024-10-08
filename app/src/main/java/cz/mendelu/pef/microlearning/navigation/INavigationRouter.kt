package cz.mendelu.pef.microlearning.navigation

import androidx.navigation.NavController

interface INavigationRouter {
    fun navigateBack()
    fun navigateToLessonScreen()
    fun navigateToLessonScreen(id: Long?)

//    fun navigateToAddAccountScreen()
//    fun navigateToGameScreen()
//    fun navigateToMyCardsScreen()
//    fun navigateToCardDetailScreen(id: Long?)
//    fun navigateToRulesScreen()
//    fun navigateToSavedGamesScreen()
//    fun navigateToTransactionsHistoryScreen()

    fun getNavController(): NavController

}
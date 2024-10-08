package cz.mendelu.pef.microlearning.navigation

sealed class Destination(val route: String) {
    object MainScreen: Destination(route = "main")
    object LessonScreen: Destination(route = "lessons")
//    object GameScreen: Destination(route = "game")
//    object MyCardsScreen: Destination(route = "my_cards")
//    object CardsDetailScreen: Destination(route = "card_detail")
//    object RulesScreen: Destination(route = "rules")
//    object SavedGamesListScreen: Destination(route = "saved_games")
//    object TransactionsHistoryScreen: Destination(route = "transactions")
}
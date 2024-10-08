package cz.mendelu.pef.microlearning.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import cz.mendelu.pef.microlearning.ui.screens.LessonScreen
import cz.mendelu.pef.microlearning.ui.screens.MainScreen

@Composable
fun NavGraph(
    navController: NavHostController = rememberNavController(),//aby si pamatoval, kde je
    navigation: INavigationRouter = remember { NavigationRouterImpl(navController) },
    startDestination: String
) {
    NavHost(
        navController = navController,
        startDestination = startDestination
    ) {
        // main screen bez argumentu
        composable(route = Destination.MainScreen.route) {
            MainScreen(null, navigation) // zavolani jine composable fce a jen se zavola
        }

        // main screen s argumenty
        composable(
            route = Destination.MainScreen.route + "/{id}",
            arguments = listOf(
                navArgument("id"){
                    type = NavType.LongType
                    defaultValue = -1L
                }
            )
        ) {
            val id = it.arguments?.getLong("id")
            MainScreen(
                lastLessonId = if (id != -1L) id else null,
                navigation = navigation
            )
        }

        // lesson screen bez argumentu
        composable(route = Destination.LessonScreen.route) {
            LessonScreen(null, navigation) // zavolani jine composable fce a jen se zavola
        }

        // lesson screen s argumenty
        composable(
            route = Destination.LessonScreen.route + "/{id}", // receni, ze to bude paramter v ceste
            arguments = listOf(
                navArgument("id"){
                    type = NavType.LongType
                    defaultValue = -1L
                }
            )
        ) {
            val id = it.arguments?.getLong("id")
            LessonScreen(
                id = if (id != -1L) id else null,
                navigation = navigation
            )
        }

//        composable(route = Destination.GameScreen.route) {
//            GameScreen(navigation) // zavolani jine composable fce a jen se zavola
//        }
//        composable(route = Destination.MyCardsScreen.route) {
//            MyCardsScreen(navigation) // zavolani jine composable fce a jen se zavola
//        }
//        composable(route = Destination.RulesScreen.route) {
//            RulesScreen(navigation) // zavolani jine composable fce a jen se zavola
//        }
//        composable(route = Destination.SavedGamesListScreen.route) {
//            SavedGamesListScreen(navigation) // zavolani jine composable fce a jen se zavola
//        }
//        composable(route = Destination.TransactionsHistoryScreen.route) {
//            TransactionsHistoryScreen(navigation) // zavolani jine composable fce a jen se zavola
//        }
//
//        composable(
//            route = Destination.CardsDetailScreen.route + "/{id}", // receni, ze to bude paramter v ceste
//            arguments = listOf(
//                navArgument("id"){
//                    type = NavType.LongType
//                    defaultValue = -1L
//                }
//            )
//        ) {
//            val id = it.arguments?.getLong("id")
//            CardDetailScreen(
//                navigation = navigation,
//                id = if (id != -1L) id else null
//            )
//        }

        // ------------------------------------------------------
//            arguments = listOf(
//                navArgument("id"){
//                    type = NavType.LongType
//                    defaultValue = -1L
//                }
//            )
//        ){
//            val id = it.arguments?.getLong("id") // arg muze vracet null
//            AddEditTaskScreen(
//                navigation = navigation,
//                id = if (id != -1L) id else null
//            )
    }

}


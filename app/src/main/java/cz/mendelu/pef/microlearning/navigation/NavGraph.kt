package cz.mendelu.pef.microlearning.navigation

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import cz.mendelu.pef.microlearning.ui.screens.lesson.LessonScreen
import cz.mendelu.pef.microlearning.ui.screens.MainScreen
import cz.mendelu.pef.microlearning.ui.screens.question.QuestionScreen
import cz.mendelu.pef.microlearning.ui.screens.test.TestScreen

@RequiresApi(Build.VERSION_CODES.P)
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
                navArgument("id") {
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
            LessonScreen(
                null,
                null,
                null,
                navigation
            ) // zavolani jine composable fce a jen se zavola
        }

        // lesson screen s argumenty
        composable(
            route = Destination.LessonScreen.route + "/{id}", // receni, ze to bude paramter v ceste
            arguments = listOf(
                navArgument("id") {
                    type = NavType.LongType
                    defaultValue = -1L
                }
            )
        ) {
            LessonScreen(
                title = null,
                lessonId = if (it.arguments?.getLong("id") != -1L) it.arguments?.getLong("id") else null,
                nodeId = null,
                navigation = navigation
            )
        }

        // lesson screen s argumenty
        composable(
            route = Destination.LessonScreen.route + "/{title}/{id}", // receni, ze to bude parametr v ceste
            arguments = listOf(
                navArgument("id") {
                    type = NavType.LongType
                    defaultValue = -1L
                },
                navArgument("title") {
                    type = NavType.StringType
                    defaultValue = ""
                }
            )
        ) {
            LessonScreen(
                title = if (it.arguments?.getString("title") != "") it.arguments?.getString("title") else null,
                lessonId = if (it.arguments?.getLong("id") != -1L) it.arguments?.getLong("id") else null,
                nodeId = null,
                navigation = navigation
            )
        }

        // lesson screen s 2 argumenty
        composable(
            route = Destination.LessonScreen.route + "/{title}/{lessonId}/{nodeId}", // receni, ze to bude paramter v ceste
            arguments = listOf(
                navArgument("title") {
                    type = NavType.StringType
                    defaultValue = ""
                },
                navArgument("lessonId") {
                    type = NavType.LongType
                    defaultValue = -1L
                },
                navArgument("nodeId") {
                    type = NavType.LongType
                    defaultValue = -1L
                }
            )
        ) {
            val lessonId = it.arguments?.getLong("lessonId")
            val nodeId = it.arguments?.getLong("nodeId")
            LessonScreen(
                title = if (it.arguments?.getString("title") != "") it.arguments?.getString("title") else null,
                lessonId = if (lessonId != -1L) lessonId else null,
                nodeId = if (nodeId != -1L) nodeId else null,
                navigation = navigation
            )
        }

        // QuestionScreen s argumenty
        composable(route = Destination.QuestionScreen.route + "/{title}",
            arguments = listOf(
                navArgument("title") {
                    type = NavType.StringType
                    defaultValue = ""
                }
            )
        ) {
            QuestionScreen(
                title = it.arguments?.getString("title") ?: "",
                nodeId = null,
                testId = null,
                lessonId = null,
                navigation = navigation
            )
        }

        // QuestionScreen s 2 argumenty
        composable(
            route = Destination.QuestionScreen.route + "/{title}/{nodeId}",
            arguments = listOf(
                navArgument("title") {
                    type = NavType.StringType
                    defaultValue = ""
                },
                navArgument("nodeId") {
                    type = NavType.LongType
                    defaultValue = -1L
                },
            )
        ) {
            QuestionScreen(
                title = it.arguments?.getString("title") ?: "",
                nodeId = it.arguments?.getLong("nodeId"),
                testId = null,
                lessonId = null,
                navigation = navigation
            )
        }

        // QuestionScreen s 3 argumenty
        composable(route = Destination.QuestionScreen.route + "/{title}/{nodeId}/{testId}",
            arguments = listOf(
                navArgument("title") {
                    type = NavType.StringType
                    defaultValue = ""
                },
                navArgument("nodeId") {
                    type = NavType.LongType
                    defaultValue = -1L
                },
                navArgument("testId") {
                    type = NavType.LongType
                    defaultValue = -1L
                }
            )
        ) {
            QuestionScreen(
                title = it.arguments?.getString("title") ?: "",
                nodeId = it.arguments?.getLong("nodeId"),
                testId = it.arguments?.getLong("testId"),
                lessonId = null,
                navigation = navigation
            )
        }

        // QuestionScreen s 4 argumenty
        composable(route = Destination.QuestionScreen.route + "/{title}/{nodeId}/{testId}/{lessonId}",
            arguments = listOf(
                navArgument("title") {
                    type = NavType.StringType
                    defaultValue = ""
                },
                navArgument("nodeId") {
                    type = NavType.LongType
                    defaultValue = -1L
                },
                navArgument("testId") {
                    type = NavType.LongType
                    defaultValue = -1L
                },
                navArgument("lessonId") {
                    type = NavType.LongType
                    defaultValue = -1L
                }
            )
        ) {
            QuestionScreen(
                title = it.arguments?.getString("title") ?: "",
                nodeId = it.arguments?.getLong("nodeId"),
                testId = it.arguments?.getLong("testId"),
                lessonId = it.arguments?.getLong("lessonId"),
                navigation = navigation
            )
        }

        //TestScreen bez arg
        composable(route = Destination.TestScreen.route) {
            TestScreen(
                title = "No name",
                lessonId = null,
                nodeId = null,
                testId = null,
                navigation = navigation
            )
        }

        //TestScreen s 1 arg
        composable(
            route = Destination.TestScreen.route + "/{title}", // receni, ze to bude paramter v ceste
            arguments = listOf(
                navArgument("title") {
                    type = NavType.StringType
                    defaultValue = ""
                }
            )
        ) {
            TestScreen(
                title = it.arguments?.getString("title") ?: "No name",
                lessonId = null,
                nodeId = null,
                testId = null,
                navigation = navigation
            )
        }
    }
}


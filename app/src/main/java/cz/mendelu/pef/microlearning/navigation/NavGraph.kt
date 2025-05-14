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
import cz.mendelu.pef.microlearning.ui.screens.ModesScreen
import cz.mendelu.pef.microlearning.ui.screens.SettingsScreen
import cz.mendelu.pef.microlearning.ui.screens.chooseLesson.ChooseLessonScreen
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

//        // lesson screen bez argumentu
//        composable(route = Destination.LessonScreen.route) {
//            LessonScreen(
////                null,
//                lessonId = null,
//                nodeId = null,
//                navigation = navigation
//            ) // zavolani jine composable fce a jen se zavola
//        }

        // lesson screen s 2 argumenty
        composable(
            route = Destination.LessonScreen.route + "/{lessonId}/{nodeId}", // receni, ze to bude paramter v ceste
            arguments = listOf(
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
//                title = if (it.arguments?.getString("title") != "") it.arguments?.getString("title") else null,
                lessonId = if (lessonId != -1L) lessonId else null,
                nodeId = if (nodeId != -1L) nodeId else null,
                lessonOrdinalNumber = null,
                topicId = null,
                navigation = navigation
            )
        }

        // lesson screen s 4 argumenty
        composable(
            route = Destination.LessonScreen.route + "/{lessonId}/{nodeId}/{lessonOrdinalNumber}/{topicId}", // receni, ze to bude paramter v ceste
            arguments = listOf(
                navArgument("lessonId") {
                    type = NavType.LongType
                    defaultValue = -1L
                },
                navArgument("nodeId") {
                    type = NavType.LongType
                    defaultValue = -1L
                },
                navArgument("lessonOrdinalNumber") {
                    type = NavType.IntType
                    defaultValue = -1
                },
                navArgument("topicId") {
                    type = NavType.LongType
                    defaultValue = -1L
                }
            )
        ) {
            val lessonId = it.arguments?.getLong("lessonId")
            val nodeId = it.arguments?.getLong("nodeId")
            val lessonOrdinalNumber = it.arguments?.getInt("lessonOrdinalNumber")
            val topicId = it.arguments?.getLong("topicId")
            LessonScreen(
//                title = if (it.arguments?.getString("title") != "") it.arguments?.getString("title") else null,
                lessonOrdinalNumber = if (lessonOrdinalNumber != -1) lessonOrdinalNumber else null,
                topicId = if (topicId != -1L) topicId else null,
                lessonId = if (lessonId != -1L) topicId else null,
                nodeId = if (nodeId != -1L) topicId else null,
                navigation = navigation
            )
        }

        // choose lesson scren s 2 args
        composable(
            route = Destination.ChooseLessonScreen.route + "/{topicName}/{topicId}", // receni, ze to bude paramter v ceste
            arguments = listOf(
                navArgument("topicName") {
                    type = NavType.StringType
                    defaultValue = ""
                },
                navArgument("topicId") {
                    type = NavType.LongType
                    defaultValue = -1L
                }
            )
        ) {
            val topicName = it.arguments?.getString("topicName")
            val topicId = it.arguments?.getLong("topicId")
            ChooseLessonScreen(
//                title = if (it.arguments?.getString("title") != "") it.arguments?.getString("title") else null,
                topicName = topicName ?: "",
                topicId = if (topicId != -1L) topicId else null,
                navigation = navigation
            )
        }


//        // QuestionScreen s 1 argumentem
//        composable(
//            route = Destination.QuestionScreen.route + "/{nodeId}",
//            arguments = listOf(
//                navArgument("nodeId") {
//                    type = NavType.LongType
//                    defaultValue = -1L
//                },
//            )
//        ) {
//            QuestionScreen(
//                nodeId = it.arguments?.getLong("nodeId"),
//                testId = null,
//                lessonId = null,
//                navigation = navigation
//            )
//        }

        // QuestionScreen s 2 argumenty
        composable(route = Destination.QuestionScreen.route + "/{nodeId}/{testId}",
            arguments = listOf(
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
                nodeId = it.arguments?.getLong("nodeId"),
                testId = it.arguments?.getLong("testId"),
                lessonId = null,
                navigation = navigation
            )
        }

        // QuestionScreen s 3 argumenty
        composable(route = Destination.QuestionScreen.route + "/{nodeId}/{testId}/{lessonId}",
            arguments = listOf(
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

        //SettingsScreen bez arg
        composable(route = Destination.SettingsScreen.route) {
            SettingsScreen(
                navigation = navigation
            )
        }

        //SettingsScreen bez arg
        composable(route = Destination.ModesScreen.route) {
            ModesScreen(
                navigation = navigation
            )
        }
    }
}


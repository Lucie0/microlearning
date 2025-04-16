package cz.mendelu.pef.microlearning.navigation

import androidx.navigation.NavController
import cz.mendelu.pef.microlearning.model.Node

interface INavigationRouter {
    fun navigateBack()

//    fun navigateToLessonScreen()
//    fun navigateToLessonScreen(lessonId: Long?)
//    fun navigateToLessonScreen(title: String?, lessonId: Long?)
    fun navigateToLessonScreen(title: String?, lessonId: Long?, nodeId: Long?)

//    fun navigateToQuestionScreen(title: String)
//    fun navigateToQuestionScreen(title: String, nodeId: Long?)
//    fun navigateToQuestionScreen(title: String, nodeId: Long?, testId:Long?)
//    fun navigateToQuestionScreen(title: String, nodeId: Long?, testId:Long?, lessonId: Long?)
    fun navigateToQuestionScreen(title: String, nodeId: Long?, testId:Long?, lessonId: Long?, lessonName: String?)

    fun navigateToTestScreen()
    fun navigateToTestScreen(title: String)

    fun navigateToMainScreen(lastLessonId: Long?)

    fun getNavController(): NavController

}
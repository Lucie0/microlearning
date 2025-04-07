package cz.mendelu.pef.microlearning.navigation

import androidx.navigation.NavController

interface INavigationRouter {
    fun navigateBack()

    fun navigateToLessonScreen()
    fun navigateToLessonScreen(lessonId: Long?)
    fun navigateToLessonScreen(lessonId: Long?, nodeId: Long?)

    fun navigateToQuestionScreen(title: String)
    fun navigateToQuestionScreen(title: String, nodeId: Long?)
    fun navigateToQuestionScreen(title: String, nodeId: Long?, testId:Long?)

    fun navigateToMainScreen(lastLessonId: Long?)

    fun getNavController(): NavController

}
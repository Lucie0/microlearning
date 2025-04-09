package cz.mendelu.pef.microlearning.navigation

import androidx.navigation.NavController

interface INavigationRouter {
    fun navigateBack()

    fun navigateToLessonScreen()
    fun navigateToLessonScreen(lessonId: Long?)
    fun navigateToLessonScreen(title: String?, lessonId: Long?)
    fun navigateToLessonScreen(title: String?, lessonId: Long?, nodeId: Long?)

    fun navigateToQuestionScreen(title: String)
    fun navigateToQuestionScreen(title: String, nodeId: Long?)
    fun navigateToQuestionScreen(title: String, nodeId: Long?, testId:Long?)
    fun navigateToQuestionScreen(title: String, nodeId: Long?, testId:Long?, lessonId: Long?)

    fun navigateToMainScreen(lastLessonId: Long?)

    fun getNavController(): NavController

}
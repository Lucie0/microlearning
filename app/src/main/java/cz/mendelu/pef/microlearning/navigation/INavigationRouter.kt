package cz.mendelu.pef.microlearning.navigation

import androidx.navigation.NavController
import cz.mendelu.pef.microlearning.model.Node

interface INavigationRouter {
    fun navigateBack()

//    fun navigateToLessonScreen()
//    fun navigateToLessonScreen(lessonId: Long?)
//    fun navigateToLessonScreen(title: String?, lessonId: Long?)
//    fun navigateToLessonScreen(title: String?, lessonId: Long?, nodeId: Long?)
    fun navigateToLessonScreen(lessonId: Long?, nodeId: Long?)
    fun navigateToLessonScreen(lessonId: Long?, nodeId: Long?, lessonOrdinalNumber: Int?, topicId: Long?)
    fun navigateToChooseLessonScreen(topicName: String?, topicId: Long?)

//    fun navigateToQuestionScreen(title: String)
//    fun navigateToQuestionScreen(title: String, nodeId: Long?)
//    fun navigateToQuestionScreen(title: String, nodeId: Long?, testId:Long?)
//    fun navigateToQuestionScreen(title: String, nodeId: Long?, testId:Long?, lessonId: Long?)
//    fun navigateToQuestionScreen(title: String, nodeId: Long?, testId:Long?, lessonId: Long?, lessonName: String?)
    fun navigateToQuestionScreen(nodeId: Long?, testId:Long?, lessonId: Long?)

    fun navigateToTestScreen()
//    fun navigateToTestScreen(title: String)

    fun navigateToSettingsScreen()
    fun navigateToModesScreen()

    fun navigateToMainScreen(lastLessonId: Long?)

    fun getNavController(): NavController

}
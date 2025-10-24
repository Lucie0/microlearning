package cz.mendelu.pef.microlearning

import android.view.Display.Mode
import cz.mendelu.pef.microlearning.architecture.CommunicationResult
import cz.mendelu.pef.microlearning.communication.api.RemoteMockRepositoryImpl
import cz.mendelu.pef.microlearning.database.MicrolearningMockRepositoryImpl
import cz.mendelu.pef.microlearning.database.MicrolearningRepositoryImpl
import cz.mendelu.pef.microlearning.model.Modes
import cz.mendelu.pef.microlearning.model.api.Graph
import cz.mendelu.pef.microlearning.model.api.Node
import cz.mendelu.pef.microlearning.model.graph
import cz.mendelu.pef.microlearning.model.mode
import cz.mendelu.pef.microlearning.ui.screens.chooseLesson.ChooseLessonVM
import cz.mendelu.pef.microlearning.ui.screens.lesson.LessonScreenVM
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */

class ChooseLessonVMUnitTest {
    private lateinit var remoteRepository: RemoteMockRepositoryImpl
    private lateinit var viewModel: ChooseLessonVM

    @Before
    fun setup() {
        println("setup")
        remoteRepository = RemoteMockRepositoryImpl()
        // Vytvoření ViewModelu s injektovaným FakeRemoteRepository
        viewModel = ChooseLessonVM(remoteRepository)

//        mode.value = Modes.TESTING.name
        graph = Graph(1,"topic1", mutableMapOf(
            Pair(
                1L,
                Node(
                    1L,
                    1,
                    "1",
                    1,
                    0,
                    0,
                    0,
                    walkThrough = false,
                    successfullyCompleted = false
                )
            ),
            Pair(
                2L,
                Node(
                    2L,
                    2,
                    "1",
                    1,
                    0,
                    0,
                    0,
                    walkThrough = false,
                    successfullyCompleted = false
                )
            ),
            Pair(
                3L,
                Node(
                    3L,
                    3,
                    "1",
                    1,
                    0,
                    0,
                    0,
                    walkThrough = false,
                    successfullyCompleted = false
                )
            ),
            Pair(
                4L,
                Node(
                    4L,
                    4,
                    "1",
                    1,
                    0,
                    0,
                    0,
                    walkThrough = false,
                    successfullyCompleted = false
                )
            ),
        ))
    }

    @Test
    fun test1() {
        assertTrue(true)
    }

    @Test
    fun test2(){
        assertNotNull(viewModel)
    }

    @Test
    fun test3() {
        mode.value = Modes.REVISION.name
    }

    @Test
    fun test_getNodeFromGraphByLesson1() {
        // lesson id 5 neexistuje
        assertEquals(-1, viewModel.getNodeFromGraphByLesson(5))
    }

    @Test
    fun test_getNodeFromGraphByLesson2() {
        // lesson id 4 v node id 4
        assertEquals(4, viewModel.getNodeFromGraphByLesson(4))
    }

    @Test
    fun test_getNodeFromGraphByLesson3() {
        // lesson id 2 v node id 2
        assertEquals(2, viewModel.getNodeFromGraphByLesson(2))
    }

    /*
    @Test
    fun test() = runTest {// kvuli suspend fcim
//        viewModel.lessonId = 1
//        viewModel.sGetLessonById()

        // jak vyvolat exception na pockani --> nastavit atribut v repu na true
//        remoteRepository.exception = true

        when (val request = remoteRepository.getLessonById(1)) {
            is CommunicationResult.ConnectionError -> TODO()
            is CommunicationResult.Error -> TODO()
            is CommunicationResult.Exception -> TODO()
            is CommunicationResult.Success -> {
                println(request.data)
                assertTrue(request.data.content.content != null)
            }
        }
        println(viewModel.data.lesson.toString())
//        val repo = remoteRepository as RemoteRepositoryImpl
//        viewModel = LessonScreenVM(RemoteMockRepositoryImpl())
//        println(remoteRepository.javaClass)
//        println(viewModel.javaClass)

        assertEquals(4, 2 + 2)
        assertNotNull(viewModel)
    }

     */
}
package cz.mendelu.pef.microlearning

import cz.mendelu.pef.microlearning.architecture.CommunicationResult
import cz.mendelu.pef.microlearning.communication.api.RemoteMockRepositoryImpl
import cz.mendelu.pef.microlearning.database.MicrolearningMockRepositoryImpl
import cz.mendelu.pef.microlearning.model.Modes
import cz.mendelu.pef.microlearning.model.mode
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

class LessonVMUnitTest {
    private lateinit var remoteRepository: RemoteMockRepositoryImpl
    private lateinit var localRepository: MicrolearningMockRepositoryImpl
    private lateinit var viewModel: LessonScreenVM

    @Before
    fun setup() {
        println("Setup")
        remoteRepository = RemoteMockRepositoryImpl()
        localRepository = MicrolearningMockRepositoryImpl()
        // Vytvoření ViewModelu s injektovaným FakeRemoteRepository
        viewModel = LessonScreenVM(remoteRepository, localRepository)
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
        mode.value = Modes.Revision.name
    }

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
}
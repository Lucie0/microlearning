package cz.mendelu.pef.microlearning

import cz.mendelu.pef.microlearning.architecture.CommunicationResult
import cz.mendelu.pef.microlearning.communication.api.RemoteMockRepositoryImpl
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
    lateinit var remoteRepository: RemoteMockRepositoryImpl
    lateinit var viewModel: LessonScreenVM

    @Before
    fun setup() {
        println("xxxxxxxxxxxxxxxx")
        remoteRepository = RemoteMockRepositoryImpl()
        // Vytvoření ViewModelu s injektovaným FakeRemoteRepository
        viewModel = LessonScreenVM(remoteRepository)
    }

    @Test
    fun test() = runTest {
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
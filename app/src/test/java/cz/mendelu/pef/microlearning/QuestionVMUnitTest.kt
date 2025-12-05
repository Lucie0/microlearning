package cz.mendelu.pef.microlearning

import cz.mendelu.pef.microlearning.communication.api.RemoteMockRepositoryImpl
import cz.mendelu.pef.microlearning.database.MicrolearningMockRepositoryImpl
import cz.mendelu.pef.microlearning.model.Modes
import cz.mendelu.pef.microlearning.model.actualNodeInGraph
import cz.mendelu.pef.microlearning.model.api.Graph
import cz.mendelu.pef.microlearning.model.api.Node
import cz.mendelu.pef.microlearning.model.graph
import cz.mendelu.pef.microlearning.model.mode
import cz.mendelu.pef.microlearning.model.todoNodes
import cz.mendelu.pef.microlearning.ui.screens.question.QuestionScreenVM
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

class QuestionVMUnitTest {
    private lateinit var remoteRepository: RemoteMockRepositoryImpl
    private lateinit var localRepository: MicrolearningMockRepositoryImpl
    private lateinit var viewModel: QuestionScreenVM

    @Before
    fun setup() {
        println("Setup")
        remoteRepository = RemoteMockRepositoryImpl()
        localRepository = MicrolearningMockRepositoryImpl()
        // Vytvoření ViewModelu s injektovaným FakeRemoteRepository
        viewModel = QuestionScreenVM(remoteRepository)

        mode.value = Modes.Testing.name
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
            )
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
    fun test_isTestCorrect() {
        // prazdny seznam spravnych odpovedi
        viewModel.correctOptions = hashMapOf()
        // prazdny seznam vybranych odpovedi
        viewModel.selectedOptions = hashMapOf()
        viewModel.nodeId = 1

        // vyhodnoceno, ze test neni zodpovezen spravne
        assertEquals(false, viewModel.isTestCorrect())
        assertEquals(0, graph.map[viewModel.nodeId]?.countOfIncorrectAnswers)
        assertEquals(0, graph.map[viewModel.nodeId]?.countOfCorrectAnswers)
        assertEquals(true, graph.map[viewModel.nodeId]?.walkThrough)
    }

    @Test
    fun test_isTestCorrect2() {
        // plny seznam spravnych odpovedi
        viewModel.correctOptions = hashMapOf(Pair("ot1", "odp1"),Pair("ot2", "odp2"))
        // prazdny seznam vybranych odpovedi
        viewModel.selectedOptions = hashMapOf()
        viewModel.nodeId = 1

        // vyhodnoceno, ze test neni zodpovezen spravne
        assertEquals(false, viewModel.isTestCorrect())
        assertEquals(2, graph.map[viewModel.nodeId]?.countOfIncorrectAnswers)
        assertEquals(0, graph.map[viewModel.nodeId]?.countOfCorrectAnswers)
        assertEquals(true, graph.map[viewModel.nodeId]?.walkThrough)

    }

    @Test
    fun test_isTestCorrect3() {
        // plny seznam spravnych odpovedi
        viewModel.correctOptions = hashMapOf(Pair("ot1", "odp1"),Pair("ot2", "odp2"))
        // plny seznam vybranych odpovedi
        viewModel.selectedOptions = hashMapOf(Pair("ot1", "odp1"),Pair("ot2", "odp2"))
        viewModel.nodeId = 1

        // vyhodnoceno, ze test je zodpovezen spravne
        assertEquals(true, viewModel.isTestCorrect())
        assertEquals(0, graph.map[viewModel.nodeId]?.countOfIncorrectAnswers)
        assertEquals(2, graph.map[viewModel.nodeId]?.countOfCorrectAnswers)
        assertEquals(true, graph.map[viewModel.nodeId]?.walkThrough)

    }

    @Test
    fun test_isTestCorrect4() {
        // prazdny seznam spravnych odpovedi
        viewModel.correctOptions = hashMapOf()
        // plny seznam vybranych odpovedi
        viewModel.selectedOptions = hashMapOf(Pair("ot1", "odp1"),Pair("ot2", "odp2"))
        viewModel.nodeId = 1

        // vyhodnoceno, ze test je zodpovezen spravne
        assertEquals(false, viewModel.isTestCorrect())
        assertEquals(0, graph.map[viewModel.nodeId]?.countOfIncorrectAnswers)
        assertEquals(0, graph.map[viewModel.nodeId]?.countOfCorrectAnswers)
        assertEquals(true, graph.map[viewModel.nodeId]?.walkThrough)
    }

    @Test
    fun test_getNextNodeId1() {
        actualNodeInGraph = 1L
//        graph.map[1]?.previousNodesIds = mutableListOf()

        assertEquals(-1L, viewModel.getNextNodeId())
        assertEquals(mutableListOf<Long>(), todoNodes)
    }

    @Test
    fun test_getNextNodeId2() {
        actualNodeInGraph = 1L
        graph.map[1L]?.previousNodesIds = mutableListOf(2)

        assertEquals(2L, viewModel.getNextNodeId())
        assertEquals(mutableListOf<Long>(), todoNodes)
    }

    @Test
    fun test_getNextNodeId3() {
        actualNodeInGraph = 1L
        graph.map[1L]?.previousNodesIds = mutableListOf(2,3)

        assertEquals(2L, viewModel.getNextNodeId())
        assertEquals(mutableListOf(3L), todoNodes)
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
        println(viewModel.data.questions.toString())
//        val repo = remoteRepository as RemoteRepositoryImpl
//        viewModel = LessonScreenVM(RemoteMockRepositoryImpl())
//        println(remoteRepository.javaClass)
//        println(viewModel.javaClass)

        assertEquals(4, 2 + 2)
        assertNotNull(viewModel)
    }
 */
}
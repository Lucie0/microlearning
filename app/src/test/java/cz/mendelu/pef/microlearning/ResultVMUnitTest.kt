package cz.mendelu.pef.microlearning

import cz.mendelu.pef.microlearning.communication.api.RemoteMockRepositoryImpl
import cz.mendelu.pef.microlearning.database.MicrolearningMockRepositoryImpl
import cz.mendelu.pef.microlearning.model.api.Node
import cz.mendelu.pef.microlearning.model.graph
import cz.mendelu.pef.microlearning.model.startingNode
import cz.mendelu.pef.microlearning.ui.screens.showResults.ResultVM
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

class ResultVMUnitTest {
    private lateinit var remoteRepository: RemoteMockRepositoryImpl
    private lateinit var localRepository: MicrolearningMockRepositoryImpl
    private lateinit var viewModel: ResultVM

    @Before
    fun setup() {
        println("Setup")
        remoteRepository = RemoteMockRepositoryImpl()
        localRepository = MicrolearningMockRepositoryImpl()
        // Vytvoření ViewModelu s injektovaným FakeRemoteRepository
        viewModel = ResultVM(remoteRepository)

        graph.map = mutableMapOf(
            Pair(
                1L,
                Node(
                    id = 1L,
                    lessonId = 1,
                    lessonName = "Lesson 1",
                    lessonOrdinalNumber = 1,
                    level = 0,
                    levelDepth = 0,
                    questionDepth = 0,
                    walkThrough = false,
                    successfullyCompleted = false
                )),
            Pair(
                2L,
                Node(
                    id = 2L,
                    lessonId = 2,
                    lessonName = "Lesson 2",
                    lessonOrdinalNumber = 2,
                    level = 0,
                    levelDepth = 0,
                    questionDepth = 0,
                    walkThrough = false,
                    successfullyCompleted = false
                )),
            Pair(
                3L,
                Node(
                    id = 3L,
                    lessonId = 3,
                    lessonName = "Lesson 3",
                    lessonOrdinalNumber = 3,
                    level = 0,
                    levelDepth = 0,
                    questionDepth = 0,
                    walkThrough = false,
                    successfullyCompleted = false
                )),
            Pair(
                4L,
                Node(
                    id = 4L,
                    lessonId = 4,
                    lessonName = "Lesson 4",
                    lessonOrdinalNumber = 4,
                    level = 0,
                    levelDepth = 0,
                    questionDepth = 0,
                    walkThrough = false,
                    successfullyCompleted = false
                )),
            Pair(
                5L,
                Node(
                    id = 5L,
                    lessonId = 5,
                    lessonName = "Lesson 5",
                    lessonOrdinalNumber = 5,
                    level = 0,
                    levelDepth = 0,
                    questionDepth = 0,
                    walkThrough = false,
                    successfullyCompleted = false
                )),
        )

        graph.map[1L]?.subsequentNodeIds = listOf(2L, 4L)
        graph.map[2L]?.subsequentNodeIds = listOf(3L)
        graph.map[4L]?.subsequentNodeIds = listOf(5L)

        graph.map[2L]?.previousNodesIds = listOf(1L)
        graph.map[4L]?.previousNodesIds = listOf(1L)
        graph.map[3L]?.previousNodesIds = listOf(2L)
        graph.map[5L]?.previousNodesIds = listOf(4L)
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
    fun test_getScalarResult1() {
        startingNode = 1
        graph.map[1L]?.countOfCorrectAnswers = 0
        assertEquals(0, viewModel.getScalarResult())
    }

    @Test
    fun test_getScalarResult2() {
        startingNode = 1
        graph.map[1L]?.countOfCorrectAnswers = 2
        assertEquals(0, viewModel.getScalarResult())
    }

    @Test
    fun test_getScalarResult3() {
        startingNode = 1
        graph.map[1L]?.countOfIncorrectAnswers = 2
        assertEquals(0, viewModel.getScalarResult())
    }

    @Test
    fun test_getScalarResult4() {
        startingNode = 2
//        graph.map[1L]?.countOfIncorrectAnswers =
        assertEquals(1, viewModel.getScalarResult())
    }

    @Test
    fun test_getScalarResult5() {
        startingNode = 3
//        graph.map[1L]?.countOfIncorrectAnswers =
        assertEquals(2, viewModel.getScalarResult())
    }

    @Test
    fun test_getScalarResult6() {
        startingNode = 3
        graph.map[3L]?.countOfIncorrectAnswers = 2
        assertEquals(1, viewModel.getScalarResult())
    }
    @Test
    fun test_getScalarResult7() {
        startingNode = 3
        graph.map[2L]?.countOfIncorrectAnswers = 2
        graph.map[3L]?.countOfIncorrectAnswers = 2
        assertEquals(0, viewModel.getScalarResult())
    }

    @Test
    fun test_getScalarResult8() {
        startingNode = 5
        assertEquals(2, viewModel.getScalarResult())
    }

    @Test
    fun test_getScalarResult9() {
        startingNode = 5
        graph.map[5L]?.countOfIncorrectAnswers = 2
        assertEquals(1, viewModel.getScalarResult())
    }

    @Test
    fun test_getGraphResult1() {
        startingNode = 1
        graph.map[1L]?.countOfCorrectAnswers = 0
        assertEquals("[Node{id=1, lessonName=Lesson 1}]", viewModel.getGraphResult())
    }

    @Test
    fun test_getGraphResult2() {
        startingNode = 1
        graph.map[1L]?.countOfCorrectAnswers = 2
        assertEquals("[Node{id=1, lessonName=Lesson 1}]", viewModel.getGraphResult())
    }

    @Test
    fun test_getGraphResult3() {
        startingNode = 1
        graph.map[1L]?.countOfIncorrectAnswers = 2
        assertEquals("", viewModel.getGraphResult())
    }

    @Test
    fun test_getGraphResult4() {
        startingNode = 2
//        graph.map[1L]?.countOfIncorrectAnswers =
        assertEquals("[Node{id=2, lessonName=Lesson 2}, Node{id=1, lessonName=Lesson 1}]", viewModel.getGraphResult())
    }

    @Test
    fun test_getGraphResult5() {
        startingNode = 3
//        graph.map[1L]?.countOfIncorrectAnswers =
        assertEquals("[Node{id=3, lessonName=Lesson 3}, Node{id=2, lessonName=Lesson 2}, Node{id=1, lessonName=Lesson 1}]", viewModel.getGraphResult())
    }

    @Test
    fun test_getGraphResult6() {
        startingNode = 3
        graph.map[3L]?.countOfIncorrectAnswers = 2
        assertEquals("[Node{id=2, lessonName=Lesson 2}, Node{id=1, lessonName=Lesson 1}]", viewModel.getGraphResult())
    }
    @Test
    fun test_getGraphResult7() {
        startingNode = 3
        graph.map[2L]?.countOfIncorrectAnswers = 2
        graph.map[3L]?.countOfIncorrectAnswers = 2
        assertEquals("[Node{id=2, lessonName=Lesson 2}, Node{id=1, lessonName=Lesson 1}]", viewModel.getGraphResult())
    }

    @Test
    fun test_getGraphResult8() {
        startingNode = 5
        assertEquals("[Node{id=5, lessonName=Lesson 5}, Node{id=4, lessonName=Lesson 4}, Node{id=1, lessonName=Lesson 1}]", viewModel.getGraphResult())
    }

    @Test
    fun test_getGraphResult9() {
        startingNode = 5
        graph.map[5L]?.countOfIncorrectAnswers = 2
        assertEquals("[Node{id=4, lessonName=Lesson 4}, Node{id=1, lessonName=Lesson 1}]", viewModel.getGraphResult())
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
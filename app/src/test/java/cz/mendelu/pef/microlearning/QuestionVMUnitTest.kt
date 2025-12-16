package cz.mendelu.pef.microlearning

import cz.mendelu.pef.microlearning.architecture.CommunicationError
import cz.mendelu.pef.microlearning.architecture.CommunicationResult
import cz.mendelu.pef.microlearning.communication.api.IRemoteRepository
import cz.mendelu.pef.microlearning.communication.api.NetworkInterceptor
import cz.mendelu.pef.microlearning.model.Modes
import cz.mendelu.pef.microlearning.model.actualNodeInGraph
import cz.mendelu.pef.microlearning.model.api.Graph
import cz.mendelu.pef.microlearning.model.api.Node
import cz.mendelu.pef.microlearning.model.api.Question
import cz.mendelu.pef.microlearning.model.graph
import cz.mendelu.pef.microlearning.model.lessonsToStudy
import cz.mendelu.pef.microlearning.model.mode
import cz.mendelu.pef.microlearning.model.response.ArrayResponse
import cz.mendelu.pef.microlearning.model.todoNodes
import cz.mendelu.pef.microlearning.ui.screens.question.QuestionScreenVM
import io.mockk.coEvery
import io.mockk.every
import io.mockk.mockk
import io.mockk.mockkObject
import io.mockk.unmockkAll
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.StandardTestDispatcher
import kotlinx.coroutines.test.advanceUntilIdle
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.runTest
import kotlinx.coroutines.test.setMain
import org.junit.After
import org.junit.Assert
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test

class QuestionVMUnitTest {

    private val dispatcher = StandardTestDispatcher()

    private lateinit var remoteRepository: IRemoteRepository
    private lateinit var vm: QuestionScreenVM

    @OptIn(ExperimentalCoroutinesApi::class)
    @Before
    fun setup() {
        remoteRepository = mockk()
        // Vytvoření ViewModelu s injektovaným FakeRemoteRepository
        vm = QuestionScreenVM(remoteRepository)

        Dispatchers.setMain(dispatcher)

        mockkObject(NetworkInterceptor)

        // RESET globálních objektů
        todoNodes = mutableSetOf()
        lessonsToStudy = mutableSetOf()
        actualNodeInGraph = -1L


        mode.value = Modes.TESTING.ordinal
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

    @OptIn(ExperimentalCoroutinesApi::class)
    @After
    fun tearDown() {
        unmockkAll()
        Dispatchers.resetMain()
    }

    private fun mockNetwork(isConnected: Boolean) {
        every { NetworkInterceptor.isNetworkConnected() } returns isConnected
    }

    @Test
    fun test_isTestCorrect() {
        // prazdny seznam spravnych odpovedi
        vm.correctOptions = hashMapOf()
        // prazdny seznam vybranych odpovedi
        vm.selectedOptions = hashMapOf()
        vm.nodeId = 1

        // vyhodnoceno, ze test neni zodpovezen spravne
        assertEquals(false, vm.isTestCorrect())
        assertEquals(0, graph.map[vm.nodeId]?.countOfIncorrectAnswers)
        assertEquals(0, graph.map[vm.nodeId]?.countOfCorrectAnswers)
        assertEquals(true, graph.map[vm.nodeId]?.walkThrough)
    }

    @Test
    fun test_isTestCorrect2() {
        // plny seznam spravnych odpovedi
        vm.correctOptions = hashMapOf(Pair("ot1", "odp1"),Pair("ot2", "odp2"))
        // prazdny seznam vybranych odpovedi
        vm.selectedOptions = hashMapOf()
        vm.nodeId = 1

        // vyhodnoceno, ze test neni zodpovezen spravne
        assertEquals(false, vm.isTestCorrect())
        assertEquals(2, graph.map[vm.nodeId]?.countOfIncorrectAnswers)
        assertEquals(0, graph.map[vm.nodeId]?.countOfCorrectAnswers)
        assertEquals(true, graph.map[vm.nodeId]?.walkThrough)

    }

    @Test
    fun test_isTestCorrect3() {
        // plny seznam spravnych odpovedi
        vm.correctOptions = hashMapOf(Pair("ot1", "odp1"),Pair("ot2", "odp2"))
        // plny seznam vybranych odpovedi
        vm.selectedOptions = hashMapOf(Pair("ot1", "odp1"),Pair("ot2", "odp2"))
        vm.nodeId = 1

        // vyhodnoceno, ze test je zodpovezen spravne
        assertEquals(true, vm.isTestCorrect())
        assertEquals(0, graph.map[vm.nodeId]?.countOfIncorrectAnswers)
        assertEquals(2, graph.map[vm.nodeId]?.countOfCorrectAnswers)
        assertEquals(true, graph.map[vm.nodeId]?.walkThrough)

    }

    @Test
    fun test_isTestCorrect4() {
        // prazdny seznam spravnych odpovedi
        vm.correctOptions = hashMapOf()
        // plny seznam vybranych odpovedi
        vm.selectedOptions = hashMapOf(Pair("ot1", "odp1"),Pair("ot2", "odp2"))
        vm.nodeId = 1

        // vyhodnoceno, ze test je zodpovezen spravne
        assertEquals(false, vm.isTestCorrect())
        assertEquals(0, graph.map[vm.nodeId]?.countOfIncorrectAnswers)
        assertEquals(0, graph.map[vm.nodeId]?.countOfCorrectAnswers)
        assertEquals(true, graph.map[vm.nodeId]?.walkThrough)
    }


    // -------------------------------------------------------------------------
    //  getData()
    // -------------------------------------------------------------------------

    @OptIn(ExperimentalCoroutinesApi::class)
    @Test
    fun `getData - offline - sets error`() = runTest {
        mockNetwork(false)

        vm.getData(dispatcher)
        advanceUntilIdle()

        assertNotNull(vm.uiState.value.errors)
        Assert.assertNull(vm.uiState.value.data)
    }

    @OptIn(ExperimentalCoroutinesApi::class)
    @Test
    fun `getData - Tuition mode - calls getQuestionsByLessonIdsTestingMode -- previous node does not exist`() = runTest {
        mockNetwork(true)
        mode.value = Modes.TUITION.ordinal

        // Node with a parent
        graph.map[10] = Node(10, 5, "L1", 1, 0, 0, null, false, successfullyCompleted = false).apply {
            previousNodesIds = listOf(100)
        }
        // node id = 100 not in graph

        vm.nodeId = 10

        coEvery { remoteRepository.getQuestionsByLessonId(any()) } returns
                CommunicationResult.Success(ArrayResponse(emptyList(), 0, 1))

        vm.getData(dispatcher)
        advanceUntilIdle()

        assertNotNull(vm.uiState.value.errors)
    }

    @OptIn(ExperimentalCoroutinesApi::class)
    @Test
    fun `getData - Tuition mode - calls getQuestionsByLessonIdsTestingMode`() = runTest {
        mockNetwork(true)
        mode.value = Modes.TUITION.ordinal

        // Node with a parent
        graph.map[10] = Node(10, 5, "L1", 1, 0, 0, null, false, successfullyCompleted = false).apply {
            previousNodesIds = listOf(100)
        }
        graph.map[100] = Node(100, 50, "L100", 3, 0, 0, null, false, successfullyCompleted = false).apply {
            previousNodesIds = listOf(1,2)
        }

        vm.nodeId = 10

        coEvery { remoteRepository.getQuestionsByLessonId(any()) } returns
                CommunicationResult.Success(ArrayResponse(emptyList(), 0, 1))

        vm.getData(dispatcher)
        advanceUntilIdle()

        assertNotNull(vm.uiState.value.data)
    }

    // -------------------------------------------------------------------------
    //  getQuestionsByLessonId()
    // -------------------------------------------------------------------------

    @OptIn(ExperimentalCoroutinesApi::class)
    @Test
    fun `getQuestionsByLessonId - no data`() = runTest {
        mockNetwork(true)
        vm.lessonId = 10

        coEvery { remoteRepository.getQuestionsByLessonId(10) } returns
                CommunicationResult.Success(ArrayResponse(null, 0, 1))

        vm.getData(dispatcher)
        advanceUntilIdle()

        assertNotNull(vm.uiState.value.errors)
        Assert.assertNull(vm.uiState.value.data)
    }

    @OptIn(ExperimentalCoroutinesApi::class)
    @Test
    fun `getQuestionsByLessonId - 404`() = runTest {
        mockNetwork(true)
        vm.lessonId = 10

        coEvery { remoteRepository.getQuestionsByLessonId(10) } returns
                CommunicationResult.Error(CommunicationError(404, "not found"))

        vm.getData(dispatcher)
        advanceUntilIdle()

        assertNotNull(vm.uiState.value.errors)
        Assert.assertNull(vm.uiState.value.data)
    }

    @OptIn(ExperimentalCoroutinesApi::class)
    @Test
    fun `getQuestionsByLessonId - ConnectionError`() = runTest {
        mockNetwork(true)
        vm.lessonId = 10

        coEvery { remoteRepository.getQuestionsByLessonId(10) } returns
                CommunicationResult.ConnectionError()

        vm.getData(dispatcher)
        advanceUntilIdle()

        assertNotNull(vm.uiState.value.errors)
    }

    // -------------------------------------------------------------------------
    //  getQuestionsByLessonIdsTestingMode()
    // -------------------------------------------------------------------------

    @OptIn(ExperimentalCoroutinesApi::class)
    @Test
    fun `getQuestionsByLessonIdsTestingMode - no previous nodes`() = runTest {
        mockNetwork(true)
        mode.value = Modes.TESTING.ordinal
        vm.nodeId = 10

        graph.map[10] = Node(10, 5, "L", 1, 0, 0, null, false, false).apply {
            previousNodesIds = emptyList()
        }

        vm.getData(dispatcher)
        advanceUntilIdle()

        assertNotNull(vm.uiState.value.errors)
    }

    @OptIn(ExperimentalCoroutinesApi::class)
    @Test
    fun `getQuestionsByLessonIdsTestingMode - success merging multiple nodes`() = runTest {
        mockNetwork(true)
        mode.value = Modes.TESTING.ordinal

        vm.nodeId = 10

        // Node 10 má předky 20, 30
        graph.map[10] = Node(10, null, "", 1, 0, 0, null, false, successfullyCompleted = false).apply {
            previousNodesIds = listOf(20, 30)
        }
        graph.map[20] = Node(20, 100, "L20", 1, 0, 0, null, false, successfullyCompleted = false)
        graph.map[30] = Node(30, 200, "L30", 1, 0, 0, null, false, successfullyCompleted = false)

        val q1 = Question(1, "A", "q1", 1, 1, ArrayResponse(emptyList(), 0, 1))
        val q2 = Question(2, "A", "q2", 1, 1, ArrayResponse(emptyList(), 0, 1))

        coEvery { remoteRepository.getQuestionsByLessonId(100) } returns
                CommunicationResult.Success(ArrayResponse(listOf(q1), 1, 1))
        coEvery { remoteRepository.getQuestionsByLessonId(200) } returns
                CommunicationResult.Success(ArrayResponse(listOf(q2), 1, 1))

        vm.getData(dispatcher)
        advanceUntilIdle()

        Assert.assertFalse(vm.uiState.value.loading)
        assertNotNull(vm.uiState.value.data?.questionsList)
        assertEquals(2, vm.uiState.value.data?.questionsList?.size)
    }

    // -------------------------------------------------------------------------
    //  reduceQuestions()
    // -------------------------------------------------------------------------

    @Test
    fun `reduceQuestions - reduces long lists to max 3`() = runTest {
        vm.data.questionsList = mutableListOf(
            ArrayResponse(
                (1..10).map { Question(it.toLong(), "A", "Q$it", 1, 1, ArrayResponse(emptyList(), 0, 1)) },
                10,
                1
            )
        )

        val method = vm.javaClass.getDeclaredMethod("reduceQuestions")
        method.isAccessible = true
        method.invoke(vm)

        assertNotNull(vm.data.questions)
        assertTrue(vm.data.questions!!.items!!.size <= 3)
    }

    // -------------------------------------------------------------------------
    //  getNextNodeId()
    // -------------------------------------------------------------------------

    @Test
    fun `getNextNodeId - returns first previous and fills todoNodes`() {
        actualNodeInGraph = 10
        graph.map[10] = Node(10, null, "", 1, 0, 0, null, false,  false).apply {
            previousNodesIds = listOf(20, 30)
        }

        val result = vm.getNextNodeId()

        assertEquals(20, result)
        assertTrue(todoNodes.contains(30))
    }

    @Test
    fun `getNextNodeId - previous empty but todoNodes not empty`() {
        actualNodeInGraph = 10
        graph.map[10] = Node(10, null, "", 1, 0, 0, null, false, false).apply {
            previousNodesIds = listOf(77)
        }

//        todoNodes.add(77)

        val result = vm.getNextNodeId()

        assertEquals(77, result)
        assertTrue(todoNodes.isEmpty())
    }

    @Test
    fun `getNextNodeId - no previous and todoNodes empty returns minus one`() {
        actualNodeInGraph = 10
        graph.map[10] = Node(10, null, "", 1, 0, 0, null, false, false).apply {
            previousNodesIds = emptyList()
        }

        val result = vm.getNextNodeId()
        assertEquals(-1L, result)
    }

    // -------------------------------------------------------------------------
    //  isTestCorrect()
    // -------------------------------------------------------------------------

    @Test
    fun `isTestCorrect - all correct`() {
        vm.nodeId = 10
        graph.map[10] = Node(10, null, "", 1, 0, 0, null, false, false)

        vm.correctOptions["q1"] = "A"
        vm.selectedOptions["q1"] = "A"

        val result = vm.isTestCorrect()

        assertTrue(result)
        assertEquals(1, graph.map[10]?.countOfCorrectAnswers)
    }

    @Test
    fun `isTestCorrect - incorrect updates graph and lessonsToStudy in Tuition mode`() {
        mode.value = Modes.TUITION.ordinal
        vm.nodeId = 10

        graph.map[10] = Node(10, null, "", 1, 0, 0, null, false, false)
        graph.map[5] = Node(5, null, "", 1, 0, 0, null, false, false)
        actualNodeInGraph = 5

        graph.map[5]!!.previousNodesIds = listOf(999)

        vm.correctOptions["q1"] = "A"
        vm.selectedOptions["q1"] = "B" // wrong

        val result = vm.isTestCorrect()

        Assert.assertFalse(result)
        assertTrue(lessonsToStudy.contains(999))
    }

    @Test
    fun `isTestCorrect - second call returns cached result`() {
        vm.nodeId = 10
        graph.map[10] = Node(10, null, "", 1, 0, 0, null, false, false)

        vm.correctOptions["q1"] = "A"
        vm.selectedOptions["q1"] = "A"

        val first = vm.isTestCorrect()
        val second = vm.isTestCorrect()

        assertEquals(first, second)
    }

    // -------------------------------------------------------------------------
    // correctAnswers()
    // -------------------------------------------------------------------------

    @Test
    fun `correctAnswers - returns only incorrect question keys`() {
        vm.correctOptions["q1"] = "A"
        vm.correctOptions["q2"] = "B"

        vm.selectedOptions["q1"] = "A"
        vm.selectedOptions["q2"] = "C"

        val result = vm.correctAnswers()

        assertEquals(1, result.size)
        assertEquals("q2", result[0])
    }

    // -------------------------------- 2 ---------------------------------
    @OptIn(ExperimentalCoroutinesApi::class)
    @Test
    fun `getQuestionsByLessonIdsTestingMode - node skipped when lessonId is null`() = runTest {
        mockNetwork(true)
        mode.value = Modes.TESTING.ordinal
        vm.nodeId = 10

        graph.map[10] = Node(10, null, "",1,0,0,null, false,false).apply {
            previousNodesIds = listOf(20)
        }

        graph.map[20] = Node(20, null, "",1,0,0,null, false,false) // lessonId = null

        vm.getData(dispatcher)
        advanceUntilIdle()

        // previous existed but lessonId missing → UI error
        assertNotNull(vm.uiState.value.errors)
    }

    @OptIn(ExperimentalCoroutinesApi::class)
    @Test
    fun `getQuestionsByLessonIdsTestingMode - error on last fetch sets error`() = runTest {
        mockNetwork(true)
        mode.value = Modes.TESTING.ordinal
        vm.nodeId = 10

        graph.map[10] = Node(10, null, "", 1, 0,0,null, false,false).apply {
            previousNodesIds = listOf(20, 30)
        }

        graph.map[20] = Node(20, 100,"",1,0,0,null, false,false)
        graph.map[30] = Node(30, 200,"",1,0,0,null, false,false)

        val q = Question(1,"A","t",1,1, ArrayResponse(emptyList(),0,1))

        coEvery { remoteRepository.getQuestionsByLessonId(100) } returns
                CommunicationResult.Success(ArrayResponse(listOf(q),1,1))

        coEvery { remoteRepository.getQuestionsByLessonId(200) } returns
                CommunicationResult.Error(CommunicationError(500,"error"))

        vm.getData(dispatcher)
        advanceUntilIdle()

        assertNotNull(vm.uiState.value.errors) // final state = error
    }

    @Test
    fun `reduceQuestions - empty list does not crash`() {
        vm.data.questionsList = mutableListOf()
        val expect = vm.data.questionsList.size

        val method = vm.javaClass.getDeclaredMethod("reduceQuestions")
        method.isAccessible = true

        method.invoke(vm)

        assertEquals(expect, vm.data.questionsList.size) // nothing to reduce
    }

    @Test
    fun `isTestCorrect - updates walkThrough and successfullyCompleted flags`() {
        vm.nodeId = 10
        graph.map[10] = Node(10,null,"",1,0,0,null, false,false)

        vm.correctOptions["q1"] = "A"
        vm.selectedOptions["q1"] = "A"

        val result = vm.isTestCorrect()
        assertTrue(result)

        assertTrue(graph.map[10]!!.walkThrough == true)
        assertTrue(graph.map[10]!!.successfullyCompleted == true)
    }

    @Test
    fun `correctAnswers - missing selectedOption still treated as incorrect`() {
        vm.correctOptions["q1"] = "A"
        vm.correctOptions["q2"] = "B"

        vm.selectedOptions["q1"] = "A"
        // missing q2 → should count as incorrect

        val list = vm.correctAnswers()

        assertEquals(1, list.size)
        assertEquals("q2", list[0])
    }

//
//    @Test
//    fun test_getNextNodeId1() {
//        actualNodeInGraph = 1L
////        graph.map[1]?.previousNodesIds = mutableListOf()
//
//        assertEquals(-1L, vm.getNextNodeId())
//        assertEquals(mutableListOf<Long>(), todoNodes)
//    }
//
//    @Test
//    fun test_getNextNodeId2() {
//        actualNodeInGraph = 1L
//        graph.map[1L]?.previousNodesIds = mutableListOf(2)
//
//        assertEquals(2L, viewModel.getNextNodeId())
//        assertEquals(mutableListOf<Long>(), todoNodes)
//    }
//
//    @Test
//    fun test_getNextNodeId3() {
//        actualNodeInGraph = 1L
//        graph.map[1L]?.previousNodesIds = mutableListOf(2,3)
//
//        assertEquals(2L, viewModel.getNextNodeId())
//        assertEquals(mutableListOf(3L), todoNodes)
//    }

}
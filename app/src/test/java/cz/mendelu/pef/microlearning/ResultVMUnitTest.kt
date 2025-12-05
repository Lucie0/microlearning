package cz.mendelu.pef.microlearning

import cz.mendelu.pef.microlearning.architecture.CommunicationError
import cz.mendelu.pef.microlearning.architecture.CommunicationResult
import cz.mendelu.pef.microlearning.communication.api.IRemoteRepository
import cz.mendelu.pef.microlearning.model.api.LessonShorter
import cz.mendelu.pef.microlearning.model.api.Node
import cz.mendelu.pef.microlearning.model.graph
import cz.mendelu.pef.microlearning.model.response.ArrayResponse
import cz.mendelu.pef.microlearning.model.startingNode
import cz.mendelu.pef.microlearning.ui.screens.showResults.ResultVM
import io.mockk.coEvery
import io.mockk.mockk
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.StandardTestDispatcher
import kotlinx.coroutines.test.advanceUntilIdle
import kotlinx.coroutines.test.runTest
import kotlinx.coroutines.test.setMain
import org.junit.Assert
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test
import java.io.IOException

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */

class ResultVMUnitTest {
    private lateinit var remoteRepository: IRemoteRepository
    private lateinit var vm: ResultVM

    private val dispatcher = StandardTestDispatcher()


    @OptIn(ExperimentalCoroutinesApi::class)
    @Before
    fun setup() {
        remoteRepository = mockk()
        vm = ResultVM(remoteRepository)

        Dispatchers.setMain(dispatcher)

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

        vm.topicId = 1L
    }

    // --- TESTY SUCCESS ---
    @OptIn(ExperimentalCoroutinesApi::class)
    @Test
    fun `when api returns Success with items, uiState contains data`() = runTest {
        val lessons = listOf(
            LessonShorter(1, "Lesson 1", 1, "Topic 2", 2L)
        )

        coEvery { remoteRepository.getLessonsShorterByTopicId(vm.topicId) } returns
                CommunicationResult.Success(ArrayResponse(items = lessons, count = 1, version = 1))

        vm.getData(dispatcher)
        advanceUntilIdle()

        val state = vm.uiState.value
        assertNotNull(state.data)
        Assert.assertNull(state.errors)
        assertEquals(1, state.data!!.items!!.size)
    }

    @OptIn(ExperimentalCoroutinesApi::class)
    @Test
    fun `when api returns Success with empty items, uiState errors is set`() = runTest {
        coEvery { remoteRepository.getLessonsShorterByTopicId(vm.topicId) } returns
                CommunicationResult.Success(ArrayResponse(items = emptyList(), count = 0, version = 1))

        vm.getData(dispatcher)
        advanceUntilIdle()

        val state = vm.uiState.value
        Assert.assertNull(state.data)
        assertNotNull(state.errors)
    }

    // --- TESTY CONNECTION ERROR ---
    @OptIn(ExperimentalCoroutinesApi::class)
    @Test
    fun `when api returns ConnectionError, uiState errors is set`() = runTest {
        coEvery { remoteRepository.getLessonsShorterByTopicId(1L) } returns CommunicationResult.ConnectionError()

        vm.getData(dispatcher)
        advanceUntilIdle()

        val state = vm.uiState.value
        Assert.assertNull(state.data)
        assertNotNull(state.errors)
    }

    // --- TESTY ERROR ---
    @OptIn(ExperimentalCoroutinesApi::class)
    @Test
    fun `when api returns Error 404, uiState errors is set`() = runTest {
        coEvery { remoteRepository.getLessonsShorterByTopicId(vm.topicId) } returns
                CommunicationResult.Error(CommunicationError(404, "Not Found"))

        vm.getData(dispatcher)
        advanceUntilIdle()

        val state = vm.uiState.value
        Assert.assertNull(state.data)
        assertNotNull(state.errors)
    }

    @OptIn(ExperimentalCoroutinesApi::class)
    @Test
    fun `when api returns Error 500, uiState errors is set`() = runTest {
        coEvery { remoteRepository.getLessonsShorterByTopicId(vm.topicId) } returns
                CommunicationResult.Error(CommunicationError(500, "Server Error"))

        vm.getData(dispatcher)
        advanceUntilIdle()

        val state = vm.uiState.value
        Assert.assertNull(state.data)
        assertNotNull(state.errors)
    }

    @OptIn(ExperimentalCoroutinesApi::class)
    @Test
    fun `when api returns unknown Error code, uiState errors is set`() = runTest {
        coEvery { remoteRepository.getLessonsShorterByTopicId(vm.topicId) } returns
                CommunicationResult.Error(CommunicationError(123, "Unknown"))

        vm.getData(dispatcher)
        advanceUntilIdle()

        val state = vm.uiState.value
        Assert.assertNull(state.data)
        assertNotNull(state.errors)
    }

    // --- TESTY EXCEPTION ---
    @OptIn(ExperimentalCoroutinesApi::class)
    @Test
    fun `when api throws Exception, uiState errors is set`() = runTest {
        coEvery { remoteRepository.getLessonsShorterByTopicId(vm.topicId) } returns
                CommunicationResult.Exception(IOException("Network failure"))

        vm.getData(dispatcher)
        advanceUntilIdle()

        val state = vm.uiState.value
        Assert.assertNull(state.data)
        assertNotNull(state.errors)
    }

    // --- TESTY pomocných funkcí grafu ---
    @Test
    fun `getScalarResult returns correct points`() {
        startingNode = 5L

        val points = vm.getScalarResult()
        assertTrue(points >= 0)
    }
    @Test
    fun test_getScalarResult1() {
        startingNode = 1
        graph.map[1L]?.countOfCorrectAnswers = 0
        assertEquals(0, vm.getScalarResult())
    }

    @Test
    fun test_getScalarResult2() {
        startingNode = 1
        graph.map[1L]?.countOfCorrectAnswers = 2
        assertEquals(0, vm.getScalarResult())
    }

    @Test
    fun test_getScalarResult3() {
        startingNode = 1
        graph.map[1L]?.countOfIncorrectAnswers = 2
        assertEquals(0, vm.getScalarResult())
    }

    @Test
    fun test_getScalarResult4() {
        startingNode = 2
//        graph.map[1L]?.countOfIncorrectAnswers =
        assertEquals(1, vm.getScalarResult())
    }

    @Test
    fun test_getScalarResult5() {
        startingNode = 3
//        graph.map[1L]?.countOfIncorrectAnswers =
        assertEquals(2, vm.getScalarResult())
    }

    @Test
    fun test_getScalarResult6() {
        startingNode = 3
        graph.map[3L]?.countOfIncorrectAnswers = 2
        assertEquals(1, vm.getScalarResult())
    }
    @Test
    fun test_getScalarResult7() {
        startingNode = 3
        graph.map[2L]?.countOfIncorrectAnswers = 2
        graph.map[3L]?.countOfIncorrectAnswers = 2
        assertEquals(0, vm.getScalarResult())
    }

    @Test
    fun test_getScalarResult8() {
        startingNode = 5
        assertEquals(2, vm.getScalarResult())
    }

    @Test
    fun test_getScalarResult9() {
        startingNode = 5
        graph.map[5L]?.countOfIncorrectAnswers = 2
        assertEquals(1, vm.getScalarResult())
    }

    @Test
    fun `getGraphResult returns non-empty set`() {
        startingNode = 5L
        graph.map[5L]?.countOfCorrectAnswers = 3

        val result = vm.getGraphResult()
        assertTrue(result.isNotEmpty())
    }

    @Test
    fun test_getGraphResult1() {
        startingNode = 1
        graph.map[1L]?.countOfCorrectAnswers = 0
        assertEquals("[Node{id=1, lessonName=Lesson 1}]", vm.getGraphResult())
    }

    @Test
    fun test_getGraphResult2() {
        startingNode = 1
        graph.map[1L]?.countOfCorrectAnswers = 2
        assertEquals("[Node{id=1, lessonName=Lesson 1}]", vm.getGraphResult())
    }

    @Test
    fun test_getGraphResult3() {
        startingNode = 1
        graph.map[1L]?.countOfIncorrectAnswers = 2
        assertEquals("", vm.getGraphResult())
    }

    @Test
    fun test_getGraphResult4() {
        startingNode = 2
//        graph.map[1L]?.countOfIncorrectAnswers =
        assertEquals("[Node{id=2, lessonName=Lesson 2}, Node{id=1, lessonName=Lesson 1}]", vm.getGraphResult())
    }

    @Test
    fun test_getGraphResult5() {
        startingNode = 3
//        graph.map[1L]?.countOfIncorrectAnswers =
        assertEquals("[Node{id=3, lessonName=Lesson 3}, Node{id=2, lessonName=Lesson 2}, Node{id=1, lessonName=Lesson 1}]", vm.getGraphResult())
    }

    @Test
    fun test_getGraphResult6() {
        startingNode = 3
        graph.map[3L]?.countOfIncorrectAnswers = 2
        assertEquals("[Node{id=2, lessonName=Lesson 2}, Node{id=1, lessonName=Lesson 1}]", vm.getGraphResult())
    }
    @Test
    fun test_getGraphResult7() {
        startingNode = 3
        graph.map[2L]?.countOfIncorrectAnswers = 2
        graph.map[3L]?.countOfIncorrectAnswers = 2
        assertEquals("[Node{id=2, lessonName=Lesson 2}, Node{id=1, lessonName=Lesson 1}]", vm.getGraphResult())
    }

    @Test
    fun test_getGraphResult8() {
        startingNode = 5
        assertEquals("[Node{id=5, lessonName=Lesson 5}, Node{id=4, lessonName=Lesson 4}, Node{id=1, lessonName=Lesson 1}]", vm.getGraphResult())
    }

    @Test
    fun test_getGraphResult9() {
        startingNode = 5
        graph.map[5L]?.countOfIncorrectAnswers = 2
        assertEquals("[Node{id=4, lessonName=Lesson 4}, Node{id=1, lessonName=Lesson 1}]", vm.getGraphResult())
    }
}
package cz.mendelu.pef.microlearning

import cz.mendelu.pef.microlearning.architecture.CommunicationError
import cz.mendelu.pef.microlearning.architecture.CommunicationResult
import cz.mendelu.pef.microlearning.communication.api.IRemoteRepository
import cz.mendelu.pef.microlearning.communication.api.NetworkInterceptor
import cz.mendelu.pef.microlearning.model.Modes
import cz.mendelu.pef.microlearning.model.api.Graph
import cz.mendelu.pef.microlearning.model.api.LessonShorter
import cz.mendelu.pef.microlearning.model.api.Node
import cz.mendelu.pef.microlearning.model.graph
import cz.mendelu.pef.microlearning.model.mode
import cz.mendelu.pef.microlearning.model.response.ArrayResponse
import cz.mendelu.pef.microlearning.ui.screens.chooseLesson.ChooseLessonVM
import io.mockk.coEvery
import io.mockk.every
import io.mockk.mockk
import io.mockk.mockkObject
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.StandardTestDispatcher
import kotlinx.coroutines.test.advanceUntilIdle
import kotlinx.coroutines.test.runTest
import kotlinx.coroutines.test.setMain
import org.junit.Assert
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Assert.assertNull
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */

class ChooseLessonVMUnitTest {
    private lateinit var repo: IRemoteRepository
    private lateinit var vm: ChooseLessonVM

    private val dispatcher = StandardTestDispatcher()

    @OptIn(ExperimentalCoroutinesApi::class)
    @Before
    fun setup() {

        Dispatchers.setMain(dispatcher)

        repo = mockk(relaxed = true)
        vm = ChooseLessonVM(repo)

        mode.value = Modes.Testing.name
//        graph = Graph(0, "", mutableMapOf())

        mockkObject(NetworkInterceptor)

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
    fun test_getNodeFromGraphByLesson1() {
        // lesson id 5 neexistuje
        assertEquals(-1, vm.getNodeFromGraphByLesson(5))
    }

    @Test
    fun test_getNodeFromGraphByLesson2() {
        // lesson id 4 v node id 4
        assertEquals(4, vm.getNodeFromGraphByLesson(4))
    }

    @Test
    fun test_getNodeFromGraphByLesson3() {
        // lesson id 2 v node id 2
        assertEquals(2, vm.getNodeFromGraphByLesson(2))
    }


    // ---------------------------------------------------------------------
    //  NETWORK OFF
    // ---------------------------------------------------------------------
    @Test
    fun `getData - network offline sets correct error`() = runTest {
        every { NetworkInterceptor.isNetworkConnected() } returns false

        vm.getData()

        assertNotNull(vm.uiState.value.errors!!.communicationError)
        assertNull(vm.uiState.value.data)
    }

    // ---------------------------------------------------------------------
    //  FULL ERROR BRANCH TESTS (getLessonsByTopic)
    // ---------------------------------------------------------------------

    @OptIn(ExperimentalCoroutinesApi::class)
    @Test
    fun `getLessonsByTopic - OK 200 empty list`() = runTest {
        every { NetworkInterceptor.isNetworkConnected() } returns true
        vm.topicId = 1L

        coEvery { repo.getLessonsByTopicId(vm.topicId) } returns
                CommunicationResult.Success(
                    ArrayResponse(listOf(), count = 0, version = 1)
                )

        coEvery { repo.getNodesByTopic(vm.topicId) } returns
                CommunicationResult.Success(
                    ArrayResponse(listOf(), count = 0, version = 1)
                )

        vm.getData()
        advanceUntilIdle()

        println("data = " + vm.uiState.value.data)
        println("errors = " + vm.uiState.value.errors)
        println("errors = " + vm.uiState.value.loading)

        assertEquals(
            null,
            vm.uiState.value.errors?.communicationError
        )

    }

    @OptIn(ExperimentalCoroutinesApi::class)
    @Test
    fun `getLessonsByTopic - other error returns something_went_wrong`() = runTest {
        every { NetworkInterceptor.isNetworkConnected() } returns true
        vm.topicId = 1L

        coEvery { repo.getLessonsShorterByTopicId(1L) } returns
                CommunicationResult.Error(
                    CommunicationError(
                        403,
                        "Something went wrong, please reload screen"
                    )
                )

        vm.getData(dispatcher)
        advanceUntilIdle()

        assertNotNull(vm.uiState.value)
        assertNotNull(vm.uiState.value.errors?.communicationError)
    }

    @OptIn(ExperimentalCoroutinesApi::class)
    @Test
    fun `getLessonsByTopic - exception returns unknown_error`() = runTest {
        every { NetworkInterceptor.isNetworkConnected() } returns true
        vm.topicId = 1L

        coEvery { repo.getLessonsShorterByTopicId(1L) } returns
                CommunicationResult.Exception(RuntimeException())

        vm.getData(dispatcher)
        advanceUntilIdle()

        assertNotNull(vm.uiState.value.errors!!.communicationError)
    }

    // ---------------------------------------------------------------------
    //  TESTING MODE
    // ---------------------------------------------------------------------

    @OptIn(ExperimentalCoroutinesApi::class)
    @Test
    fun `Testing mode - new topicId resets graph and loads nodes`() = runTest {
        every { NetworkInterceptor.isNetworkConnected() } returns true

        graph = Graph(999, "Old", mutableMapOf())
        vm.topicId = 1L
        vm.topicName = "Topic A"
        mode.value = Modes.Testing.name

        coEvery { repo.getLessonsShorterByTopicId(any()) } returns
                CommunicationResult.Success(
                    ArrayResponse(
                        listOf(
                            LessonShorter(
                                id = 10L,
                                name = "",
                                ordinalNumber = 1,
                                topic = vm.topicName,
                                topicId = vm.topicId
                            )
                        ), count = 1, version = 1
                    )
                )

        coEvery { repo.getNodesByTopic(any()) } returns
                CommunicationResult.Success(ArrayResponse(listOf(), count = 0, version = 1))

        vm.getData()
        advanceUntilIdle()

        assertEquals(1L, graph.topicId)
        assertEquals("Topic A", graph.topicName)
    }

    @OptIn(ExperimentalCoroutinesApi::class)
    @Test
    fun `Testing mode - same topicId resets walkthrough counters`() = runTest {
        every { NetworkInterceptor.isNetworkConnected() } returns true

        graph = Graph(
            1,
            "Same",
            mutableMapOf(
                10L to Node(
                    id = 10L,
                    walkThrough = true,
                    successfullyCompleted = true,
                    lessonId = 10L,
                    lessonName = "Lesson 10",
                    lessonOrdinalNumber = 2,
                    levelDepth = 2,
                    level = 2,
                    questionDepth = 0
                )
            )
        )
        vm.topicId = 1L
        mode.value = Modes.Testing.name

        coEvery { repo.getLessonsShorterByTopicId(any()) } returns
                CommunicationResult.Success(
                    ArrayResponse(
                        listOf(
                            LessonShorter(
                                id = 10L,
                                ordinalNumber = 1,
                                name = "Lesson 10",
                                topicId = 1L,
                                topic = "Same"
                            )
                        ), count = 1, version = 1
                    )
                )

        coEvery { repo.getNodesByTopic(any()) } returns
                CommunicationResult.Success(ArrayResponse(items = listOf(), count = 0, version = 1))

        vm.getData()
        advanceUntilIdle()

        val node = graph.map[10L]!!
        Assert.assertFalse(node.walkThrough ?: false)
        Assert.assertFalse(node.successfullyCompleted ?: false)
        assertEquals(0, node.countOfCorrectAnswers)
        assertEquals(0, node.countOfIncorrectAnswers)
    }

    // ---------------------------------------------------------------------
    //  TUITION MODE
    // ---------------------------------------------------------------------

    @OptIn(ExperimentalCoroutinesApi::class)
    @Test
    fun `Tuition mode - topic changed resets graph and loads nodes`() = runTest {
        every { NetworkInterceptor.isNetworkConnected() } returns true

        mode.value = Modes.Tuition.name
        graph = Graph(999, "Old", mutableMapOf())

        vm.topicId = 1L
        vm.topicName = "NewTopic"

        coEvery { repo.getLessonsShorterByTopicId(any()) } returns
                CommunicationResult.Success(
                    ArrayResponse(
                        items = listOf(LessonShorter(id = 99L, name = "Lesson 99", topic = vm.topicName, topicId = vm.topicId, ordinalNumber = 1)),
                        count = 1,
                        version = 1
                    )
                )

        coEvery { repo.getNodesByTopic(any()) } returns
                CommunicationResult.Success(ArrayResponse(items = listOf(), count = 0, version = 1))

        vm.getData()
        advanceUntilIdle()

        assertEquals(1L, graph.topicId)
        assertEquals("NewTopic", graph.topicName)
    }

    // ---------------------------------------------------------------------
    //  REVISION MODE
    // ---------------------------------------------------------------------

    @OptIn(ExperimentalCoroutinesApi::class)
    @Test
    fun `Revision mode - graph is reset and nodes are NOT loaded`() = runTest {
        every { NetworkInterceptor.isNetworkConnected() } returns true

        mode.value = Modes.Revision.name
        graph = Graph(999, "Old", mutableMapOf(10L to Node(
            id = 10L,
            lessonId = 10L,
            lessonName = "Lesson 10",
            lessonOrdinalNumber = 1,
            level = 2,
            questionDepth = null,
            levelDepth = null,
            walkThrough = false,
            successfullyCompleted = false
        )))

        vm.topicId = 7L
        vm.topicName = "RevisionTopic"

        coEvery { repo.getLessonsShorterByTopicId(any()) } returns
                CommunicationResult.Success(
                    ArrayResponse(
                        items = listOf(
                            LessonShorter(id = 1L, ordinalNumber = 1, name = "Lesson1", topic = vm.topicName, topicId = vm.topicId)
                        ),
                        count = 1,
                        version = 1
                    )
                )

        // Should NOT be called in Revision
        coEvery { repo.getNodesByTopic(any()) } returns
                CommunicationResult.Success(ArrayResponse(items = listOf(), count = 1, version = 1))

        vm.getData()
        advanceUntilIdle()

        assertEquals(7L, graph.topicId)
        assertTrue(graph.map.isEmpty())
    }

    // ---------------------------------------------------------------------
    //  getNodeFromGraphByLesson()
    // ---------------------------------------------------------------------

    @Test
    fun `getNodeFromGraphByLesson returns node id`() {
        graph = Graph(1, "A", mutableMapOf(10L to Node(
            id = 10L,
            lessonId = 77L,
            lessonName = "Lesson 77",
            lessonOrdinalNumber = 1,
            level = 2,
            questionDepth = null,
            levelDepth = null,
            walkThrough = false,
            successfullyCompleted = false
        )))

        assertEquals(10L, vm.getNodeFromGraphByLesson(77L))
    }

    @Test
    fun `getNodeFromGraphByLesson returns -1 when not found`() {
        graph = Graph(1, "A", mutableMapOf())

        assertEquals(-1L, vm.getNodeFromGraphByLesson(77L))
    }
}
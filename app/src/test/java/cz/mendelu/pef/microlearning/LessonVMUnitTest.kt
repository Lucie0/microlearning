package cz.mendelu.pef.microlearning

import cz.mendelu.pef.microlearning.architecture.CommunicationError
import cz.mendelu.pef.microlearning.architecture.CommunicationResult
import cz.mendelu.pef.microlearning.communication.api.IRemoteRepository
import cz.mendelu.pef.microlearning.communication.api.NetworkInterceptor
import cz.mendelu.pef.microlearning.database.IMicrolearningRepository
import cz.mendelu.pef.microlearning.model.Modes
import cz.mendelu.pef.microlearning.model.actualNodeInGraph
import cz.mendelu.pef.microlearning.model.api.Graph
import cz.mendelu.pef.microlearning.model.api.Lesson
import cz.mendelu.pef.microlearning.model.api.Node
import cz.mendelu.pef.microlearning.model.graph
import cz.mendelu.pef.microlearning.model.mode
import cz.mendelu.pef.microlearning.model.response.ObjectResponse
import cz.mendelu.pef.microlearning.ui.screens.lesson.LessonScreenVM
import io.mockk.coEvery
import io.mockk.coVerify
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
import org.junit.Before
import org.junit.Test

class LessonVMUnitTest {

    private lateinit var vm: LessonScreenVM
    private lateinit var remote: IRemoteRepository
    private lateinit var local: IMicrolearningRepository

    private val dispatcher = StandardTestDispatcher()

//    @get:Rule
//    val dispatcherRule = MainDispatcherRule()

    @OptIn(ExperimentalCoroutinesApi::class)
    @Before
    fun setup() {
        Dispatchers.setMain(dispatcher)

        remote = mockk()
        local = mockk()

        vm = LessonScreenVM(remote, local)

        // Mock global variables
        graph = Graph(
            topicId = 1L,
            topicName = "TEST",
            map = mutableMapOf()
        )
        actualNodeInGraph = 3L
        mode.value = Modes.TUITION.ordinal
    }

    // Helper to mock network
    private fun mockNetwork(connected: Boolean) {
        mockkObject(NetworkInterceptor)
        every { NetworkInterceptor.isNetworkConnected() } returns connected
    }

    // -------------------------------------------------------------------------
    // GET DATA TESTS
    // -------------------------------------------------------------------------

    @Test
    fun `getData - no network - sets error state`() = runTest {
        mockNetwork(false)

        vm.getData(dispatcher)

        Assert.assertFalse(vm.lessonsUiState.value.loading)
        assertNotNull(vm.lessonsUiState.value.errors?.communicationError)
    }

    @OptIn(ExperimentalCoroutinesApi::class)
    @Test
    fun `getData - tuition mode calls getLessonById`() = runTest {
        mockNetwork(true)

        vm.lessonId = 10L

        coEvery { remote.getLessonById(any()) } returns CommunicationResult.Success(
            ObjectResponse(
                Lesson(
                    id = 10L, name = "Lesson 10",
                    content = "Content of lesson 10", ordinalNumber = 1, topic = "topicName"
                ),
                version = 1
            )
        )

        vm.getData(dispatcher)
        advanceUntilIdle()

        assertEquals(10L, vm.lessonsUiState.value.data?.lesson?.content?.id)
    }

    @OptIn(ExperimentalCoroutinesApi::class)
    @Test
    fun `getData - revision mode calls getLessonByOrdinalNumberInTopic`() = runTest {
        mockNetwork(true)

        vm.lessonOrdinalNumber = 5
        vm.topicId = 1L

        coEvery { remote.getLessonsByTopicIdAndOrdinalNumber(any(), any()) } returns
                CommunicationResult.Success(
                    ObjectResponse(
                    Lesson(
                        id = 99L, name = "Lesson 99",
                        content = "Content of lesson 99", ordinalNumber = 1, topic = "topicName"
                    ),
                    version = 1
                )
                )

        vm.getData(dispatcher)
        advanceUntilIdle()

        assertEquals(99L, vm.lessonsUiState.value.data?.lesson?.content?.id)
    }

    // -------------------------------------------------------------------------
    // GET LESSON BY ID
    // -------------------------------------------------------------------------

    @OptIn(ExperimentalCoroutinesApi::class)
    @Test
    fun `sGetLessonById - success`() = runTest {
        mockNetwork(true)

        vm.lessonId = 7L

        coEvery { remote.getLessonById(7L) } returns CommunicationResult.Success(
            ObjectResponse(
                Lesson(
                    id = 7, name = "Lesson 7",
                    content = "Content of lesson 7", ordinalNumber = 1, topic = "topicName"
                ),
                version = 1
            )
        )

        vm.getData(dispatcher)
        advanceUntilIdle()

        assertEquals(7L, vm.lessonsUiState.value.data?.lesson?.content?.id)
    }

    @OptIn(ExperimentalCoroutinesApi::class)
    @Test
    fun `sGetLessonById - 404 error`() = runTest {
        mockNetwork(true)

        vm.lessonId = 7L

        coEvery { remote.getLessonById(any()) } returns CommunicationResult.Error(
            CommunicationError(404, "Not found")
        )

        vm.getData(dispatcher)
        advanceUntilIdle()

        assertNotNull(vm.lessonsUiState.value.errors?.communicationError)
    }

    @OptIn(ExperimentalCoroutinesApi::class)
    @Test
    fun `sGetLessonById - server error 500`() = runTest {
        mockNetwork(true)

        vm.lessonId = 7L

        coEvery { remote.getLessonById(any()) } returns CommunicationResult.Error(
            CommunicationError(500, "Server error")
        )

        vm.getData(dispatcher)
        advanceUntilIdle()

        assertNotNull(vm.lessonsUiState.value.errors?.communicationError)
    }

    @OptIn(ExperimentalCoroutinesApi::class)
    @Test
    fun `sGetLessonById - exception`() = runTest {
        mockNetwork(true)

        vm.lessonId = 7L

        coEvery { remote.getLessonById(any()) } returns
                CommunicationResult.Exception(RuntimeException())

        vm.getData(dispatcher)
        advanceUntilIdle()

        assertNotNull(vm.lessonsUiState.value.errors?.communicationError)
    }

    // -------------------------------------------------------------------------
    // GET LESSON BY ORDINAL NUMBER
    // -------------------------------------------------------------------------

    @OptIn(ExperimentalCoroutinesApi::class)
    @Test
    fun `getLessonByOrdinalNumberInTopic - success`() = runTest {
        mockNetwork(true)

        vm.lessonOrdinalNumber = 2
        vm.topicId = 1L

        coEvery { remote.getLessonsByTopicIdAndOrdinalNumber(any(), any()) } returns
                CommunicationResult.Success(
                    ObjectResponse(
                    Lesson(
                        id = 55, name = "Lesson 55",
                        content = "Content of lesson 55", ordinalNumber = 1, topic = "topicName"
                    ),
                    version = 1
                )
                )

        vm.getData(dispatcher)
        advanceUntilIdle()

        assertEquals(55L, vm.lessonsUiState.value.data?.lesson?.content?.id)
    }

    @OptIn(ExperimentalCoroutinesApi::class)
    @Test
    fun `getLessonByOrdinalNumberInTopic - no data`() = runTest {
        mockNetwork(true)

        vm.lessonOrdinalNumber = 2
        vm.topicId = 1L

        coEvery { remote.getLessonsByTopicIdAndOrdinalNumber(any(), any()) } returns
                CommunicationResult.Success(
                    ObjectResponse(
                    Lesson(
                        id = null, name = "Lesson null",
                        content = "Content of lesson null", ordinalNumber = 1, topic = "topicName"
                    ),
                    version = 1
                )
                )

        vm.getData(dispatcher)
        advanceUntilIdle()

        assertNotNull(vm.lessonsUiState.value.errors?.communicationError)
    }

    // -------------------------------------------------------------------------
    // SAVE ACTUAL STATE TO DB
    // -------------------------------------------------------------------------

    @OptIn(ExperimentalCoroutinesApi::class)
    @Test
    fun `saveActualStateToLocalDB - revision mode saves topic only`() = runTest {
        mode.value = Modes.REVISION.ordinal

        coEvery { local.insertSavedTopic(any()) } returns 100L

        vm.saveActualStateToLocalDB(5)
        advanceUntilIdle()

        coVerify { local.insertSavedTopic(match {
            it.topicId == graph.topicId &&
                    it.actualNodeId == 5L &&
                    it.modeNumber == Modes.REVISION.ordinal
        }) }
    }

    @OptIn(ExperimentalCoroutinesApi::class)
    @Test
    fun `saveActualStateToLocalDB - tuition mode saves changed nodes`() = runTest {
        mode.value = Modes.TUITION.ordinal

        // node with changes
        graph.map = mutableMapOf(
            1L to Node(
                id = 1,
                lessonId =1,
                lessonName = "Lesson 1",
                lessonOrdinalNumber = 1,
                level = 1,
                questionDepth = null,
                levelDepth = null,
                successfullyCompleted = false,
                walkThrough = true
            )
        )

        coEvery { local.insertSavedTopic(any()) } returns 200L
        coEvery { local.insertNode(any()) } returns 1L

        vm.saveActualStateToLocalDB(0)
        advanceUntilIdle()

        coVerify { local.insertSavedTopic(any()) }
        coVerify { local.insertNode(any()) }
    }

}
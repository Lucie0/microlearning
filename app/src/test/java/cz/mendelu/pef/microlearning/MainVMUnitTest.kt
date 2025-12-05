package cz.mendelu.pef.microlearning

import cz.mendelu.pef.microlearning.communication.api.IRemoteRepository
import cz.mendelu.pef.microlearning.communication.api.NetworkInterceptor
import cz.mendelu.pef.microlearning.database.IMicrolearningRepository
import cz.mendelu.pef.microlearning.ui.screens.MainScreenVM
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.setMain
import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import cz.mendelu.pef.microlearning.architecture.CommunicationError
import org.junit.Assert.*
import cz.mendelu.pef.microlearning.architecture.CommunicationResult
import cz.mendelu.pef.microlearning.model.*
import cz.mendelu.pef.microlearning.model.api.*
import cz.mendelu.pef.microlearning.model.db.SavedTopic
import cz.mendelu.pef.microlearning.model.response.ArrayResponse
import io.mockk.*
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.test.*
import org.junit.runners.JUnit4

@OptIn(ExperimentalCoroutinesApi::class)
@RunWith(JUnit4::class)
class MainScreenVMUnitTest {

    private lateinit var remoteRepository: IRemoteRepository
    private lateinit var localRepository: IMicrolearningRepository

    private lateinit var vm: MainScreenVM
    private val dispatcher = StandardTestDispatcher()

    @Before
    fun setup() {
        Dispatchers.setMain(dispatcher)
        mode.value = Modes.Tuition.name

        // MockK initializace
        MockKAnnotations.init(this, relaxed = true)

        // Mocks
        remoteRepository = mockk(relaxed = true)
        localRepository = mockk(relaxed = true)

        // mock pro NetworkInterceptor
        mockkObject(NetworkInterceptor)

        vm = MainScreenVM(remoteRepository, localRepository)
    }

    @After
    fun tearDown() {
        Dispatchers.resetMain()
        unmockkAll()
    }

    // ---------------------------------------------------------------------------------------------
    // TEST 1: NETWORK NOT CONNECTED
    // ---------------------------------------------------------------------------------------------
    @Test
    fun `when network is not connected, uiState contains network error`() = runTest {

        every { NetworkInterceptor.isNetworkConnected() } returns false

        vm.getData()
        advanceUntilIdle()

        val state = vm.mainUiState.value

        assertEquals(R.string.network_is_not_connected, state.errors?.communicationError)
        assertNull(state.data)
    }

    // ---------------------------------------------------------------------------------------------
    // TEST 2: SUCCESS + DB
    // ---------------------------------------------------------------------------------------------
    @Test
    fun `when api success and db returns data, uiState contains topics`() = runTest {

        every { NetworkInterceptor.isNetworkConnected() } returns true

        val topicsResponse = ArrayResponse(
            items = listOf(
                Topic(1, "Topic 1", null)
            ),
                count = 1,
                version = 1
        )

        coEvery { remoteRepository.getTopics() } returns CommunicationResult.Success(topicsResponse)

        val savedTopics = listOf(
            SavedTopic(
                topicId = 1,
                name = "Saved Topic 1",
                actualNodeId = 100,
                modeNumber = 0
            )
        )

        every {
            localRepository.getAllSavedTopicsByMode(any())
        } returns flowOf(savedTopics)

        vm.getData(dispatcher)
        advanceUntilIdle()

        val state = vm.mainUiState.value

        assertNotNull(state.data)
        assertNull(state.errors)
        assertEquals(1, state.data!!.topics!!.items!!.size)
        assertEquals(1, state.data!!.myTopics!!.size)
    }

    // ---------------------------------------------------------------------------------------------
    // TEST 3: SUCCESS but items = null
    // ---------------------------------------------------------------------------------------------
    @Test
    fun `when api success but items null, errors null`() = runTest {

        every { NetworkInterceptor.isNetworkConnected() } returns true

        coEvery { remoteRepository.getTopics() } returns
                CommunicationResult.Success(
                    ArrayResponse(items = null, count = 0, version = 1)
                )

        every { localRepository.getAllSavedTopicsByMode(any()) } returns flowOf(emptyList())

        vm.getData(dispatcher)
        advanceUntilIdle()

        val state = vm.mainUiState.value

        println(state.data)
        println(state.errors)
        println(state.loading)

//        assertNull(state.data)
        assertEquals(null, state.errors)
    }

    // ---------------------------------------------------------------------------------------------
    // TEST 4: ConnectionError
    // ---------------------------------------------------------------------------------------------
    @Test
    fun `when api returns ConnectionError, ui contains communication error`() = runTest {

        every { NetworkInterceptor.isNetworkConnected() } returns true

        coEvery { remoteRepository.getTopics() } returns CommunicationResult.ConnectionError()

        every { localRepository.getAllSavedTopicsByMode(any()) } returns flowOf(emptyList())

        vm.getData(dispatcher)
        advanceUntilIdle()

        val state = vm.mainUiState.value

        assertEquals(R.string.communication_error, state.errors!!.communicationError)
    }

    // ---------------------------------------------------------------------------------------------
    // TEST 5: Error 404
    // ---------------------------------------------------------------------------------------------
    @Test
    fun `when api returns error 404, ui contains not found error`() = runTest {

        every { NetworkInterceptor.isNetworkConnected() } returns true

        coEvery { remoteRepository.getTopics() } returns CommunicationResult.Error(
            CommunicationError(404, "Not Found")
        )

        every { localRepository.getAllSavedTopicsByMode(any()) } returns flowOf(emptyList())

        vm.getData(dispatcher)
        advanceUntilIdle()

        val state = vm.mainUiState.value

        assertEquals(R.string.not_found, state.errors!!.communicationError)
    }

    // ---------------------------------------------------------------------------------------------
    // TEST 6: Error 500
    // ---------------------------------------------------------------------------------------------
    @Test
    fun `when api returns error 500, ui contains unexpected error`() = runTest {

        every { NetworkInterceptor.isNetworkConnected() } returns true

        coEvery { remoteRepository.getTopics() } returns CommunicationResult.Error(
            CommunicationError(500, "Server Error")
        )

        every { localRepository.getAllSavedTopicsByMode(any()) } returns flowOf(emptyList())

        vm.getData(dispatcher)
        advanceUntilIdle()

        val state = vm.mainUiState.value

        assertEquals(R.string.some_unexpected_error, state.errors!!.communicationError)
    }

    // ---------------------------------------------------------------------------------------------
    // TEST 7: Exception
    // ---------------------------------------------------------------------------------------------
    @Test
    fun `when api returns Exception, ui contains unknown error`() = runTest {

        every { NetworkInterceptor.isNetworkConnected() } returns true

        coEvery { remoteRepository.getTopics() } returns CommunicationResult.Exception(
            RuntimeException("error")
        )

        every { localRepository.getAllSavedTopicsByMode(any()) } returns flowOf(emptyList())

        vm.getData(dispatcher)
        advanceUntilIdle()

        val state = vm.mainUiState.value

        assertEquals(R.string.unknown_error, state.errors!!.communicationError)
    }
}
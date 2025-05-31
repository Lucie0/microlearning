package cz.mendelu.pef.microlearning.ui.screens.lesson

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import cz.mendelu.pef.microlearning.R
import cz.mendelu.pef.microlearning.architecture.BaseViewModel
import cz.mendelu.pef.microlearning.architecture.CommunicationResult
import cz.mendelu.pef.microlearning.communication.api.IRemoteRepository
import cz.mendelu.pef.microlearning.communication.api.NetworkInterceptor
import cz.mendelu.pef.microlearning.database.IMicrolearningRepository
import cz.mendelu.pef.microlearning.model.Modes
import cz.mendelu.pef.microlearning.model.UiState
import cz.mendelu.pef.microlearning.model.actualNodeInGraph
import cz.mendelu.pef.microlearning.model.db.NodeDB
import cz.mendelu.pef.microlearning.model.db.SavedTopic
import cz.mendelu.pef.microlearning.model.graph
import cz.mendelu.pef.microlearning.model.mode
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

@HiltViewModel
class LessonScreenVM @Inject constructor(
    private val remoteRepository: IRemoteRepository,
    private val localRepository: IMicrolearningRepository
) : BaseViewModel() {

    // uistate
    val lessonsUiState: MutableState<UiState<LessonData, LessonsErrors>> =
        mutableStateOf(UiState())
//    val linkAfterUiState: MutableState<UiState<ObjectResponse<LinkAfter>, LessonsErrors>> =
//        mutableStateOf(UiState())

    var data = LessonData()
    var lessonId: Long? = null
    var actualNodeId: Long? = null
    var lessonOrdinalNumber: Int? = null
    var topicId: Long? = null

    var nextNodeId: Long? = null

//    init {
//        getLessonById()
//    }

    fun getData() {
        if (NetworkInterceptor.isNetworkConnected()) {
            if (lessonId != null) {
                println("GetData> Tuition + testing mode")
                // Tuition a testing mode -- kombinace lessonId a nodeId
                getLessonById()
                getNextNodeId()
            }
            if (lessonOrdinalNumber != null) {
                println("GetData> Revision mode")
                getLessonByOrdinalNumberInTopic()
                // todo kdyz je revision mode -- stahnout lekci dle kobinace ordinalNumber--topicId
            }
            println("Get data")
        } else {
            println("Network not connected")
            lessonsUiState.value = UiState(
                loading = false,
                data = null,
                errors = LessonsErrors(R.string.network_is_not_connected) // "communication error" resource code
            )
        }
    }

    private fun getLessonByOrdinalNumberInTopic() {
        launch {
            val result =
                withContext(Dispatchers.IO) {
                    remoteRepository
                        .getLessonsByTopicIdAndOrdinalNumber(
                            topicId!!,
                            lessonOrdinalNumber!!
                        )
                }
            println("***result: $result")
            when (result) {
                is CommunicationResult.ConnectionError -> {
                    lessonsUiState.value = UiState(
                        loading = false,
                        data = null,
                        errors = LessonsErrors(R.string.communication_error) // "communication error" resource code
                    )
                }

                is CommunicationResult.Error -> {
                    println(result.error)
                    when (result.error.code) {
                        500 -> {
                            lessonsUiState.value = UiState(
                                loading = false,
                                data = null,
                                errors = LessonsErrors(R.string.some_unexpected_error) // "exception" resource code
                            )
                        }

                        404 -> {
                            lessonsUiState.value = UiState(
                                loading = false,
                                data = null,
                                errors = LessonsErrors(R.string.not_found) // "not found" resource code
                            )
                        }

                        else -> {
                            lessonsUiState.value = UiState(
                                loading = false,
                                data = null,
                                errors = LessonsErrors(R.string.something_went_wrong_please_reload_screen)
                            )
                        }
                    }
                }

                is CommunicationResult.Exception -> {
                    lessonsUiState.value = UiState(
                        loading = false,
                        data = null,
                        errors = LessonsErrors(R.string.unknown_error) // "exception" resource code
                    )
                }

                is CommunicationResult.Success -> {
                    if (result.data.content.id != null) {
                        data.lesson = result.data

                        lessonsUiState.value = UiState(
                            loading = false,
                            data = data,
                            errors = null
                        )
                    } else {
                        lessonsUiState.value = UiState(
                            loading = false,
                            data = null,
                            errors = LessonsErrors(R.string.no_data) // "exception" resource code
                        )
                    }
                }
            }
        }
    }

    //  getLesson
    private fun getLessonById() {
        if (lessonId != null) {
            launch {
                sGetLessonById()
            }
        }
    }

    private suspend fun sGetLessonById() {
        val result =
            withContext(Dispatchers.IO) {
                remoteRepository.getLessonById(lessonId!!)
            }

        when (result) {
            is CommunicationResult.ConnectionError -> {
                lessonsUiState.value = UiState(
                    loading = false,
                    data = null,
                    errors = LessonsErrors(R.string.communication_error) // "communication error" resource code
                )
            }

            is CommunicationResult.Error -> {
                println(result.error)
                when (result.error.code) {
                    500 -> {
                        lessonsUiState.value = UiState(
                            loading = false,
                            data = null,
                            errors = LessonsErrors(R.string.some_unexpected_error) // "exception" resource code
                        )
                    }

                    404 -> {
                        lessonsUiState.value = UiState(
                            loading = false,
                            data = null,
                            errors = LessonsErrors(R.string.not_found) // "not found" resource code
                        )
                    }

                    else -> {
                        lessonsUiState.value = UiState(
                            loading = false,
                            data = null,
                            errors = LessonsErrors(R.string.something_went_wrong_please_reload_screen)
                        )
                    }
                }
            }

            is CommunicationResult.Exception -> {
                lessonsUiState.value = UiState(
                    loading = false,
                    data = null,
                    errors = LessonsErrors(R.string.unknown_error) // "exception" resource code
                )
            }

            is CommunicationResult.Success -> {
                if (result.data.content.id != null) {
                    data.lesson = result.data

                    lessonsUiState.value = UiState(
                        loading = false,
                        data = data,
                        errors = null
                    )
                } else {
                    lessonsUiState.value = UiState(
                        loading = false,
                        data = null,
                        errors = LessonsErrors(R.string.no_data) // "exception" resource code
                    )
                }
            }
        }
    }

    private fun getNextNodeId() {
        if (actualNodeId != null) {
            println("getnextnodeid(): actualnodeid: $actualNodeId")
            launch {
                val result = withContext(Dispatchers.IO) {
                    remoteRepository.getNodesAfter(actualNodeId!!)
                }

                when (result) {
                    is CommunicationResult.ConnectionError -> {
                        lessonsUiState.value = UiState(
                            loading = false,
                            data = null,
                            errors = LessonsErrors(R.string.communication_error) // "communication error" resource code
                        )
                    }

                    is CommunicationResult.Error -> {
                        println(result.error)
                        when (result.error.code) {
                            500 -> {
                                lessonsUiState.value = UiState(
                                    loading = false,
                                    data = null,
                                    errors = LessonsErrors(R.string.some_unexpected_error) // "exception" resource code
                                )
                            }

                            404 -> {
                                lessonsUiState.value = UiState(
                                    loading = false,
                                    data = null,
                                    errors = LessonsErrors(R.string.not_found) // "not found" resource code
                                )
                            }

                            else -> {
                                lessonsUiState.value = UiState(
                                    loading = false,
                                    data = null,
                                    errors = LessonsErrors(R.string.something_went_wrong_please_reload_screen)
                                )
                            }
                        }
                    }

                    is CommunicationResult.Exception -> {
                        lessonsUiState.value = UiState(
                            loading = false,
                            data = null,
                            errors = LessonsErrors(R.string.unknown_error) // "exception" resource code
                        )
                    }

                    is CommunicationResult.Success -> {
                        if (result.data != null) {
                            data.linkAfter = result.data
                            println("actual node Id:$actualNodeId")
                            println("count links after :" + data.linkAfter?.count)
                            if (result.data.count > 0) {
                                getNodeById(result.data.items?.get(0)?.nextNodeId!!)
                            }
//                            nextNodeId = result.data.items?.getOrNull(0)?.nextNodeId

                            lessonsUiState.value = UiState(
                                loading = false,
                                data = data,
                                errors = null
                            )
                        } else {
                            lessonsUiState.value = UiState(
                                loading = false,
                                data = null,
                                errors = LessonsErrors(R.string.no_data) // "exception" resource code
                            )
                        }
                    }
                }
            }
        }
    }

    private suspend fun getNodeById(nextNodeId: Long) {
        launch {
            val result =
                withContext(Dispatchers.IO) {
                    remoteRepository.getNodeById(nextNodeId)
                }

            when (result) {
                is CommunicationResult.ConnectionError -> {
                    lessonsUiState.value = UiState(
                        loading = false,
                        data = null,
                        errors = LessonsErrors(R.string.communication_error) // "communication error" resource code
                    )
                }

                is CommunicationResult.Error -> {
                    println(result.error)
                    when (result.error.code) {
                        500 -> {
                            lessonsUiState.value = UiState(
                                loading = false,
                                data = null,
                                errors = LessonsErrors(R.string.some_unexpected_error) // "exception" resource code
                            )
                        }

                        404 -> {
                            lessonsUiState.value = UiState(
                                loading = false,
                                data = null,
                                errors = LessonsErrors(R.string.not_found) // "not found" resource code
                            )
                        }

                        else -> {
                            lessonsUiState.value = UiState(
                                loading = false,
                                data = null,
                                errors = LessonsErrors(R.string.something_went_wrong_please_reload_screen)
                            )
                        }
                    }
                }

                is CommunicationResult.Exception -> {
                    lessonsUiState.value = UiState(
                        loading = false,
                        data = null,
                        errors = LessonsErrors(R.string.unknown_error) // "exception" resource code
                    )
                }

                is CommunicationResult.Success -> {
                    if (result.data != null) {
                        data.nextNode = result.data
                        lessonsUiState.value = UiState(
                            loading = false,
                            data = data,
                            errors = null
                        )
                    } else {
                        lessonsUiState.value = UiState(
                            loading = false,
                            data = null,
                            errors = LessonsErrors(R.string.no_data) // "exception" resource code
                        )
                    }
                }
            }
        }
    }

    fun saveActualStateToLocalDB() {
        var savedTopicId = 0L
        // projit graf
        when (mode.value) {
            Modes.REVISION.name -> {

            }
             Modes.TUITION.name -> {
                 launch {
                     graph.map.values.forEach {
                         // zjistit, jestli se nejaka hodnota lisi od defaultni (pocty spravnych/spatnych, projiti, uspesne dokonceno)
                         if (it.walkThrough != false || it.successfullyCompleted != false || it.countOfCorrectAnswers != 0 || it.countOfIncorrectAnswers != 0) {
                             // pokud se lisi
                             if (savedTopicId == 0L) {
                                 // save topic to db
                                 //      tak ulozit nejdriv polozku savedTopic do db, ziskat jeho id vytvorene DB a pote ho pouzivat na nalinkovani
                                 //          u jednotlivych uzlu -- ale pouze poprve, zjistovat, ukladat to do lokalni promenne

                                 savedTopicId = localRepository.insertSavedTopic(
                                     SavedTopic(
                                         topicId = graph.topicId,
                                         name = graph.topicName,
                                         actualNodeId = actualNodeInGraph,
                                         modeNumber = Modes.valueOf(mode.value).ordinal
                                     )
                                 )
                                 println("SavedTopicId z DB: $savedTopicId")
                             }
                             //      dale ulozit ten node s vracenym id saveTopicu, jen s id jako construktor a pak ho naplnit hodndotami pomoci metody NodeDB.fromNode
                             val nodeDb = NodeDB(-1, savedTopicId)
                             println("NodeDb po init: $nodeDb")
                             nodeDb.fromNode(it)
                             println("Filling NodeDb: $nodeDb")

                             //      nasledne ulozit do DB (nebo do nejakeho listu, ktery se pak cely posle do DB na ulozeni?)
                             localRepository.insertNode(nodeDb)

                         } else {
                             // pokud se nelisi
                             //      pokracovat dal -- nic nedelat
                             println("Node v puvodnim stavu: ${it.id}, neuklada se do DB")
                         }
                     }
                 }
             }
        }

    }
}
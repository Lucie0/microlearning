package cz.mendelu.pef.microlearning.ui.screens

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import cz.mendelu.pef.microlearning.model.Modes
import cz.mendelu.pef.microlearning.model.api.Graph
import cz.mendelu.pef.microlearning.model.graph
import cz.mendelu.pef.microlearning.model.mode
import cz.mendelu.pef.microlearning.navigation.INavigationRouter
import cz.mendelu.pef.microlearning.ui.elements.BaseScreen
import cz.mendelu.pef.microlearning.ui.elements.RadioButtonSingleSelection

@RequiresApi(Build.VERSION_CODES.P)
@Composable
fun ModesScreen(
    navigation: INavigationRouter
){
    BaseScreen(
        topBarText = "Modes",
        onBackClick = {
            graph = Graph(0, "no name", mutableMapOf())
            navigation.navigateBack()
        },
    ) {
        ModesScreenContent(
            paddingValues = it,
            navigation = navigation
        )
    }
}

@RequiresApi(Build.VERSION_CODES.P)
@Composable
fun ModesScreenContent(
    paddingValues: PaddingValues,
    navigation: INavigationRouter
){
//    val selectedOption = remember { mutableStateOf(mode.value) } // vytahnout z D, v jakem modu se nachazi, a dat to jako inicializaci

    Column {
        RadioButtonSingleSelection(
            radioOptions = Modes.values().toList().map { it.name.lowercase().replaceFirstChar { ch -> ch.uppercase() } },//"Revision", "Tuition", "Testing"),
            selectedOption = mode // todo ukladat do DB nastaveny rezim?
        )
    }

}

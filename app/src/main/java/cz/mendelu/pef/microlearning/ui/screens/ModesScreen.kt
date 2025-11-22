package cz.mendelu.pef.microlearning.ui.screens

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ListItem
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import cz.mendelu.pef.microlearning.R
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
        topBarText = stringResource(R.string.title_modes),
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

@OptIn(ExperimentalMaterial3Api::class)
@RequiresApi(Build.VERSION_CODES.P)
@Composable
fun ModesScreenContent(
    paddingValues: PaddingValues,
    navigation: INavigationRouter
){
//    val selectedOption = remember { mutableStateOf(mode.value) } // vytahnout z D, v jakem modu se nachazi, a dat to jako inicializaci

    val enabled = true
    Column(
        modifier = Modifier.padding(start=16.dp, end=16.dp)
    ){
        Modes.values().forEach {
            ListItem(
                modifier = Modifier.clickable { mode.value = it.value },
                headlineText = { Text(it.value) },
                supportingText = { Text(it.supportingText) },
                trailingContent = {
                    RadioButton(
                        enabled = enabled,
                        selected = (it.value == mode.value),
                        onClick = { mode.value = it.value }
                    )
                }
            )
        }

//        RadioButtonSingleSelection(
//            radioOptions = Modes.values().toList().map { it.name },//.lowercase().replaceFirstChar { ch -> ch.uppercase() } },//"Revision", "Tuition", "Testing"),
//            selectedOption = mode // todo ukladat do DB nastaveny rezim?
//        )
    }

}

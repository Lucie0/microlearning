package cz.mendelu.pef.microlearning.ui.screens

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ListItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.capitalize
import androidx.compose.ui.text.toLowerCase
import cz.mendelu.pef.microlearning.BuildConfig
import cz.mendelu.pef.microlearning.model.Modes
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
        onBackClick = { navigation.navigateBack() },
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
            radioOptions = Modes.values().toList().map { it.name },//"Revision", "Tuition", "Testing"),
            selectedOption = mode // todo ukladat do DB nastaveny rezim
        )
    }

}

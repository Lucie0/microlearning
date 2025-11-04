package cz.mendelu.pef.microlearning.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ListItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import cz.mendelu.pef.microlearning.BuildConfig
import cz.mendelu.pef.microlearning.model.mode
import cz.mendelu.pef.microlearning.navigation.INavigationRouter
import cz.mendelu.pef.microlearning.ui.elements.BaseScreen

@Composable
fun SettingsScreen(
    navigation: INavigationRouter
){
    BaseScreen(
        topBarText = "Settings",
        onBackClick = { navigation.navigateBack() },
    ) {
        SettingsScreenContent(
            paddingValues = it,
            navigation = navigation)
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SettingsScreenContent(
    paddingValues: PaddingValues,
    navigation: INavigationRouter
){
    Column {
        ListItem(headlineText = {Text("Version")},
            supportingText = {
                Text(BuildConfig.VERSION_NAME)
            })
        ListItem(
            headlineText = { Text("Modes") },
            supportingText = { Text(mode.value.lowercase().replaceFirstChar { it.uppercase() }) },
            modifier = Modifier.clickable { navigation.navigateToModesScreen() }
        )
    }

}

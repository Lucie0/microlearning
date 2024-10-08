package cz.mendelu.pef.microlearning

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import cz.mendelu.pef.microlearning.navigation.Destination
import cz.mendelu.pef.microlearning.navigation.NavGraph
import cz.mendelu.pef.microlearning.ui.theme.MicrolearningTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MicrolearningTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    // hlavni stranka
                    NavGraph(startDestination = Destination.MainScreen.route)
                }
            }
        }
    }
}


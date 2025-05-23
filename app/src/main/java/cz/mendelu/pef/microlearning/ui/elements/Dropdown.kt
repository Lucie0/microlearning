package cz.mendelu.pef.microlearning.ui.elements

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.toSize


@RequiresApi(Build.VERSION_CODES.P)
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Dropdown(
    options: List<String?>,
    selected: MutableState<String>,
    enabled: Boolean = true,
    onClickBefore: () -> Unit = {},
    onClickAfter: () -> Unit = {},
){
    val expanded = remember { mutableStateOf(false) }
//    var selected = remember { mutableStateOf("") }

//        .sorted() // dle abecedy
    // velikost textoveho pole, kvuli roztazeni na maximum
    var textFieldSize by remember {
        mutableStateOf(Size.Zero)
//            list.maxOf { item -> item.length * 100 })

    }
    val icon = if (expanded.value) Icons.Filled.KeyboardArrowUp else Icons.Filled.KeyboardArrowDown

    Column(modifier = Modifier.padding(16.dp)) {
//        IconButton(onClick = { expanded = !expanded }) {
//            Icon(Icons.Default.MoreVert, contentDescription = null)
//        }
        // todo v selected.value promenit vsechny html znaky na normal znaky
        OutlinedTextField(
            value = selected.value,
            onValueChange = { selected.value = it },
            readOnly = true,
//            label = { Text(text = "Label") },
            modifier = Modifier
                .fillMaxWidth()
                .onGloballyPositioned { coordinates ->
                    textFieldSize = coordinates.size.toSize()
                },
            trailingIcon = {
                Icon(
                    imageVector = icon,
                    contentDescription = null,
                    modifier = Modifier.clickable {
                        if (enabled) {
                            expanded.value = !expanded.value
                        }
                    }
                )
            })

        DropdownMenu(
            expanded = expanded.value,
            onDismissRequest = { expanded.value = false },
            modifier = Modifier.width(with(LocalDensity.current){ textFieldSize.width.toDp() })
        ) {
            options.forEach{
                DropdownMenuItem(text = { Text(it ?: "none") }, onClick = {
                    onClickBefore()
                    selected.value = it ?: "none"
                    expanded.value = !expanded.value
                    onClickAfter()
                })
            }
        }
    }
}

package cz.mendelu.pef.microlearning.ui.elements

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


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Dropdown(
    options: List<String?>
){
    var expanded by remember { mutableStateOf(false) }
    var selected by remember { mutableStateOf("") }
//    val list = listOf("whole program","alternative part","int","string","returned value","clear screen","clear input buffer")
//        .sorted() // dle abecedy
    var textFieldSize by remember {
        mutableStateOf(Size.Zero)
//            list.maxOf { item -> item.length * 100 })

    }
    val icon = if (expanded) Icons.Filled.KeyboardArrowUp else Icons.Filled.KeyboardArrowDown

    Column(modifier = Modifier.padding(16.dp)) {
//        IconButton(onClick = { expanded = !expanded }) {
//            Icon(Icons.Default.MoreVert, contentDescription = null)
//        }
        OutlinedTextField(
            value = selected,
            onValueChange = { selected = it },
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
                    modifier = Modifier.clickable { expanded = !expanded }
                )
            })

        DropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false },
            modifier = Modifier.width(with(LocalDensity.current){ textFieldSize.width.toDp() })
        ) {
            options.forEach{
                DropdownMenuItem(text = { Text(it ?: "none") }, onClick = {
                    selected = it ?: "none"
                    expanded = !expanded
                })
            }
        }
    }
}

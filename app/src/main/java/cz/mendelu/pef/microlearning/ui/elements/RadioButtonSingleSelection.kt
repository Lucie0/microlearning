package cz.mendelu.pef.microlearning.ui.elements

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.BaselineShift
import androidx.compose.ui.unit.dp

// todo nefunguje prime kliknuti na text jako oznaceni dane moznosti,
// plocha kolem ano, ale samotny text nikoliv
@RequiresApi(Build.VERSION_CODES.P)
@Composable
fun RadioButtonSingleSelection(
    modifier: Modifier = Modifier,
    radioOptions: List<String?>,
    selectedOption: MutableState<String>,
    onClickBefore: () -> Unit = {},
    onClickAfter: () -> Unit = {}
) {
//    val (selectedOption, onOptionSelected) = remember { mutableStateOf("") }
//    val selectedOption = remember { mutableStateOf("") }

    // Note that Modifier.selectableGroup() is essential to ensure correct accessibility behavior
    Column(modifier.selectableGroup()) {
        radioOptions.forEach { text ->
            Row(
                Modifier
                    .fillMaxWidth()
                    .height(56.dp)
                    .selectable(
                        selected = (text == selectedOption.value),
                        onClick = {
                            onClickBefore()
                            if (text != null) {
//                                onOptionSelected(text)
                                selectedOption.value = text
                            }
                            onClickAfter()
                        },
                        role = Role.RadioButton
                    )
                    .padding(horizontal = 16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                RadioButton(
                    selected = (text == selectedOption.value),
                    onClick = null // null recommended for accessibility with screen readers
                )
                HtmlToNormalText(
                    text = text ?: "null",
                    style = MaterialTheme.typography.bodyLarge,
                    modifier = Modifier.padding(start = 16.dp)
                )

//                HtmlText(
//                    string = text ?: "null",
//                    fontSize = MaterialTheme.typography.bodyLarge.fontSize,
//                    fontWeight = MaterialTheme.typography.bodyLarge.fontWeight ?: FontWeight.Medium,
//                    modifier = Modifier.padding(start = 16.dp),
//                    baselineShift = BaselineShift(-1f) // kvuli posunuti se na stejou uroven jako rButton
//                )
            }
        }

        // vypsani odpovedi, ciste ke kontrole
        Text(text = selectedOption.value)
    }
}
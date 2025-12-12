package cz.mendelu.pef.microlearning.ui.elements

import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import cz.mendelu.pef.microlearning.R

//@Composable
//fun Dialog(
//    openAlertDialog: MutableState<Boolean>
//) {
//    val open = openAlertDialog // = remember { mutableStateOf(false) }
//
//    when {
//        // ...
//        openAlertDialog.value -> {
//
//            AlertDialog(
//                onDismissRequest = { openAlertDialog.value = false },
//                onConfirmation = {
//                    openAlertDialog.value = false
//                    println("Confirmation registered") // Add logic here to handle confirmation.
//                },
//                dialogTitle = "Alert dialog example",
//                dialogText = "This is an example of an alert dialog with buttons.",
//                icon = Icons.Default.Info
//            )
//        }
//    }
//}

@Composable
fun AlertDialog(
    onDismissRequest: () -> Unit,
    onConfirmation: () -> Unit,
    dialogTitle: String,
    dialogText: String,
    icon: ImageVector?,
) {
    AlertDialog (
        icon = {
            if (icon != null) Icon(icon, contentDescription = "Example Icon")
        },
        title = {
            Text(text = dialogTitle)
        },
        text = {
            Text(text = dialogText)
        },
        onDismissRequest = {
            onDismissRequest()
        },
        confirmButton = {
            TextButton(
                onClick = {
                    onConfirmation()
                }
            ) {
                Text(stringResource(R.string.dialog_confirm))
            }
        },
        dismissButton = {
            TextButton(
                onClick = {
                    onDismissRequest()
                }
            ) {
                Text(stringResource(R.string.dialog_dismiss))
            }
        }
    )
}

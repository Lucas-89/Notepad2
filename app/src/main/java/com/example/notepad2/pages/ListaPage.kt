package com.example.notepad2.pages

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.notepad2.ui.theme.Notepad2Theme

@Composable
fun ListaPage(
    modifier: Modifier = Modifier,
    onNotaSelected : () -> Unit,
    notas : List<String>
) {
    Button(
        onClick = {
        onNotaSelected()
        }
    ) {
        Text(
            text = "Ir al detalle",
            modifier = modifier
        )
    }

}

@Preview(showBackground = true)
@Composable
fun ListaPagePreview() {
    val notas = remember { mutableStateListOf<String>() }
    
    Notepad2Theme {
        ListaPage(
            onNotaSelected = {},
            notas = notas
        )
    }
}
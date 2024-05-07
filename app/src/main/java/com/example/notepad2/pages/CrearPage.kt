package com.example.notepad2.pages

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.notepad2.ui.theme.Notepad2Theme

@Composable
fun CrearPage( modifier: Modifier = Modifier) {
    Text(
        text = "Crear Page",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun CrearPagePreview() {
    Notepad2Theme {
        CrearPage()
    }
}
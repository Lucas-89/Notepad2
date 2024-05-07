package com.example.notepad2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.notepad2.pages.MainPage
import com.example.notepad2.ui.theme.Notepad2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // enableEdgeToEdge()
        setContent {
            Notepad2Theme {
//                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    MainPage(
//                        modifier = Modifier.padding(innerPadding)
//                    )
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainPage()
                }
                }

            }
        }
    }





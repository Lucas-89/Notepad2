package com.example.notepad2.pages

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.notepad2.ui.theme.Notepad2Theme

@Composable
fun MainPage( modifier: Modifier = Modifier) {
    val navHostController = rememberNavController()
    //creo un objeto para la lista de notas
    val notas = remember { mutableStateListOf<String>() }

    Scaffold (
        modifier = modifier,
        topBar = { MainTopAppBar() }
    ){
        MainNavHost(
            modifier= Modifier.padding(it),
            navHostController = navHostController,
            notas = notas
        )
    }
}

@Composable
fun MainNavHost(
    modifier: Modifier = Modifier,
    navHostController: NavHostController,
    notas : List<String>
){
    NavHost(
        modifier = modifier,
        navController = navHostController,
        startDestination = "lista"
    ) {
        composable("lista"){
            ListaPage(
                notas = notas,
                onNotaSelected = {navHostController.navigate("detalle")}
            )
        }
        composable("detalle"){ DetallePage()}
        composable("crear"){ CrearPage()}
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainTopAppBar(){
    TopAppBar(
        title = {
            Text(text = "Notepad")
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer,
            titleContentColor = MaterialTheme.colorScheme.primary
        )
    )
}

@Preview(showBackground = true)
@Composable
fun MainPagePreview() {
    Notepad2Theme {
        MainPage()
    }
}
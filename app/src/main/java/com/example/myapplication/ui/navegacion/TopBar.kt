package com.example.myapplication.ui.navegacion

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.myapplication.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar(
    navController: NavHostController
) {

    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    TopAppBar(
        title = {
            Column() {
                Text( text =
                    when (currentRoute) {
                        Rutas.HOME -> "¡Hola, [usuario]!"
                        Rutas.MICOLECCION -> "Mi colección"
                        Rutas.PERFIL -> "Perfil"
                        Rutas.DETALLE -> "Detalle"
                        else -> ""
                    },
                    style = MaterialTheme.typography.headlineMedium
                )

                if(currentRoute == Rutas.HOME) {
                    Spacer(modifier = Modifier.height(5.dp))
                    Text( text = "Tu colección, en buenas manos.",
                        style = MaterialTheme.typography.bodyLarge)
                }
            }

        },
        navigationIcon = {
            if(currentRoute != Rutas.HOME) {
                IconButton(onClick = { navController.navigate(Rutas.HOME) }) {
                    Icon(painter = painterResource(R.drawable.arrow_back), contentDescription = "Volver")
                }
            }
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer,
            titleContentColor = MaterialTheme.colorScheme.onPrimaryContainer
        )
    )
}
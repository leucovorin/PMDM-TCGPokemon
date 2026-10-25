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
import com.example.myapplication.VariablesGlobales.nombreUsuario

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
                    when {
                        currentRoute == Rutas.HOME ->
                            "¡Hola, $nombreUsuario!"
                        currentRoute == Rutas.MICOLECCION ->
                            "Mi colección"
                        currentRoute == Rutas.PERFIL ->
                            "Perfil"
                        currentRoute == Rutas.DETALLE ->
                            "Detalle"
                        currentRoute?.startsWith(Rutas.COLECCIONES) == true ->
                            "Sets"
                        currentRoute == Rutas.COLECCION ->
                            "Sets"
                        else -> ""
                    },
                    style = MaterialTheme.typography.headlineMedium
                )

                if(currentRoute == Rutas.HOME) {
                    Spacer(modifier = Modifier.height(6.dp))
                    Text( text = "Tu colección, en buenas manos.",
                        style = MaterialTheme.typography.bodyLarge)
                    Spacer(modifier = Modifier.height(12.dp))
                }
            }

        },
        navigationIcon = {
            if(currentRoute != Rutas.HOME) {
                IconButton(onClick = { navController.popBackStack() }) {
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
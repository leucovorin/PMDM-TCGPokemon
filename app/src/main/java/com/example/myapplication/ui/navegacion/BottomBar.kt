package com.example.myapplication.ui.navegacion

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.myapplication.R

@Composable
public fun BottomBar(
    navController: NavHostController
) {
    NavigationBar() {

        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route

        NavigationBarItem(
            selected = currentRoute == Rutas.HOME,
            onClick = { navController.navigate(Rutas.HOME) },
            icon = { Icon(painter = painterResource(R.drawable.home), contentDescription = "Home") },
            label = { Text("Home") }
        )

        NavigationBarItem(
            selected = currentRoute == Rutas.COLECCIONES,
            onClick = { navController.navigate(Rutas.COLECCIONES) },
            icon = { Icon(painter = painterResource(R.drawable.home), contentDescription = "Colecciones") },
            label = { Text("Colecciones") }
        )

        NavigationBarItem(
            selected = currentRoute == Rutas.PERFIL,
            onClick = { navController.navigate(Rutas.PERFIL) },
            icon = { Icon(painter = painterResource(R.drawable.home), contentDescription = "Perfil") },
            label = { Text("Perfil") }
        )


    }
}
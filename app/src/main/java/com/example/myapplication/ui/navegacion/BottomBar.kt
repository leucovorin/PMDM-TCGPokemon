package com.example.myapplication.ui.navegacion

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.myapplication.R

@Composable
fun BottomBar(
    navController: NavHostController
) {
    NavigationBar(
        modifier = Modifier.height(115.dp)
    ) {

        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route

        NavigationBarItem(
            selected = currentRoute == Rutas.HOME,
            onClick = { navController.navigate(Rutas.HOME) },
            icon = { Icon(painter = painterResource(R.drawable.home), modifier = Modifier.size(34.dp) ,contentDescription = "Home") },
            label = { Text("Home") }
        )

        NavigationBarItem(
            selected = currentRoute == Rutas.COLECCIONES,
            onClick = { navController.navigate(Rutas.COLECCIONES) },
            icon = { Icon(painter = painterResource(R.drawable.home), modifier = Modifier.size(34.dp) ,contentDescription = "Colecciones") },
            label = { Text("Colecciones") }
        )

        NavigationBarItem(
            selected = currentRoute == Rutas.PERFIL,
            onClick = { navController.navigate(Rutas.PERFIL) },
            icon = { Icon(painter = painterResource(R.drawable.home), modifier = Modifier.size(34.dp) ,contentDescription = "Perfil") },
            label = { Text("Perfil") }
        )


    }
}
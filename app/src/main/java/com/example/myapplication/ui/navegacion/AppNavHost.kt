package com.example.myapplication.ui.navegacion

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import com.example.myapplication.model.Carta
import com.example.myapplication.model.Rareza
import com.example.myapplication.ui.screen.HomeScreen
import com.example.myapplication.R

object Rutas {
    const val HOME = "home"
    const val COLECCIONES = "colecciones"
    const val PERFIL = "perfil"
    const val DETALLE = "detalle/{cartaId}"

    fun detalleConId(cartaId: Long) = "detalle/$cartaId"
}

@Composable
fun AppNavHost (
    navController: NavHostController,
    modifier: Modifier
) {

    val listaCartas = listOf(
        Carta(
            nombre = "Alakazam",
            rareza = Rareza.RH,
            precio = 0.20f,
            numero = "1/102",
            ilustrador = "Ken Sugimori",
            coleccion = 1,
            imagen = R.drawable.imagen1
        ),

        Carta(
            nombre = "Blastoise",
            rareza = Rareza.RH,
            precio = 8.75f,
            numero = "2/102",
            ilustrador = "Ken Sugimori",
            coleccion = 1,
            imagen = R.drawable.imagen3
        ),
        Carta(
            nombre = "Chansey",
            rareza = Rareza.RH,
            precio = 85.00f,
            numero = "3/102",
            ilustrador = "Ken Sugimori",
            coleccion = 1,
            imagen = R.drawable.imagen5
        ),
        Carta(
            nombre = "Charizard",
            rareza = Rareza.RH,
            precio = 12.50f,
            numero = "4/102",
            ilustrador = "Mitsuhiro Arita",
            coleccion = 1,
            imagen = R.drawable.imagen2
        ),
        Carta(
            nombre = "Clefairy",
            rareza = Rareza.RH,
            precio = 85.00f,
            numero = "5/102",
            ilustrador = "Ken Sugimori",
            coleccion = 1,
            imagen = R.drawable.imagen6
        )
    )

    NavHost(
        navController = navController,
        startDestination = Rutas.HOME,
        modifier = modifier
    ) {
        composable(Rutas.HOME) {
            HomeScreen(
                modifier = Modifier,
                cartas = listaCartas,
                onCartaClick = { navController.navigate(Rutas.detalleConId(it))}
            )
        }
    }
}

fun buscarCarta(id: Long) : Carta {
    val listaCartas = listOf(
        Carta(
            nombre = "Alakazam",
            rareza = Rareza.RH,
            precio = 0.20f,
            numero = "1/102",
            ilustrador = "Ken Sugimori",
            coleccion = 1,
            imagen = R.drawable.imagen1
        ),

        Carta(
            nombre = "Blastoise",
            rareza = Rareza.RH,
            precio = 8.75f,
            numero = "2/102",
            ilustrador = "Ken Sugimori",
            coleccion = 1,
            imagen = R.drawable.imagen3
        ),
        Carta(
            nombre = "Chansey",
            rareza = Rareza.RH,
            precio = 85.00f,
            numero = "3/102",
            ilustrador = "Ken Sugimori",
            coleccion = 1,
            imagen = R.drawable.imagen5
        ),
        Carta(
            nombre = "Charizard",
            rareza = Rareza.RH,
            precio = 12.50f,
            numero = "4/102",
            ilustrador = "Mitsuhiro Arita",
            coleccion = 1,
            imagen = R.drawable.imagen2
        ),
        Carta(
            nombre = "Clefairy",
            rareza = Rareza.RH,
            precio = 85.00f,
            numero = "5/102",
            ilustrador = "Ken Sugimori",
            coleccion = 1,
            imagen = R.drawable.imagen6
        )
    )

    return listaCartas.find { it.imagen == imagen }!!
}
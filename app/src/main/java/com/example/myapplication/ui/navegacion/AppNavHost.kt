package com.example.myapplication.ui.navegacion

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.toLong
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.NavHostController
import com.example.myapplication.model.Carta
import com.example.myapplication.model.Rareza
import com.example.myapplication.ui.screen.HomeScreen
import com.example.myapplication.R
import androidx.navigation.compose.composable
import coil.compose.AsyncImage
import com.example.myapplication.model.Coleccion
import com.example.myapplication.model.listaColecciones
import com.example.myapplication.ui.screen.ColeccionScreen
import com.example.myapplication.ui.screen.DetalleScreen
import com.example.myapplication.ui.screen.ListaCartasScreen
import com.example.myapplication.ui.screen.ListaColeccionesScreen
import com.example.myapplication.ui.screen.MiColeccion
import com.example.myapplication.ui.screen.PerfilScreen

object Rutas {
    const val HOME = "home"
    const val MICOLECCION = "micoleccion"
    const val PERFIL = "perfil"

    const val COLECCIONES = "colecciones"
    const val DETALLE = "detalle/{cartaId}"

    const val COLECCION = "coleccion/{coleccionId}"

    fun detalleConIdCarta(cartaId: Long) = "detalle/$cartaId"
    fun detalleConIdColeccion(coleccionId: Long) = "coleccion/$coleccionId"
}

@Composable
fun AppNavHost (
    navController: NavHostController,
    modifier: Modifier
) {

    val misCartas = remember {
        mutableStateListOf<Carta>()
    }

    val listaCartas = listOf(
        Carta(
            id = 1L,
            nombre = "Alakazam",
            rareza = Rareza.RH,
            precio = 0.20f,
            numero = "1/102",
            ilustrador = "Ken Sugimori",
            coleccion = listaColecciones.first { it.id == 1L },
            imagen = "file:///android_asset/base_set/imagen1.jpg"
        ),
        Carta(
            id = 2L,
            nombre = "Blastoise",
            rareza = Rareza.RH,
            precio = 8.75f,
            numero = "2/102",
            ilustrador = "Ken Sugimori",
            coleccion = listaColecciones.first { it.id == 1L },
            imagen = "file:///android_asset/base_set/imagen3.jpg"
        ),
        Carta(
            id = 3L,
            nombre = "Chansey",
            rareza = Rareza.RH,
            precio = 85.00f,
            numero = "3/102",
            ilustrador = "Ken Sugimori",
            coleccion = listaColecciones.first { it.id == 1L },
            imagen = "file:///android_asset/base_set/imagen5.jpg"
        ),
        Carta(
            id = 4L,
            nombre = "Charizard",
            rareza = Rareza.RH,
            precio = 12.50f,
            numero = "4/102",
            ilustrador = "Mitsuhiro Arita",
            coleccion = listaColecciones.first { it.id == 1L },
            imagen = "file:///android_asset/base_set/imagen2.jpg"
        ),
        Carta(
            id = 5L,
            nombre = "Clefairy",
            rareza = Rareza.RH,
            precio = 85.00f,
            numero = "5/102",
            ilustrador = "Ken Sugimori",
            coleccion = listaColecciones.first { it.id == 1L },
            imagen = "file:///android_asset/base_set/imagen6.jpg"
        ),
        Carta(
            id = 6L,
            nombre = "Gyarados",
            rareza = Rareza.RH,
            precio = 85.00f,
            numero = "6/102",
            ilustrador = "Mitsuhiro Arita",
            coleccion = listaColecciones.first { it.id == 1L },
            imagen = "file:///android_asset/base_set/imagen7.jpg"
        ),
        Carta(
            id = 7L,
            nombre = "Hitmonchan",
            rareza = Rareza.RH,
            precio = 85.00f,
            numero = "7/102",
            ilustrador = "Ken Sugimori",
            coleccion = listaColecciones.first { it.id == 1L },
            imagen = "file:///android_asset/base_set/imagen8.jpg"
        ),
        Carta(
            id = 8L,
            nombre = "Machamp",
            rareza = Rareza.RH,
            precio = 85.00f,
            numero = "8/102",
            ilustrador = "Ken Sugimori",
            coleccion = listaColecciones.first { it.id == 1L },
            imagen = "file:///android_asset/base_set/imagen9.jpg"
        ),
        Carta(
            id = 9L,
            nombre = "Magneton",
            rareza = Rareza.RH,
            precio = 85.00f,
            numero = "9/102",
            ilustrador = "Ken Sugimori",
            coleccion = listaColecciones.first { it.id == 1L },
            imagen = "file:///android_asset/base_set/imagen10.jpg"
        ),
        Carta(
            id = 10L,
            nombre = "Mewtwo",
            rareza = Rareza.RH,
            precio = 85.00f,
            numero = "10/102",
            ilustrador = "Ken Sugimori",
            coleccion = listaColecciones.first { it.id == 1L },
            imagen = "file:///android_asset/base_set/imagen11.jpg"
        ),
        Carta(
            id = 11L,
            nombre = "Nidoking",
            rareza = Rareza.RH,
            precio = 85.00f,
            numero = "11/102",
            ilustrador = "Ken Sugimori",
            coleccion = listaColecciones.first { it.id == 1L },
            imagen = "file:///android_asset/base_set/imagen12.jpg"
        ),
        Carta(
            id = 12L,
            nombre = "Ninetales",
            rareza = Rareza.RH,
            precio = 85.00f,
            numero = "12/102",
            ilustrador = "Ken Sugimori",
            coleccion = listaColecciones.first { it.id == 1L },
            imagen = "file:///android_asset/base_set/imagen13.jpg"
        ),
        Carta(
            id = 13L,
            nombre = "Poliwrath",
            rareza = Rareza.RH,
            precio = 85.00f,
            numero = "13/102",
            ilustrador = "Ken Sugimori",
            coleccion = listaColecciones.first { it.id == 1L },
            imagen = "file:///android_asset/base_set/imagen14.jpg"
        ),
        Carta(
            id = 14L,
            nombre = "Raichu",
            rareza = Rareza.RH,
            precio = 85.00f,
            numero = "14/102",
            ilustrador = "Ken Sugimori",
            coleccion = listaColecciones.first { it.id == 1L },
            imagen = "file:///android_asset/base_set/imagen15.jpg"
        ),
        Carta(
            id = 15L,
            nombre = "Venusaur",
            rareza = Rareza.RH,
            precio = 85.00f,
            numero = "15/102",
            ilustrador = "Ken Sugimori",
            coleccion = listaColecciones.first { it.id == 1L },
            imagen = "file:///android_asset/base_set/imagen16.jpg"
        ),
        Carta(
            id = 16L,
            nombre = "Zapdos",
            rareza = Rareza.RH,
            precio = 85.00f,
            numero = "16/102",
            ilustrador = "Ken Sugimori",
            coleccion = listaColecciones.first { it.id == 1L },
            imagen = "file:///android_asset/base_set/imagen17.jpg"
        ),
        Carta(
            id = 17L,
            nombre = "Beedrill",
            rareza = Rareza.R,
            precio = 85.00f,
            numero = "17/102",
            ilustrador = "Ken Sugimori",
            coleccion = listaColecciones.first { it.id == 1L },
            imagen = "file:///android_asset/base_set/imagen18.jpg"
        ),
        Carta(
            id = 18L,
            nombre = "Dragonair",
            rareza = Rareza.R,
            precio = 85.00f,
            numero = "18/102",
            ilustrador = "Ken Sugimori",
            coleccion = listaColecciones.first { it.id == 1L },
            imagen = "file:///android_asset/base_set/imagen19.jpg"
        ),
        Carta(
            id = 19L,
            nombre = "Dugtrio",
            rareza = Rareza.R,
            precio = 85.00f,
            numero = "19/102",
            ilustrador = "Ken Sugimori",
            coleccion = listaColecciones.first { it.id == 1L },
            imagen = "file:///android_asset/base_set/imagen20.jpg"
        ),
        Carta(
            id = 20L,
            nombre = "Electabuzz",
            rareza = Rareza.R,
            precio = 85.00f,
            numero = "20/102",
            ilustrador = "Ken Sugimori",
            coleccion = listaColecciones.first { it.id == 1L },
            imagen = "file:///android_asset/base_set/imagen21.jpg"
        ),
        Carta(
            id = 21L,
            nombre = "Electrode",
            rareza = Rareza.R,
            precio = 85.00f,
            numero = "21/102",
            ilustrador = "Ken Sugimori",
            coleccion = listaColecciones.first { it.id == 1L },
            imagen = "file:///android_asset/base_set/imagen22.jpg"
        ),
        Carta(
            id = 22L,
            nombre = "Pidgeotto",
            rareza = Rareza.R,
            precio = 85.00f,
            numero = "22/102",
            ilustrador = "Ken Sugimori",
            coleccion = listaColecciones.first { it.id == 1L },
            imagen = "file:///android_asset/base_set/imagen23.jpg"
        ),
        Carta(
            id = 23L,
            nombre = "Arcanine",
            rareza = Rareza.U,
            precio = 85.00f,
            numero = "23/102",
            ilustrador = "Ken Sugimori",
            coleccion = listaColecciones.first { it.id == 1L },
            imagen = "file:///android_asset/base_set/imagen24.jpg"
        ),
        Carta(
            id = 24L,
            nombre = "Charmeleon",
            rareza = Rareza.U,
            precio = 85.00f,
            numero = "24/102",
            ilustrador = "Ken Sugimori",
            coleccion = listaColecciones.first { it.id == 1L },
            imagen = "file:///android_asset/base_set/imagen25.jpg"
        ),
        Carta(
            id = 25L,
            nombre = "Dewgong",
            rareza = Rareza.U,
            precio = 85.00f,
            numero = "25/102",
            ilustrador = "Ken Sugimori",
            coleccion = listaColecciones.first { it.id == 1L },
            imagen = "file:///android_asset/base_set/imagen26.jpg"
        ),
        Carta(
            id = 26L,
            nombre = "Dratini",
            rareza = Rareza.U,
            precio = 85.00f,
            numero = "26/102",
            ilustrador = "Ken Sugimori",
            coleccion = listaColecciones.first { it.id == 1L },
            imagen = "file:///android_asset/base_set/imagen27.jpg"
        ),
        Carta(
            id = 27L,
            nombre = "Farfetch'd",
            rareza = Rareza.U,
            precio = 85.00f,
            numero = "27/102",
            ilustrador = "Ken Sugimori",
            coleccion = listaColecciones.first { it.id == 1L },
            imagen = "file:///android_asset/base_set/imagen28.jpg"
        ),
        Carta(
            id = 28L,
            nombre = "Growlithe",
            rareza = Rareza.U,
            precio = 85.00f,
            numero = "28/102",
            ilustrador = "Ken Sugimori",
            coleccion = listaColecciones.first { it.id == 1L },
            imagen = "file:///android_asset/base_set/imagen29.jpg"
        ),
        Carta(
            id = 29L,
            nombre = "Haunter",
            rareza = Rareza.U,
            precio = 85.00f,
            numero = "29/102",
            ilustrador = "Ken Sugimori",
            coleccion = listaColecciones.first { it.id == 1L },
            imagen = "file:///android_asset/base_set/imagen30.jpg"
        ),
        Carta(
            id = 30L,
            nombre = "Ivysaur",
            rareza = Rareza.U,
            precio = 85.00f,
            numero = "30/102",
            ilustrador = "Ken Sugimori",
            coleccion = listaColecciones.first { it.id == 1L },
            imagen = "file:///android_asset/base_set/imagen31.jpg"
        ),
        Carta(
            id = 31L,
            nombre = "Jynx",
            rareza = Rareza.U,
            precio = 85.00f,
            numero = "31/102",
            ilustrador = "Ken Sugimori",
            coleccion = listaColecciones.first { it.id == 1L },
            imagen = "file:///android_asset/base_set/imagen32.jpg"
        ),
        Carta(
            id = 32L,
            nombre = "Kadabra",
            rareza = Rareza.U,
            precio = 85.00f,
            numero = "32/102",
            ilustrador = "Ken Sugimori",
            coleccion = listaColecciones.first { it.id == 1L },
            imagen = "file:///android_asset/base_set/imagen33.jpg"
        ),
        Carta(
            id = 33L,
            nombre = "Kakuna",
            rareza = Rareza.U,
            precio = 85.00f,
            numero = "33/102",
            ilustrador = "Ken Sugimori",
            coleccion = listaColecciones.first { it.id == 1L },
            imagen = "file:///android_asset/base_set/imagen34.jpg"
        ),
        Carta(
            id = 34L,
            nombre = "Machoke",
            rareza = Rareza.U,
            precio = 85.00f,
            numero = "34/102",
            ilustrador = "Ken Sugimori",
            coleccion = listaColecciones.first { it.id == 1L },
            imagen = "file:///android_asset/base_set/imagen35.jpg"
        ),
        Carta(
            id = 35L,
            nombre = "Magikarp",
            rareza = Rareza.U,
            precio = 85.00f,
            numero = "35/102",
            ilustrador = "Ken Sugimori",
            coleccion = listaColecciones.first { it.id == 1L },
            imagen = "file:///android_asset/base_set/imagen36.jpg"
        ),
        Carta(
            id = 36L,
            nombre = "Magmar",
            rareza = Rareza.U,
            precio = 85.00f,
            numero = "36/102",
            ilustrador = "Ken Sugimori",
            coleccion = listaColecciones.first { it.id == 1L },
            imagen = "file:///android_asset/base_set/imagen37.jpg"
        ),
        Carta(
            id = 37L,
            nombre = "Nidorino",
            rareza = Rareza.U,
            precio = 85.00f,
            numero = "37/102",
            ilustrador = "Ken Sugimori",
            coleccion = listaColecciones.first { it.id == 1L },
            imagen = "file:///android_asset/base_set/imagen38.jpg"
        ),
        Carta(
            id = 38L,
            nombre = "Poliwhirl",
            rareza = Rareza.U,
            precio = 85.00f,
            numero = "38/102",
            ilustrador = "Ken Sugimori",
            coleccion = listaColecciones.first { it.id == 1L },
            imagen = "file:///android_asset/base_set/imagen39.jpg"
        ),
        Carta(
            id = 39L,
            nombre = "Porygon",
            rareza = Rareza.U,
            precio = 85.00f,
            numero = "39/102",
            ilustrador = "Ken Sugimori",
            coleccion = listaColecciones.first { it.id == 1L },
            imagen = "file:///android_asset/base_set/imagen40.jpg"
        ),
        Carta(
            id = 40L,
            nombre = "Raticate",
            rareza = Rareza.U,
            precio = 85.00f,
            numero = "40/102",
            ilustrador = "Ken Sugimori",
            coleccion = listaColecciones.first { it.id == 1L },
            imagen = "file:///android_asset/base_set/imagen41.jpg"
        ),
        Carta(
            id = 41L,
            nombre = "Seel",
            rareza = Rareza.U,
            precio = 85.00f,
            numero = "41/102",
            ilustrador = "Ken Sugimori",
            coleccion = listaColecciones.first { it.id == 1L },
            imagen = "file:///android_asset/base_set/imagen42.jpg"
        ),
        Carta(
            id = 42L,
            nombre = "Wartortle",
            rareza = Rareza.U,
            precio = 85.00f,
            numero = "42/102",
            ilustrador = "Ken Sugimori",
            coleccion = listaColecciones.first { it.id == 1L },
            imagen = "file:///android_asset/base_set/imagen43.jpg"
        ),
        Carta(
            id = 43L,
            nombre = "Abra",
            rareza = Rareza.C,
            precio = 85.00f,
            numero = "43/102",
            ilustrador = "Ken Sugimori",
            coleccion = listaColecciones.first { it.id == 1L },
            imagen = "file:///android_asset/base_set/imagen44.jpg"
        ),
        Carta(
            id = 44L,
            nombre = "Bulbasaur",
            rareza = Rareza.C,
            precio = 85.00f,
            numero = "44/102",
            ilustrador = "Ken Sugimori",
            coleccion = listaColecciones.first { it.id == 1L },
            imagen = "file:///android_asset/base_set/imagen45.jpg"
        ),
        Carta(
            id = 45L,
            nombre = "Caterpie",
            rareza = Rareza.C,
            precio = 85.00f,
            numero = "45/102",
            ilustrador = "Ken Sugimori",
            coleccion = listaColecciones.first { it.id == 1L },
            imagen = "file:///android_asset/base_set/imagen46.jpg"
        ),
        Carta(
            id = 46L,
            nombre = "Charmander",
            rareza = Rareza.C,
            precio = 85.00f,
            numero = "46/102",
            ilustrador = "Ken Sugimori",
            coleccion = listaColecciones.first { it.id == 1L },
            imagen = "file:///android_asset/base_set/imagen47.jpg"
        ),
        Carta(
            id = 47L,
            nombre = "Diglett",
            rareza = Rareza.C,
            precio = 85.00f,
            numero = "47/102",
            ilustrador = "Ken Sugimori",
            coleccion = listaColecciones.first { it.id == 1L },
            imagen = "file:///android_asset/base_set/imagen48.jpg"
        ),
        Carta(
            id = 48L,
            nombre = "Doduo",
            rareza = Rareza.C,
            precio = 85.00f,
            numero = "48/102",
            ilustrador = "Ken Sugimori",
            coleccion = listaColecciones.first { it.id == 1L },
            imagen = "file:///android_asset/base_set/imagen49.jpg"
        ),
        Carta(
            id = 49L,
            nombre = "Drowzee",
            rareza = Rareza.C,
            precio = 85.00f,
            numero = "49/102",
            ilustrador = "Ken Sugimori",
            coleccion = listaColecciones.first { it.id == 1L },
            imagen = "file:///android_asset/base_set/imagen50.jpg"
        ),
        Carta(
            id = 50L,
            nombre = "Gastly",
            rareza = Rareza.C,
            precio = 85.00f,
            numero = "50/102",
            ilustrador = "Ken Sugimori",
            coleccion = listaColecciones.first { it.id == 1L },
            imagen = "file:///android_asset/base_set/imagen51.jpg"
        ),
        Carta(
            id = 51L,
            nombre = "Koffing",
            rareza = Rareza.C,
            precio = 85.00f,
            numero = "51/102",
            ilustrador = "Ken Sugimori",
            coleccion = listaColecciones.first { it.id == 1L },
            imagen = "file:///android_asset/base_set/imagen52.jpg"
        ),
        Carta(
            id = 52L,
            nombre = "Machop",
            rareza = Rareza.C,
            precio = 85.00f,
            numero = "52/102",
            ilustrador = "Ken Sugimori",
            coleccion = listaColecciones.first { it.id == 1L },
            imagen = "file:///android_asset/base_set/imagen53.jpg"
        ),
        Carta(
            id = 53L,
            nombre = "Magnemite",
            rareza = Rareza.C,
            precio = 85.00f,
            numero = "53/102",
            ilustrador = "Ken Sugimori",
            coleccion = listaColecciones.first { it.id == 1L },
            imagen = "file:///android_asset/base_set/imagen54.jpg"
        ),
        Carta(
            id = 54L,
            nombre = "Metapod",
            rareza = Rareza.C,
            precio = 85.00f,
            numero = "54/102",
            ilustrador = "Ken Sugimori",
            coleccion = listaColecciones.first { it.id == 1L },
            imagen = "file:///android_asset/base_set/imagen55.jpg"
        ),
        Carta(
            id = 55L,
            nombre = "Nidoranm",
            rareza = Rareza.C,
            precio = 85.00f,
            numero = "55/102",
            ilustrador = "Ken Sugimori",
            coleccion = listaColecciones.first { it.id == 1L },
            imagen = "file:///android_asset/base_set/imagen56.jpg"
        ),
        Carta(
            id = 56L,
            nombre = "Onix",
            rareza = Rareza.C,
            precio = 85.00f,
            numero = "56/102",
            ilustrador = "Ken Sugimori",
            coleccion = listaColecciones.first { it.id == 1L },
            imagen = "file:///android_asset/base_set/imagen57.jpg"
        ),
        Carta(
            id = 57L,
            nombre = "Pidgey",
            rareza = Rareza.C,
            precio = 85.00f,
            numero = "57/102",
            ilustrador = "Ken Sugimori",
            coleccion = listaColecciones.first { it.id == 1L },
            imagen = "file:///android_asset/base_set/imagen58.jpg"
        ),
        Carta(
            id = 58L,
            nombre = "Yellow Cheeks Pikachu",
            rareza = Rareza.C,
            precio = 85.00f,
            numero = "58/102",
            ilustrador = "Ken Sugimori",
            coleccion = listaColecciones.first { it.id == 1L },
            imagen = "file:///android_asset/base_set/imagen59.jpg"
        ),
        Carta(
            id = 59L,
            nombre = "Red Cheeks Pikachu",
            rareza = Rareza.C,
            precio = 85.00f,
            numero = "58/102",
            ilustrador = "Mitsuhiro Arita",
            coleccion = listaColecciones.first { it.id == 1L },
            imagen = "file:///android_asset/base_set/imagen4.jpg"
        ),
        Carta(
            id = 60L,
            nombre = "Poliwag",
            rareza = Rareza.C,
            precio = 85.00f,
            numero = "59/102",
            ilustrador = "Ken Sugimori",
            coleccion = listaColecciones.first { it.id == 1L },
            imagen = "file:///android_asset/base_set/imagen60.jpg"
        ),
        Carta(
            id = 61L,
            nombre = "Ponyta",
            rareza = Rareza.C,
            precio = 85.00f,
            numero = "60/102",
            ilustrador = "Ken Sugimori",
            coleccion = listaColecciones.first { it.id == 1L },
            imagen = "file:///android_asset/base_set/imagen61.jpg"
        ),
        Carta(
            id = 62L,
            nombre = "Rattata",
            rareza = Rareza.C,
            precio = 85.00f,
            numero = "61/102",
            ilustrador = "Ken Sugimori",
            coleccion = listaColecciones.first { it.id == 1L },
            imagen = "file:///android_asset/base_set/imagen62.jpg"
        ),
        Carta(
            id = 63L,
            nombre = "Sandshrew",
            rareza = Rareza.C,
            precio = 85.00f,
            numero = "62/102",
            ilustrador = "Ken Sugimori",
            coleccion = listaColecciones.first { it.id == 1L },
            imagen = "file:///android_asset/base_set/imagen63.jpg"
        ),
        Carta(
            id = 64L,
            nombre = "Squirtle",
            rareza = Rareza.C,
            precio = 85.00f,
            numero = "63/102",
            ilustrador = "Ken Sugimori",
            coleccion = listaColecciones.first { it.id == 1L },
            imagen = "file:///android_asset/base_set/imagen64.jpg"
        ),
        Carta(
            id = 65L,
            nombre = "Starmie",
            rareza = Rareza.C,
            precio = 85.00f,
            numero = "64/102",
            ilustrador = "Ken Sugimori",
            coleccion = listaColecciones.first { it.id == 1L },
            imagen = "file:///android_asset/base_set/imagen65.jpg"
        ),
        Carta(
            id = 66L,
            nombre = "Staryu",
            rareza = Rareza.C,
            precio = 85.00f,
            numero = "65/102",
            ilustrador = "Ken Sugimori",
            coleccion = listaColecciones.first { it.id == 1L },
            imagen = "file:///android_asset/base_set/imagen66.jpg"
        ),
        Carta(
            id = 67L,
            nombre = "Tangela",
            rareza = Rareza.C,
            precio = 85.00f,
            numero = "66/102",
            ilustrador = "Ken Sugimori",
            coleccion = listaColecciones.first { it.id == 1L },
            imagen = "file:///android_asset/base_set/imagen67.jpg"
        ),
        Carta(
            id = 68L,
            nombre = "Voltorb",
            rareza = Rareza.C,
            precio = 85.00f,
            numero = "67/102",
            ilustrador = "Ken Sugimori",
            coleccion = listaColecciones.first { it.id == 1L },
            imagen = "file:///android_asset/base_set/imagen68.jpg"
        ),
        Carta(
            id = 69L,
            nombre = "Vulpix",
            rareza = Rareza.C,
            precio = 85.00f,
            numero = "68/102",
            ilustrador = "Ken Sugimori",
            coleccion = listaColecciones.first { it.id == 1L },
            imagen = "file:///android_asset/base_set/imagen69.jpg"
        ),
        Carta(
            id = 70L,
            nombre = "Weedle",
            rareza = Rareza.C,
            precio = 85.00f,
            numero = "69/102",
            ilustrador = "Ken Sugimori",
            coleccion = listaColecciones.first { it.id == 1L },
            imagen = "file:///android_asset/base_set/imagen70.jpg"
        ),
        Carta(
            id = 71L,
            nombre = "Clefairy Doll",
            rareza = Rareza.R,
            precio = 85.00f,
            numero = "70/102",
            ilustrador = "Ken Sugimori",
            coleccion = listaColecciones.first { it.id == 1L },
            imagen = "file:///android_asset/base_set/imagen71.jpg"
        ),
        Carta(
            id = 72L,
            nombre = "Computer Search",
            rareza = Rareza.R,
            precio = 85.00f,
            numero = "71/102",
            ilustrador = "Ken Sugimori",
            coleccion = listaColecciones.first { it.id == 1L },
            imagen = "file:///android_asset/base_set/imagen72.jpg"
        ),
        Carta(
            id = 73L,
            nombre = "Devolution Spray",
            rareza = Rareza.R,
            precio = 85.00f,
            numero = "72/102",
            ilustrador = "Ken Sugimori",
            coleccion = listaColecciones.first { it.id == 1L },
            imagen = "file:///android_asset/base_set/imagen73.jpg"
        ),
        Carta(
            id = 74L,
            nombre = "Impostor Professor Oak",
            rareza = Rareza.R,
            precio = 85.00f,
            numero = "73/102",
            ilustrador = "Ken Sugimori",
            coleccion = listaColecciones.first { it.id == 1L },
            imagen = "file:///android_asset/base_set/imagen74.jpg"
        ),
        Carta(
            id = 75L,
            nombre = "Item Finder",
            rareza = Rareza.R,
            precio = 85.00f,
            numero = "74/102",
            ilustrador = "Ken Sugimori",
            coleccion = listaColecciones.first { it.id == 1L },
            imagen = "file:///android_asset/base_set/imagen75.jpg"
        ),
        Carta(
            id = 76L,
            nombre = "Lass",
            rareza = Rareza.R,
            precio = 85.00f,
            numero = "75/102",
            ilustrador = "Ken Sugimori",
            coleccion = listaColecciones.first { it.id == 1L },
            imagen = "file:///android_asset/base_set/imagen76.jpg"
        ),
        Carta(
            id = 77L,
            nombre = "Pokémon Breeder",
            rareza = Rareza.R,
            precio = 85.00f,
            numero = "76/102",
            ilustrador = "Ken Sugimori",
            coleccion = listaColecciones.first { it.id == 1L },
            imagen = "file:///android_asset/base_set/imagen77.jpg"
        ),
        Carta(
            id = 78L,
            nombre = "Pokémon Trader",
            rareza = Rareza.R,
            precio = 85.00f,
            numero = "77/102",
            ilustrador = "Ken Sugimori",
            coleccion = listaColecciones.first { it.id == 1L },
            imagen = "file:///android_asset/base_set/imagen78.jpg"
        ),
        Carta(
            id = 79L,
            nombre = "Scoop Up",
            rareza = Rareza.R,
            precio = 85.00f,
            numero = "78/102",
            ilustrador = "Ken Sugimori",
            coleccion = listaColecciones.first { it.id == 1L },
            imagen = "file:///android_asset/base_set/imagen79.jpg"
        ),
        Carta(
            id = 80L,
            nombre = "Super Energy Removal",
            rareza = Rareza.R,
            precio = 85.00f,
            numero = "79/102",
            ilustrador = "Ken Sugimori",
            coleccion = listaColecciones.first { it.id == 1L },
            imagen = "file:///android_asset/base_set/imagen80.jpg"
        ),
        Carta(
            id = 81L,
            nombre = "Defender",
            rareza = Rareza.U,
            precio = 85.00f,
            numero = "80/102",
            ilustrador = "Ken Sugimori",
            coleccion = listaColecciones.first { it.id == 1L },
            imagen = "file:///android_asset/base_set/imagen81.jpg"
        ),
        Carta(
            id = 82L,
            nombre = "Energy Retrieval",
            rareza = Rareza.U,
            precio = 85.00f,
            numero = "81/102",
            ilustrador = "Ken Sugimori",
            coleccion = listaColecciones.first { it.id == 1L },
            imagen = "file:///android_asset/base_set/imagen82.jpg"
        ),
        Carta(
            id = 83L,
            nombre = "Full Heal",
            rareza = Rareza.U,
            precio = 85.00f,
            numero = "82/102",
            ilustrador = "Ken Sugimori",
            coleccion = listaColecciones.first { it.id == 1L },
            imagen = "file:///android_asset/base_set/imagen83.jpg"
        ),
        Carta(
            id = 84L,
            nombre = "Maintenance",
            rareza = Rareza.U,
            precio = 85.00f,
            numero = "83/102",
            ilustrador = "Ken Sugimori",
            coleccion = listaColecciones.first { it.id == 1L },
            imagen = "file:///android_asset/base_set/imagen84.jpg"
        ),
        Carta(
            id = 85L,
            nombre = "PlusPower",
            rareza = Rareza.U,
            precio = 85.00f,
            numero = "84/102",
            ilustrador = "Ken Sugimori",
            coleccion = listaColecciones.first { it.id == 1L },
            imagen = "file:///android_asset/base_set/imagen85.jpg"
        ),
        Carta(
            id = 86L,
            nombre = "Pokémon Center",
            rareza = Rareza.U,
            precio = 85.00f,
            numero = "85/102",
            ilustrador = "Ken Sugimori",
            coleccion = listaColecciones.first { it.id == 1L },
            imagen = "file:///android_asset/base_set/imagen86.jpg"
        ),
        Carta(
            id = 87L,
            nombre = "Pokémon Flute",
            rareza = Rareza.U,
            precio = 85.00f,
            numero = "86/102",
            ilustrador = "Ken Sugimori",
            coleccion = listaColecciones.first { it.id == 1L },
            imagen = "file:///android_asset/base_set/imagen87.jpg"
        ),
        Carta(
            id = 88L,
            nombre = "Pokédex",
            rareza = Rareza.U,
            precio = 85.00f,
            numero = "87/102",
            ilustrador = "Ken Sugimori",
            coleccion = listaColecciones.first { it.id == 1L },
            imagen = "file:///android_asset/base_set/imagen88.jpg"
        ),
        Carta(
            id = 89L,
            nombre = "Professor Oak",
            rareza = Rareza.U,
            precio = 85.00f,
            numero = "88/102",
            ilustrador = "Ken Sugimori",
            coleccion = listaColecciones.first { it.id == 1L },
            imagen = "file:///android_asset/base_set/imagen89.jpg"
        ),
        Carta(
            id = 90L,
            nombre = "Revive",
            rareza = Rareza.U,
            precio = 85.00f,
            numero = "89/102",
            ilustrador = "Ken Sugimori",
            coleccion = listaColecciones.first { it.id == 1L },
            imagen = "file:///android_asset/base_set/imagen90.jpg"
        ),
        Carta(
            id = 91L,
            nombre = "Super Potion",
            rareza = Rareza.U,
            precio = 85.00f,
            numero = "90/102",
            ilustrador = "Ken Sugimori",
            coleccion = listaColecciones.first { it.id == 1L },
            imagen = "file:///android_asset/base_set/imagen91.jpg"
        ),
        Carta(
            id = 92L,
            nombre = "Bill",
            rareza = Rareza.C,
            precio = 85.00f,
            numero = "91/102",
            ilustrador = "Ken Sugimori",
            coleccion = listaColecciones.first { it.id == 1L },
            imagen = "file:///android_asset/base_set/imagen92.jpg"
        ),
        Carta(
            id = 93L,
            nombre = "Energy Removal",
            rareza = Rareza.C,
            precio = 85.00f,
            numero = "92/102",
            ilustrador = "Ken Sugimori",
            coleccion = listaColecciones.first { it.id == 1L },
            imagen = "file:///android_asset/base_set/imagen93.jpg"
        ),
        Carta(
            id = 94L,
            nombre = "Gust of Wind",
            rareza = Rareza.C,
            precio = 85.00f,
            numero = "93/102",
            ilustrador = "Ken Sugimori",
            coleccion = listaColecciones.first { it.id == 1L },
            imagen = "file:///android_asset/base_set/imagen94.jpg"
        ),
        Carta(
            id = 95L,
            nombre = "Potion",
            rareza = Rareza.C,
            precio = 85.00f,
            numero = "94/102",
            ilustrador = "Ken Sugimori",
            coleccion = listaColecciones.first { it.id == 1L },
            imagen = "file:///android_asset/base_set/imagen95.jpg"
        ),
        Carta(
            id = 96L,
            nombre = "Switch",
            rareza = Rareza.C,
            precio = 85.00f,
            numero = "95/102",
            ilustrador = "Ken Sugimori",
            coleccion = listaColecciones.first { it.id == 1L },
            imagen = "file:///android_asset/base_set/imagen96.jpg"
        ),
        Carta(
            id = 97L,
            nombre = "Double Colorless Energy",
            rareza = Rareza.U,
            precio = 85.00f,
            numero = "96/102",
            ilustrador = "Ken Sugimori",
            coleccion = listaColecciones.first { it.id == 1L },
            imagen = "file:///android_asset/base_set/imagen97.jpg"
        ),
        Carta(
            id = 98L,
            nombre = "Fighting Energy",
            rareza = Rareza.C,
            precio = 85.00f,
            numero = "97/102",
            ilustrador = "Ken Sugimori",
            coleccion = listaColecciones.first { it.id == 1L },
            imagen = "file:///android_asset/base_set/imagen98.jpg"
        ),
        Carta(
            id = 99L,
            nombre = "Fire Energy",
            rareza = Rareza.C,
            precio = 85.00f,
            numero = "98/102",
            ilustrador = "Ken Sugimori",
            coleccion = listaColecciones.first { it.id == 1L },
            imagen = "file:///android_asset/base_set/imagen99.jpg"
        ),
        Carta(
            id = 100L,
            nombre = "Grass Energy",
            rareza = Rareza.C,
            precio = 85.00f,
            numero = "99/102",
            ilustrador = "Ken Sugimori",
            coleccion = listaColecciones.first { it.id == 1L },
            imagen = "file:///android_asset/base_set/imagen100.jpg"
        ),
        Carta(
            id = 101L,
            nombre = "Lightning Energy",
            rareza = Rareza.C,
            precio = 85.00f,
            numero = "100/102",
            ilustrador = "Ken Sugimori",
            coleccion = listaColecciones.first { it.id == 1L },
            imagen = "file:///android_asset/base_set/imagen101.jpg"
        ),
        Carta(
            id = 102L,
            nombre = "Psychic Energy",
            rareza = Rareza.C,
            precio = 85.00f,
            numero = "101/102",
            ilustrador = "Ken Sugimori",
            coleccion = listaColecciones.first { it.id == 1L },
            imagen = "file:///android_asset/base_set/imagen102.jpg"
        ),
        Carta(
            id = 103L,
            nombre = "Water Energy",
            rareza = Rareza.C,
            precio = 85.00f,
            numero = "102/102",
            ilustrador = "Ken Sugimori",
            coleccion = listaColecciones.first { it.id == 1L},
            imagen = "file:///android_asset/base_set/imagen103.jpg"
        ),
        Carta(
            id = 104L,
            nombre = "Exeggcute",
            rareza = Rareza.C,
            precio = 0.0f,
            numero = "1/128",
            ilustrador = "Nelnal",
            coleccion = listaColecciones.first { it.id == 131L},
            imagen = "file:///android_asset/30ani/001_001_exeggcute.png"
        ),
        Carta(
            id = 105L,
            nombre = "Alolan Exeggutor",
            rareza = Rareza.C,
            precio = 0.0f,
            numero = "2/128",
            ilustrador = "Oswaldo KATO",
            coleccion = listaColecciones.first { it.id == 131L},
            imagen = "file:///android_asset/30ani/002_002_exeggutor_de_alola.png"
        ),
        Carta(
            id = 106L,
            nombre = "Volbeat",
            rareza = Rareza.C,
            precio = 0.0f,
            numero = "3/128",
            ilustrador = "Yoriyuki Ikegami",
            coleccion = listaColecciones.first { it.id == 131L},
            imagen = "file:///android_asset/30ani/003_003_volbeat.png"
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
                onCartaClick = { navController.navigate(Rutas.detalleConIdCarta(it))},
                navController = navController
            )
        }
        composable(Rutas.MICOLECCION) {
            MiColeccion(
                modifier = Modifier,
                misCartas = misCartas.sortedBy { it.id },
                onCartaClick = { navController.navigate(Rutas.detalleConIdCarta(it))}
            )
        }
        composable(Rutas.PERFIL) {
            PerfilScreen(
                modifier = Modifier,
                cartas = listaCartas,
                navController = navController
            )
        }
        composable(Rutas.COLECCIONES) {
            ListaColeccionesScreen(
                modifier = Modifier,
                colecciones = listaColecciones,
                onColeccionClick = { navController.navigate(Rutas.detalleConIdColeccion(it))}
            )
        }
        composable("coleccion/{coleccionId}") { backStackEntry ->

            val id = backStackEntry.arguments
                ?.getString("coleccionId")
                ?.toLongOrNull()

            val coleccion = id?.let { coleccionId ->
                listaColecciones.firstOrNull {
                    it.id == coleccionId
                }
            }

            if (id != null && coleccion != null) {
                ColeccionScreen(
                    modifier = Modifier,
                    coleccionId = id,
                    cartas = listaCartas,
                    onCartaClick = { cartaId ->
                        navController.navigate(
                            Rutas.detalleConIdCarta(cartaId)
                        )
                    },
                    coleccion = coleccion,
                    navController = navController
                )
            }
        }
        composable("detalle/{cartaId}") { backStackEntry ->

            val cartaId = backStackEntry.arguments
                ?.getString("cartaId")
                ?.toLongOrNull()

            val carta = cartaId?.let { id ->
                listaCartas.firstOrNull { it.id == id }
            }

            if( carta != null ) {
                DetalleScreen(
                    modifier = Modifier,
                    carta = carta,
                    misCartas = misCartas,
                    onAnadirCarta = { cartaAAnadir ->
                        if(misCartas.none { it.id == cartaAAnadir.id}) {
                            misCartas.add(cartaAAnadir)
                        }
                    },
                    onBorrarCarta = { cartaABorrar ->
                        misCartas.removeAll{ it.id == cartaABorrar.id }
                    }
                )
            }

        }
        composable("lol"){
            ListaCartasScreen (
                modifier = Modifier,
                cartas = listaCartas,
                onCartaClick = { navController.navigate(Rutas.detalleConIdColeccion(it))}
            )
        }
    }
}

fun buscarCarta(id: Long) : Carta {
    val listaCartas = listOf(
        Carta(
            id = 1,
            nombre = "Alakazam",
            rareza = Rareza.RH,
            precio = 0.20f,
            numero = "1/102",
            ilustrador = "Ken Sugimori",
            coleccion = listaColecciones[0],
            imagen = ""
        ),

        Carta(
            id = 2,
            nombre = "Blastoise",
            rareza = Rareza.RH,
            precio = 8.75f,
            numero = "2/102",
            ilustrador = "Ken Sugimori",
            coleccion = listaColecciones[0],
            imagen = ""
        ),
        Carta(
            id = 3,
            nombre = "Chansey",
            rareza = Rareza.RH,
            precio = 85.00f,
            numero = "3/102",
            ilustrador = "Ken Sugimori",
            coleccion = listaColecciones[0],
            imagen = ""
        ),
        Carta(
            id = 4,
            nombre = "Charizard",
            rareza = Rareza.RH,
            precio = 12.50f,
            numero = "4/102",
            ilustrador = "Mitsuhiro Arita",
            coleccion = listaColecciones[0],
            imagen = ""
        ),
        Carta(
            id = 5,
            nombre = "Clefairy",
            rareza = Rareza.RH,
            precio = 85.00f,
            numero = "5/102",
            ilustrador = "Ken Sugimori",
            coleccion = listaColecciones[0],
            imagen = ""
        )
    )

    return listaCartas.find { it.id == id }!!
}
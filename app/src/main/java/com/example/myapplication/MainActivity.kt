package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.MyApplicationTheme
import kotlin.collections.listOf
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.screen.ColeccionScreen
import com.example.myapplication.model.Carta
import com.example.myapplication.model.Rareza

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ColeccionScreen(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(innerPadding)
                            .padding(8.dp),
                        cartas = listOf(Carta(
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
                            ),
                            Carta(
                                nombre = "Gyarados",
                                rareza = Rareza.RH,
                                precio = 85.00f,
                                numero = "6/102",
                                ilustrador = "Mitsuhiro Arita",
                                coleccion = 1,
                                imagen = R.drawable.imagen7
                            ),
                            Carta(
                                nombre = "Hitmonchan",
                                rareza = Rareza.RH,
                                precio = 85.00f,
                                numero = "7/102",
                                ilustrador = "Ken Sugimori",
                                coleccion = 1,
                                imagen = R.drawable.imagen8
                            ),
                            Carta(
                                nombre = "Machamp",
                                rareza = Rareza.RH,
                                precio = 85.00f,
                                numero = "8/102",
                                ilustrador = "Ken Sugimori",
                                coleccion = 1,
                                imagen = R.drawable.imagen9
                            ),
                            Carta(
                                nombre = "Magneton",
                                rareza = Rareza.RH,
                                precio = 85.00f,
                                numero = "9/102",
                                ilustrador = "Ken Sugimori",
                                coleccion = 1,
                                imagen = R.drawable.imagen10
                            ),
                            Carta(
                                nombre = "Mewtwo",
                                rareza = Rareza.RH,
                                precio = 85.00f,
                                numero = "10/102",
                                ilustrador = "Ken Sugimori",
                                coleccion = 1,
                                imagen = R.drawable.imagen11
                            ),
                            Carta(
                                nombre = "Nidoking",
                                rareza = Rareza.RH,
                                precio = 85.00f,
                                numero = "11/102",
                                ilustrador = "Ken Sugimori",
                                coleccion = 1,
                                imagen = R.drawable.imagen12
                            ),
                            Carta(
                                nombre = "Ninetales",
                                rareza = Rareza.RH,
                                precio = 85.00f,
                                numero = "12/102",
                                ilustrador = "Ken Sugimori",
                                coleccion = 1,
                                imagen = R.drawable.imagen13
                            ),
                            Carta(
                                nombre = "Poliwrath",
                                rareza = Rareza.RH,
                                precio = 85.00f,
                                numero = "13/102",
                                ilustrador = "Ken Sugimori",
                                coleccion = 1,
                                imagen = R.drawable.imagen14
                            ),
                            Carta(
                                nombre = "Raichu",
                                rareza = Rareza.RH,
                                precio = 85.00f,
                                numero = "14/102",
                                ilustrador = "Ken Sugimori",
                                coleccion = 1,
                                imagen = R.drawable.imagen15
                            ),
                            Carta(
                                nombre = "Venusaur",
                                rareza = Rareza.RH,
                                precio = 85.00f,
                                numero = "15/102",
                                ilustrador = "Ken Sugimori",
                                coleccion = 1,
                                imagen = R.drawable.imagen16
                            ),
                            Carta(
                                nombre = "Zapdos",
                                rareza = Rareza.RH,
                                precio = 85.00f,
                                numero = "16/102",
                                ilustrador = "Ken Sugimori",
                                coleccion = 1,
                                imagen = R.drawable.imagen17
                            ),
                            Carta(
                                nombre = "Beedrill",
                                rareza = Rareza.R,
                                precio = 85.00f,
                                numero = "17/102",
                                ilustrador = "Ken Sugimori",
                                coleccion = 1,
                                imagen = R.drawable.imagen18
                            ),
                            Carta(
                                nombre = "Dragonair",
                                rareza = Rareza.R,
                                precio = 85.00f,
                                numero = "18/102",
                                ilustrador = "Ken Sugimori",
                                coleccion = 1,
                                imagen = R.drawable.imagen19
                            ),
                            Carta(
                                nombre = "Dugtrio",
                                rareza = Rareza.R,
                                precio = 85.00f,
                                numero = "19/102",
                                ilustrador = "Ken Sugimori",
                                coleccion = 1,
                                imagen = R.drawable.imagen20
                            ),
                            Carta(
                                nombre = "Electabuzz",
                                rareza = Rareza.R,
                                precio = 85.00f,
                                numero = "20/102",
                                ilustrador = "Ken Sugimori",
                                coleccion = 1,
                                imagen = R.drawable.imagen21
                            ),
                            Carta(
                                nombre = "Electrode",
                                rareza = Rareza.R,
                                precio = 85.00f,
                                numero = "21/102",
                                ilustrador = "Ken Sugimori",
                                coleccion = 1,
                                imagen = R.drawable.imagen22
                            ),
                            Carta(
                                nombre = "Pidgeotto",
                                rareza = Rareza.R,
                                precio = 85.00f,
                                numero = "22/102",
                                ilustrador = "Ken Sugimori",
                                coleccion = 1,
                                imagen = R.drawable.imagen23
                            ),
                            Carta(
                                nombre = "Arcanine",
                                rareza = Rareza.U,
                                precio = 85.00f,
                                numero = "23/102",
                                ilustrador = "Ken Sugimori",
                                coleccion = 1,
                                imagen = R.drawable.imagen24
                            ),
                            Carta(
                                nombre = "Charmeleon",
                                rareza = Rareza.U,
                                precio = 85.00f,
                                numero = "24/102",
                                ilustrador = "Ken Sugimori",
                                coleccion = 1,
                                imagen = R.drawable.imagen25
                            ),
                            Carta(
                                nombre = "Dewgong",
                                rareza = Rareza.U,
                                precio = 85.00f,
                                numero = "25/102",
                                ilustrador = "Ken Sugimori",
                                coleccion = 1,
                                imagen = R.drawable.imagen26
                            ),
                            Carta(
                                nombre = "Dratini",
                                rareza = Rareza.U,
                                precio = 85.00f,
                                numero = "26/102",
                                ilustrador = "Ken Sugimori",
                                coleccion = 1,
                                imagen = R.drawable.imagen27
                            ),
                            Carta(
                                nombre = "Farfetch'd",
                                rareza = Rareza.U,
                                precio = 85.00f,
                                numero = "27/102",
                                ilustrador = "Ken Sugimori",
                                coleccion = 1,
                                imagen = R.drawable.imagen28
                            ),
                            Carta(
                                nombre = "Growlithe",
                                rareza = Rareza.U,
                                precio = 85.00f,
                                numero = "28/102",
                                ilustrador = "Ken Sugimori",
                                coleccion = 1,
                                imagen = R.drawable.imagen29
                            ),
                            Carta(
                                nombre = "Haunter",
                                rareza = Rareza.U,
                                precio = 85.00f,
                                numero = "29/102",
                                ilustrador = "Ken Sugimori",
                                coleccion = 1,
                                imagen = R.drawable.imagen30
                            ),
                            Carta(
                                nombre = "Ivysaur",
                                rareza = Rareza.U,
                                precio = 85.00f,
                                numero = "30/102",
                                ilustrador = "Ken Sugimori",
                                coleccion = 1,
                                imagen = R.drawable.imagen31
                            ),
                            Carta(
                                nombre = "Jynx",
                                rareza = Rareza.U,
                                precio = 85.00f,
                                numero = "31/102",
                                ilustrador = "Ken Sugimori",
                                coleccion = 1,
                                imagen = R.drawable.imagen32
                            ),
                            Carta(
                                nombre = "Kadabra",
                                rareza = Rareza.U,
                                precio = 85.00f,
                                numero = "32/102",
                                ilustrador = "Ken Sugimori",
                                coleccion = 1,
                                imagen = R.drawable.imagen33
                            ),
                            Carta(
                                nombre = "Kakuna",
                                rareza = Rareza.U,
                                precio = 85.00f,
                                numero = "33/102",
                                ilustrador = "Ken Sugimori",
                                coleccion = 1,
                                imagen = R.drawable.imagen34
                            ),
                            Carta(
                                nombre = "Machoke",
                                rareza = Rareza.U,
                                precio = 85.00f,
                                numero = "34/102",
                                ilustrador = "Ken Sugimori",
                                coleccion = 1,
                                imagen = R.drawable.imagen35
                            ),
                            Carta(
                                nombre = "Magikarp",
                                rareza = Rareza.U,
                                precio = 85.00f,
                                numero = "35/102",
                                ilustrador = "Ken Sugimori",
                                coleccion = 1,
                                imagen = R.drawable.imagen36
                            ),
                            Carta(
                                nombre = "Magmar",
                                rareza = Rareza.U,
                                precio = 85.00f,
                                numero = "36/102",
                                ilustrador = "Ken Sugimori",
                                coleccion = 1,
                                imagen = R.drawable.imagen37
                            ),
                            Carta(
                                nombre = "Nidorino",
                                rareza = Rareza.U,
                                precio = 85.00f,
                                numero = "37/102",
                                ilustrador = "Ken Sugimori",
                                coleccion = 1,
                                imagen = R.drawable.imagen38
                            ),
                            Carta(
                                nombre = "Poliwhirl",
                                rareza = Rareza.U,
                                precio = 85.00f,
                                numero = "38/102",
                                ilustrador = "Ken Sugimori",
                                coleccion = 1,
                                imagen = R.drawable.imagen39
                            ),
                            Carta(
                                nombre = "Porygon",
                                rareza = Rareza.U,
                                precio = 85.00f,
                                numero = "39/102",
                                ilustrador = "Ken Sugimori",
                                coleccion = 1,
                                imagen = R.drawable.imagen40
                            ),
                            Carta(
                                nombre = "Raticate",
                                rareza = Rareza.U,
                                precio = 85.00f,
                                numero = "40/102",
                                ilustrador = "Ken Sugimori",
                                coleccion = 1,
                                imagen = R.drawable.imagen41
                            ),
                            Carta(
                                nombre = "Seel",
                                rareza = Rareza.U,
                                precio = 85.00f,
                                numero = "41/102",
                                ilustrador = "Ken Sugimori",
                                coleccion = 1,
                                imagen = R.drawable.imagen42
                            ),
                            Carta(
                                nombre = "Wartortle",
                                rareza = Rareza.U,
                                precio = 85.00f,
                                numero = "42/102",
                                ilustrador = "Ken Sugimori",
                                coleccion = 1,
                                imagen = R.drawable.imagen43
                            ),
                            Carta(
                                nombre = "Abra",
                                rareza = Rareza.C,
                                precio = 85.00f,
                                numero = "43/102",
                                ilustrador = "Ken Sugimori",
                                coleccion = 1,
                                imagen = R.drawable.imagen44
                            ),
                            Carta(
                                nombre = "Bulbasaur",
                                rareza = Rareza.C,
                                precio = 85.00f,
                                numero = "44/102",
                                ilustrador = "Ken Sugimori",
                                coleccion = 1,
                                imagen = R.drawable.imagen45
                            ),
                            Carta(
                                nombre = "Caterpie",
                                rareza = Rareza.C,
                                precio = 85.00f,
                                numero = "45/102",
                                ilustrador = "Ken Sugimori",
                                coleccion = 1,
                                imagen = R.drawable.imagen46
                            ),
                            Carta(
                                nombre = "Charmander",
                                rareza = Rareza.C,
                                precio = 85.00f,
                                numero = "46/102",
                                ilustrador = "Ken Sugimori",
                                coleccion = 1,
                                imagen = R.drawable.imagen47
                            ),
                            Carta(
                                nombre = "Diglett",
                                rareza = Rareza.C,
                                precio = 85.00f,
                                numero = "47/102",
                                ilustrador = "Ken Sugimori",
                                coleccion = 1,
                                imagen = R.drawable.imagen48
                            ),
                            Carta(
                                nombre = "Doduo",
                                rareza = Rareza.C,
                                precio = 85.00f,
                                numero = "48/102",
                                ilustrador = "Ken Sugimori",
                                coleccion = 1,
                                imagen = R.drawable.imagen49
                            ),
                            Carta(
                                nombre = "Drowzee",
                                rareza = Rareza.C,
                                precio = 85.00f,
                                numero = "49/102",
                                ilustrador = "Ken Sugimori",
                                coleccion = 1,
                                imagen = R.drawable.imagen50
                            ),
                            Carta(
                                nombre = "Gastly",
                                rareza = Rareza.C,
                                precio = 85.00f,
                                numero = "50/102",
                                ilustrador = "Ken Sugimori",
                                coleccion = 1,
                                imagen = R.drawable.imagen51
                            ),
                            Carta(
                                nombre = "Koffing",
                                rareza = Rareza.C,
                                precio = 85.00f,
                                numero = "51/102",
                                ilustrador = "Ken Sugimori",
                                coleccion = 1,
                                imagen = R.drawable.imagen52
                            ),
                            Carta(
                                nombre = "Machop",
                                rareza = Rareza.C,
                                precio = 85.00f,
                                numero = "52/102",
                                ilustrador = "Ken Sugimori",
                                coleccion = 1,
                                imagen = R.drawable.imagen53
                            ),
                            Carta(
                                nombre = "Magnemite",
                                rareza = Rareza.C,
                                precio = 85.00f,
                                numero = "53/102",
                                ilustrador = "Ken Sugimori",
                                coleccion = 1,
                                imagen = R.drawable.imagen54
                            ),
                            Carta(
                                nombre = "Metapod",
                                rareza = Rareza.C,
                                precio = 85.00f,
                                numero = "54/102",
                                ilustrador = "Ken Sugimori",
                                coleccion = 1,
                                imagen = R.drawable.imagen55
                            ),
                            Carta(
                                nombre = "Nidoranm",
                                rareza = Rareza.C,
                                precio = 85.00f,
                                numero = "55/102",
                                ilustrador = "Ken Sugimori",
                                coleccion = 1,
                                imagen = R.drawable.imagen56
                            ),
                            Carta(
                                nombre = "Onix",
                                rareza = Rareza.C,
                                precio = 85.00f,
                                numero = "56/102",
                                ilustrador = "Ken Sugimori",
                                coleccion = 1,
                                imagen = R.drawable.imagen57
                            ),
                            Carta(
                                nombre = "Pidgey",
                                rareza = Rareza.C,
                                precio = 85.00f,
                                numero = "57/102",
                                ilustrador = "Ken Sugimori",
                                coleccion = 1,
                                imagen = R.drawable.imagen58
                            ),
                            Carta(
                                nombre = "Yellow Cheeks Pikachu",
                                rareza = Rareza.C,
                                precio = 85.00f,
                                numero = "58/102",
                                ilustrador = "Ken Sugimori",
                                coleccion = 1,
                                imagen = R.drawable.imagen59
                            ),
                            Carta(
                                nombre = "Red Cheeks Pikachu",
                                rareza = Rareza.C,
                                precio = 85.00f,
                                numero = "58/102",
                                ilustrador = "Mitsuhiro Arita",
                                coleccion = 1,
                                imagen = R.drawable.imagen4
                            ),
                            Carta(
                                nombre = "Poliwag",
                                rareza = Rareza.C,
                                precio = 85.00f,
                                numero = "59/102",
                                ilustrador = "Ken Sugimori",
                                coleccion = 1,
                                imagen = R.drawable.imagen60
                            ),
                            Carta(
                                nombre = "Ponyta",
                                rareza = Rareza.C,
                                precio = 85.00f,
                                numero = "60/102",
                                ilustrador = "Ken Sugimori",
                                coleccion = 1,
                                imagen = R.drawable.imagen61
                            ),
                            Carta(
                                nombre = "Rattata",
                                rareza = Rareza.C,
                                precio = 85.00f,
                                numero = "61/102",
                                ilustrador = "Ken Sugimori",
                                coleccion = 1,
                                imagen = R.drawable.imagen62
                            ),
                            Carta(
                                nombre = "Sandshrew",
                                rareza = Rareza.C,
                                precio = 85.00f,
                                numero = "62/102",
                                ilustrador = "Ken Sugimori",
                                coleccion = 1,
                                imagen = R.drawable.imagen63
                            ),
                            Carta(
                                nombre = "Squirtle",
                                rareza = Rareza.C,
                                precio = 85.00f,
                                numero = "63/102",
                                ilustrador = "Ken Sugimori",
                                coleccion = 1,
                                imagen = R.drawable.imagen64
                            ),
                            Carta(
                                nombre = "Starmie",
                                rareza = Rareza.C,
                                precio = 85.00f,
                                numero = "64/102",
                                ilustrador = "Ken Sugimori",
                                coleccion = 1,
                                imagen = R.drawable.imagen65
                            ),
                            Carta(
                                nombre = "Staryu",
                                rareza = Rareza.C,
                                precio = 85.00f,
                                numero = "65/102",
                                ilustrador = "Ken Sugimori",
                                coleccion = 1,
                                imagen = R.drawable.imagen66
                            ),
                            Carta(
                                nombre = "Tangela",
                                rareza = Rareza.C,
                                precio = 85.00f,
                                numero = "66/102",
                                ilustrador = "Ken Sugimori",
                                coleccion = 1,
                                imagen = R.drawable.imagen67
                            ),
                            Carta(
                                nombre = "Voltorb",
                                rareza = Rareza.C,
                                precio = 85.00f,
                                numero = "67/102",
                                ilustrador = "Ken Sugimori",
                                coleccion = 1,
                                imagen = R.drawable.imagen68
                            ),
                            Carta(
                                nombre = "Vulpix",
                                rareza = Rareza.C,
                                precio = 85.00f,
                                numero = "68/102",
                                ilustrador = "Ken Sugimori",
                                coleccion = 1,
                                imagen = R.drawable.imagen69
                            ),
                            Carta(
                                nombre = "Weedle",
                                rareza = Rareza.C,
                                precio = 85.00f,
                                numero = "69/102",
                                ilustrador = "Ken Sugimori",
                                coleccion = 1,
                                imagen = R.drawable.imagen70
                            ),
                            Carta(
                                nombre = "Clefairy Doll",
                                rareza = Rareza.R,
                                precio = 85.00f,
                                numero = "70/102",
                                ilustrador = "Ken Sugimori",
                                coleccion = 1,
                                imagen = R.drawable.imagen71
                            ),
                            Carta(
                                nombre = "Computer Search",
                                rareza = Rareza.R,
                                precio = 85.00f,
                                numero = "71/102",
                                ilustrador = "Ken Sugimori",
                                coleccion = 1,
                                imagen = R.drawable.imagen72
                            ),
                            Carta(
                                nombre = "Devolution Spray",
                                rareza = Rareza.R,
                                precio = 85.00f,
                                numero = "72/102",
                                ilustrador = "Ken Sugimori",
                                coleccion = 1,
                                imagen = R.drawable.imagen73
                            ),
                            Carta(
                                nombre = "Impostor Professor Oak",
                                rareza = Rareza.R,
                                precio = 85.00f,
                                numero = "73/102",
                                ilustrador = "Ken Sugimori",
                                coleccion = 1,
                                imagen = R.drawable.imagen74
                            ),
                            Carta(
                                nombre = "Item Finder",
                                rareza = Rareza.R,
                                precio = 85.00f,
                                numero = "74/102",
                                ilustrador = "Ken Sugimori",
                                coleccion = 1,
                                imagen = R.drawable.imagen75
                            ),
                            Carta(
                                nombre = "Lass",
                                rareza = Rareza.R,
                                precio = 85.00f,
                                numero = "75/102",
                                ilustrador = "Ken Sugimori",
                                coleccion = 1,
                                imagen = R.drawable.imagen76
                            ),
                            Carta(
                                nombre = "Pokémon Breeder",
                                rareza = Rareza.R,
                                precio = 85.00f,
                                numero = "76/102",
                                ilustrador = "Ken Sugimori",
                                coleccion = 1,
                                imagen = R.drawable.imagen77
                            ),
                            Carta(
                                nombre = "Pokémon Trader",
                                rareza = Rareza.R,
                                precio = 85.00f,
                                numero = "77/102",
                                ilustrador = "Ken Sugimori",
                                coleccion = 1,
                                imagen = R.drawable.imagen78
                            ),
                            Carta(
                                nombre = "Scoop Up",
                                rareza = Rareza.R,
                                precio = 85.00f,
                                numero = "78/102",
                                ilustrador = "Ken Sugimori",
                                coleccion = 1,
                                imagen = R.drawable.imagen79
                            ),
                            Carta(
                                nombre = "Super Energy Removal",
                                rareza = Rareza.R,
                                precio = 85.00f,
                                numero = "79/102",
                                ilustrador = "Ken Sugimori",
                                coleccion = 1,
                                imagen = R.drawable.imagen80
                            ),
                            Carta(
                                nombre = "Defender",
                                rareza = Rareza.U,
                                precio = 85.00f,
                                numero = "80/102",
                                ilustrador = "Ken Sugimori",
                                coleccion = 1,
                                imagen = R.drawable.imagen81
                            ),
                            Carta(
                                nombre = "Energy Retrieval",
                                rareza = Rareza.U,
                                precio = 85.00f,
                                numero = "81/102",
                                ilustrador = "Ken Sugimori",
                                coleccion = 1,
                                imagen = R.drawable.imagen82
                            ),
                            Carta(
                                nombre = "Full Heal",
                                rareza = Rareza.U,
                                precio = 85.00f,
                                numero = "82/102",
                                ilustrador = "Ken Sugimori",
                                coleccion = 1,
                                imagen = R.drawable.imagen83
                            ),
                            Carta(
                                nombre = "Maintenance",
                                rareza = Rareza.U,
                                precio = 85.00f,
                                numero = "83/102",
                                ilustrador = "Ken Sugimori",
                                coleccion = 1,
                                imagen = R.drawable.imagen84
                            ),
                            Carta(
                                nombre = "PlusPower",
                                rareza = Rareza.U,
                                precio = 85.00f,
                                numero = "84/102",
                                ilustrador = "Ken Sugimori",
                                coleccion = 1,
                                imagen = R.drawable.imagen85
                            ),
                            Carta(
                                nombre = "Pokémon Center",
                                rareza = Rareza.U,
                                precio = 85.00f,
                                numero = "85/102",
                                ilustrador = "Ken Sugimori",
                                coleccion = 1,
                                imagen = R.drawable.imagen86
                            ),
                            Carta(
                                nombre = "Pokémon Flute",
                                rareza = Rareza.U,
                                precio = 85.00f,
                                numero = "86/102",
                                ilustrador = "Ken Sugimori",
                                coleccion = 1,
                                imagen = R.drawable.imagen87
                            ),
                            Carta(
                                nombre = "Pokédex",
                                rareza = Rareza.U,
                                precio = 85.00f,
                                numero = "87/102",
                                ilustrador = "Ken Sugimori",
                                coleccion = 1,
                                imagen = R.drawable.imagen88
                            ),
                            Carta(
                                nombre = "Professor Oak",
                                rareza = Rareza.U,
                                precio = 85.00f,
                                numero = "88/102",
                                ilustrador = "Ken Sugimori",
                                coleccion = 1,
                                imagen = R.drawable.imagen89
                            ),
                            Carta(
                                nombre = "Revive",
                                rareza = Rareza.U,
                                precio = 85.00f,
                                numero = "89/102",
                                ilustrador = "Ken Sugimori",
                                coleccion = 1,
                                imagen = R.drawable.imagen90
                            ),
                            Carta(
                                nombre = "Super Potion",
                                rareza = Rareza.U,
                                precio = 85.00f,
                                numero = "90/102",
                                ilustrador = "Ken Sugimori",
                                coleccion = 1,
                                imagen = R.drawable.imagen91
                            ),
                            Carta(
                                nombre = "Bill",
                                rareza = Rareza.C,
                                precio = 85.00f,
                                numero = "91/102",
                                ilustrador = "Ken Sugimori",
                                coleccion = 1,
                                imagen = R.drawable.imagen92
                            ),
                            Carta(
                                nombre = "Energy Removal",
                                rareza = Rareza.C,
                                precio = 85.00f,
                                numero = "92/102",
                                ilustrador = "Ken Sugimori",
                                coleccion = 1,
                                imagen = R.drawable.imagen93
                            ),
                            Carta(
                                nombre = "Gust of Wind",
                                rareza = Rareza.C,
                                precio = 85.00f,
                                numero = "93/102",
                                ilustrador = "Ken Sugimori",
                                coleccion = 1,
                                imagen = R.drawable.imagen94
                            ),
                            Carta(
                                nombre = "Potion",
                                rareza = Rareza.C,
                                precio = 85.00f,
                                numero = "94/102",
                                ilustrador = "Ken Sugimori",
                                coleccion = 1,
                                imagen = R.drawable.imagen95
                            ),
                            Carta(
                                nombre = "Switch",
                                rareza = Rareza.C,
                                precio = 85.00f,
                                numero = "95/102",
                                ilustrador = "Ken Sugimori",
                                coleccion = 1,
                                imagen = R.drawable.imagen96
                            ),
                            Carta(
                                nombre = "Double Colorless Energy",
                                rareza = Rareza.U,
                                precio = 85.00f,
                                numero = "96/102",
                                ilustrador = "Ken Sugimori",
                                coleccion = 1,
                                imagen = R.drawable.imagen97
                            ),
                            Carta(
                                nombre = "Fighting Energy",
                                rareza = Rareza.C,
                                precio = 85.00f,
                                numero = "97/102",
                                ilustrador = "Ken Sugimori",
                                coleccion = 1,
                                imagen = R.drawable.imagen98
                            ),
                            Carta(
                                nombre = "Fire Energy",
                                rareza = Rareza.C,
                                precio = 85.00f,
                                numero = "98/102",
                                ilustrador = "Ken Sugimori",
                                coleccion = 1,
                                imagen = R.drawable.imagen99
                            ),
                            Carta(
                                nombre = "Grass Energy",
                                rareza = Rareza.C,
                                precio = 85.00f,
                                numero = "99/102",
                                ilustrador = "Ken Sugimori",
                                coleccion = 1,
                                imagen = R.drawable.imagen100
                            ),
                            Carta(
                                nombre = "Lightning Energy",
                                rareza = Rareza.C,
                                precio = 85.00f,
                                numero = "100/102",
                                ilustrador = "Ken Sugimori",
                                coleccion = 1,
                                imagen = R.drawable.imagen101
                            ),
                            Carta(
                                nombre = "Psychic Energy",
                                rareza = Rareza.C,
                                precio = 85.00f,
                                numero = "101/102",
                                ilustrador = "Ken Sugimori",
                                coleccion = 1,
                                imagen = R.drawable.imagen102
                            ),
                            Carta(
                                nombre = "Water Energy",
                                rareza = Rareza.C,
                                precio = 85.00f,
                                numero = "102/102",
                                ilustrador = "Ken Sugimori",
                                coleccion = 1,
                                imagen = R.drawable.imagen103
                            )
                        )
                    )
                }
            }
        }
    }
}
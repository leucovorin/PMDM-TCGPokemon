package com.example.myapplication.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.myapplication.model.Carta
import com.example.myapplication.model.Coleccion
import com.example.myapplication.ui.components.CartaCard
import com.example.myapplication.ui.navegacion.Rutas

@Composable
fun ColeccionScreen(
    modifier: Modifier,
    coleccionId: Long,
    cartas: List<Carta>,
    coleccion: Coleccion,
    onCartaClick: (Long) -> Unit,
) {
    val cartasColeccion = cartas.filter {
        it.coleccion.id == coleccionId
    }

        Card(
            modifier = modifier
        ) {
            Column {
                Spacer(modifier = Modifier.height(16.dp))
                CartasColeccion (
                    modifier = Modifier.fillMaxWidth(),
                    cartas = cartasColeccion,
                    coleccion = coleccion,
                    onCartaClick = { onCartaClick(it) }
                )
            }
        }



}

@Composable
private fun CartasColeccion(
    modifier: Modifier,
    cartas: List<Carta>,
    coleccion: Coleccion,
    onCartaClick: (Long) -> Unit
) {
    Column(
        modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFFB8B6C2)),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text=coleccion.nombre, fontWeight = FontWeight.Bold, modifier = Modifier.padding(top = 14.dp, bottom = 16.dp))
        }

        LazyVerticalGrid (
            modifier = Modifier.fillMaxWidth().weight(1f),
            columns = GridCells.Fixed(2),
            verticalArrangement = Arrangement.spacedBy(0.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(cartas.size) { indice ->
                val carta = cartas[indice]
                CartaCard(
                    modifier = Modifier.fillMaxWidth(),
                    carta = carta,
                    onClick = { cartaId ->
                        onCartaClick(cartaId)
                    }
                )
            }
        }
    }


}
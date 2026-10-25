package com.example.myapplication.ui.screen

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.myapplication.model.Carta
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import com.example.myapplication.ui.components.CartaCard
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.model.Rareza
import androidx.compose.foundation.layout.Spacer
import androidx.compose.material3.Text
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Card
import androidx.compose.ui.text.style.TextAlign
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.myapplication.model.Coleccion
import com.example.myapplication.ui.components.ColeccionCard

@Composable
fun ListaColeccionesScreen(
    modifier: Modifier,
    cartas: List<Carta>,
    misCartas: List<Carta>,
    colecciones: List<Coleccion>,
    onColeccionClick: (Long) -> Unit
) {

    Card(
        modifier = modifier
    ) {
        Column {
            Spacer(modifier = Modifier.height(8.dp))
            ColeccionList(
                modifier = Modifier.fillMaxWidth(),
                colecciones = colecciones,
                onColeccionClick = { id ->
                    onColeccionClick(id)
                },
                cartas = cartas,
                misCartas = misCartas
            )
        }
    }



}

@Composable
fun ColeccionList(
    modifier: Modifier,
    colecciones: List<Coleccion>,
    misCartas: List<Carta>,
    cartas: List<Carta>,
    onColeccionClick: (Long) -> Unit
) {

    LazyVerticalGrid (
        modifier = modifier,
        columns = GridCells.Fixed(2),
        verticalArrangement = Arrangement.spacedBy(0.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(colecciones.size) { indice ->

            val coleccion = colecciones[indice]

            val cartasObtenidas = misCartas
                .filter { it.coleccion.id == coleccion.id }
                .distinctBy { it.id }
                .size

            val totalCartas = cartas
                .count { it.coleccion.id == coleccion.id }

            val progreso = if (totalCartas > 0) {
                cartasObtenidas.toFloat() / totalCartas
            } else {
                0f
            }

            ColeccionCard(
                modifier = Modifier.fillMaxWidth(),
                coleccion = coleccion,
                onClick = { onColeccionClick(coleccion.id) },
                progreso = progreso
            )

        }
    }

}
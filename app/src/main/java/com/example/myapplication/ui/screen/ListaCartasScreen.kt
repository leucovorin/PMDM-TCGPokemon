package com.example.myapplication.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.model.Carta
import com.example.myapplication.model.Rareza
import com.example.myapplication.ui.components.CartaCard

@Composable
fun ListaCartasScreen(
    modifier: Modifier,
    cartas: List<Carta>,
    onCartaClick: (Long) -> Unit
) {
    Card(
        modifier
    ) {
        Column(
            modifier
        ) {
            Text(text = "Cartas APP", style = MaterialTheme.typography.displaySmall, textAlign = TextAlign.Center)
            Spacer(modifier = Modifier.height(8.dp))
            CartaList(
                modifier = Modifier.fillMaxWidth(),
                cartas = cartas,
                onCartaClick = { onCartaClick(it) }
            )
        }
    }
}

@Composable
fun CartaList(
    modifier: Modifier,
    cartas: List<Carta>,
    onCartaClick: (Long) -> Unit
){
    LazyVerticalGrid (
        columns = GridCells.Fixed(2),
        verticalArrangement = Arrangement.spacedBy(0.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(cartas.size) { indice ->
            CartaCard(
                modifier = Modifier.fillMaxWidth(),
                carta = cartas[indice],
                onClick = { onCartaClick(it) }
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CartaListPreview(){
    CartaList(
        modifier = Modifier,
        cartas = listOf(
            Carta( id = 1, nombre = "Carta I", precio = 5.3f, rareza = Rareza.R, numero = "001", ilustrador = "payico", coleccion = 5, imagen = 1 ),
            Carta( id = 2, nombre = "Carta II", precio = 15.2f, rareza = Rareza.R, numero = "022", ilustrador = "payo", coleccion = 5, imagen = 1 ),
            Carta( id = 3, nombre = "Carta III", precio = 25.5f, rareza = Rareza.R, numero = "003", ilustrador = "payuco", coleccion = 5, imagen = 1 )
        ),
        onCartaClick = {}
    )
}
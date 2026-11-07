package com.example.myapplication.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.myapplication.model.Carta
import com.example.myapplication.model.CartaColeccion

@Composable
fun DetalleCCScreen(
    carta: CartaColeccion,
    onEditarCarta: (CartaColeccion) -> Unit,
    onBorrarCarta: (CartaColeccion) -> Unit
) {

    Column(modifier = Modifier.fillMaxSize().padding(top = 32.dp)) {
        val imagen = carta.carta.imagen
        AsyncImage(
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp),
            model = imagen,
            contentDescription = "Imagen Carta",
            contentScale = ContentScale.Fit
        )
        Column(modifier = Modifier.fillMaxWidth().padding(top = 12.dp), horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = carta.carta.nombre, fontWeight = FontWeight.Bold)
            Text(text = carta.carta.numero)
        }
        Column(modifier = Modifier.weight(1f)) {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
                    .weight(1f)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .verticalScroll(rememberScrollState())
                ) {
                    Text(text = "Información de la carta", modifier = Modifier.padding(horizontal = 16.dp).padding(top = 8.dp), fontWeight = FontWeight.Bold)
                    HorizontalDivider(
                        modifier = Modifier.padding(8.dp)
                    )
                    Row {
                        Column { Text(text = "Colección", modifier = Modifier.padding(horizontal = 16.dp), color = Color.Gray) }
                        Column(modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.End) { Text(text = carta.carta.coleccion.nombre, modifier = Modifier.padding(horizontal = 16.dp)) }
                    }
                    HorizontalDivider(
                        modifier = Modifier.padding(8.dp)
                    )
                    Row {
                        Column { Text(text = "Rareza", modifier = Modifier.padding(horizontal = 16.dp), color = Color.Gray) }
                        Column(modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.End) { Text(text = carta.carta.rareza, modifier = Modifier.padding(horizontal = 16.dp)) }
                    }
                    HorizontalDivider(
                        modifier = Modifier.padding(8.dp)
                    )
                    Row {
                        Column { Text(text = "Ilustrador", modifier = Modifier.padding(horizontal = 16.dp), color = Color.Gray) }
                        Column(modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.End) { Text(text = carta.carta.ilustrador, modifier = Modifier.padding(horizontal = 16.dp)) }
                    }
                    HorizontalDivider(
                        modifier = Modifier.padding(8.dp)
                    )
                    Row {
                        Column { Text(text = "Idioma", modifier = Modifier.padding(horizontal = 16.dp), color = Color.Gray) }
                        Column(modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.End) { Text(text = carta.idioma, modifier = Modifier.padding(horizontal = 16.dp)) }
                    }
                    HorizontalDivider(
                        modifier = Modifier.padding(8.dp)
                    )
                    Row {
                        Column { Text(text = "Condición", modifier = Modifier.padding(horizontal = 16.dp), color = Color.Gray) }
                        Column(modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.End) { Text(text = carta.condicion, modifier = Modifier.padding(horizontal = 16.dp)) }
                    }
                    HorizontalDivider(
                        modifier = Modifier.padding(8.dp)
                    )
                    Row {
                        Column { Text(text = "Precio", modifier = Modifier.padding(horizontal = 16.dp).padding(bottom = 8.dp), color = Color.Gray) }
                        Column(modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.End) { Text(text = "${String.format("%.2f", carta.carta.precio)}€", modifier = Modifier.padding(horizontal = 16.dp)) }
                    }
                }
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
                    .padding(bottom = 16.dp),
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                Button(
                    modifier = Modifier.weight(1f).height(52.dp),
                    onClick = {
                        onEditarCarta(carta)
                    }) {
                    Text("Editar carta")
                }
                Button(
                    modifier = Modifier.weight(1f).height(52.dp),
                    onClick = {
                        onBorrarCarta(carta)
                    }) {
                    Text("Borrar de mi colección")
                }
            }
        }
    }
}






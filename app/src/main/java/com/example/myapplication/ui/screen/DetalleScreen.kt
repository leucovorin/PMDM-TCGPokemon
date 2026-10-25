package com.example.myapplication.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import coil.compose.AsyncImage
import com.example.myapplication.model.Carta
import com.example.myapplication.model.listaColecciones
import com.example.myapplication.ui.components.CartaCard
import com.example.myapplication.ui.navegacion.Rutas

@Composable
fun DetalleScreen(
    modifier: Modifier,
    carta: Carta,
    misCartas: List<Carta>,
    onAnadirCarta: (Carta) -> Unit,
    onBorrarCarta: (Carta) -> Unit
) {

    val tieneCarta = carta in misCartas

    Column(modifier = Modifier.padding(top = 32.dp)) {
        val imagen = carta.imagen
        AsyncImage(
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp),
            model = imagen,
            contentDescription = "Imagen Carta",
            contentScale = ContentScale.Fit
        )
        Column(modifier = Modifier.fillMaxWidth().padding(top = 12.dp), horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = carta.nombre, fontWeight = FontWeight.Bold)
            Text(text = carta.numero)
        }
        Column() {
            Column {
                Card(modifier = Modifier.fillMaxWidth().padding(16.dp)) {
                    Text(text = "Información de la carta", modifier = Modifier.padding(horizontal = 16.dp).padding(top = 8.dp), fontWeight = FontWeight.Bold)
                    HorizontalDivider(
                        modifier = Modifier.padding(8.dp)
                    )
                    Row {
                        Column { Text(text = "Colección", modifier = Modifier.padding(horizontal = 16.dp), color = Color.Gray) }
                        Column(modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.End) { Text(text = carta.coleccion.nombre, modifier = Modifier.padding(horizontal = 16.dp)) }
                    }
                    HorizontalDivider(
                        modifier = Modifier.padding(8.dp)
                    )
                    Row {
                        Column { Text(text = "Rareza", modifier = Modifier.padding(horizontal = 16.dp), color = Color.Gray) }
                        Column(modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.End) { Text(text = carta.rareza, modifier = Modifier.padding(horizontal = 16.dp)) }
                    }
                    HorizontalDivider(
                        modifier = Modifier.padding(8.dp)
                    )
                    Row {
                        Column { Text(text = "Ilustrador", modifier = Modifier.padding(horizontal = 16.dp), color = Color.Gray) }
                        Column(modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.End) { Text(text = carta.ilustrador, modifier = Modifier.padding(horizontal = 16.dp)) }
                    }
                    HorizontalDivider(
                        modifier = Modifier.padding(8.dp)
                    )
                    Row {
                        Column { Text(text = "Precio", modifier = Modifier.padding(horizontal = 16.dp).padding(bottom = 8.dp), color = Color.Gray) }
                        Column(modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.End) { Text(text = "${String.format("%.2f", carta.precio)}€", modifier = Modifier.padding(horizontal = 16.dp)) }
                    }
                }
            }
            Row {
                Button(modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp).height(52.dp),
                    onClick = {
                        if(tieneCarta) {
                            onBorrarCarta(carta)
                        } else {
                            onAnadirCarta(carta)
                        }
                    }) {
                    Text(
                        if(tieneCarta) {
                            "Quitar de mi colección"
                        } else {
                            "Añadir a mi colección"
                        }
                    )
                }
            }

        }
    }


}
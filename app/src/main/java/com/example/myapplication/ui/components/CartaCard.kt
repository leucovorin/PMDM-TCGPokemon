package com.example.myapplication.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.R
import com.example.myapplication.model.Rareza
import com.example.myapplication.model.Carta
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.TextStyle
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.text.font.FontWeight
import coil.compose.AsyncImage
import com.example.myapplication.model.listaColecciones

@Composable
fun CartaCard (
    modifier: Modifier,
    carta: Carta,
    onClick: (Long) -> Unit
) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .clickable {
                    onClick(carta.id)
                },
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            val imagen = carta.imagen
            AsyncImage(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(300.dp),
                model = imagen,
                contentDescription = "Imagen Carta",
                contentScale = ContentScale.Fit
            )
            Row(
                modifier = Modifier.fillMaxSize(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column(
                    modifier = Modifier.weight(1f)
                ) {
                    Text(
                        text = "${carta.nombre}",
                        style = TextStyle(fontSize = 20.sp),
                        fontWeight = FontWeight.Medium
                    )
                }
                Column(
                    horizontalAlignment = Alignment.End
                ) {
                    Text(
                        text = "${carta.numero}"
                    )
                }
            }
            Row(
                modifier = Modifier.fillMaxSize()
            ) {
                Column(

                ) {
                    Text(
                        text = "${String.format("%.2f", carta.precio)}€"
                    )
                }
                Column() { }
            }
        }




}

@Preview(showBackground = true)
@Composable
private fun CartaCardPreview (){
    CartaCard(
        modifier = Modifier,
        carta = Carta(
            id = 1,
            nombre = "Nombre de la Carta",
            precio =  1.1F,
            rareza = Rareza.R,
            coleccion = listaColecciones[0],
            ilustrador = "payo",
            numero = "067",
            imagen = "1",
        ),
            onClick = {}
        )
}
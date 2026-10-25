package com.example.myapplication.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.model.Coleccion

@Composable
fun ColeccionCard(
    modifier: Modifier,
    coleccion: Coleccion,
    onClick: (Long) -> Unit
) {

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .clickable {
                onClick(coleccion.id)
            },
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        val imagen = coleccion.imagen
        Image(
            modifier = Modifier
                .fillMaxWidth()
                .height(150.dp)
                .background(Color.White),
            painter = painterResource(imagen),
            contentDescription = "Imagen Colección",
            contentScale = ContentScale.Fit
        )
        Row(
            modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column(
                modifier = Modifier.weight(1f)
            ) {
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    text = "${coleccion.nombre}",
                    fontWeight = FontWeight.Bold,
                    style = TextStyle(fontSize = 20.sp)
                )
            }
        }
        Row(
            modifier = Modifier.fillMaxSize()
        ) {
            Column(

            ) {
                Text(
                    text = coleccion.era
                )
            }
            Column() { }
        }

    }

}
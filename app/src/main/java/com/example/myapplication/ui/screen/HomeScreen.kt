package com.example.myapplication.ui.screen

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.myapplication.model.Carta
import androidx.compose.foundation.lazy.LazyColumn
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
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card

@Composable
fun HomeScreen(
    modifier: Modifier,
    cartas: List<Carta>,
    onCartaClick: (Long) -> Unit
) {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Button(
            modifier = Modifier.height(106.dp).weight(1f),
            shape = RoundedCornerShape(15.dp),
            onClick = {

            }) {
            Text(text = "Ver mi colección")
        }

        Button(
            modifier = Modifier.height(106.dp).weight(1f),
            shape = RoundedCornerShape(15.dp),
            onClick = {

            }) {
            Text(text = "Explorar sets")
        }

        Button(
            modifier = Modifier.height(106.dp).weight(1f),
            shape = RoundedCornerShape(15.dp),
            onClick = {

            }) {
            Text(text = "Explorar cartas")
        }
    }


}
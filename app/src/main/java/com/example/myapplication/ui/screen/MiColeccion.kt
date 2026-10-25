package com.example.myapplication.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.DockedSearchBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.SearchBar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.myapplication.model.Carta
import com.example.myapplication.ui.components.CartaCard

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MiColeccion(
    modifier: Modifier,
    misCartas: List<Carta>,
    onCartaClick: (Long) -> Unit
) {

    var query by remember { mutableStateOf("") }
    var active by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
            .padding(top = 16.dp)
    ) {

        DockedSearchBar(
            query = query,
            onQueryChange = { query = it },
            onSearch = { active = false },
            active = active,
            onActiveChange = { active = it },
            placeholder = {
                Text("Buscar carta")
            },
            leadingIcon = {
                IconButton(
                    onClick = {
                        active = false
                    }
                ) {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = "Buscar"
                    )
                }
            },
            trailingIcon = {
                if(query.isNotEmpty()) {
                    IconButton(
                        onClick = {
                            query = ""
                            active = false
                        }
                    ) {
                        Icon(
                            imageVector = Icons.Default.Close,
                            contentDescription = "Cerrar búsqueda"
                        )
                    }
                }
            }
        ) {}

        val cartasFiltradas = misCartas.filter { carta ->
            carta.nombre.contains(
                query,
                ignoreCase = true
            )
        }

        Column() {

            LazyVerticalGrid (
                modifier = Modifier.fillMaxWidth().weight(1f),
                columns = GridCells.Fixed(2),
                verticalArrangement = Arrangement.spacedBy(0.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                items(cartasFiltradas.size) { indice ->
                    val carta = cartasFiltradas[indice]
                    CartaCard(
                        modifier = Modifier.fillMaxWidth(),
                        carta = carta,
                        onClick = {
                            onCartaClick(carta.id)
                        }
                    )
                }
            }

        }

    }

}
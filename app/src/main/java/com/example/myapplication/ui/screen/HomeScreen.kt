package com.example.myapplication.ui.screen

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.myapplication.model.Carta
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.SearchBar
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.NavHostController
import com.example.myapplication.ui.components.CartaCard
import com.example.myapplication.ui.navegacion.Rutas
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.DockedSearchBar
import androidx.compose.material3.IconButton

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    modifier: Modifier,
    cartas: List<Carta>,
    onCartaClick: (Long) -> Unit,
    onMiColeccionClick: () -> Unit,
    onExplorarClick: () -> Unit
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

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Button(
                modifier = Modifier.height(76.dp).weight(1f),
                shape = RoundedCornerShape(15.dp),
                onClick = {
                    onMiColeccionClick()
                }) {
                Text(text = "Ver mi colección")
            }

            Button(
                modifier = Modifier.height(76.dp).weight(1f),
                shape = RoundedCornerShape(15.dp),
                onClick = {
                    onExplorarClick()
                }) {
                Text(text = "Explorar sets")
            }

        }

        val cartasFiltradas = cartas.filter { carta ->
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
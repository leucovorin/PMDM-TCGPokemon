package com.example.myapplication.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.myapplication.R
import com.example.myapplication.VariablesGlobales.nombreUsuario
import com.example.myapplication.model.Carta
import com.example.myapplication.model.Coleccion

@Composable
fun PerfilScreen(
    modifier: Modifier,
    listaCartas: List<Carta>,
    misCartas: List<Carta>,
    masColeccionadas: List<Coleccion>,
    onProgresoClick: () -> Unit
) {

    var mostrarPopup by remember { mutableStateOf(false) }
    var nuevoNombre by remember { mutableStateOf(nombreUsuario) }

    Column {
        Spacer(modifier = modifier.height(16.dp))
        Row() {
            Text(
                text = "${nombreUsuario}",
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier.padding(16.dp).padding(horizontal = 12.dp))
        }

        Column(modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp).weight(1f)) {
            Button(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 4.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF495D92)
                ),
                onClick = onProgresoClick,
                shape = RoundedCornerShape(15.dp),
                contentPadding = PaddingValues(16.dp)
            ) {
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "Progreso de tu colección",
                            modifier = Modifier.weight(1f)
                        )
                        Icon(
                            painter = painterResource(R.drawable.flechaa),
                            contentDescription = "La flecha indica que el elemento es pulsable",
                            modifier = Modifier.size(24.dp)
                        )
                    }


                    masColeccionadas.forEach { coleccion ->
                        val cartasObtenidas = misCartas
                            .filter { it.coleccion.id == coleccion.id }
                            .distinctBy { it.id }
                            .size

                        val totalCartas = listaCartas
                            .count { it.coleccion.id == coleccion.id }

                        val progreso = if (totalCartas > 0) {
                            cartasObtenidas.toFloat() / totalCartas
                        } else {
                            0f
                        }

                        Card(
                            modifier = Modifier.fillMaxWidth(),
                            colors = CardDefaults.cardColors(
                                containerColor = Color.White
                            )
                        ) {
                            Column(
                                modifier = Modifier.padding(12.dp)
                            ) {
                                Text(
                                    text = coleccion.nombre,
                                    color = Color.Black,
                                    fontWeight = FontWeight.SemiBold
                                )

                                Spacer(modifier = Modifier.height(8.dp))

                                Row(
                                    modifier = Modifier.fillMaxWidth(),
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    LinearProgressIndicator(
                                        progress = { progreso },
                                        modifier = Modifier
                                            .weight(1f)
                                            .height(8.dp)
                                            .clip(RoundedCornerShape(50)),
                                        color = Color(0xFF495D92),
                                        trackColor = Color.LightGray
                                    )

                                    Spacer(modifier = Modifier.width(12.dp))

                                    Text(
                                        text = "${cartasObtenidas}/${totalCartas}",
                                        color = Color.Black
                                    )
                                }
                            }
                        }
                    }
                }
            }
            Column {
                Spacer(modifier = Modifier.height(16.dp))
                Row() {
                    Column(modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp).weight(1f)) {
                        Text(text = "Ajustes", fontWeight = FontWeight.SemiBold)
                    }
                }
                Row() {
                    Button(
                        modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 4.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xFF495D92)
                        ),
                        onClick = {
                            nuevoNombre = nombreUsuario
                            mostrarPopup = true
                        },
                        shape = RoundedCornerShape(15.dp),
                        contentPadding = PaddingValues(16.dp)
                    ) {
                        Text(text = "Cambiar nombre")
                    }
                }
            }
        }
    }
    if (mostrarPopup) {
        AlertDialog(
            onDismissRequest = {
                mostrarPopup = false
            },
            title = {
                Text("Cambiar nombre")
            },
            text = {
                OutlinedTextField(
                    value = nuevoNombre,
                    onValueChange = { nuevoNombre = it },
                    label = { Text("Nuevo nombre") },
                    singleLine = true
                )
            },
            confirmButton = {
                TextButton(
                    onClick = {
                        if (nuevoNombre.isNotBlank()) {
                            nombreUsuario = nuevoNombre.trim()
                            mostrarPopup = false
                        }
                    }
                ) {
                    Text("Guardar")
                }
            },
            dismissButton = {
                TextButton(
                    onClick = {
                        mostrarPopup = false
                    }
                ) {
                    Text("Cancelar")
                }
            }
        )
    }
}

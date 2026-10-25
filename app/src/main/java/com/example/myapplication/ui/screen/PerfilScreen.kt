package com.example.myapplication.ui.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.myapplication.R
import com.example.myapplication.model.Carta

@Composable
fun PerfilScreen(
    modifier: Modifier,
    cartas: List<Carta>,
    navController: NavController
) {

    Column {
        Spacer(modifier= Modifier.height(16.dp))
        Row() {
            Column( modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp).weight(1f)  ) {
                Card(
                    modifier = Modifier.fillMaxWidth().height(35.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color.Transparent
                    )
                ) {
                    Box(
                        modifier = Modifier.fillMaxSize()
                    ) {
                        Text(text = "{nombre}")
                    }
                }
            }

        }
        Row() {
            Column( modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp).weight(1f)  ) {
                Card( modifier = Modifier.fillMaxWidth().height(150.dp) ) {
                    Box(
                        modifier = Modifier.fillMaxSize().padding(16.dp)
                    ) {
                        Row {
                            Column( modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp).weight(1f) ) {
                                Text( text = "Progreso de tu colección" )
                            }
                            Column( modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp).weight(0.2f), horizontalAlignment = Alignment.End) {
                                Icon(painter = painterResource(R.drawable.flechaa), contentDescription = "La flecha indica que el elemento es pulsable", modifier = Modifier.height(24.dp))
                            }
                        }
                    }
                }

            }
        }
        Row {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            ) {

            }
        }
        Row {

        }
    }

}
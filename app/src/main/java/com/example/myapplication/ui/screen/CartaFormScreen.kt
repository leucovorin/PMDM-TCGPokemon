package com.example.myapplication.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.myapplication.model.Carta
import com.example.myapplication.model.CartaColeccion
import com.example.myapplication.model.Condicion
import com.example.myapplication.model.Idioma
import com.example.myapplication.model.listaColecciones
import kotlin.math.exp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CartaFormScreen(

    modifier: Modifier,
    carta: Carta?,
    cartaInicial: CartaColeccion?,
    misCartas: List<CartaColeccion>,
    onSaveClick: (CartaColeccion) -> Unit,
    onCancelarClick: () -> Unit,
    onBorrarCarta: (CartaColeccion) -> Unit

    ) {

    val condicionOptions = listOf<String>(
        Condicion.PO,
        Condicion.HP,
        Condicion.MP,
        Condicion.LP,
        Condicion.NM,
        Condicion.MT
    )

    val idiomaOptions = listOf<String>(
        Idioma.es,
        Idioma.lat,
        Idioma.en,
        Idioma.ita,
        Idioma.po,
        Idioma.de,
        Idioma.fr,
        Idioma.kr,
        Idioma.ch,
        Idioma.th,
        Idioma.ind
    )

    var nombre by remember {
        mutableStateOf(cartaInicial?.carta?.nombre ?: carta?.nombre)
    }

    var rareza by remember {
        mutableStateOf(cartaInicial?.carta?.rareza ?: carta?.rareza)
    }

    var precio by remember {
        mutableStateOf(cartaInicial?.carta?.precio?.toString() ?: carta?.precio)
    }

    var numero by remember {
        mutableStateOf(cartaInicial?.carta?.numero ?: carta?.numero)
    }

    var imagen by remember {
        mutableStateOf(cartaInicial?.carta?.imagen ?: carta?.imagen)
    }

    var ilustrador by remember {
        mutableStateOf(cartaInicial?.carta?.ilustrador ?: carta?.ilustrador)
    }

    var coleccion by remember {
        mutableStateOf(cartaInicial?.carta?.coleccion ?: carta?.coleccion)
    }

    var idioma by remember {
        mutableStateOf(cartaInicial?.idioma ?: "")
    }

    var condicionIndex by remember {
        mutableIntStateOf(condicionOptions.indexOf(cartaInicial?.condicion).coerceAtLeast(0))
    }

    var idiomaIndex by remember {
        mutableIntStateOf(idiomaOptions.indexOf(cartaInicial?.condicion).coerceAtLeast(0))
    }

    Column(
        modifier = Modifier
            .padding(horizontal = 16.dp)
            .padding(vertical = 8.dp),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally,

    ) {

        val imagen = carta?.imagen ?: cartaInicial?.carta?.imagen
        AsyncImage(
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp),
            model = imagen,
            contentDescription = "Imagen Carta",
            contentScale = ContentScale.Fit
        )

        var expanded1 by remember { mutableStateOf(false) }
        var expanded2 by remember { mutableStateOf(false) }

        ExposedDropdownMenuBox(
            expanded = expanded2,
            onExpandedChange = { expanded2 = !expanded2 }
        ) {
            OutlinedTextField(
                value = idiomaOptions.getOrNull(idiomaIndex) ?: "",
                onValueChange = {},
                label = { Text("Idioma") },
                readOnly = true,
                trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded = expanded2) },
                colors = ExposedDropdownMenuDefaults.outlinedTextFieldColors(),
                modifier = Modifier.menuAnchor()
            )
            ExposedDropdownMenu(
                expanded = expanded2,
                onDismissRequest = { expanded2 = false }
            ) {

                idiomaOptions.forEachIndexed { index, idioma ->

                    DropdownMenuItem(
                        text = { Text(idioma) },
                        onClick = {
                            idiomaIndex = index
                            expanded2 = false
                        }
                    )
                }
            }
        }

        ExposedDropdownMenuBox(
            expanded = expanded1,
            onExpandedChange = { expanded1 = !expanded1 }
        ) {
            OutlinedTextField(
                value = condicionOptions.getOrNull(condicionIndex) ?: "",
                onValueChange = {},
                label = { Text("Condición") },
                readOnly = true,
                trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded = expanded1) },
                colors = ExposedDropdownMenuDefaults.outlinedTextFieldColors(),
                modifier = Modifier.menuAnchor()
            )
            ExposedDropdownMenu(
                expanded = expanded1,
                onDismissRequest = { expanded1 = false }
            ) {

                condicionOptions.forEachIndexed { index, opcion ->

                    DropdownMenuItem(
                        text = { Text(opcion) },
                        onClick = {
                            condicionIndex = index
                            expanded1 = false
                        }
                    )
                }
            }
        }
        Spacer(modifier = Modifier.height(18.dp))
        Button(modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp).height(52.dp),
            onClick = {
                if(cartaInicial != null) {
                    onBorrarCarta(cartaInicial)
                }
                val cartaFinal = CartaColeccion(
                    id = cartaInicial?.id ?: System.currentTimeMillis(),
                    carta = carta ?: cartaInicial?.carta ?: Carta(1, "Esto no debería mostrarse...", "", 3f, "", "", listaColecciones[1], "" ),
                    idioma = idiomaOptions[idiomaIndex],
                    condicion = condicionOptions[condicionIndex]
                )
                onSaveClick(cartaFinal)
            }) {
            Text("Guardar carta")
        }
        Button(modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp).height(52.dp),
            onClick = { onCancelarClick() }
        ) {
            Text("Cancelar")
        }
    }



}
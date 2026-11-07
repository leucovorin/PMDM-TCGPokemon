package com.example.myapplication.model

data class CartaColeccion(
    val id: Long,
    val carta: Carta,
    val idioma: String,
    val condicion: String
)

object Idioma {
    const val es = "Español"
    const val lat = "Español (latinoamérica)"
    const val en = "Inglés"
    const val ita = "Italiano"
    const val po = "Portugués"
    const val de = "Alemán"
    const val fr = "Francés"
    const val kr = "Coreano"
    const val ch = "Chino"
    const val th = "Tailandés"
    const val ind = "Indonesio"
}

object Condicion {
    const val PO = "Muy pobre"
    const val HP = "Mala"
    const val MP = "Moderadamente buena"
    const val LP = "Bastante buena"
    const val NM = "Casi nueva"
    const val MT = "Perfecta"
}
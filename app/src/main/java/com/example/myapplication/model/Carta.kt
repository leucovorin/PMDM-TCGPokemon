package com.example.myapplication.model

data class Carta (
    val nombre: String,
    val rareza: String,
    val precio: Float,
    val numero: String,
    val ilustrador: String,
    val coleccion: Int, // Próximamente será de la clase "Coleccion"
    val imagen: Int
)

object Rareza {
    const val C = "Common"
    const val U = "Uncommon"
    const val R = "Rare"
    const val RR = "Double Rare"
    const val ACE = "Ace Spec Rare"
    const val AR = "Illustration Rare"
    const val SR = "Ultra Rare"
    const val SAR = "Special Illustration Rare"
    const val UR = "Hyper Rare"
    const val S = "Shiny Rare"
    const val SSR = "Shiny Ultra Rare"
    const val PROMO = "Black Star Promo"
    const val RH = "Rare Holo"
}
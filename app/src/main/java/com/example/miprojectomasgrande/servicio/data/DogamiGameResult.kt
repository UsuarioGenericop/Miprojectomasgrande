package com.example.miprojectomasgrande.servicio.data

data class Games(val games: List<DogamiGameResult>)

data class DogamiGameResult(
    val id: Int,
    val name: String,
    val minPlayers: Int,
    val maxPlayers: Int,
    val description: String,
    val time: String,
    val complexity: String,
    val minAge: String,
    val imageUrl: String,
    val posterUrl: String,
    val favorite: Boolean
)
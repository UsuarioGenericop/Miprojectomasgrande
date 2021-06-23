package com.example.miprojectomasgrande.servicio

import com.example.miprojectomasgrande.servicio.data.DogamiGameResult


interface GameClickListener {

    fun onGameClicked(dogamiGameResult: DogamiGameResult)
}
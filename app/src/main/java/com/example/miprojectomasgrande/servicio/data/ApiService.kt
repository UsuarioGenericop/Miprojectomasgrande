package com.example.miprojectomasgrande.servicio.data

import retrofit2.Call
import retrofit2.http.GET

interface ApiService {



    @GET("games")
    fun getGames():  Call<Games>

}
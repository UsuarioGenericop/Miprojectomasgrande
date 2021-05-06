package com.example.miprojectomasgrande.servicio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.miprojectomasgrande.R
import com.example.miprojectomasgrande.servicio.data.ApiClient
import com.example.miprojectomasgrande.servicio.data.DogamiGameResult
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class LlamarServicioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_llamar_servicio)
        getGames()
    }
    private fun getGames() {

        ApiClient.apiService.getGames().enqueue(object : Callback<MutableList<DogamiGameResult>> {
            override fun onFailure(call: Call<MutableList<DogamiGameResult>>, t: Throwable) {
                //Show error
            }

            override fun onResponse(
                call: Call<MutableList<DogamiGameResult>>,
                response: Response<MutableList<DogamiGameResult>>
            ) {
                val usersResponse = response.body()
            }
        })

    }

}
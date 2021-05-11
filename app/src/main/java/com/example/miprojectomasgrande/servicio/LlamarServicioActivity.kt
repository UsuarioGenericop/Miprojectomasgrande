package com.example.miprojectomasgrande.servicio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.miprojectomasgrande.R
import com.example.miprojectomasgrande.servicio.data.ApiClient
import com.example.miprojectomasgrande.servicio.data.DogamiGameResult
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class LlamarServicioActivity : AppCompatActivity() {
    lateinit var resultTextView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_llamar_servicio)
        resultTextView = findViewById(R.id.textView)
        getGames()
    }

    private fun getGames() {
        Thread(Runnable {
            ApiClient.apiService.getGames().enqueue(object :
                Callback<MutableList<DogamiGameResult>> {
                override fun onFailure(call: Call<MutableList<DogamiGameResult>>, t: Throwable) {
                    resultTextView.post {
                        resultTextView.text = "Error loading data :("
                    }
                }

                override fun onResponse(
                    call: Call<MutableList<DogamiGameResult>>,
                    response: Response<MutableList<DogamiGameResult>>
                ) {
                    resultTextView.post {
                        resultTextView.text = response.body().toString()
                    }
                }
            })
        }).start()
    }

}
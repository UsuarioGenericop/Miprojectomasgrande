package com.example.miprojectomasgrande.servicio.gamedetail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.miprojectomasgrande.R
import com.example.miprojectomasgrande.servicio.data.DogamiGameResult

class GameDetailActivity : AppCompatActivity() {

    lateinit var titleTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_detail)

        val game: DogamiGameResult =
            intent.getParcelableExtra<DogamiGameResult>("game") as DogamiGameResult


        titleTextView = findViewById(R.id.tvTitulo)
        titleTextView.text = game.name

    }
}
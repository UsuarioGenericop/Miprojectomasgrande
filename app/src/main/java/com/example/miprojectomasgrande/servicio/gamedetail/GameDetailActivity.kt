package com.example.miprojectomasgrande.servicio.gamedetail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toolbar
import com.bumptech.glide.Glide
import com.example.miprojectomasgrande.R
import com.example.miprojectomasgrande.servicio.data.DogamiGameResult

class GameDetailActivity : AppCompatActivity() {

    lateinit var titleTextView: TextView
    lateinit var timeTextView: TextView
    lateinit var minPlayersTextView: TextView
    lateinit var complexityTextView: TextView
    lateinit var descriptionTextView: TextView
    lateinit var posterImageView: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_detail)

        val game: DogamiGameResult =
            intent.getParcelableExtra<DogamiGameResult>("game") as DogamiGameResult


        titleTextView = findViewById(R.id.tvTitulo)
        titleTextView.text = game.name
        timeTextView = findViewById(R.id.tvPartida2)
        timeTextView.text = game.time
        minPlayersTextView = findViewById(R.id.tvJugadores2)
        minPlayersTextView.text = "${game.minPlayers}-${game.maxPlayers}"
        complexityTextView = findViewById(R.id.tvDificultad2)
        complexityTextView.text = game.complexity
        descriptionTextView = findViewById(R.id.tvDescripcion)
        descriptionTextView.text = game.description
        posterImageView = findViewById(R.id.gamePosterImageView)
        Glide.with(this)
            .load(game.posterUrl)
            .centerCrop()
            .into(posterImageView)


    }
}
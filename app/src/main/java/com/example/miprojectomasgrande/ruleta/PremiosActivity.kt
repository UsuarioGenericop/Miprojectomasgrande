package com.example.miprojectomasgrande.ruleta

import PrizeAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.miprojectomasgrande.R

class PremiosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_premios)
        val premioOne = Premio(
            imagen = R.drawable.cherry,
            recompensa = 300
        )
        val premioTwo = Premio(
            imagen = R.drawable.coin,
            recompensa = 400

        )
        val premioThree = Premio(
            imagen = R.drawable.diamond,
            recompensa = 500
        )
        val premioFour = Premio(
            imagen = R.drawable.heart,
            recompensa = 600

        )
        val premioFive = Premio(
            imagen = R.drawable.lemon,
            recompensa = 650
        )
        val premioSix = Premio(
            imagen = R.drawable.orange,
            recompensa = 700

        )
        val premioSeven = Premio(
            imagen = R.drawable.seven,
            recompensa = 800
        )

        val listaDePremios: ArrayList<Premio> = arrayListOf(
            premioOne,
            premioTwo,
            premioThree,
            premioFour,
            premioFive,
            premioSix,
            premioSeven
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rvPrizes)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val adapter = PrizeAdapter(this, listaDePremios)
        recyclerView.adapter = adapter


    }
}
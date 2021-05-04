package com.example.miprojectomasgrande.ruleta

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.example.miprojectomasgrande.R

class TragaPerrasActivity : AppCompatActivity() {

    var contador = 0

    lateinit var tvContador: TextView

    val images: ArrayList<Int> = arrayListOf(
        R.drawable.cherry,
        R.drawable.coin,
        R.drawable.diamond,
        R.drawable.heart,
        R.drawable.lemon,
        R.drawable.orange,
        R.drawable.seven
    )

    lateinit var ivimagen1: ImageView
    lateinit var ivimagen2: ImageView
    lateinit var ivimagen3: ImageView
    lateinit var btGirar: Button
    lateinit var tvPerdiste: TextView
    lateinit var tvGanaste: TextView
    lateinit var btMoneda: Button

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_traga_perras)
        val premios: Button = findViewById(R.id.btPremios)
        premios.setOnClickListener {
            val intent = Intent(this, PremiosActivity::class.java)
            startActivity(intent)
        }
        ivimagen1 = findViewById(R.id.ivImagen1)
        ivimagen2 = findViewById(R.id.ivImagen2)
        ivimagen3 = findViewById(R.id.ivImagen3)
        btGirar = findViewById(R.id.btTragaPerrear)
        tvPerdiste = findViewById(R.id.tvPerdiste)
        tvGanaste = findViewById(R.id.tvGanaste)
        btMoneda = findViewById(R.id.btMoneda)
        tvContador = findViewById(R.id.tvContador)



        btGirar.setOnClickListener {
            gitar()

        }

        btMoneda.setOnClickListener {
            incrementarMonedas()
            sonidito()
        }

    }

    fun incrementarMonedas() {
        contador += 300
        tvContador.text = contador.toString()
    }

    fun decrementarMonedas() {
        tvContador.text = contador.toString()
        contador -= 300
    }

    fun sonidito() {
        val mp: MediaPlayer = MediaPlayer.create(
            applicationContext,
            R.raw.insert_coin_effect
        )
        mp.start()
    }

    fun gitar() {
        decrementarMonedas()
        var imagenAleatoria1 = images.random()
        var imagenAleatoria2 = images.random()
        var imagenAleatoria3 = images.random()
        ivimagen1.setImageDrawable(
            ContextCompat.getDrawable(
                this, imagenAleatoria1
            )

        )
        ivimagen2.setImageDrawable(
            ContextCompat.getDrawable(
                this, imagenAleatoria2
            )
        )
        ivimagen3.setImageDrawable(
            ContextCompat.getDrawable(
                this, imagenAleatoria3
            )
        )
        if (imagenAleatoria1 == imagenAleatoria2 && imagenAleatoria1 == imagenAleatoria3) {
            tvGanaste.visibility = View.VISIBLE
            tvPerdiste.visibility = View.GONE
        } else {
            tvPerdiste.visibility = View.VISIBLE
            tvGanaste.visibility = View.GONE
        }
    }
}

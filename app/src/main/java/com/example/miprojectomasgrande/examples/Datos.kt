package com.example.miprojectomasgrande.examples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.miprojectomasgrande.R

class Datos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_datos)

        val tvTuNombre : TextView = findViewById(R.id.tvTuNombre)
        tvTuNombre.text = intent.getStringExtra("nombre")
        val tvTuEdad : TextView = findViewById(R.id.tvTuEdad)
        tvTuEdad.text = intent.getIntExtra("edad",0).toString()
        val tvPeliculaFavorita : TextView = findViewById(R.id.tvPeliculaFavorita)
        tvPeliculaFavorita.text = intent.getStringExtra("peliculaFavorita")
        val tvPiojos : TextView = findViewById(R.id.tvPiojos)
        tvPiojos.text = intent.getBooleanExtra("piojos",false).toString()
        val tvNacimiento : TextView = findViewById(R.id.tvNacimiento)
        tvNacimiento.text = intent.getIntExtra("nacimiento",0).toString()


    }
}
package com.example.miprojectomasgrande.FORMULARIO

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import com.example.miprojectomasgrande.examples.Datos
import com.example.miprojectomasgrande.R

class Formulario : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formulario)
        val nombreet: EditText = findViewById(R.id.etNombre)
        val edadet: EditText = findViewById(R.id.etEdad)
        val peliculaFavoritaet: EditText = findViewById(R.id.etPeliculaFavorita)
        val validar: Button = findViewById(R.id.btValidar)
        val nacimientoet: EditText = findViewById(R.id.etNacimiento)
        val piojoset: CheckBox = findViewById(R.id.cbPiojos)
        validar.setOnClickListener {
            val intent = Intent(this, Datos::class.java)

            var nombre = ""
            if (nombreet.text.toString() != "") {
                nombre = nombreet.text.toString()
            } else {
                nombreet.error = "Este campo es obligatorio"
            }
            var edad = 0
            if (edadet.text.toString() != "") {
                edad = edadet.text.toString().toInt()
            } else {
                edadet.error = "Este campo es obligatorio"
            }

            var pelicula = ""
            if (peliculaFavoritaet.text.toString() != "") {
                pelicula = peliculaFavoritaet.text.toString()
            } else {
                peliculaFavoritaet.error = "Este campo es obligatorio"
            }

            var nacimiento = ""
            if (nacimientoet.text.toString() != "") {
                nacimiento = nacimientoet.text.toString()
            } else {
                nacimientoet.error = "Este campo es obligatorio"
            }

            var piojos = true
            if (piojoset.text.toString() != "") {
                piojos = piojoset.text.toString().toBoolean()
            } else {
                piojoset.error = "Este campo es obligatorio"
            }

            intent.putExtra("nombre", nombre)
            intent.putExtra("edad", edad)
            intent.putExtra("peliculaFavorita", pelicula)
            intent.putExtra("nacimiento", nacimiento)
            intent.putExtra("piojos", piojos)
            startActivity(intent)
        }


    }
}
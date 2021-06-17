package com.example.miprojectomasgrande.start

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.miprojectomasgrande.R
import com.example.miprojectomasgrande.FORMULARIO.Formulario
import com.example.miprojectomasgrande.servicio.LlamarServicioActivity
import com.example.miprojectomasgrande.ruleta.TragaPerrasActivity


class Inicio : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio)
        val formulario: Button = findViewById(R.id.btFormulario)
        val tragaPerras: Button = findViewById(R.id.btTragaPerras)
        var servicio: Button = findViewById(R.id.btServicio)

        formulario.setOnClickListener {
            val intent = Intent(this, Formulario::class.java)
            startActivity(intent)
        }
        tragaPerras.setOnClickListener {
            val intent = Intent(this, TragaPerrasActivity::class.java)
            startActivity(intent)
        }
        servicio.setOnClickListener {
            val intent = Intent(this, LlamarServicioActivity::class.java)
            startActivity(intent)
        }
    }
}

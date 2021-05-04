package com.example.miprojectomasgrande

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.Window
import android.view.WindowManager
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import com.example.miprojectomasgrande.start.Inicio


class HeladeriaKreiserSupra : AppCompatActivity() {
    lateinit var imagen : ImageView
    lateinit var titulazo : TextView
    lateinit var titulazo2 : TextView
    lateinit var topAnim : Animation
    lateinit var botAnim : Animation

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_heladeria_kreiser_supra)
        imagen = findViewById(R.id.androi)
        titulazo = findViewById(R.id.titulazo)
        titulazo2 = findViewById(R.id.titulazo2)

        topAnim = AnimationUtils.loadAnimation(this, R.anim.top_animation)
        botAnim = AnimationUtils.loadAnimation(this, R.anim.bottom_animation)
        loadAnimation()
        loadMainScreen()
    }



    private fun loadAnimation(){
        imagen.animation = topAnim
        titulazo.animation = botAnim
        titulazo2.animation = botAnim
    }
    private fun loadMainScreen() {
        Handler().postDelayed(Runnable {
            startActivity(Intent(this, Inicio::class.java))
        }, 2000)
    }
}

package com.example.miprojectomasgrande.servicio

import GameAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Adapter
import android.widget.ScrollView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.miprojectomasgrande.R
import com.example.miprojectomasgrande.servicio.data.ApiClient
import com.example.miprojectomasgrande.servicio.data.DogamiGameResult
import com.example.miprojectomasgrande.servicio.data.Games
import com.margge.dogami.presentation.utils.SpacesItemDecoration
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class LlamarServicioActivity : AppCompatActivity() {
    lateinit var gamesRecyclerView: RecyclerView
    lateinit var adapter : GameAdapter
    lateinit var errorView : ScrollView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_llamar_servicio)
        gamesRecyclerView = findViewById(R.id.rbGames)
        errorView = findViewById(R.id.errorView)
        gamesRecyclerView.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        val decoration = SpacesItemDecoration(50)
        gamesRecyclerView.addItemDecoration(decoration)
        getGames()
    }

    private fun getGames() {
        Thread(Runnable {
            ApiClient.apiService.getGames().enqueue(object :
                Callback<Games> {

                override fun onFailure(call: Call<Games>, t: Throwable) {
                    showErrorView()
                }

                override fun onResponse(call: Call<Games>, response: Response<Games>) {
                    gamesRecyclerView.post {
                        val body = response.body()
                        body?.run {
                            showGames(this.games)
                        }
                    }
                }
            })
        }).start()
    }
    private fun showGames(list: List<DogamiGameResult>?) {
        list?.run {
            adapter = GameAdapter(this@LlamarServicioActivity, this.toMutableList())
            gamesRecyclerView.adapter = adapter
        }
        gamesRecyclerView.visibility = View.VISIBLE
        errorView.visibility = View.GONE
    }
    private fun showErrorView(){
        gamesRecyclerView.visibility = View.GONE
        errorView.visibility = View.VISIBLE
    }
}
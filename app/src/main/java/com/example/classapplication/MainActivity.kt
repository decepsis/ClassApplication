package com.example.classapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.game_recycler_view)

        recyclerView.layoutManager = LinearLayoutManager(this)

        val games = mutableListOf<Game>()
        for(i in 0..30){
            games.add(createGames())
        }

        val adapter = GameAdapter(games)
        recyclerView.adapter = adapter

    }

    private fun createGames() = Game(
        name = "Minecraft",
        genre = "Survival",
        price = 24.99,
        coverArt = R.drawable.cat,
        dlc = listOf<String>(),
    )
}
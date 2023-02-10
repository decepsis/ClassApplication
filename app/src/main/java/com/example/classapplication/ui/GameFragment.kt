package com.example.classapplication.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.classapplication.Game
import com.example.classapplication.GameAdapter
import com.example.classapplication.R

class GameFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_game_list, container, false)

        val recyclerView = view.findViewById<RecyclerView>(R.id.game_recycler_view)

        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        val game1 = Game(
            "Minecraft",
            listOf<String>("Survival", "Sandbox"),
            19.99,
            R.drawable.minecraft_logo,
            listOf<String>("N/A")
        )

        val game2 = Game(
            "Not For Broadcast",
            listOf<String>("Indie", "Adventure", "Simulation"),
            19.99,
            R.drawable.not_for_broadcast,
            listOf<String>("Live and Spooky")
        )

        val game3 = Game(
            "Disco Elysium",
            listOf<String>("RPG", "Indie", "Detective"),
            39.99,
            R.drawable.disco_elysium,
            listOf<String>("N/A")
        )

        val game4 = Game(
            "Stardew Valley",
            listOf<String>("Farming", "Indie", "Simulation"),
            14.99,
            R.drawable.placeholder,
            listOf<String>("N/A")
        )

        val game5 = Game(
            "Opus Magnum",
            listOf<String>("Puzzle", "Indie", "Programming"),
            19.99,
            R.drawable.placeholder,
            listOf<String>("N/A")
        )

        val games = mutableListOf<Game>()
        games.add(game1)
        games.add(game2)
        games.add(game3)
        games.add(game4)
        games.add(game5)


        val adapter = GameAdapter(games)
        recyclerView.adapter = adapter

        return view
    }

}
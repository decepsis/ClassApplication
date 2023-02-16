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
            "https://assets.nintendo.com/image/upload/c_fill,w_1200/q_auto:best/f_auto/dpr_2.0" +
                    "/ncom/software/switch/70010000000964/811461b8d1cacf1f2da791b478dccfe2a55457780364c3d5a95fbfcdd4c3086f",
            listOf<String>("N/A"),
            "In Minecraft, players explore a blocky, procedurally generated, three-dimensional" +
                    " world with virtually infinite terrain and may discover and extract raw materials," +
                    " craft tools and items, and build structures, earthworks, and machines.\n"
        )

        val game2 = Game(
            "Not For Broadcast",
            listOf<String>("Indie", "Adventure", "Simulation"),
            19.99,
            "https://images.gog-statics.com/9331cb840da7aa3a412107f3e38450ac2d6daefd6eaddc2e3e96e1c657d4c279.jpg",
            listOf<String>("Live and Spooky"),
            "The National Nightly News is live and you’re the brains behind the scenes. Beep" +
                    " the swears, keep the cameras on the celebs and keep the audience hooked in this" +
                    " darkly comedic game of televised chaos."
        )

        val game3 = Game(
            "Disco Elysium",
            listOf<String>("RPG", "Indie", "Detective"),
            39.99,
            "https://images.gog-statics.com/b0864505790d5178ededf477e1b28d3f96ccba8082ca6c6bacc10354e40201cd.jpg",
            listOf<String>("N/A"),
            "Disco Elysium - The Final Cut is a groundbreaking role playing game. You’re a " +
                    "detective with a unique skill system at your disposal and a whole city to carve" +
                    " your path across. Interrogate unforgettable characters, crack murders or take " +
                    "bribes. Become a hero or an absolute disaster of a human being."
        )

        val game4 = Game(
            "Stardew Valley",
            listOf<String>("Farming", "Indie", "Simulation"),
            14.99,
            "https://assets.nintendo.com/image/upload/c_fill,w_1200/q_auto:best/f_auto/dpr_2.0" +
                    "/ncom/en_US/games/switch/s/stardew-valley-switch/hero",
            listOf<String>("N/A"),
            "You've inherited your grandfather's old farm plot in Stardew Valley. Armed with" +
                    " hand-me-down tools and a few coins, you set out to begin your new life. Can " +
                    "you learn to live off the land and turn these overgrown fields into a thriving home?"
        )

        val game5 = Game(
            "Opus Magnum",
            listOf<String>("Puzzle", "Indie", "Programming"),
            19.99,
            "https://i.ytimg.com/vi/Uj689znjxpg/maxresdefault.jpg",
            listOf<String>("N/A"),
            "Opus Magnum is the latest open-ended puzzle game from Zachtronics, the creators" +
                    " of SpaceChem, Infinifactory, and SHENZHEN I/O. Design and build machines that" +
                    " assemble potions, poisons, and more using the alchemical engineer’s most advanced" +
                    " tool: the transmutation engine!"
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
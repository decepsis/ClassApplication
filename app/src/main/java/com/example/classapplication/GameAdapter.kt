package com.example.classapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf
import androidx.fragment.app.commit
import androidx.recyclerview.widget.RecyclerView
import com.example.classapplication.ui.GameDetailFragment
import com.bumptech.glide.Glide

class GameAdapter(private val games: List<Game>):
    RecyclerView.Adapter<GameAdapter.GameViewHolder>() {

    inner class GameViewHolder(
        itemView: View,
        private val onItemClick: (adapterPosition: Int) -> Unit
    ): RecyclerView.ViewHolder(itemView){

        val gameCover: ImageView = itemView.findViewById(R.id.game_cover)
        val gameName: TextView = itemView.findViewById(R.id.game_name)
        val price: TextView = itemView.findViewById(R.id.price)
        val genre: TextView = itemView.findViewById(R.id.genre)
        val dlc: TextView = itemView.findViewById(R.id.dlc)

        init {
            itemView.setOnClickListener {
                onItemClick(adapterPosition)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GameViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.game_card_view, parent, false)
        return GameViewHolder(view) { position ->
            val game = games[position]

            val bundle = bundleOf(
                "name" to game.name,
                "price" to game.price,
                "genre" to game.genre,
                "art" to game.coverArt,
                "dlc" to game.dlc

            )

            val detailFragment = GameDetailFragment()
            detailFragment.arguments = bundle

            val activity = view.context as AppCompatActivity

            activity.supportFragmentManager.commit {
                setReorderingAllowed(true)
                replace(R.id.fragment_container_view,detailFragment)
            }
        }
    }

    override fun getItemCount() = games.size

    override fun onBindViewHolder(holder: GameViewHolder, position: Int) {
        val game = games[position]
        val formattedPrice = "$".plus(game.price.toString())
        holder.gameCover.setImageResource(game.coverArt)
        holder.gameName.text = game.name
        holder.price.text = formattedPrice
        holder.genre.text = game.genre.toString()
        holder.dlc.text = game.dlc.toString()
    }
}
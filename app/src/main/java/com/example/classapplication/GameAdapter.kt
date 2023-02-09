package com.example.classapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class GameAdapter(private val games: List<Game>): RecyclerView.Adapter<GameAdapter.GameViewHolder>() {

    class GameViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val gameCover: ImageView = itemView.findViewById(R.id.game_cover)
        val gameName: TextView = itemView.findViewById(R.id.game_name)
        val price: TextView = itemView.findViewById(R.id.price)
        val genre: TextView = itemView.findViewById(R.id.genre)
        val dlc: TextView = itemView.findViewById(R.id.dlc)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GameViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.game_card_view, parent, false)
        return GameViewHolder(view)
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
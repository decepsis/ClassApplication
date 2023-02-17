package com.example.classapplication.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.example.classapplication.R

class GameDetailFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_game_detail, container, false)

        if (arguments != null){
            val name = requireArguments().getString("name")
            val price = requireArguments().getDouble("price")
            val art = requireArguments().getString("art")
            val genre = requireArguments().getStringArrayList("genre")
            val summary = requireArguments().getString("summary")
            val imageView = view.findViewById<ImageView>(R.id.game_cover_art)

            Glide.with(this).load(art).into(imageView)

            view.findViewById<TextView>(R.id.game_name).text = name
            view.findViewById<TextView>(R.id.price).text = price.toString()
            view.findViewById<TextView>(R.id.genre).text = genre.toString()
            view.findViewById<TextView>(R.id.summary).text = summary




        }



        return view
    }


}
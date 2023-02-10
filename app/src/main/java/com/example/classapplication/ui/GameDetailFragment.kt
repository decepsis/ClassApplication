package com.example.classapplication.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
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
            val price = requireArguments().getString("price")
            val art = requireArguments().getString("art")
            val genre = requireArguments().getString("genre")

            view.findViewById<TextView>(R.id.game_name).text = name
        }



        return view
    }


}
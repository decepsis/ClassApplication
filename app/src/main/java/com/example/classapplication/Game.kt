package com.example.classapplication

import android.os.Parcelable

data class Game(

    val name: String,
    val genre: ArrayList<String>,
    val price: Double,
    val coverArt: String,
    val dlc: ArrayList<String>,
    val summary: String

)
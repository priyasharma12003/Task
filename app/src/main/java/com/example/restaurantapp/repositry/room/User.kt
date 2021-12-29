package com.example.restaurantapp.repositry.room

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName =USER_TABLE)
data class User(
    @PrimaryKey(autoGenerate = true)
    val id:Long=0,

    var password: String?="",

    var email:String?="",
)
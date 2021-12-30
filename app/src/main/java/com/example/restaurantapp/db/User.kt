package com.example.restaurantapp.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName ="tbl_user")
data class User(
    @PrimaryKey(autoGenerate = true)
    val id:Long=0,
@ColumnInfo(name="password")
    var password: String?="",
@ColumnInfo(name="email")
    var email:String?="",
)
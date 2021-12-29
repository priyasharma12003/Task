package com.example.restaurantapp.repositry.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface UserDao {

    //for single user insert
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertUser(user: User): Long

    //checking user exist or not in our db
    @Query("SELECT * FROM User WHERE email LIKE :email AND password LIKE :password")
    fun readLoginData(email: String, password: String):User

    //deleting all user from db
    @Query("DELETE FROM User")
    fun deleteAll()
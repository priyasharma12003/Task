package com.example.restaurantapp.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.restaurantapp.db.User

@Dao
interface UserDao {

    //for single user insert
      @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertUser(user: User): Long

    //checking user exist or not in our db
    @Query("SELECT * FROM tbl_user WHERE email LIKE :email AND password LIKE :password")
    fun readLoginData(email: String, password: String): User

    //deleting all user from db
    @Query("DELETE FROM tbl_user")
    fun deleteAll()
}
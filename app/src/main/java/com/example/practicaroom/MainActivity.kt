package com.example.practicaroom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels

import com.example.practicaroom.database.User


class MainActivity : AppCompatActivity() {

    private val mainViewModel : MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainViewModel.saveUser(
            User(
                "User04",
                "carmung",
                1.78,
                87.0,
                "ucarmunguiaa16@gamil.com",
                "blueblack20"
            )
        )

        mainViewModel.getUsers()
        //si es fragment
        //es con viewLifecycleOwner en lugar de this

        mainViewModel.savedUsers.observe(this, {usersList ->
            if(usersList.isNotEmpty()){
                for(user in usersList) {
                    Log.e("Estos son lo susuarios", user.user_name)
                }
            }else{
                Log.e("Estos son los usuarios", "null or empty")
            }
        })
    }
}
package com.example.userprofileapp

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val textViewName = findViewById<TextView>(R.id.textViewName)
        val textViewAge = findViewById<TextView>(R.id.textViewAge)
        val imageViewProfile = findViewById<ImageView>(R.id.imageViewProfile)

        val name = intent.getStringExtra("USER_NAME") ?: "Unknown"
        val age = intent.getIntExtra("USER_AGE", 0)

        textViewName.text = "Name: $name"
        textViewAge.text = "Age: $age"
    }
}
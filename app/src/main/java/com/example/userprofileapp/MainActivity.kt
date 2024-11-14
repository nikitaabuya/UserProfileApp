package com.example.userprofileapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextName = findViewById<EditText>(R.id.editTextName)
        val editTextYearOfBirth = findViewById<EditText>(R.id.editTextYearOfBirth)
        val buttonSubmit = findViewById<Button>(R.id.buttonSubmit)

        buttonSubmit.setOnClickListener {
            val name = editTextName.text.toString()
            val yearOfBirth = editTextYearOfBirth.text.toString().toIntOrNull()

            if (yearOfBirth != null) {
                val currentYear = 2024
                val age = currentYear - yearOfBirth

                val intent = Intent(this, ProfileActivity::class.java).apply {
                    putExtra("USER_NAME", name)
                    putExtra("USER_AGE", age)
                }
                startActivity(intent)
            }
        }
    }
}
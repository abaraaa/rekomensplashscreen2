package com.example.rekomensplashscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main1)

        val pertama = findViewById<Button>(R.id.button)
        pertama.setOnClickListener{
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)

        }
    }
}
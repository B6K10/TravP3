package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonToast: Button = findViewById(R.id.button_toast)
        buttonToast.setOnClickListener { Toast.makeText(this,"joyeux anniversaire",
            Toast.LENGTH_LONG).show()
        }
    }
}
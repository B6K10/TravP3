package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class CountActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_count)
        val buttonToast: Button = findViewById(R.id.button_T)
        buttonToast.setOnClickListener { Toast.makeText(this,"Hello Francky",
            Toast.LENGTH_LONG).show()
        }
    }
}
package com.example.homework1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val addFab = findViewById<FloatingActionButton>(R.id.floating_button)
        addFab.setOnClickListener {
            Toast.makeText(this, "FAB is clicked...", Toast.LENGTH_LONG).show()
        }
    }
}
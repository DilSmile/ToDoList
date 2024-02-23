package com.example.homework1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.content.res.AppCompatResources
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.homework1.data.TodoItem
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val todoList = generateList(50)

        val recycler_view = findViewById<RecyclerView>(R.id.recycler_view)

        recycler_view.adapter = ToDoAdapter(todoList)
        recycler_view.layoutManager = LinearLayoutManager(this)
        recycler_view.setHasFixedSize(true)

        val addFab = findViewById<FloatingActionButton>(R.id.floating_button)
        addFab.setOnClickListener {
            val intent = Intent(this@MainActivity, MainActivity2::class.java)
            startActivity(intent)
        }

    }
    private fun generateList(size: Int): List<TodoItem> {
        val list = ArrayList<TodoItem>()

        val errorImage = AppCompatResources.getDrawable(this, R.drawable.error)
        val checkBox = "wwedewew" // or true if you want to initialize as checked

        for (i in 0 until size) {
            val item = TodoItem(1, errorImage, checkBox)
            list += item
        }
        return list
    }

}
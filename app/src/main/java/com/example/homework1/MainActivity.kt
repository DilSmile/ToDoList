package com.example.homework1

import TodoItemsRepository
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {

    private val todoItemsRepository = TodoItemsRepository(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val todoList = todoItemsRepository.generateList(60)

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)

        recyclerView.adapter = ToDoAdapter(todoList)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)

        val addFab = findViewById<FloatingActionButton>(R.id.floating_button)
        addFab.setOnClickListener {
            val intent = Intent(this@MainActivity, MainActivity2::class.java)
            startActivity(intent)
        }
    }
}

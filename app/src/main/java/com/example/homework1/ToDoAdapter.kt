package com.example.homework1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.homework1.data.TodoItem

class ToDoAdapter (private val todoList: List<TodoItem>) : RecyclerView.Adapter<ToDoAdapter.ToDoViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ToDoViewHolder {
        val todoView = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.todolist,
                parent,false)

        return ToDoViewHolder(todoView)
    }

    override fun onBindViewHolder(holder: ToDoViewHolder, position: Int) {
       val currentItem = todoList [position]

        holder.imageView.setImageDrawable(currentItem.errorImage)
        holder.checkBox.text = currentItem.checkBox.toString()
    }

    override fun getItemCount() = todoList.size

    class ToDoViewHolder (itemView:View): RecyclerView.ViewHolder(itemView){
        val imageView : ImageView = itemView.findViewById(R.id.error)
        val checkBox : TextView = itemView.findViewById(R.id.checkBox)
    }
}
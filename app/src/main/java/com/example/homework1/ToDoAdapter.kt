package com.example.homework1

import android.graphics.Paint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.homework1.data.TodoItem

class ToDoAdapter(private val todoList: List<TodoItem>) : RecyclerView.Adapter<ToDoAdapter.ToDoViewHolder>() {

    private var isVisibleCheckedItems: Boolean = true

    // Function to update visibility state and notify adapter
    fun updateVisibility(isVisibleCheckedItems: Boolean) {
        this.isVisibleCheckedItems = isVisibleCheckedItems
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ToDoViewHolder {
        val todoView = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.todolist, parent, false)

        return ToDoViewHolder(todoView)
    }

    override fun onBindViewHolder(holder: ToDoViewHolder, position: Int) {
        val currentItem = todoList[position]

        holder.imageView.setImageDrawable(currentItem.errorImage)
        holder.checkBox.text = currentItem.checkBox
        holder.checkBox.isChecked = currentItem.isChecked

        // Update the isChecked property of TodoItem when checkbox state changes
        holder.checkBox.setOnCheckedChangeListener { _, isChecked ->
            currentItem.isChecked = isChecked
            updateTextStyle(holder.checkBox, isChecked)
        }
        updateTextStyle(holder.checkBox, currentItem.isChecked)
    }

    private fun updateTextStyle(textView: TextView, isChecked: Boolean) = if (isChecked) {
        textView.paintFlags = textView.paintFlags or Paint.STRIKE_THRU_TEXT_FLAG
    } else {
        textView.paintFlags = textView.paintFlags and Paint.STRIKE_THRU_TEXT_FLAG.inv()
    }



    override fun getItemCount() = todoList.size

    class ToDoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.error)
        val checkBox: CheckBox = itemView.findViewById(R.id.checkBox)
    }
}



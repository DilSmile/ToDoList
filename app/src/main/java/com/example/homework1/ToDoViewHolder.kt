package com.example.homework1

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ToDoViewHolder (itemView:View): RecyclerView.ViewHolder(itemView){
    val imageView : ImageView = itemView.findViewById(R.id.error)
    val checkBox : TextView = itemView.findViewById(R.id.checkBox)
}
package com.example.homework1.data

import android.graphics.drawable.Drawable

data class TodoItem(
    val id: Int,
    val errorImage: Drawable?,
    val checkBox: String,
    var isChecked: Boolean = false
)

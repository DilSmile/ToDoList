package com.example.homework1.data


import android.content.Context
import android.graphics.drawable.Drawable
import androidx.appcompat.content.res.AppCompatResources
import com.example.homework1.R

class TodoItemsRepository {

    // Метод для возврата списка всех дел
    fun getTodoItems(context: Context): List<TodoItem> {
        return buildList {
            val errorImage = AppCompatResources.getDrawable(context, R.drawable.error)
            val checkBox = "fefefe"

            val numberOfLists = (1..10).random()
            for (i in 0..numberOfLists)
                add(TodoItem(errorImage, checkBox))
        }
    }

    private fun TodoItem(id: Drawable?, checkBox: String): TodoItem {
        return TodoItem(id, checkBox)
    }
}

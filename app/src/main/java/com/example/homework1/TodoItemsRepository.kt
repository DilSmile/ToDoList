package com.example.homework1

import TodoItem

class TodoItemsRepository {

    private val todoList = mutableListOf<TodoItem>()

    // Метод для добавления нового дела в список
    fun addTodoItem(todoItem: TodoItem) {
        todoList.add(todoItem)
    }

    // Метод для возврата списка всех дел
    fun getAllTodoItems(): List<TodoItem> {
        return todoList.toList() // Возвращаем копию списка для предотвращения изменения оригинального списка извне
    }
}
package com.example.todoapp

import java.time.Instant
import java.util.Date
data class Todo(
    var id: Int,
    var title: String,
    var createdAt: Date
)


fun getFakeTodo(): List<Todo>{
    return listOf(
        Todo(1, "first todo", Date.from(Instant.now())),
        Todo(2, "second todo", Date.from(Instant.now())),
        Todo(3, "third todo", Date.from(Instant.now())),
        Todo(4, "fourth todo", Date.from(Instant.now()))
    )
}

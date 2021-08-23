package com.example.todolist.model

import java.sql.RowId

data class Task(
    val title: String,
    val hour: String,
    val date: String,
    val id: Int = 0
)
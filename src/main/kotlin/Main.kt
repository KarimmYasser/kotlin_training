package org.example

fun main() {
    val tasks = mutableListOf<Task>()
    tasks.add(Task("Buy groceries", false))
    tasks.add(Task("Do assignment", true))
    tasks.add(Task("Run 10 Kilometers", false))
    for (task in tasks) {
        val status = if (task.isDone) "✅" else "❌"
        println("$status ${task.title}")
    }
}

data class Task(val title: String, var isDone: Boolean)
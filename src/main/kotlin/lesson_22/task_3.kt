package org.example.lesson_22

fun main() {
    val student = Student("Max", 15, true)
    val (name, age,work) = student
    println("Name: $name, $age, $work")
}

data class Student(val name: String, val age: Int, val isWork: Boolean) {
}
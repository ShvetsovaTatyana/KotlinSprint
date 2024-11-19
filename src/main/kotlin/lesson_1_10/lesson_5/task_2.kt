package org.example.lesson_1_10.lesson_5

const val COMING_OF_AGE = 18

fun main() {
    println("Введите год рождения")

    val yearOfBirth = readln().toInt()
    val currentYear = 2024

    val userAge = currentYear - yearOfBirth
    if (userAge >= COMING_OF_AGE) println("Показать экран со скрытым контентом")
}
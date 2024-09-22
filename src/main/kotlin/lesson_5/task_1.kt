package org.example.lesson_5

fun main() {
    val firstNumber: Int = 5
    val secondNumber: Int = 5

    println("Вы должны доказать,что вы не бот. Для этого нужно решить простой пример: $firstNumber+$secondNumber")

    val answer: Int = firstNumber + secondNumber
    val user: Int = readln().toInt()

    if (answer == user) println("Добро пожаловать!")
    else println("Доступ запрещен")
}
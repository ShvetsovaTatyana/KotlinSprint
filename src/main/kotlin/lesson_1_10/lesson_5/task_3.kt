package org.example.lesson_1_10.lesson_5

fun main() {
    println("Введите два числа от 0 до 42")

    val firstNumber = 42
    val secondNumber = 14
    val firstNumberOfInput = readln().toInt()
    val secondNumberOfInput = readln().toInt()

    if ((firstNumberOfInput == firstNumber) && (secondNumberOfInput == secondNumber) ||
        (secondNumberOfInput == firstNumber) && (firstNumberOfInput == secondNumber)
    )
        println("Поздравляем! Вы выиграли главный приз!")
    else if ((firstNumberOfInput == firstNumber) || (firstNumberOfInput == secondNumber) ||
        (secondNumberOfInput == firstNumber) || (secondNumberOfInput == secondNumber)
    )
        println("Вы выиграли утешительный приз!")
    else
        println("Неудача")
}
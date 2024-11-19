package org.example.lesson_1_10.lesson_6

fun main() {
    println("Введите количество секунд")
    var second = readln().toLong()
    val counter = 0

    while (counter <= second) {
        Thread.sleep(1000)
        println("Осталось секунд:${second--}")
    }
    println("Время вышло")
}
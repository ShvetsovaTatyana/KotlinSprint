package org.example.lesson_1_10.lesson_6

fun main() {
    println("Введите количество секунд")
    val second = readln().toLong()
    val counter = 0

    counter <= second
    Thread.sleep(second * 1000)
    println("Прошло $second секунд")
}

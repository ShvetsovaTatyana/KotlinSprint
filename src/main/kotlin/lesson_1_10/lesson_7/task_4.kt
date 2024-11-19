package org.example.lesson_1_10.lesson_7

fun main() {
    println("Сколько секунд нужно засечь?")
    val secondPerson = readln().toInt()

    for (i in secondPerson downTo 1 step 1) {
        println("Осталось секунд $i")
        Thread.sleep(1000)
    }
    println("Время вышло")
}
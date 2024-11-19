package org.example.lesson_1_10.lesson_7

fun main() {
    println("Введите число")
    val numberPerson = readln().toInt()

    for (i in 0..numberPerson step 2) {
        println(i)
    }
}
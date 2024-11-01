package org.example.lesson_7

import kotlin.random.Random

fun main() {
    var code = 0
    var codePerson = 0

    do {
        code = Random.nextInt(1000, 9999)
        println("Ваш код авторизации:$code")
        println("Ведите код для атворизации")
        codePerson = readln().toInt()
    } while (codePerson != code)
    println("Приветствуем вас!")
}
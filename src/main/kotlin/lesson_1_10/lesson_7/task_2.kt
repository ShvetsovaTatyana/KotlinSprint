package org.example.lesson_1_10.lesson_7

fun main() {
    var code = 0
    var codePerson = 0

    do {
        code = 1000.rangeTo(9999).random()
        println("Ваш код авторизации:$code")
        println("Ведите код для атворизации")
        codePerson = readln().toInt()
    } while (codePerson != code)
    println("Приветствуем вас!")
}
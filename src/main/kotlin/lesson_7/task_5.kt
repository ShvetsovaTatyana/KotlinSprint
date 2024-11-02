package org.example.lesson_7

fun main() {
    var number = readln().toInt()
    var password = ""

    if (number < 6)
        number = 6
    for (i in 1..number) {
        val numberPassword = 1.rangeTo(9).random().toString()
        val lowercaseLetter = 'a'.rangeTo('z').random().lowercase().toString()
        val capitalLetter = 'a'.rangeTo('z').random().uppercase().toString()
        password += (numberPassword + lowercaseLetter + capitalLetter).random().toString()
    }
    println(password)
}
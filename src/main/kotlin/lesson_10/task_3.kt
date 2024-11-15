package org.example.lesson_10

fun main() {
    println(passwordGeneration(passwordLength()))
}

fun passwordLength(): Int {
    val passwordLength = readln().toInt()
    return passwordLength
}

fun passwordGeneration(passwordLength: Int): String {
    var password = ""

    for (i in 1..passwordLength) {
        if (i % 2 != 0) {
            val numberRandom = 0.rangeTo(9).random()
            password += numberRandom
        } else {
            val charRandom = ' '.rangeTo('/').random()
            password += charRandom
        }
    }
    return password
}
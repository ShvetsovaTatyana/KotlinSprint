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
    val numberRandom = 0.rangeTo(9)
    val charRandom = ' '.rangeTo('/')

    for (i in 1..passwordLength) {
        if (i % 2 != 0) {
            password += numberRandom.random()
        } else {
            password += charRandom.random()
        }
    }
    return password
}
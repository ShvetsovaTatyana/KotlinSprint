package org.example.lesson_7

fun main() {
    var password = ""

    for (i in 1..3) {
        val characters = 'a'.rangeTo('z').random().toString()
        val number = 1.rangeTo(9).random().toString()
        password = password + characters + number
    }
    println(password)
}
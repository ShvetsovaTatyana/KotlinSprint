package org.example.lesson_7

import kotlin.random.Random

fun main() {
    var password = ""

    for (i in 1..3) {
        val characters = 'a'.rangeTo('z').random().toString()
        val number = Random.nextInt(1, 9).toString()
        password = password + characters + number
    }
    println(password)
}
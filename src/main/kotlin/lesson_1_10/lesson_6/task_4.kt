package org.example.lesson_1_10.lesson_6

import kotlin.random.Random

fun main() {
    val numberRandom = Random.nextInt(1, 9)
    var attempt = 4
    var number = 0

    do {
        number = readln().toInt()
        if (number == numberRandom || attempt == 0)
            break
        println("Неверно,оставшееся число поыток:${attempt--}")
    } while (number != numberRandom && attempt != -1)

    if (number == numberRandom)
        println("Это была великолепная игра!")
    else
        println("Было загадано число $numberRandom")

}
package org.example.lesson_1_10.lesson_6

import kotlin.random.Random

fun main() {
    var attempt = 2
    var result = 0
    var userResult = 0

    println("Докажите,что вы не бот. Решите простой пример!")
    do {
        val numberOne = Random.nextInt(1, 9)
        val numberTwo = Random.nextInt(1, 9)

        result = numberOne + numberTwo
        println("Ваш пример:$numberOne+$numberTwo")
        userResult = readln().toInt()
        if (result == userResult || attempt == 0)
            break
        println("Неверно,оставшееся число попыток:${attempt--}")
    } while (userResult != result && attempt != -1)

    if (attempt == 0)
        println("Доступ запрещен")
    else
        println("Добро пожаловать!")
}
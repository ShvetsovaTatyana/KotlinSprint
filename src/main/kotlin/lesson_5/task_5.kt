package org.example.lesson_5

import kotlin.random.Random

fun main() {
    val randomOne = Random.nextInt(0, 42)
    val randomTwo = Random.nextInt(0, 42)
    val randomTree = Random.nextInt(0, 42)
    val randoms = listOf(randomOne, randomTwo, randomTree)
    val numberOne = readln().toInt()
    val numberTwo = readln().toInt()
    val numberTree = readln().toInt()
    val numbers = listOf(numberOne, numberTwo, numberTree)
    val intersectedArray = randoms.intersect(numbers)

    when (intersectedArray.size) {
        3 -> println("Вы выиграли джекпот!")
        2 -> println("Вы угадали два числа и получаете крупный приз")
        1 -> println("Вам выплачивается утешительный приз")
        0 -> println("Вы не угадали ни одного числа")
    }
    println(randoms)
}
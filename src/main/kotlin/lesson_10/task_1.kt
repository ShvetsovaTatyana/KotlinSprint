package org.example.lesson_10

import kotlin.random.Random

fun main() {

    val numberComputer = computerThrowingDice()
    println("Кубик бросил компьютер. Значение на кубике:$numberComputer")
    val numberPlayer = playerIsDiceRoll()
    println("Кубик бросил игрок. Значение на кубике:$numberPlayer")

    if (numberComputer == numberPlayer)
        println("Победила дружба")
    if (numberComputer > numberPlayer)
        println("Победила машина")
    if (numberPlayer > numberComputer)
        println("Победило человечество")
}

fun computerThrowingDice(): Int {
    val numberRandom = Random.nextInt(1, 7)
    return numberRandom
}

fun playerIsDiceRoll(): Int {
    val numberPlayer = readln().toInt()
    return numberPlayer
}

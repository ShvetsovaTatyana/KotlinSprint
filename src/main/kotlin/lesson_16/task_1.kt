package org.example.lesson_16

fun main() {
    val player = Dice()
    println(player.showNumber())
}

class Dice() {
    private val number: Int = (1..6).random()

    fun showNumber(): String {
        return "Число $number"
    }
}
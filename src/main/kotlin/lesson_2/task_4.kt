package org.example.lesson_2

fun main() {
    val crystalOre = 7
    val ironOre = 11
    val buff = 20.0 / 100
    val crystalOreBuff = (crystalOre * buff).toInt()
    val ironOreBuff = (ironOre * buff).toInt()
    println("Кристаллической руды: $crystalOreBuff")
    println("Железной руды: $ironOreBuff")
}
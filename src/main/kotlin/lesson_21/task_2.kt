package org.example.lesson_21

fun main() {
    val listOfIntegers: List<Int> = listOf(1, 2, 3, 4, 5)
    println(listOfIntegers.evenNumbersSum())
}

fun List<Int>.evenNumbersSum(): Int {
    return this.filter { it % 2 == 0 }.sum()
}
package org.example.lesson_21

fun main() {
    val listOfIntegers: List<Int> = listOf(1, 2, 3, 4, 5)
    fun List<Int>.calculateTheAmount(): Int {
        var sum = 0
        for (i in listOfIntegers) {
            if (i % 2 == 0)
                sum = sum + i
        }
        return sum
    }
    println(listOfIntegers.calculateTheAmount())
}
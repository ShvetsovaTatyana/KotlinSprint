package org.example.lesson_20

fun main() {
    val listOfStrings: List<String> = listOf("сушилка", "стул", "одежда")
    val listOfLambdas = listOfStrings.map { it -> { "Нажат элемент: $it" } }
    for (i in 0 until listOfLambdas.size) {
        if (i % 2 == 0)
            println(listOfLambdas.get(i)())
    }
}
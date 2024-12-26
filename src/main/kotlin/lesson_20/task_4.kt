package org.example.lesson_20

fun main() {
    val listOfStrings: List<String> = listOf("сушилка", "стул", "одежда")
    val listOfLambdas = listOfStrings.map { it -> { "Нажат элемент: $it" } }
    listOfLambdas.forEachIndexed { index, element ->
        if (index % 2 == 0)
            println(element())
    }
}
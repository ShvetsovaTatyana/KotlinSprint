package org.example.lesson_9

fun main() {
    var ingredients = ""
    val listOfIngredients: MutableSet<String> = mutableSetOf<String>().toSortedSet()

    for (i in 1..5) {
        println("Введите ингредиент № $i")
        ingredients = readln()
        listOfIngredients.add(ingredients)
    }

    val listOfIngredientsNew =
        listOfIngredients.joinToString { it }.replaceFirstChar { it.uppercase() }
    println(listOfIngredientsNew)
}
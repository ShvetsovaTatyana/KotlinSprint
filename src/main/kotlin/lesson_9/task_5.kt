package org.example.lesson_9

fun main() {
    val listOfIngredients: MutableList<String> = mutableListOf()
    var ingredients = ""

    for (i in 1..5) {
        println("Введите ингредиент № $i")
        ingredients = readln()
        if (listOfIngredients.contains(ingredients))
            continue
        listOfIngredients.add(ingredients)
    }
    listOfIngredients.sort()
    val listOfIngredientsNew = listOfIngredients[0].replaceFirstChar { it.uppercase() }
    listOfIngredients[0] = listOfIngredientsNew
    println(listOfIngredients)
}
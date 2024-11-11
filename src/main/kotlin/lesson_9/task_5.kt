package org.example.lesson_9

fun main() {
    var ingredients = ""
    val listOfIngredients: MutableSet<String> = mutableSetOf()

    for (i in 1..5) {
        println("Введите ингредиент № $i")
        ingredients = readln()
        listOfIngredients.add(ingredients)
    }
    val listOfIngredientsNew = listOfIngredients.toString().replaceFirstChar { it.uppercase() }//тут не понимаю,что нужно в скобках писать
    listOfIngredients = listOfIngredientsNew
    println(listOfIngredients)
}
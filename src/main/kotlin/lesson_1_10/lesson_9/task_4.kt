package org.example.lesson_1_10.lesson_9

fun main() {
    println("Введите 5 ингредиентов")
    val ingredient = readln()
    val listOfIngredients = (ingredient.split(", "))
    val listOfIngredientsNew = listOfIngredients.sorted()
    println(listOfIngredientsNew)
}
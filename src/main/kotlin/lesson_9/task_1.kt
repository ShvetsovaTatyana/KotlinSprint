package org.example.lesson_9

fun main() {
    val listOfIngredients = mutableListOf("вода", "лук", "морковь", "курица", "соль")
    println("В рецепте есть следующие ингредиенты: $listOfIngredients")
    listOfIngredients.forEach {
        println(it)
    }
}
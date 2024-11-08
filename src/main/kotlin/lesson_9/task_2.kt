package org.example.lesson_9

fun main() {

    val listOfIngredients = mutableListOf("вода", "соль", "мясо")
    println("В рецепте есть базовые ингредиенты: $listOfIngredients")
    println("Желаете добавить еще?")
    val answer = readln()

    if (!answer.equals("Да"))
        return
    else
        println("Какой ингредиент вы хотите добавить?")

    val newIngredient = readln()
    listOfIngredients.add(newIngredient)
    println("Теперь в рецепте есть следующие ингредиенты: $listOfIngredients")
}
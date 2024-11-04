package org.example.lesson_8

fun main() {
    val dish = arrayListOf("курица", "вода", "лук", "морковь", "соль")

    println("Наличие какого ингредиента вы хотите проверить?")
    val ingredient: String = readln()

    if (ingredient in dish) {
        println("Ингредиент $ingredient в рецепте есть")
        return
    }
    println("Такого ингредиента в рецепте нет")
}
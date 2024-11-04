package org.example.lesson_8

fun main() {
    val dish = arrayListOf("курица", "вода", "лук", "морковь", "соль")

    println("Наличие какого ингредиента вы хотите проверить?")
    val ingredient: String = readln()

    for (i in dish) {
        if (ingredient.equals(i)) {
            println("Ингредиент $ingredient в рецепте есть")
            return
        }
    }
    println("Такого ингредиента в рецепте нет")
}
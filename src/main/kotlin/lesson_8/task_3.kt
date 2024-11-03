package org.example.lesson_8

fun main() {
    val dish = arrayListOf("курица", "вода", "лук", "морковь", "соль")

    println("Наличие какого ингредиента вы хотите проверить?")
    val ingredient: String = readln()

    if (ingredient.equals(dish[0]) || ingredient.equals(dish[1]) || ingredient.equals(dish[2]) ||
        ingredient.equals(dish[3]) || ingredient.equals(dish[4])
    ) {
        println("Ингредиент $ingredient в рецепте есть")
        return
    }
    println("Такого ингредиента в рецепте нет")
}
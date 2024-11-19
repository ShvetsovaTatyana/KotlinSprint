package org.example.lesson_1_10.lesson_8

fun main() {
    val dish = arrayListOf("курица", "вода", "лук", "морковь", "соль")
    var ingredientNew = ""
    println(dish)
    println("Какой ингредиент вы бы хотели заменить?")
    val ingredient = readln()
    val index = dish.indexOf(ingredient)

    if (index != -1) {
        println("Какой ингредиент вы бы хотели добавить?")
        ingredientNew = readln()
        dish[index] = ingredientNew
        println("Готово! Вы сохранили следующий список: $dish")
        return
    }
    println("Такого ингредиента нет в списке")
}


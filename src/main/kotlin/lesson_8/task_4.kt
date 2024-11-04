package org.example.lesson_8

fun main() {
    val dish = arrayListOf("курица", "вода", "лук", "морковь", "соль")
    var ingredientNew = ""
    println(dish)
    println("Какой ингредиент вы бы хотели заменить?")
    val ingredient = readln()

    for (i in dish) {
        if (ingredient.equals(i)) {
            println("Какой ингредиент вы бы хотели добавить?")
            ingredientNew = readln()
            val index = dish.indexOf(i)
            dish[index] = ingredientNew
            println("Готово! Вы сохранили следующий список: $dish")
            return
        }
    }
    println("Такого ингредиента нет в списке")
}


package org.example.lesson_19

fun main() {
    val listOfFish = Aquarium.values()
    for (i in listOfFish) {
        i.fish()
    }
}

enum class Aquarium {
    QUPPU,
    ANGELFISH,
    GOLDFISH,
    SIAMESE_FIGHTING_FISH;

    fun fish() {
        when (this) {
            QUPPU -> println("Гуппи")
            ANGELFISH -> println("Скалярия")
            GOLDFISH -> println("Золотая рыбка")
            SIAMESE_FIGHTING_FISH -> println("Петушок")
        }
    }


}
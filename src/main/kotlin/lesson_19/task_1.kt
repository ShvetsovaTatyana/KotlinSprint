package org.example.lesson_19

import org.example.lesson_19.Aquarium.*

fun main() {
    val listOfFish = Aquarium.values()
    for (i in listOfFish){
        fish(i)
    }
}

enum class Aquarium {
    QUPPU,
    ANGELFISH,
    GOLDFISH,
    SIAMESE_FIGHTING_FISH,
}

fun fish(aquarium: Aquarium) {
    when (aquarium) {
        QUPPU -> println("Гуппи")
        ANGELFISH -> println("Скалярия")
        GOLDFISH -> println("Золотая рыбка")
        SIAMESE_FIGHTING_FISH -> println("Петушок")
    }
}
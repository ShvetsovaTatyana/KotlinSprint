package org.example.lesson_18

fun main() {
    val fox = Fox()
    val dog = Dog()
    val cat = Cat()
    val listOfAnimals: List<Tamagotchi> = listOf(fox, dog, cat)
    for (i in listOfAnimals)
        i.eat()
}

abstract class Tamagotchi(val name: String) {
    fun sleep() {
        val sleep = "Спать"
    }

    abstract fun eat()
}

class Fox : Tamagotchi("Лиса") {
    override fun eat() {
        println("$name -> ест ягоды")
    }
}

class Dog : Tamagotchi("Собака") {
    override fun eat() {
        println("$name -> ест кости")
    }
}

class Cat() : Tamagotchi("Кошка") {
    override fun eat() {
        println("$name -> ест рыбу")
    }
}
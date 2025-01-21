package org.example.lesson_16

fun main() {
    val playerOne = Player("Noah", 14, 7)
    val playerTwo = Player("Liam", 21, 3)
    println("Осталось жизней: ${playerOne.takeDamage(playerTwo.impactForce)}")
    println("Осталось жизней: ${playerOne.treat(2)}")
    println("Осталось жизней: ${playerOne.takeDamage(playerTwo.impactForce)}")
    println("Осталось жизней: ${playerOne.takeDamage(playerTwo.impactForce)}")
    println("Осталось жизней: ${playerOne.takeDamage(playerTwo.impactForce)}")
    println("Осталось жизней: ${playerOne.takeDamage(playerTwo.impactForce)}")
    println("Осталось жизней: ${playerOne.treat(2)}")

}

class Player(
    val name: String,
    private var health: Int,
    var impactForce: Int,
) {
    fun takeDamage(impactForce: Int): Int {
        this.health = health - impactForce
        if (this.health <= 0) {
            die()
            return 0
        } else
            return this.health
    }

    fun treat(impactForce: Int): Int {
        val restoredHealth = this.health + impactForce
        if (this.health <= 0)
            return 0
        else
            return restoredHealth

    }

    private fun die() {
        if (this.health <= 0)
            health = 0
        impactForce = 0
        println("Игрок умер")
    }

}
package org.example.lesson_16

fun main() {
    val playerOne = Player("Noah", 14, 7,false)
    val playerTwo = Player("Liam", 21, 3,false)
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
    var isDead: Boolean,
) {
    fun takeDamage(impactForce: Int): Int {
        if (this.health <= 0) {
            isDead=true
            println("Игрок умер")
        } else
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
        health = 0
        impactForce = 0
        println("Игрок умер")
    }

}
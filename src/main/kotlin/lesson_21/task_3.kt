package org.example.lesson_21

fun main() {
    val player = Player("Федор", 51, 85)
    println(player.isHealthy())
}

class Player(
    val name: String,
    var currentHealth: Int,
    val maxHealth: Int,
)

fun Player.isHealthy(): Boolean {
    return this.currentHealth == this.maxHealth
}
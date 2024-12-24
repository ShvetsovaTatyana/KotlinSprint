package org.example.lesson_20

fun main() {
    val player = Player("Павел", 55, 85)
    val restoreHealth: (Player) -> Unit = {
        it.currentHealth = it.maxHealth
    }
    restoreHealth(player)
    println(player.currentHealth)
}

class Player(
    val name: String,
    var currentHealth: Int,
    val maxHealth: Int,
)
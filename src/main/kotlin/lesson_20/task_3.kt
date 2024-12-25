package org.example.lesson_20

fun main() {
    val player = Gamer(true)
    val checkForKeyAvailability: (player: Gamer) -> String = {
        if (it.isHaveAKey)
            "Игрок открыл дверь"
        else
            "Дверь заперта"
    }
    println(checkForKeyAvailability(player))
}

class Gamer(val isHaveAKey: Boolean) {

}

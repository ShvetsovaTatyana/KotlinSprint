package org.example.lesson_17

fun main() {
    val ship = Ship("Мандарин", 100, "Cочи")
    ship.name = "Феликс"
    println(ship.name)
}

class Ship(name: String, averageSpeed: Int, homePort: String) {
    var name: String = name
        set(value: String) {
            if (field != value)
                println("Имя корабля менять нельзя")
        }
    val averageSpeed: Int = averageSpeed
    var homePort: String = homePort

}
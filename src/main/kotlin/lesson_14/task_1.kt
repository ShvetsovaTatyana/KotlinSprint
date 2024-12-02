package org.example.lesson_14

fun main() {
    val cargoLiner = CargoLiner()
    val icebreaker = Icebreaker()
    val passengerLiner = PassengerLiner()
}

open class Liner(
    val speed: Int = 100,
)

class CargoLiner(val liftingCapacity: Int = 500) : Liner(speed = 80)

class Icebreaker(val isAbilityToCrushIce: Boolean = true) : Liner(speed = 90)

class PassengerLiner(val passengerCapacity: Int = 1000) : Liner()
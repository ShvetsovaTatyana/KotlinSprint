package org.example.lesson_14

fun main() {
    val cargoLiner = CargoLinerTwo()
    val icebreaker = IcebreakerTwo()
    val passengerLiner = PassengerLinerTwo()

    cargoLiner.loadingMethodCargoLinerTwo()
    icebreaker.loadingMethodIcebreakerTwo()
    passengerLiner.loadingMethodPassengerLinerTwo()
}

open class LinerTwo(
    val speed: Int = 100,
)

class CargoLinerTwo(val liftingCapacity: Int = 500) : LinerTwo(speed = 80) {
    fun loadingMethodCargoLinerTwo() {
        println("Грузовой корабль активирует погрузочный кран")
    }
}

class IcebreakerTwo(val isAbilityToCrushIce: Boolean = true) : LinerTwo(speed = 90) {
    fun loadingMethodIcebreakerTwo() {
        println("Ледокол открывает ворота со стороны кормы")
    }
}

class PassengerLinerTwo(val passengerCapacity: Int = 1000) : LinerTwo() {
    fun loadingMethodPassengerLinerTwo() {
        println("Лайнер выдвигает горизонтальный трап со шкафута")
    }
}
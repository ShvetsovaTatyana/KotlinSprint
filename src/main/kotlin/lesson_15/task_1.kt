package org.example.lesson_15

fun main() {
    val crucianCarp = CrucianCarp()
    val gull = Gull()
    val duck = Duck()
    println(
        "Карась-${crucianCarp.modeOfTransportationSwim()}\nЧайка-${gull.modeOfTransportationFly()}\n" +
                "Утка-${duck.modeOfTransportationSwim()} и ${duck.modeOfTransportationFly()}"
    )

}

interface FlyingCreatures {
    fun modeOfTransportationFly(): String {
        val fly = "летает"
        return fly
    }
}

interface SwimmingCreatures {
    fun modeOfTransportationSwim(): String {
        val swim = "плавает"
        return swim
    }
}

class CrucianCarp() : SwimmingCreatures
class Gull() : FlyingCreatures
class Duck() : FlyingCreatures, SwimmingCreatures
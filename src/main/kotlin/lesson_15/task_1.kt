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
    fun modeOfTransportationFly(): String
}

interface SwimmingCreatures {
    fun modeOfTransportationSwim(): String
}

class CrucianCarp() : SwimmingCreatures {
    override fun modeOfTransportationSwim(): String {
        return "плавает"
    }
}

class Gull() : FlyingCreatures {
    override fun modeOfTransportationFly(): String {
        return "летает"

    }
}

class Duck() : FlyingCreatures, SwimmingCreatures {
    override fun modeOfTransportationFly(): String {
        return "летает"
    }

    override fun modeOfTransportationSwim(): String {
        return "плавает"
    }
}
package org.example.lesson_14

fun main() {
    val mimas = Satellites("Мимас", true, false)
    val enceladus = Satellites("Энцелад", true, false)
    val saturn: Planets = Planets(
        name = "Сатурн",
        isHaveAnAtmosphere = true,
        isSuitableForDisembarkation = false,
        listOfSatellites = listOf(mimas, enceladus)
    )
    println("Имя планеты: ${saturn.name}")

    for (i in saturn.listOfSatellites) {
        println("Названия ее спутников: ${i.name}")
    }

}

open class CelestialBodies(val isHaveAnAtmosphere: Boolean, val isSuitableForDisembarkation: Boolean)

class Planets(
    val name: String,
    isHaveAnAtmosphere: Boolean,
    isSuitableForDisembarkation: Boolean,
    val listOfSatellites: List<Satellites> = listOf(),
) : CelestialBodies(isHaveAnAtmosphere, isSuitableForDisembarkation)

class Satellites(
    val name: String,
    isHaveAnAtmosphere: Boolean,
    isSuitableForDisembarkation: Boolean,
) : CelestialBodies(isHaveAnAtmosphere, isSuitableForDisembarkation)
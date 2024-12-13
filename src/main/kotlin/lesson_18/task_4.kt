package org.example.lesson_18

import kotlin.math.pow

fun main() {
    val rectangular = RectangularPackage(5.0, 4.0, 6.0)
    val cube = CubePackage(4.0)
    println(
        "Площадь прямоугольника: ${rectangular.calculateArea()}\n" +
                "Площадь куба: ${cube.calculateArea()}"
    )
}

abstract class Package() {
    abstract fun calculateArea(): Double
}

class RectangularPackage(
    val width: Double,
    val height: Double,
    val length: Double
) : Package() {
    override fun calculateArea(): Double {
        return width * height * length
    }
}

class CubePackage(val length: Double) : Package() {
    override fun calculateArea(): Double {
        return length.pow(2) * 6
    }
}
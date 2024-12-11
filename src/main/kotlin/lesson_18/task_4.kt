package org.example.lesson_18

import kotlin.math.pow

fun main() {
    val rectangular = RectangularPackage(5.0, 4.0)
    val cube = CubePackage()
    println(
        "Площадь прямоугольника: ${rectangular.calculateArea()}\n" +
                "Площадь куба: ${cube.calculateArea()}"
    )
}

abstract class Package(val length: Double) {
    abstract fun calculateArea(): Double
}

class RectangularPackage(val width: Double, val height: Double) : Package(4.0) {
    override fun calculateArea(): Double {
        val square: Double = width * height
        return square
    }
}

class CubePackage() : Package(5.0) {
    override fun calculateArea(): Double {
        val square: Double = length.pow(2) * 6
        return square
    }
}
package org.example.lesson_16

private const val PI = 3.14
fun main() {
    val calculator = Circle(5.0)
    println(
        "Длина окружности равна ${calculator.calculateTheCircumference()}\n" +
                "Площадь круга равна ${calculator.calculateTheAreaOfACircle()}"
    )
}

class Circle(
    private val radius: Double,
) {
    fun calculateTheCircumference(): Double {
        val circumference = 2 * PI * (radius * radius)
        return circumference
    }

    fun calculateTheAreaOfACircle(): Double {
        val areaOfACircle = PI * (radius * radius)
        return areaOfACircle
    }
}
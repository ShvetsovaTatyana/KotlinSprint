package org.example.lesson_14

const val NUMBER_P = 3.14

fun main() {
    val circleWhite = Circle(3.0, "white")
    val circleBlack = Circle(3.0, "black")
    val rectangleWhite = Rectangle(2.0, 4.0, "white")
    val rectangleBlack = Rectangle(3.0, 6.0, "black")
    val listOfFigures: List<Figure> = listOf(circleWhite, circleBlack, rectangleWhite, rectangleBlack)
    val sumOfThePerimetersOfWhiteFigures = circleWhite.calculatePerimeter() + rectangleWhite.calculatePerimeter()
    val sumOfThePerimetersBlackOfFigures = circleBlack.calculatePerimeter() + rectangleBlack.calculateArea()

    println(
        "Сумма периметров всех черных фигур = $sumOfThePerimetersBlackOfFigures\n" +
                "Сумма площадей всех белых фигур = $sumOfThePerimetersOfWhiteFigures"
    )
}

abstract class Figure(val color: String) {
    abstract fun calculateArea(): Double
    abstract fun calculatePerimeter(): Double
}

class Circle(val radius: Double, color: String) : Figure(color) {
    override fun calculateArea(): Double {
        val area = NUMBER_P * (radius * radius)
        return area
    }

    override fun calculatePerimeter(): Double {
        val perimeter = 2 * NUMBER_P * radius
        return perimeter
    }


}


class Rectangle(val width: Double, val height: Double, color: String) : Figure(color) {
    override fun calculateArea(): Double {
        val area = width * height
        return area
    }

    override fun calculatePerimeter(): Double {
        val perimeter = 2 * (width + height)
        return perimeter
    }
}
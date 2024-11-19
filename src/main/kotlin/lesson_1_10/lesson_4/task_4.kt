package org.example.lesson_1_10.lesson_4

fun main() {
    val trainingDay = 6
    val isEvenDayOfTheWeek = trainingDay % 2 == 0

    println(
        """Упражнения для рук:     ${!isEvenDayOfTheWeek}
Упражнения для ног:     $isEvenDayOfTheWeek
Упражнения для спины:   $isEvenDayOfTheWeek
Упражнения для пресса:  ${!isEvenDayOfTheWeek}
""".trimMargin()
    )
}
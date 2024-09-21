package org.example.lesson_4

fun main() {
    var trainingDay = 5
    println(
        """Упражнения для рук:    true
Упражнения для ног:    false
Упражнения для спины:  false
Упражнения для пресса: true
""".trimMargin()
    )
    trainingDay = 6
    println("""Упражнения для рук:    false
Упражнения для ног:    true
Упражнения для спины:  true
Упражнения для пресса: false
""".trimMargin())
}
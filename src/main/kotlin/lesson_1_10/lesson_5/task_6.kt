package org.example.lesson_1_10.lesson_5

import kotlin.math.pow

fun main() {
    println("Введите свой вес в кг")
    val weight = readln().toDouble()
    println("Введите свой рост в см")
    val height = readln().toDouble()
    val heightInMeters = height / 100
    val bmi = weight / (heightInMeters.pow(2))
    println(String.format("%.2f", bmi))
    if (bmi < 18.5)
        println("Недостаточная масса тела")
    if (18.5 <= bmi && bmi < 25.0)
        println("Нормальная масса тела")
    if (25.0 <= bmi && bmi < 30.0)
        println("Избыточная масса тела")
    if (bmi >= 30)
        println("Ожирение")

}
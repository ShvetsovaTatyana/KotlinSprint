package org.example.lesson_1_10.lesson_2

import kotlin.math.pow

fun main() {
    val initialDepositAmount = 70000
    val interestRate = 16.7 / 100
    val years = 20
    val finalDepositAmount = initialDepositAmount * (1 + interestRate).pow(years)
    println(String.format("%.3f", finalDepositAmount))
}
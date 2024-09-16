package org.example.lesson_2

fun main() {
    val workersSalaries: Int = 50 * 30000
    val traineeSalary: Int = 30 * 20000
    val amountOfEmployees: Int = 50 + 30
    val generalExpenses: Int = workersSalaries + traineeSalary
    val averageSalary: Int = generalExpenses / amountOfEmployees
    println(workersSalaries)
    println(generalExpenses)
    println(averageSalary)
}
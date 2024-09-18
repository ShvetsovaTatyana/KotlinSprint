package org.example.lesson_2

fun main() {
    val worker = 50
    val employeeSalary = 30000
    val trainee = 30
    val traineeSalary = 20000
    val totalTraineeSalary: Int = trainee * traineeSalary
    val workersSalaries: Int = worker * employeeSalary
    val amountOfEmployees: Int = 50 + 30
    val generalExpenses: Int = workersSalaries + totalTraineeSalary
    val averageSalary: Int = generalExpenses / amountOfEmployees
    println(workersSalaries)
    println(generalExpenses)
    println(averageSalary)
}
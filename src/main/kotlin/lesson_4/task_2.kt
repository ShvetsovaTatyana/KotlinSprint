package org.example.lesson_4

fun main() {
    val averageWeightOne = 20
    val averageVolumeOne = 80
    val averageWeightTwo = 50
    val averageVolumeTwo = 100
    println(
        "Груз с весом 20 кг и объемом 80 л соответствует категории 'Average':" +
                "${(averageWeightOne > 35) && (averageWeightOne <= 100) && averageVolumeOne < 100}"
    )
    println(
        "Груз с весом 50 кг и объемом 100 л соответствует категории 'Average':" +
                "${(averageWeightTwo > 35) && (averageWeightTwo <= 100) && averageVolumeTwo < 100}"
    )
}
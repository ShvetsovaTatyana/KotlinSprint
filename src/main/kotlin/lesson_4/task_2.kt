package org.example.lesson_4

const val WEIGHT_MIN = 35
const val WEIGHT_MAX = 100
const val VOLUME_MAX = 100

fun main() {
    val averageWeightOne = 20
    val averageVolumeOne = 80
    val averageWeightTwo = 50
    val averageVolumeTwo = 100

    println(
        "Груз с весом 20 кг и объемом 80 л соответствует категории 'Average':" +
                "${(averageWeightOne > WEIGHT_MIN) && (averageWeightOne <= WEIGHT_MAX) && averageVolumeOne < VOLUME_MAX}"
    )
    println(
        "Груз с весом 50 кг и объемом 100 л соответствует категории 'Average':" +
                "${(averageWeightTwo > 35) && (averageWeightTwo <= 100) && averageVolumeTwo < 100}"
    )
}
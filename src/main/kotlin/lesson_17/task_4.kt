package org.example.lesson_17

fun main() {
    val parcel = Package("124563695", "Москва", 1)
    parcel.currentLocation = "Сочи"
    println(parcel.currentLocation)
}

class Package(number: String, currentLocation: String, movementCounter: Int) {
    val number: String = number
    var currentLocation: String = currentLocation
        set(value: String) {
            if (field != value) {
                movementCounter = movementCounter + 1
                field = value
                println("Счетчик перемещений: $movementCounter")
            }
        }
    private var movementCounter: Int = movementCounter
}
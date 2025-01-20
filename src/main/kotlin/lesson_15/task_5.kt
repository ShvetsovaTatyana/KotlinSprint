package org.example.lesson_15

fun main() {
    val carOne = Car()
    val carTwo = Car()
    val truck = Truck()
    carOne.transportsPassenger(3)
    carTwo.transportsPassenger(2)
    truck.transportsPassenger(1)
    truck.transportsCargo(1, 2.0)
}

class Car() : TransportationOfPassenger {
    override fun transportsPassenger(passenger: Int) {
        if (passenger <= 3)
            println("Перевезено $passenger пассажира")
        else
            return
    }

}

class Truck() : TransportationOfPassenger, CargoTransportation {
    override fun transportsCargo(passenger: Int, cargoInTons: Double) {
        if (passenger <= 1 && cargoInTons <= 2)
            println("Перевезен $passenger пассажир и $cargoInTons тонн груза")
        else
            return
    }

}

interface TransportationOfPassenger {
    fun transportsPassenger(passenger: Int) {

    }
}

interface CargoTransportation {
    fun transportsCargo(passenger: Int, cargoInTons: Double) {

    }
}
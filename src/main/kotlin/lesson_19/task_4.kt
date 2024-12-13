package org.example.lesson_19

fun main() {
    val tank = Tank()
    tank.weaponsWithANewTypeOfCartridges(Cartridge.RED)
    tank.shoot()
}

enum class Cartridge() {
    BLUE,
    GREEN,
    RED;

    fun hitWithForce(): Int {
        return when (this) {
            BLUE -> 5
            GREEN -> 10
            RED -> 20
        }
    }
}

class Tank() {
    var cartridge: Cartridge? = null
    fun weaponsWithANewTypeOfCartridges(cartridgeTwo: Cartridge) {
        cartridge = cartridgeTwo
    }

    fun shoot() {
        println("Урон нанесен на ${cartridge?.hitWithForce()} единиц")
    }
}
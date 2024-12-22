package org.example.lesson_19

fun main() {
    val tank = Tank()
    tank.weaponsWithANewTypeOfCartridges(Cartridge.RED)
    tank.shoot()
}

enum class Cartridge(val damage: Int) {
    BLUE(5),
    GREEN(10),
    RED(20);
}

class Tank() {
    var cartridge: Cartridge? = null
    fun weaponsWithANewTypeOfCartridges(cartridgeNew: Cartridge) {
        cartridge = cartridgeNew
    }

    fun shoot() {
        if (cartridge == null)
            println("Урон не нанесен")
        else
            println("Урон нанесен на ${cartridge?.damage} единиц")
    }
}
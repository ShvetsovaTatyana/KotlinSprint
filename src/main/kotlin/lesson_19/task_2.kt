package org.example.lesson_19

fun main() {
    val towel: Product = Product("Полотенце", "fhgbgfbnh1245", OnlineStore.CLOTH)
    val door: Product = Product("Дверь", "fjgjfvbfj4562", OnlineStore.MISCELLANEOUS)
    towel.displayInformation()
    println()
    door.displayInformation()
}

enum class OnlineStore {
    CLOTH,
    STATIONERY,
    MISCELLANEOUS;

    fun getAName(): String {
        return when (this) {
            CLOTH -> "Одежда"
            STATIONERY -> "Канцелярские товары"
            MISCELLANEOUS -> "Разное"
        }
    }

}

class Product(
    val name: String,
    val id: String,
    val category: OnlineStore,
) {
    fun displayInformation() {
        println("Имя товара: $name\nИдентификатор товара: $id\nКатегория товара: ${category.getAName()}")
    }
}
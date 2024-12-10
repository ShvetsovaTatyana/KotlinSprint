package org.example.lesson_18

fun main() {
    val orderOne = Order("72145254")
    val orderTwo = Order("51458965")

    orderOne.displayInformation("Жидкое мыло")
    orderTwo.displayInformation(listOf("Зубная паста", "Порошок"))
}

class Order(val number: String) {
    fun displayInformation(
        product: String,
    ) {
        println("Заказан товар: $product")
    }

    fun displayInformation(
        product: List<String>
    ) {
        println("Заказаны следующие товары: $product")
    }
}
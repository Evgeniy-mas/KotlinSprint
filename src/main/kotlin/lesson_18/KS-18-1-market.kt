package org.example.lesson_18

fun main() {
    val order = MarketPlace()
    order.makeOrder(23, "phone")

    val order2 = MarketPlace()
    order2.makeOrder(55, arrayOf("TV, musicBox, ipod, boots"))
}

class MarketPlace {

    fun makeOrder(num: Int, product: String) {
        println("Заказан товар: $product, номер заказа - $num.")
    }

    fun makeOrder(num: Int, array: Array<String>) {
        println("Заказаны товары: ${array.joinToString()}, номер заказа - $num.")
    }
}

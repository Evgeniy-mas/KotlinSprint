package org.example.lesson_16

fun main() {
    val pizza = Order(245, "в обработке")

    pizza.newStatus("готовится.")
}

class Order(private val number: Int, var status: String) {

    private fun changeStatus2(stat: String) {
        status = stat
        println("Статус заказа номер - $number, изменился на - $status.")
    }

    fun newStatus(status: String) {
        changeStatus2(status)
    }
}


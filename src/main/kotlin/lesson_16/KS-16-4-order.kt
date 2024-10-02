package org.example.lesson_16

fun main() {
    val pizza = Order(245, "в обработке")

    newStatus(pizza, "готовится")
}

class Order(private val number: Int, var status: String) {

    fun changeStatus2(status: String) {
        this.status = status
        println("Статус заказа номер - $number, изменился на - ${this.status}.")
    }
}

fun newStatus(order: Order, status: String) {
    order.changeStatus2(status)
}
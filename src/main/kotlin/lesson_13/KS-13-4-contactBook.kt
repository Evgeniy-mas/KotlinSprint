package org.example.lesson_13

fun main() {
    val contactBook = ContactBook()
    val contact: MutableList<ContactBook> = mutableListOf()

    while (true) {
        println("Введите имя:")
        val name = readln()

        println("Введите номер телефона:")
        val number = readln().toLongOrNull()
        if (number == null) {
            println("Вы не ввели номер телефона.")
        }

        println("Введите назавние компании:")
        var company = readln()
        if (company.isEmpty()) {
            company = null.toString()
        }

        if (number != null) {
            contact.add(ContactBook(name, number, company))
        }

        println("Хотите добавить еще один контакт: да,нет?")
        val question = readln().lowercase()
        if (question == "да") {
            continue
        } else break
    }
    contactBook.showContact(contact)
}

class ContactBook(val name: String? = "", val number: Long? = null, val company: String? = null) {

    fun showContact(cont: MutableList<ContactBook>) {
        cont.forEach { println("Имя: ${it.name}\nНомер телефона:${it.number}\nКомпания:${it.company}") }
    }
}
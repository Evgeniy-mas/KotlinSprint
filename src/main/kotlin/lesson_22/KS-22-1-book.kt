package org.example.lesson_22


fun main() {
    val book = RegularBook("Вий", "Гоголь")
    val book2 = RegularBook("Вий", "Гоголь")

    println(book == book2)

    /* Результат сравнения false, потому-что мы сравниваем ссылки
    на объекты в памяти, а не сами значения.
    */

    val book3 = DataBook("Шекспир", "Гамлет")
    val book4 = DataBook("Шекспир", "Гамлет")

    println(book3 == book4)

    /* В дата классе мы сравниваем именно сами значения.
    А так как они одинаковые, результат - true.
 */
}

class RegularBook(val title: String, val author: String)

data class DataBook(val title: String, val author: String)
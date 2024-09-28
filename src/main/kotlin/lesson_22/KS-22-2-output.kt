package org.example.lesson_22


fun main() {
    val book = RegularBook2("Вий", "Гоголь")
    println(book)
    /* RegularBook@12edcd21, так по-умолчанию
    выводится объект класса в строку. Для нормального вывода значний,
    можно в обычном классе переопределить метод toString.
    */

    val book2 = DataBook2("Шекспир", "Гамлет")
    println(book2)
}
/* У data класса, нормальный вывод значений, потому-что data class,
   автоматически переопределяет метод toString, который
   тоже можно переопределить в случае необходимости.
 */

class RegularBook2(val title: String, val author: String)

data class DataBook2(val title: String, val author: String)
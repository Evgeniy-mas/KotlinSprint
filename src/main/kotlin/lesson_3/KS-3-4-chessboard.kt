package org.example.lesson_3

fun main() {
    var whereFrom = "E2"
    var where = "E4"
    var moveNumber = 1
    var sending = "[$whereFrom-$where;$moveNumber]"

    println(sending)

    whereFrom = "D2"
    where = "D3"
    moveNumber = 2
    sending = "[$whereFrom-$where;$moveNumber]"

    println(sending)
}
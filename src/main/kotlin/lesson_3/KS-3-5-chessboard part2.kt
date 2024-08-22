package org.example.lesson_3

fun main() {
    val serv = "D2-D4;0"

    val whereFrom = serv.subSequence(0,2)
    val where = serv.subSequence(3,5)
    val moveNumber = serv.subSequence(6,7)

    print(whereFrom)
    print(where)
    print(moveNumber)
}
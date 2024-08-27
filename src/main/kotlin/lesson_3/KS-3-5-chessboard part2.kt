package org.example.lesson_3

fun main() {
    val server = "D2-D4;0"

    val serverSplit:List<String> = server.split('-',';')

    val whereFrom = serverSplit[0]
    val where = serverSplit[1]
    val moveNumber = serverSplit[2]

    println(whereFrom)
    println(where)
    println(moveNumber)
}
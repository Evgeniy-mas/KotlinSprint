package org.example.lesson_17

fun main() {
    val quiz = Quiz("Какой город столица Испании?", "Мадрид")

    println(quiz.question)

    println(quiz.answer)
}

class Quiz(_question: String, _answer: String) {
    val question = _question
        get() = field

    var answer = _answer
        get() = field
        set(value) {
            field = value
        }
}
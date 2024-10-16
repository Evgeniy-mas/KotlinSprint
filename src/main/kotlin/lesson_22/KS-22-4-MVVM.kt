package org.example.lesson_22

fun main() {
    val data = MainScreenViewModel("Hello")
    data.loadData()
}

class MainScreenViewModel(mainScreenState: String) {

    private val comingData = MainScreenState(mainScreenState)

    data class MainScreenState(val data: String, val isLoading: Boolean = false)

    fun loadData() {
        println("Нет данных")
        if (comingData.data.isNotEmpty()) {
            println("Идет загрузка данных")
            val newObject = comingData.copy(isLoading = true)
            println(newObject)
            println("Наличие данных")
        }
    }
}
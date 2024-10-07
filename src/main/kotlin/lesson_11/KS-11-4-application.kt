package org.example.lesson_11

fun main() {
    val category = Category2(listOf("Бургеры", "Десерты", "Пицца", "Рыба", "Супы", "Салаты", "Избранное"))

    val recipeBurger = Recipe2(
        listOf(
            "Классический гамбургер",
            "Чизбургер",
            "Бургер с грибами и сыром",
        )
    )

    val favourites = Category2(listOf(recipeBurger.recipe[0], recipeBurger.recipe[1]))

    val ingredient = Ingredient(
        listOf(
            "творог - 350г",
            "куриное яйцо - 2шт",
            "мука - 6с ложек",
            "подсолнечное масло - 5с ложек",
            "сахар - 2с ложек",
        )
    )

    println("Категория: ${category.category[0]}")
    println("Рецепт: ${recipeBurger.recipe[2]}")
    println("Ингредиенты: ${ingredient.ingredient.joinToString()}")
    println("Категория ${category.category[6]}: ${favourites.category}")
}

class Category2(val category: List<String>)

class Recipe2(val recipe: List<String>)

class Ingredient(val ingredient: List<String>)
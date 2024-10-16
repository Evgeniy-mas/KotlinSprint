package org.example.lesson_11

fun main() {
    val showCategory = listOf("Бургеры", "Десерты", "Пицца", "Рыба", "Супы", "Салаты")

    val category = Category2(
        "Бургеры",
        "Картинка бургер",
        "рецепты всех популярных бургеров.",
        "Классический гамбургер\nЧизбургер\nБургер с грибами и сыром\nБургер с сыром и авокадо\nБургер с сыром" +
                "Бургер с беконом\nВеганский бургер\nОстрый гамбургер"
    )

    val ingredient = Ingredient(
        listOf(
            "творог - 350г",
            "куриное яйцо - 2шт",
            "мука - 6с ложек",
            "подсолнечное масло - 5с ложек",
            "сахар - 2с ложек",
        )
    )

    val recipe = Recipe2(
        "Бургер с грибами и сыром", category, "burger.jpg",
        ingredient = listOf(ingredient), portions = 3, cookingMethod = "1.В глубокой миске смешайте говяжий фарш," +
                "лук, чеснок, соль и перец. Разделите фарш на 4равные части т сформируйте котлеты.\n" +
                "2.Разогрейте сковороду на среднем огне. Обжаривайте котлеты с каждой стороны в течении 4-5 минут " +
                "или до желаемой степени прожарки.\nВ то время как котлеты готовятся, подготовьте булочки. Разрежьте " +
                "их пополам и обжарьте на сковороде до золотистой корочки.\n4.Смазать нижние половинки булочек горчицей " +
                "и кетчупом, затем положите лист салата, котлету, кольца помидора и закройте верхней половиной булочки.\n" +
                "5.Подавайте бургеры горячими  с картофельными чипсами или картофельным пюре."
    )

    splashscreen()
    println("Выбор категории рецептов: $showCategory")
    println()
    category.choiceCategory()
    println()
    recipe.showRecipe()
    recipe.addToFavorite()
    recipe.removeFromFavorite()
}

fun splashscreen() {
    println("Картинка РЕЦЕПТЫ")
}

class Category2(
    val title: String,
    val picture: String,
    val describe: String,
    val allBurger: String
) {
    fun choiceCategory() {
        println("Выбрана категория $title. $picture. Описание: $describe \n$allBurger")
    }
}

class Recipe2(
    val title: String,
    val category: Category2,
    val image: String,
    var isFavourites: Boolean = false,
    var ingredient: List<Ingredient>,
    var portions: Int,
    val cookingMethod: String
) {

    fun showRecipe() {
        println("Рецепт $title, на $portions порции, категория:${category.title}, $image, в избранном:$isFavourites")
        println(
            "Ингредиенты: ${
                ingredient.map { it.ingredient }.joinToString()
            }\n\nСпособ приготовления:\n$cookingMethod"
        )
    }

    fun addToFavorite() {
        println("Рецепт $title добавлен в избранное.")
        isFavourites = true
    }

    fun removeFromFavorite() {
        println("Рецепт $title удален из избранного.")
        isFavourites = false
    }
}

class Ingredient(
    val ingredient: List<String>,
)
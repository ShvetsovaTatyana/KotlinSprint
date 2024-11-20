package org.example.lesson_11

class RrecipeCategory(
    val burgers: List<String> = listOf("Чмзбургер", "Классический гамбургер", "Бургер с грибами и сыром"),
    val desserts: List<String> = listOf("Сырники", "Блины", "Мороженое"),
    val pizza: List<String> = listOf("Маргарита", "Ветчина с сыром", "Курица с грибами"),
    val fish: List<String> = listOf("Тунец", "Семга", "Форель"),
    val inFavorites: Boolean,
) {

}

class Rrecipe(
    val name: String = "Бургер с грибами и сыром",
    val category: String = "Бургеры",
    val numberOfServings: Int = 3,
    val ingredients: List<String> = listOf(
        "Творог",
        "Куриной яйцо",
        "Пшеничная мука",
        "Подсолнечное масло",
        "Сахар"
    ),
    val inFavorites: Boolean,
    val cookingMethod: String = "Тут написаны подробные шаги приготовления",
) {
}

class Ingredient(
    val numberOfServings: Int = 3,
    val quantityOfIngredients: List<String> = listOf(
        "Творог 350г",
        "Куриной яйцо 2шт",
        "Пшеничная мука 6 с. ложек",
        "Подсолнечное масло 5 с. ложек",
        "Сахар 2 с. ложки"
    ),
    val inFavorites: Boolean,
) {

}
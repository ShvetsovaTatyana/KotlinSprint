package org.example.lesson_11

class RecipeCategory(
    val category: List<Recipe>,
    val imageRecipeCategory: String,
    val nameOfTheRecipeCategory: String,
)

class Recipe(
    val ingredients: List<Ingredient>,
    val inFavorite: Boolean,
    val cookingMethod: String,
    val imageRecipe: String,
    val nameOfTheRecipe: String,
    val portions: Int,
)

class Ingredient(
    val ingredient: String,
    val amountOfIngredient: String,
)



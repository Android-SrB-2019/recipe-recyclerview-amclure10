/**
 * Alex McLure
 * 2019-03-25
 */
package com.example.owner.recipe;
import java.util.LinkedList;
public class Recipe {

    public Recipe(String name, String description, String image, String ingredients, String directions) {
        this.name = name;
        this.description = description;
        this.image = image;
        this.ingredients = ingredients;
        this.directions = directions;
    }

    public String name;
    public String description;
    public String image;
    public String ingredients;
    public String directions;

    public static final String NAME = "NAME";
    public static final String DESCRIPTION = "DESCRIPTION";
    public static final String IMAGE = "IMAGE";
    public static final String INGREDIENTS = "INGREDIENTS";
    public static final String DIRECTIONS = "DIRECTIONS";

    public static LinkedList<Recipe> getRecipes()
    {
        return DataProvider.getRecipes();
    }

    @Override
    public String toString()
    {
        return name;
    }
}
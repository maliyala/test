package com.meituan.pattern.builder;

public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal:");
        vegMeal.showItem();
        System.out.println("Total Cost:"+vegMeal.getCost());

        Meal noVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\nNon-Veg Meal:");
        noVegMeal.showItem();
        System.out.println("Total Cost:"+noVegMeal.getCost());
    }
}

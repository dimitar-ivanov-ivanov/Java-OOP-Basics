package com.company.PizzaCalories.Models.Toppings;

public class Veggies extends ToppingImpl {
    private static final double VEGGIE_CALORIES = 0.8;

    public Veggies(double weight) {
        super(weight, VEGGIE_CALORIES);
    }
}

package com.company.PizzaCalories.Models.Toppings;

public class Sauce extends ToppingImpl {
    private static final double SAUCE_CALORIES = 0.9;

    public Sauce(double weight) {
        super(weight, SAUCE_CALORIES);
    }
}

package com.company.PizzaCalories.Models.Toppings;

public class Cheese extends ToppingImpl {
    private static final double CHEESE_CALORIES = 1.1;

    public Cheese(double weight) {
        super(weight, CHEESE_CALORIES);
    }
}

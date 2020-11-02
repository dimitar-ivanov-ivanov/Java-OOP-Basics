package com.company.PizzaCalories.Models.Toppings;

public class Meat extends ToppingImpl {
    private static final double MEAT_CALORIES = 1.2;

    public Meat(double weight) {
        super(weight, MEAT_CALORIES);
    }
}

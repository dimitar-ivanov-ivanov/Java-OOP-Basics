package com.company.PizzaCalories.Models.Doughs;

public class Crispy extends DoughImpl {
    private static final double CRISPY_DOUGH_CALORIE_MODIFIER = 1;

    public Crispy(double weight) {
        super(weight, CRISPY_DOUGH_CALORIE_MODIFIER);
    }
}

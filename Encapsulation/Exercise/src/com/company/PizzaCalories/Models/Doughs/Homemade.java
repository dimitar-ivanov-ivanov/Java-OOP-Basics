package com.company.PizzaCalories.Models.Doughs;

public class Homemade extends DoughImpl {
    private static final double HOMEMADE_DOUGH_CALORIE_MODIFIER = 1.1;

    public Homemade(double weight) {
        super(weight, HOMEMADE_DOUGH_CALORIE_MODIFIER);
    }
}

package com.company.PizzaCalories.Models.Doughs;

public class Chewy extends DoughImpl {
    private static final double CHEWY_DOUGH_CALORIE_MODIFIER = 1.1;

    public Chewy(double weight) {
        super(weight, CHEWY_DOUGH_CALORIE_MODIFIER);
    }
}

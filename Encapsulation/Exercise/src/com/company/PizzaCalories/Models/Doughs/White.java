package com.company.PizzaCalories.Models.Doughs;

public class White extends DoughImpl {
    private static final double WHITE_DOUGH_CALORIE_MODIFIER = 1.5;

    public White(double weight) {
        super(weight, WHITE_DOUGH_CALORIE_MODIFIER);
    }
}

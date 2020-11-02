package com.company.PizzaCalories.Models.Doughs;

public class Wholegrain extends DoughImpl {
    private static final double WHOLEGRAIN_DOUGH_CALORIE_MODIFIER = 1;

    public Wholegrain(double weight) {
        super(weight, WHOLEGRAIN_DOUGH_CALORIE_MODIFIER);
    }
}

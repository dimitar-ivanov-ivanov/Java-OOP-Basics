package com.company.PizzaCalories.Models.Toppings;

public abstract class ToppingImpl {
    private static final int MIN_WEIGHT = 1;
    private static final int MAX_WEIGHT = 50;

    private double weight;
    private double calories;

    public ToppingImpl(double weight, double calories) {
        setWeight(weight);
        this.calories = calories;
    }

    private void setWeight(double weight) {
        if (weight < MIN_WEIGHT || weight > MAX_WEIGHT) {
            throw new IllegalArgumentException(this.getClass().getSimpleName() + " weight should be in the range [" + MIN_WEIGHT + ".." + MAX_WEIGHT + "].");
        }
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public double getCalories() {
        return calories;
    }
}

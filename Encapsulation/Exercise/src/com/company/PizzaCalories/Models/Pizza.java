package com.company.PizzaCalories.Models;

import java.util.ArrayList;
import java.util.List;

import com.company.PizzaCalories.Models.Doughs.DoughImpl;
import com.company.PizzaCalories.Models.Toppings.ToppingImpl;

public class Pizza {
    private static final int MIN_NAME_LEN = 1;
    private static final int MAX_NAME_LEN = 15;
    private static final int MIN_TOPPING_COUNT = 0;
    private static final int MAX_TOPPING_COUNT = 10;

    private String name;
    private List<DoughImpl> doughs;
    private List<ToppingImpl> toppings;

    public Pizza(String name, int numberOfToppings) {
        setName(name);
        this.doughs = new ArrayList<>();
        setToppings(numberOfToppings);
    }

    public void setDoughs(List<DoughImpl> doughs) {
        this.doughs = doughs;
    }

    private void setName(String name) {
        if (name.length() < MIN_NAME_LEN || name.length() > MAX_NAME_LEN) {
            throw new IllegalArgumentException("Pizza name should be between " + MIN_NAME_LEN + " and " + MAX_NAME_LEN + " symbols.");
        }
        this.name = name;
    }

    private void setToppings(int numberOfToppings) {
        if (numberOfToppings < MIN_TOPPING_COUNT || numberOfToppings > MAX_TOPPING_COUNT) {
            throw new IllegalArgumentException("Number of toppings should be in range [" + MIN_TOPPING_COUNT + ".." + MAX_TOPPING_COUNT + "].");
        }
        this.toppings = new ArrayList<>(numberOfToppings);
    }

    public void setToppings(List<ToppingImpl> toppings) {
        this.toppings = new ArrayList<>(toppings);
    }

    private double getTotalCalories() {
        double doughCalories = getDoughCalories();
        double toppingCalories = getToppingsCalories();
        return doughCalories + toppingCalories;
    }

    private double getToppingsCalories() {
        double calories = 0;

        for (int i = 0; i < toppings.size(); i++) {
            ToppingImpl topping = toppings.get(i);
            calories *= (topping.getCalories() * topping.getWeight() * 2);
        }

        return calories;
    }

    private double getDoughCalories() {
        double calories = doughs.get(0).getWeight() * 2;
        for (int i = 0; i < doughs.size(); i++) {
            calories *= doughs.get(i).getCalories();
        }

        return calories;
    }

    @Override
    public String toString() {
        return name + " - " + getTotalCalories();
    }
}

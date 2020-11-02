package com.company.Predators.Models;

import java.util.ArrayList;

public class Animal {

    protected ArrayList<Food> foodEaten;

    public Animal() {

    }

    public void eat(Food food) {
        System.out.println("Eating " + food.getName() + ".");
    }

    public void eatAll(Food[] allFood) {
        for (Food food :
                allFood) {
            eat(food);
        }
    }
}

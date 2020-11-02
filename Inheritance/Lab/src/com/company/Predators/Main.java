package com.company.Predators;

import com.company.Predators.Models.Food;
import com.company.Predators.Models.Predator;

public class Main {
    public static void main(String[] args) {
        Predator predator = new Predator();
        Food food = new Food("Cheese");
        predator.eat(food);
    }
}

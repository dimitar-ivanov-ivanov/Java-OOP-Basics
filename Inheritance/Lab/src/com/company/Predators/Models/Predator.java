package com.company.Predators.Models;

public class Predator extends Animal {
    private int health;

    public Predator() {

    }

    @Override
    public void eat(Food food) {
        super.eat(food);
        health++;
        System.out.println("Health increased.");
    }
}

package com.company.Farm.Animals;

import com.company.Farm.Foods.Food;

public abstract class Animal {
    private String animalName;
    private String animalType;
    private double animalWeight;
    private int foodEaten;

    public Animal(String animalName, String animalType, double animalWeight) {
        this.animalName = animalName;
        this.animalType = animalType;
        this.animalWeight = animalWeight;
    }

    protected String getAnimalName() {
        return animalName;
    }

    protected String getAnimalType() {
        return animalType;
    }

    protected double getAnimalWeight() {
        return animalWeight;
    }

    protected int getFoodEaten() {
        return foodEaten;
    }

    private void setFoodEaten(int foodEaten) {
        this.foodEaten = foodEaten;
    }

    public abstract void makeSound();

    public void eat(Food food) {
        setFoodEaten(getFoodEaten() + food.getQuantity());
        System.out.println(this.getClass().getSimpleName() + " is eating " + food.getQuantity() + " " + food.getClass().getSimpleName());
    }
}

package com.company.Farm.Animals.Cats;

import java.text.DecimalFormat;

public class Cat extends Feline {
    private String breed;

    public Cat(String animalName, String animalType, double animalWeight, String livingRegion, String breed) {
        super(animalName, animalType, animalWeight, livingRegion);
        this.breed = breed;
    }

    private String getBreed() {
        return breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Meowwww");
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return getClass().getSimpleName() + "[" + getAnimalName() + ", " + getBreed() + ", " + df.format(getAnimalWeight()) + ", " + getLivingRegion() + ", " + getFoodEaten() + "]";
    }
}

package com.company.Farm.Animals;

import java.text.DecimalFormat;

public abstract class Mammal extends Animal {
    private String livingRegion;

    public Mammal(String animalName, String animalType, double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight);
        this.livingRegion = livingRegion;
    }

    protected String getLivingRegion() {
        return livingRegion;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return getClass().getSimpleName() + "[" + getAnimalName() + ", " + df.format(getAnimalWeight()) + ", " + getLivingRegion() + " ," + getFoodEaten() + "]";
    }
}

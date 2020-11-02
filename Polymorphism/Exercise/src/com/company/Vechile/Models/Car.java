package com.company.Vechile.Models;

public class Car extends Vechile {
    public Car(double fuelQuantity, double fuelConsumption, int tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
        this.drivingModifier = 0.9;
    }
}

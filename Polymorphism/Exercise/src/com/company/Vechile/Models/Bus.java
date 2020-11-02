package com.company.Vechile.Models;

public class Bus extends Vechile {
    public Bus(double fuelQuantity, double fuelConsumption, int tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
        this.drivingModifier = 1.4;
    }

    public void driveEmpty(int distance) {
        drivingModifier = 0;
        super.drive(distance);
        drivingModifier = 1.4;
    }
}

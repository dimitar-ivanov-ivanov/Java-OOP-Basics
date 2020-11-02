package com.company.Vechile.Models;

public class Truck extends Vechile {
    public Truck(double fuelQuantity, double fuelConsumption, int tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
        this.drivingModifier = 1.6;
    }

    @Override
    public void refuel(double fuel) {
        super.refuel(fuel * 95 / 100);
    }
}

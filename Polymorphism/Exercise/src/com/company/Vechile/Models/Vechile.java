package com.company.Vechile.Models;

public abstract class Vechile {
    private double fuelQuantity;
    private double fuelConsumption;
    private int tankCapacity;

    protected double drivingModifier;

    public Vechile(double fuelQuantity, double fuelConsumption, int tankCapacity) {
        setTankCapacity(tankCapacity);
        setFuelConsumption(fuelConsumption);
        setFuelQuantity(fuelQuantity);
    }

    public double getFuelQuantity() {
        return fuelQuantity;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    private int getTankCapacity() {
        return tankCapacity;
    }

    protected void setFuelQuantity(double fuelQuantity) throws IllegalArgumentException {
        if (fuelQuantity <= 0) {
            throw new IllegalArgumentException("Fuel must be a positive number.");
        }
        if (fuelQuantity > getTankCapacity()) {
            throw new IllegalArgumentException("Cannot fit fuel in tank");
        }
        this.fuelQuantity = fuelQuantity;
    }

    protected void setFuelConsumption(double fuelConsumption) throws IllegalArgumentException {
        if (fuelConsumption < 0) {
            throw new IllegalArgumentException("Fuel consumption cannot be negative.");
        }
        this.fuelConsumption = fuelConsumption;
    }

    protected void setTankCapacity(int tankCapacity) throws IllegalArgumentException {
        if (tankCapacity < 0) {
            throw new IllegalArgumentException("Tank capacity cannot be negative.");
        }
        this.tankCapacity = tankCapacity;
    }

    public boolean drive(double distance) throws IllegalArgumentException {
        if (distance < 0) {
            throw new IllegalArgumentException("Distance cannot be negative.");
        }
        double fuelNeeded = getFuelConsumption() + drivingModifier;
        if (distance * fuelNeeded <= getFuelQuantity()) {
            setFuelQuantity(getFuelQuantity() - distance * fuelNeeded);
            return true;
        }
        return false;
    }

    public void refuel(double fuel) throws IllegalArgumentException {
        if (fuel <= 0) {
            throw new IllegalArgumentException("Fuel consumption cannot be negative.");
        }
        setFuelQuantity(getFuelQuantity() + fuel);
    }
}

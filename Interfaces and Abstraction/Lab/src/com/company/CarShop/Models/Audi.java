package com.company.CarShop.Models;

import com.company.CarShop.Interfaces.Car;
import com.company.CarShop.Interfaces.Rentable;

public class Audi implements Rentable, Car {
    private String model;
    private String color;
    private int power;
    private int minRentDays;
    private double pricePerDay;
    private String countryProduced;

    public Audi(String model, String color, int power, String countryProduced, int minRentDays, double pricePerDay) {
        this.model = model;
        this.color = color;
        this.power = power;
        this.countryProduced = countryProduced;
        this.minRentDays = minRentDays;
        this.pricePerDay = pricePerDay;
    }

    @Override
    public int getMinRentDays() {
        return minRentDays;
    }

    @Override
    public double getPricePerDay() {
        return pricePerDay;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public int getHorsePower() {
        return power;
    }
}

package com.company.CarShop.Models;

import com.company.CarShop.Interfaces.Car;
import com.company.CarShop.Interfaces.Sellable;

import java.io.Serializable;

public class Seat implements Sellable {
    private String model;
    private String color;
    private int power;
    private double price;
    private String countryProduced;

    public Seat(String model, String color, int power, String countryProduced, double price) {
        this.model = model;
        this.color = color;
        this.power = power;
        this.countryProduced = countryProduced;
        this.price = price;
    }

    public String getCountryProduced() {
        return countryProduced;
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public int getHorsePower() {
        return this.power;
    }

    @Override
    public String toString() {
        return "This is " + getModel() + " produced in " + getCountryProduced() + " and have " + TIRES + " tires";
    }

    @Override
    public double getPrice() {
        return price;
    }
}

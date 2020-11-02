package com.company.Ferrari.Models;

import com.company.Ferrari.Interfaces.Car;

public class Ferrari implements Car {
    private String name;

    public Ferrari(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String useBrakes() {
        return "Brakes!";
    }

    @Override
    public String pushTheGas() {
        return "Zadu6avam sA!";
    }

    @Override
    public String toString() {
        return Car.MODEL + "/" + useBrakes() + "/" + pushTheGas() + "/" + getName();
    }
}

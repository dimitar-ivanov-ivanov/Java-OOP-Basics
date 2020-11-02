package com.company.CarShop.Interfaces;

public interface Rentable extends Car {
    double pricePerDay = 0;

    int getMinRentDays();

    double getPricePerDay();
}

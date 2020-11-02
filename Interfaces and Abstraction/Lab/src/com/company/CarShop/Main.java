package com.company.CarShop;

import com.company.CarShop.Interfaces.Car;
import com.company.CarShop.Interfaces.Rentable;
import com.company.CarShop.Interfaces.Sellable;
import com.company.CarShop.Models.Audi;
import com.company.CarShop.Models.Seat;

public class Main {
    public static void main(String[] args) {
        Sellable seat = new Seat("Leon", "Gray", 110, "Spain", 11111.1);
        Rentable audi = new Audi("Leon", "Gray", 110, "Spain", 3, 99.9);

        printCarInfo(seat);
        printCarInfo(audi);
    }

    private static void printCarInfo(Car car) {
        System.out.println(String.format(
                "%s is %s color and have %s horse power",
                car.getModel(),
                car.getColor(),
                car.getHorsePower()));
        System.out.println(car.toString());
    }

}

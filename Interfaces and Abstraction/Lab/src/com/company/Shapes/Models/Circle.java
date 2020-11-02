package com.company.Shapes.Models;

import com.company.Shapes.Interfaces.Drawable;

public class Circle implements Drawable {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    private int getRadius() {
        return radius;
    }

    @Override
    public void draw() {
        double r_in = getRadius() - 0.4;
        double r_out = getRadius() + 0.4;

        for (double y = getRadius(); y >= -getRadius(); --y) {
            for (double x = -getRadius(); x < r_out; x += 0.5) {
                double val = x * x + y * y;
                if (val >= r_in * r_in && val <= r_out * r_out) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}

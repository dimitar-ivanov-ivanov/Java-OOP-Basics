package com.company.Shapes.Models;

import com.company.Shapes.Interfaces.Measureable;

public class Circle implements Measureable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    private double getRadius() {
        return radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * getRadius();
    }

    @Override
    public double calculateArea() {
        return Math.PI * getRadius() * getRadius();
    }
}

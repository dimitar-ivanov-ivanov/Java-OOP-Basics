package com.company.Shapes.Models;

import com.company.Shapes.Interfaces.Measureable;

public abstract class FourSidedShape implements Measureable {
    private double height;

    public FourSidedShape(double height) {
        setHeight(height);
    }

    private void setHeight(double height) throws IllegalArgumentException {
        if (height < 0) {
            throw new IllegalArgumentException("Side cannot be negative.");
        }
        this.height = height;
    }


    protected double getHeight() {
        return height;
    }

    @Override
    public abstract double calculateArea();

    @Override
    public abstract double calculatePerimeter();
}

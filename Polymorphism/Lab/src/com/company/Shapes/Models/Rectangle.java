package com.company.Shapes.Models;

public class Rectangle extends FourSidedShape {
    private double width;

    public Rectangle(double height, double width) {
        super(height);
        setWidth(width);
    }

    private void setWidth(double width) throws IllegalArgumentException {
        if (width < 0) {
            throw new IllegalArgumentException("Side cannot be negative.");
        }
        this.width = width;
    }

    private double getWidth() {
        return width;
    }

    @Override
    public double calculateArea() {
        return this.getHeight() * this.getWidth();
    }

    @Override
    public double calculatePerimeter() {
        return 2 * getHeight() + 2 * getWidth();
    }
}

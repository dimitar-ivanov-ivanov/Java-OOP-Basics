package com.company.Shapes.Models;

public class Square extends FourSidedShape {
    public Square(double height) {
        super(height);
    }

    @Override
    public double calculateArea() {
        return this.getHeight() * this.getHeight();
    }

    @Override
    public double calculatePerimeter() {
        return 4 * getHeight();
    }

}

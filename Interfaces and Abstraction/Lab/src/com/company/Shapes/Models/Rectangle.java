package com.company.Shapes.Models;

import com.company.Shapes.Interfaces.Drawable;

public class Rectangle implements Drawable {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    private int getWidth() {
        return width;
    }

    private int getHeight() {
        return height;
    }

    @Override
    public void draw() {
        for (int i = 0; i < getHeight(); i++) {
            System.out.print("*");
            for (int k = 1; k < getWidth() - 1; k++) {
                System.out.print(" ");
                if (i == 0 || i == (getHeight() - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.print(" ");
            System.out.print("*");
            System.out.print("\n");
        }
    }
}

package com.company.Shapes;

import com.company.Shapes.Interfaces.Measureable;
import com.company.Shapes.Models.Circle;
import com.company.Shapes.Models.FourSidedShape;
import com.company.Shapes.Models.Rectangle;
import com.company.Shapes.Models.Square;

import java.awt.*;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        solve();
    }

    private static void solve() {
        Scanner scanner = new Scanner(System.in);

        int numberOfFourWalledShapes = Integer.parseInt(scanner.nextLine());
        List<Measureable> fourWalledShapes = getShapesWithFourWalls(scanner, numberOfFourWalledShapes);

        int numberOfCircles = Integer.parseInt(scanner.nextLine());
        List<Measureable> circles = getCircles(scanner, numberOfCircles);
        fourWalledShapes.addAll(circles);

        printAreasOfShapes(fourWalledShapes);
    }

    private static List<Measureable> getCircles(Scanner scanner, int numberOfCircles) {
        List<Measureable> circles = new ArrayList<>();

        for (int i = 0; i < numberOfCircles; i++) {
            double[] nums = Arrays
                    .stream(scanner.nextLine().split(" "))
                    .mapToDouble(e -> Double.parseDouble(e))
                    .toArray();
            circles.add(new Circle(nums[0]));
        }

        return circles;
    }

    private static void printAreasOfShapes(List<Measureable> shapes) {
        for (Measureable shape :
                shapes) {
            System.out.println("Area: " + shape.calculateArea() + " Perimeter: " + shape.calculatePerimeter());
        }

    }

    private static List<Measureable> getShapesWithFourWalls(Scanner scanner, int numberOfShapes) {
        List<Measureable> fourWallShaped = new ArrayList<>();

        for (int i = 0; i < numberOfShapes; i++) {
            double[] nums = Arrays
                    .stream(scanner.nextLine().split(" "))
                    .mapToDouble(e -> Double.parseDouble(e))
                    .toArray();

            if (nums.length == 1) {
                fourWallShaped.add(new Square(nums[0]));
            } else {
                fourWallShaped.add(new Rectangle(nums[0], nums[1]));
            }
        }

        return fourWallShaped;
    }
}

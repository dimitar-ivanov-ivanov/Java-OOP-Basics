package com.company.ClassBox;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        solve();
    }

    private static void solve() {
        Scanner scanner = new Scanner(System.in);
        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());

        try {
            Box box = new Box(length, width, height);
            DecimalFormat df = new DecimalFormat("0.00");
            System.out.println("Surface Area - " + df.format(box.getSurfaceArea()));
            System.out.println("Lateral Surface Area - " + df.format(box.getLateralSurfaceArea()));
            System.out.println("Volume – " + df.format(box.getVolume()));
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

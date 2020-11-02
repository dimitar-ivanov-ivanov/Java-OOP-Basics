package com.company.Ferrari;

import com.company.Ferrari.Interfaces.Car;
import com.company.Ferrari.Models.Ferrari;

import java.lang.instrument.IllegalClassFormatException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        solve();
        checkSolution();
    }

    private static void checkSolution() {
        String ferrariName = Ferrari.class.getSimpleName();
        String carInterface = Car.class.getSimpleName();
        boolean isCreated = Car.class.isInterface();
        if (!isCreated) {
            try {
                throw new IllegalClassFormatException("No interface created!");
            } catch (IllegalClassFormatException e) {
                e.getMessage();
            }
        }

    }

    private static void solve() {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        Ferrari ferrari = new Ferrari(name);
        System.out.println(ferrari);
    }
}

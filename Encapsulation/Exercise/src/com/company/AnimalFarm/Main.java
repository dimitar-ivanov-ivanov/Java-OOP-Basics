package com.company.AnimalFarm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        solve();
    }

    private static void solve() {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int num = Integer.parseInt(scanner.nextLine());
        try {
            Chicken chicken = new Chicken(name, num);
            System.out.println(chicken);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

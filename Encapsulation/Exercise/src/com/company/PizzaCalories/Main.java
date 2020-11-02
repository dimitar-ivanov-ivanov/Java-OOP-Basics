package com.company.PizzaCalories;

import com.company.PizzaCalories.Models.Doughs.*;
import com.company.PizzaCalories.Models.Pizza;
import com.company.PizzaCalories.Models.Toppings.*;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        solve();
    }

    private static void solve() {
        Scanner scanner = new Scanner(System.in);
        try {
            Pizza pizza = getPizza(scanner);
            List<DoughImpl> doughs = getDough(scanner);
            pizza.setDoughs(doughs);
            List<ToppingImpl> toppings = getToppings(scanner, pizza);
            pizza.setToppings(toppings);
            printPizza(pizza);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static void printPizza(Pizza pizza) {
        System.out.println(pizza);
    }

    private static List<ToppingImpl> getToppings(Scanner scanner, Pizza pizza) {
        String[] args = scanner.nextLine().split(" ");
        List<ToppingImpl> toppings = new ArrayList<>();

        while (!args[0].equals("END")) {
            String typeName = args[1];
            double weight = Double.parseDouble(args[2]);

            try {
                ToppingImpl topping = getCertainTypeOfTopping(typeName, weight);
                toppings.add(topping);
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }

            args = scanner.nextLine().split(" ");
        }

        return toppings;
    }

    private static ToppingImpl getCertainTypeOfTopping(String typeName, double weight) {
        switch (typeName) {
            case "Meat":
                return new Meat(weight);
            case "Veggies":
                return new Veggies(weight);
            case "Cheese":
                return new Cheese(weight);
            case "Sauce":
                return new Sauce(weight);
            default:
                throw new IllegalArgumentException("Cannot place " + typeName + " on top of your pizza.");
        }
    }

    private static List<DoughImpl> getDough(Scanner scanner) {
        String[] args = scanner.nextLine().split(" ");
        List<DoughImpl> doughs = new ArrayList<>();
        Double weight = Double.parseDouble(args[3]);
        DoughImpl firstDough = getCertainTypeOfDough(args[1], weight);
        DoughImpl secondDough = getCertainTypeOfDough(args[2], weight);
        doughs.add(firstDough);
        doughs.add(secondDough);
        return doughs;
    }

    private static DoughImpl getCertainTypeOfDough(String typeName, Double weight) {
        switch (typeName) {
            case "White":
                return new White(weight);
            case "Wholegrain":
                return new Wholegrain(weight);
            case "Crispy":
                return new Crispy(weight);
            case "Chewy":
                return new Chewy(weight);
            case "Homemade":
                return new Homemade(weight);
            default:
                throw new IllegalArgumentException("Invalid type of dough.");
        }
    }

    private static Pizza getPizza(Scanner scanner) {
        String[] args = scanner.nextLine().split(" ");
        return new Pizza(args[1], Integer.parseInt(args[2]));
    }
}

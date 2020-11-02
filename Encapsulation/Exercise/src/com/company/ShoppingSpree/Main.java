package com.company.ShoppingSpree;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        solve();
    }

    private static void solve() {
        Scanner scanner = new Scanner(System.in);
        Map<String, Person> people = getPeople(scanner);
        Map<String, Product> products = getProducts(scanner);
        peopleBuyProducts(people, products, scanner);
        printPeople(people);
    }

    private static void printPeople(Map<String, Person> people) {
        people
                .entrySet()
                .stream()
                .forEach(set -> {
                    Person person = set.getValue();
                    System.out.println(person);
                });
    }

    private static void peopleBuyProducts(Map<String, Person> people, Map<String, Product> products, Scanner scanner) {
        String[] args = scanner.nextLine().split(" ");

        while (!args[0].equals("END")) {
            String personName = args[0];
            String productName = args[1];

            addProductToPersonBag(people, products, personName, productName);
            args = scanner.nextLine().split(" ");
        }
    }

    private static void addProductToPersonBag(Map<String, Person> people, Map<String, Product> products, String personName, String productName) {
        if (people.containsKey(personName) && products.containsKey(productName)) {
            if (people.get(personName).tryToAddProduct(products.get(productName))) {
                System.out.println(personName + " bought " + productName);
            } else {
                System.out.println(personName + " can't afford " + productName);
            }
        }
    }

    private static Map<String, Product> getProducts(Scanner scanner) {
        String[] peopleArgs = scanner.nextLine().split(";");
        Map<String, Product> products = new HashMap<>();

        for (int i = 0; i < peopleArgs.length; i++) {
            String[] personArgs = peopleArgs[i].split("=");
            String name = personArgs[0];
            double cost = Double.parseDouble(personArgs[1]);

            try {
                Product product = new Product(name, cost);
                if (!products.containsKey(name)) {
                    products.put(name, product);
                }
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return products;
    }

    private static Map<String, Person> getPeople(Scanner scanner) {
        String[] peopleArgs = scanner.nextLine().split(";");
        Map<String, Person> people = new HashMap<>();

        for (int i = 0; i < peopleArgs.length; i++) {
            String[] personArgs = peopleArgs[i].split("=");
            String name = personArgs[0];
            double money = Double.parseDouble(personArgs[1]);

            try {
                Person person = new Person(name, money);
                if (!people.containsKey(name)) {
                    people.put(name, person);
                }
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return people;
    }
}

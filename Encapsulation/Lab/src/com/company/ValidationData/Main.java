package com.company.ValidationData;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        solve();
    }

    private static void solve() {
        Scanner scanner = new Scanner(System.in);
        int numberOfPeople = Integer.parseInt(scanner.nextLine());

        List<Person> people = getPeople(scanner, numberOfPeople);
        printPeople(people);
    }

    private static void printPeople(List<Person> people) {
        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i));
        }
    }

    private static List<Person> getPeople(Scanner scanner, int numberOfPeople) {
        List<Person> people = new ArrayList<>();

        for (int i = 0; i < numberOfPeople; i++) {
            try {
                people.add(Person.parsePerson(scanner.nextLine().split(" ")));
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return people;
    }
}

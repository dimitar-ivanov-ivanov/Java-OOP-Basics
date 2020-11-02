package com.company.SalaryIncrease;

import com.company.SalaryIncrease.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        solve();
    }

    private static void solve() {
        Scanner scanner = new Scanner(System.in);
        int numberOfPeople = Integer.parseInt(scanner.nextLine());

        List<Person> people = getPeople(scanner, numberOfPeople);
        addBonusToSalaries(scanner, people);
        printPeople(people);
    }

    private static void addBonusToSalaries(Scanner scanner, List<Person> people) {
        double bonus = Double.parseDouble(scanner.nextLine());
        for (Person person : people) {
            person.increaseSalary(bonus);
        }
    }

    private static void printPeople(List<Person> people) {
        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i));
        }
    }


    private static List<Person> getPeople(Scanner scanner, int numberOfPeople) {
        List<Person> people = new ArrayList<>();

        for (int i = 0; i < numberOfPeople; i++) {
            people.add(Person.parsePerson(scanner.nextLine().split(" ")));
        }

        return people;
    }
}

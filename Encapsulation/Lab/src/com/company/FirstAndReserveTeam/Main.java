package com.company.FirstAndReserveTeam;

import java.util.ArrayList;
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
        Team footballTeam = new Team("Arsenal");
        addPeopleToTeam(people, footballTeam);
        printTeam(footballTeam);
    }

    private static void printTeam(Team footballTeam) {
        System.out.println(footballTeam);
    }

    private static void addPeopleToTeam(List<Person> people, Team footballTeam) {
        for (Person person : people) {
            footballTeam.addPlayer(person);
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

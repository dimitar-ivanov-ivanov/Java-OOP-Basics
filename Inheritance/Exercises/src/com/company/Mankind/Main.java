package com.company.Mankind;

import com.company.Mankind.Models.Human;
import com.company.Mankind.Models.Student;
import com.company.Mankind.Models.Worker;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        solve();
    }

    private static void solve() {
        List<Human> humans = getHumans();
        printHumans(humans);
    }

    private static void printHumans(List<Human> humans) {
        for (Human human : humans) {
            System.out.println(human);
        }
    }

    private static List<Human> getHumans() {
        Scanner scanner = new Scanner(System.in);
        List<Human> humans = new ArrayList<>();
        String[] tokens = scanner.nextLine().split(" ");

        while (!tokens[0].equals("END")) {
            String firstName = tokens[0];
            String lastName = tokens[1];
            Human human = null;

            try {
                if (tokens.length == 3) {
                    String facultyNumber = tokens[2];
                    human = new Student(firstName, lastName, facultyNumber);
                } else if (tokens.length == 4) {
                    Double weekSalary = Double.parseDouble(tokens[2]);
                    Double workingHours = Double.parseDouble(tokens[3]);
                    human = new Worker(firstName, lastName, weekSalary, workingHours);
                }

                humans.add(human);
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }

            tokens = scanner.nextLine().split(" ");
        }

        return humans;
    }
}

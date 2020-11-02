package com.company.MilitaryElite;

import com.company.MilitaryElite.Interfaces.Private;
import com.company.MilitaryElite.Models.Soldiers.PrivateImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        solve();
    }

    private static void solve() {
        Scanner scanner = new Scanner(System.in);
        List<Private> privates = getPrivates(scanner);

    }

    private static List<Private> getPrivates(Scanner scanner) {
        List<Private> privates = new ArrayList<>();
        String[] args = scanner.nextLine().split(" ");
        String command = args[0];

        while (!command.equals("End")) {
            String firstName = args[1];
            String lastName = args[2];
            int id = Integer.parseInt(args[3]);
            double salary = Double.parseDouble(args[4]);

            switch (command) {
                case "Private":
                    privates.add(new PrivateImpl(id, firstName, lastName, salary));
                    break;
                case "Commando":
                    String corps = args[5];
                    break;
                case "LeutenantGeneral":
                    //get last elements as ids
                    int[] privatesIds = Arrays.stream(args).skip(5).toArray();
                    break;
                default:
                    break;
            }

            args = scanner.nextLine().split(" ");
            command = args[0];
        }


        return privates;
    }
}

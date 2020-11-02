package com.company.BorderControl;

import com.company.BorderControl.Models.Citizen;
import com.company.BorderControl.Models.IdentifiableImpl;
import com.company.BorderControl.Models.Robot;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        solve();
    }

    private static void solve() {
        Scanner scanner = new Scanner(System.in);
        List<IdentifiableImpl> identifiables = getIdentifiables(scanner);
        detainIdentifiables(identifiables, scanner);
    }

    private static void detainIdentifiables(List<IdentifiableImpl> identifiables, Scanner scanner) {
        String lastThreeDigitsOfId = scanner.nextLine();

        identifiables.forEach(identifiable -> {
            if (identifiable.getId().endsWith(lastThreeDigitsOfId)) {
                System.out.println(identifiable.getId());
            }
        });
    }

    private static List<IdentifiableImpl> getIdentifiables(Scanner scanner) {
        List<IdentifiableImpl> identifiables = new ArrayList<>();
        String[] args = scanner.nextLine().split(" ");

        while (!args[0].equals("End")) {
            if (args.length == 3) {
                identifiables.add(new Citizen(args[0], Integer.parseInt(args[1]), args[2]));
            } else if (args.length == 2) {
                identifiables.add(new Robot(args[0], args[1]));
            }
            args = scanner.nextLine().split(" ");
        }

        return identifiables;
    }
}

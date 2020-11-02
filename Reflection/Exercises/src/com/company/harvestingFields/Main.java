package com.company.harvestingFields;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Class reflection = RichSoilLand.class;
        solve(reflection);
    }

    private static void solve(Class<?> reflection) {
        Scanner scanner = new Scanner(System.in);
        String[] args = scanner.nextLine().split(" ");
        Field[] fields = reflection.getDeclaredFields();

        while (!args[0].equals("HARVEST")) {
            String idealModifier = args[0];
            for (Field field : fields) {
                String modifier = Modifier.toString(field.getModifiers());
                int indexFirstWhitespace = modifier.indexOf(' ');

                if (indexFirstWhitespace != -1) {
                    modifier = modifier.substring(0, indexFirstWhitespace);
                }

                if (idealModifier.equals(modifier) || idealModifier.equals("all")) {
                    System.out.println(modifier + " " + field.getType() + " " + field.getName());
                }
            }
            args = scanner.nextLine().split(" ");
        }
    }
}

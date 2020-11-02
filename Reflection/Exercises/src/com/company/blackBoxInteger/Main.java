package com.company.blackBoxInteger;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchMethodException, NoSuchFieldException {
        solve();
    }

    private static void solve() throws IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException, NoSuchFieldException {
        Scanner scanner = new Scanner(System.in);
        Constructor ctor = BlackBoxInt.class.getDeclaredConstructor();
        ctor.setAccessible(true);
        BlackBoxInt boxInt = (BlackBoxInt) ctor.newInstance();

        Method[] methods = boxInt.getClass().getDeclaredMethods();
        Field innerValue = boxInt.getClass().getDeclaredField("innerValue");
        innerValue.setAccessible(true);

        String[] args = scanner.nextLine().split("_");

        while (!args[0].equals("END")) {
            String methodName = args[0];
            int val = Integer.parseInt(args[1]);
            Arrays.stream(methods)
                    .filter(m -> m.getName().equals(methodName))
                    .forEach(m -> {
                        m.setAccessible(true);
                        try {
                            m.invoke(boxInt, val);
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        } catch (InvocationTargetException e) {
                            e.printStackTrace();
                        }
                    });

            System.out.println(innerValue.getInt(boxInt));
            args = scanner.nextLine().split("_");
        }
    }
}

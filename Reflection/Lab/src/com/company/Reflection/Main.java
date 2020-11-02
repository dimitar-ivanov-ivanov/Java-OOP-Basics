package com.company.Reflection;

import java.lang.reflect.*;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class ref = Reflection.class;

        printClass(ref);
        printInterfaces(ref);
        printInstatiatedObject(ref);
        printMethods(ref);
        printFields(ref);
        checkAccessModifiers(ref);
    }

    private static void checkAccessModifiers(Class ref) {
        Field[] fields = ref.getDeclaredFields();
        Method[] methods = getAllMethodsSortedByName(ref);
        Method[] getters = getMethodsStartingWith(methods, "get");
        Method[] setters = getMethodsStartingWith(methods, "set");

        checkMembersAcessModifiers(fields, "private");
        checkMembersAcessModifiers(getters, "public");
        checkMembersAcessModifiers(setters, "private");
    }

    private static void checkMembersAcessModifiers(Member[] objectMembers, String idealModifier) {
        Arrays.stream(objectMembers).forEach(member -> {
            String currentModifier = Modifier.toString(member.getModifiers());
            int indexOfFirstWhitespace = currentModifier.indexOf(' ');

            if (indexOfFirstWhitespace != -1) {
                currentModifier = currentModifier.substring(0, indexOfFirstWhitespace);
            }

            if (!currentModifier.equals(idealModifier)) {
                System.out.println(member.getName() + " must be " + idealModifier + "!");
            }
        });
    }

    private static void printFields(Class ref) {
        Field[] fields = ref.getDeclaredFields();
        Arrays.stream(fields).forEach(f -> System.out.println(f.getName()));
    }

    private static void printMethods(Class ref) {
        Method[] methods = getAllMethodsSortedByName(ref);
        Method[] getters = getMethodsStartingWith(methods, "get");
        Method[] setters = getMethodsStartingWith(methods, "set");
        printGetMethods(getters);
        printSetMethods(setters);
    }

    private static Method[] getMethodsStartingWith(Method[] methods, String name) {
        return Arrays.stream(methods).takeWhile(m -> m.getName().startsWith(name)).toArray(Method[]::new);
    }

    private static void printGetMethods(Method[] getters) {
        for (Method method :
                getters) {
            String returnType = method.getReturnType().getName();
            System.out.println(method.getName() + " will return class " + returnType);
        }
    }

    private static void printSetMethods(Method[] setters) {
        for (Method method :
                setters) {
            String parameterType = Arrays.stream(method.getParameterTypes()).findFirst().get().getName();
            System.out.println(method.getName() + "and will set field of class " + parameterType);
        }
    }


    private static Method[] getAllMethodsSortedByName(Class ref) {
        return Arrays.stream(ref.getDeclaredMethods()).sorted(Comparator.comparing(Method::getName)).toArray(Method[]::new);
    }

    private static void printInstatiatedObject(Class ref) throws InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        Object reflection = ref.getDeclaredConstructor().newInstance();
        System.out.println(reflection);
    }

    private static void printInterfaces(Class ref) {
        Class[] interfaces = ref.getInterfaces();

        for (Class anInterface : interfaces) {
            printClass(anInterface);
        }
    }

    private static void printClass(Class ref) {
        System.out.println(ref);
    }
}

package com.company.Annotations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Map;

public class Tracker {
    @Author(name = "George")
    public static void main(String[] args) {
        printMethodsByAuthor(Tracker.class);
    }

    @Author(name = "Peter")
    private static void printMethodsByAuthor(Class<?> cl) {
        Method[] methods = cl.getDeclaredMethods();
        Map<String, List<String>> annotationsOnMethods = new HashMap<>();

        for (Method method : methods) {
            addAnnotationsToMap(annotationsOnMethods, method);
        }

        printMap(annotationsOnMethods);
    }

    @Author(name ="George")
    private static void printMap(Map<String, List<String>> annotationsOnMethods) {
        annotationsOnMethods.forEach((annotation, methods) -> {
            System.out.print(annotation + ": ");
            methods.forEach(method -> System.out.print(method + " "));
            System.out.println();
        });
    }

    @Author(name ="Peter")
    private static void addAnnotationsToMap(Map<String, List<String>> annotationsOnMethods, Method method) {
        Author annotation = method.getAnnotation(Author.class);
        if (annotation != null) {
            annotationsOnMethods.putIfAbsent(annotation.name(), new ArrayList<>());
            annotationsOnMethods.get(annotation.name()).add(method.getName() + "()");
        }
    }
}

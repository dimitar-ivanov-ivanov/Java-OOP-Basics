package com.company.AnimalFarm;

public class Chicken {
    private static final int LIFE_SPAN = 15;
    private static final int MINIMUM_NAME_LENGTH = 15;
    private static final int EGGS_PER_DAY_YOUNG = 2;
    private static final int EGGS_PER_DAY_MIDDLE_AGE = 1;
    private static final double EGGS_PER_DAY_OLD = 0.75;

    private String name;
    private int age;

    public Chicken(String name, int age) {
        setName(name);
        setAge(age);
    }

    private void setName(String name) {
        if (name == null || name.length() == 0) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        this.name = name;
    }

    private void setAge(int age) {
        if (age <= 0 || age >= LIFE_SPAN) {
            throw new IllegalArgumentException("Age should be between 0 and 15.");
        }
        this.age = age;
    }

    public double productPerDay() {
        if (age <= 5) {
            return EGGS_PER_DAY_YOUNG;
        } else if (age <= 11) {
            return EGGS_PER_DAY_MIDDLE_AGE;
        } else {
            return EGGS_PER_DAY_OLD;
        }
    }

    @Override
    public String toString() {
        return "Chicken " + name + " (age " + age + ") can produce " + productPerDay() + " eggs per day.";
    }
}

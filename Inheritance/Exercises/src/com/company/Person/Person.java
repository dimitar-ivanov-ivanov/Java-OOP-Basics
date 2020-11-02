package com.company.Person;

public class Person {
    protected int age;
    private String name;

    public Person(String name, int age) {
        setAge(age);
        setName(name);
    }

    protected void setAge(int age) throws IllegalArgumentException {
        if (age < 1) {
            throw new IllegalArgumentException("Age must be positive!");
        }
        this.age = age;
    }

    private void setName(String name) {
        if (name.length() < 3) {
            throw new IllegalArgumentException("Name's length should not be less than 3 symbols!");
        }
        this.name = name;
    }

    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }

}

package com.company.SalaryIncrease;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Person(String firstName, String lastName, int age, Double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public void increaseSalary(Double bonus) {
        if (age > 30) {
            salary += salary * bonus / 100;
        } else {
            salary += salary * bonus / 200;
        }
    }

    public static Person parsePerson(String[] args) {
        return new Person(args[0], args[1], Integer.parseInt(args[2]), Double.parseDouble(args[3]));
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " got " + salary + " leva";
    }

}

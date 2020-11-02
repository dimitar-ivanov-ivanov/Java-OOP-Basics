package com.company.SortByNameAndAge;

public class Person implements Comparable<Person> {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
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

    public static Person parsePerson(String[] args) {
        return new Person(args[0], args[1], Integer.parseInt(args[2]));
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " is " + age + " years old.";
    }

    @Override
    public int compareTo(Person other) {
        int nameComparison = this.getFirstName().compareTo(other.getFirstName());

        if (nameComparison == 0) {
            return Integer.compare(this.getAge(), other.getAge());
        }

        return nameComparison;
    }

    public void increaseSalary() {
    }
}

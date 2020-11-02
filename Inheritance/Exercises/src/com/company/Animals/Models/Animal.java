package com.company.Animals.Models;

public abstract class Animal {
    private String name;
    private int age;
    private String gender;

    public Animal(String name, int age, String gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    private void setName(String name) throws IllegalArgumentException {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty!");
        }
        this.name = name;
    }

    private void setAge(int age) throws IllegalArgumentException {
        if (age < 1 || age > 15) {
            throw new IllegalArgumentException("Age cannot be negative or bigger than 15!");
        }
        this.age = age;
    }

    protected void setGender(String gender) {
        if (!(gender.equals("Female") || gender.equals("Male"))) {
            throw new IllegalArgumentException("Gender has to be either male or female!");
        }
        this.gender = gender;
    }

    protected String getName() {
        return name;
    }

    protected int getAge() {
        return age;
    }

    protected String getGender() {
        return gender;
    }

    public String produceSound() {
        return "Not implemented!";
    }

    public String toString() {
        return this.getClass().getSimpleName() + "\n" +
                this.getName() + " " + this.getAge() + " " + this.getGender() + "\n" +
                this.produceSound();
    }
}

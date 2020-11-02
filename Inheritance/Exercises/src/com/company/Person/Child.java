package com.company.Person;

public class Child extends Person {

    public Child(String name, int age) {
        super(name, age);
    }

    @Override
    protected void setAge(int age) throws IllegalArgumentException {
        super.setAge(age);
        if (age > 15) {
            throw new IllegalArgumentException("Child's age must be lesser than 15!");
        }
        this.age = age;
    }
}

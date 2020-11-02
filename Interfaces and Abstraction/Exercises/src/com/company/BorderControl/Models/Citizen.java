package com.company.BorderControl.Models;

public class Citizen extends IdentifiableImpl {
    private String name;
    private int age;

    public Citizen(String name, int age, String id) {
        super(id);
        this.name = name;
        this.age = age;
    }
}

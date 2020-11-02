package com.company.Predators.Models;

public class Food {
    private String name;

    public Food(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        if (name.isEmpty() || name.trim().length() == 0) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        this.name = name;
    }
}

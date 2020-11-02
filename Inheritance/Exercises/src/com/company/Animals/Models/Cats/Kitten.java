package com.company.Animals.Models.Cats;

public class Kitten extends Cat {
    public Kitten(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    protected void setGender(String gender) throws IllegalArgumentException {
        super.setGender(gender);
        if (this.getGender().equals("Male")) {
            throw new IllegalArgumentException("Kitten cannot be male.");
        }
    }

    @Override
    public String produceSound() {
        return "Miau";
    }
}

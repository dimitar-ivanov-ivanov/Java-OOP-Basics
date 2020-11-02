package com.company.Animals.Models.Cats;

public class Tomcat extends Cat {
    public Tomcat(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    protected void setGender(String gender) throws IllegalArgumentException {
        super.setGender(gender);
        if (this.getGender().equals("Female")) {
            throw new IllegalArgumentException("Tomcat cannot be female.");
        }
    }


    @Override
    public String produceSound() {
        return "Give me one million b***h";
    }
}

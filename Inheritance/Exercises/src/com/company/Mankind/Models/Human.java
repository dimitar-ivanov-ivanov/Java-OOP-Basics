package com.company.Mankind.Models;

import com.company.Mankind.Constants.ExceptionMessages;

public abstract class Human {
    private String firstName;
    protected String lastName;

    protected Human(String firstName) {
        setFirstName(firstName);
    }

    public Human(String firstName, String lastName) {
        this(firstName);
        setLastName(lastName);
    }

    private void setFirstName(String firstName) throws IllegalArgumentException {
        if (!Character.isUpperCase(firstName.charAt(0))) {
            throw new IllegalArgumentException(String.format(ExceptionMessages.EXPECTED_UPPERCASE_LETTER, "firstName"));
        }
        if (firstName.length() < 4) {
            throw new IllegalArgumentException(String.format(ExceptionMessages.LENGTH_SHOULD_BE_MORE_SYMBOLS, 4, "firstName"));
        }
        this.firstName = firstName;
    }

    protected void setLastName(String lastName) throws IllegalArgumentException {
        if (!Character.isUpperCase(lastName.charAt(0))) {
            throw new IllegalArgumentException(String.format(ExceptionMessages.EXPECTED_UPPERCASE_LETTER, "lastName"));
        }
        if (lastName.length() < 3) {
            throw new IllegalArgumentException(String.format(ExceptionMessages.LENGTH_SHOULD_BE_MORE_SYMBOLS, 3, "lastName"));
        }
        this.lastName = lastName;
    }

    private String getFirstName() {
        return firstName;
    }

    private String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "First Name: " + getFirstName() + "\n" +
                "Last Name: " + getLastName() + "\n";
    }
}

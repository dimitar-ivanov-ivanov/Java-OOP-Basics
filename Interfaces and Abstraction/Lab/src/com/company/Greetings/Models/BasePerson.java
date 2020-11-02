package com.company.Greetings.Models;

import com.company.Greetings.Interfaces.Person;

public abstract class BasePerson implements Person {
    private String name;

    public BasePerson(String name) {
        setName(name);
    }

    @Override
    public String getName() {
        return null;
    }

    private void setName(String name) {
        this.name = name;
    }
}

package com.company.Greetings;

import com.company.Greetings.Interfaces.Person;
import com.company.Greetings.Models.Bulgarian;
import com.company.Greetings.Models.Chinese;
import com.company.Greetings.Models.European;

import java.util.List;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        solve();
    }

    private static void solve() {
        List<Person> persons;
        persons = new ArrayList<>();

        persons.add(new Bulgarian("Pesho"));
        persons.add(new European("Pesho"));
        persons.add(new Chinese("Pesho"));

        for (Person person : persons) {
            print(person);
        }
    }

    private static void print(Person person) {
        System.out.println(person.sayHello());
    }
}

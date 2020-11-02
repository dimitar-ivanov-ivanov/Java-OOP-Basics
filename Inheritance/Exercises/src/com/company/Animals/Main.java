package com.company.Animals;

import com.company.Animals.Models.Cats.Cat;
import com.company.Animals.Models.Cats.Kitten;
import com.company.Animals.Models.Cats.Tomcat;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Macka", 12, "Female");
        System.out.println(cat);
        try {
            Tomcat tomcat = new Tomcat("Tom", 10, "Female");
            System.out.println(tomcat);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            Kitten kitten = new Kitten("Jerry", 10, "Male");
            System.out.println(kitten);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }


    }
}

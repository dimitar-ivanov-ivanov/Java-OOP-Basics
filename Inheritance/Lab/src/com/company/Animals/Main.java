package com.company.Animals;

import com.company.Animals.Models.Cat;
import com.company.Animals.Models.Dog;
import com.company.Animals.Models.Puppy;

public class Main {

    public static void main(String[] args) {
        solve();
    }

    private static void solve() {
        printDogCommands();
        printPuppyCommands();
        printCatCommands();
    }

    private static void printCatCommands() {
        Cat cat = new Cat();
        cat.eat();
        cat.meow();
    }

    private static void printPuppyCommands() {
        Puppy puppy = new Puppy();
        puppy.eat();
        puppy.bark();
        puppy.weep();
    }

    private static void printDogCommands() {
        Dog dog = new Dog();
        dog.eat();
        dog.bark();
    }
}

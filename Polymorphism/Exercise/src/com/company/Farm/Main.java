package com.company.Farm;

import com.company.Farm.Animals.Cats.Cat;
import com.company.Farm.Animals.Cats.Tiger;
import com.company.Farm.Animals.Mammal;
import com.company.Farm.Animals.Mouse;
import com.company.Farm.Animals.Zebra;
import com.company.Farm.Foods.Food;
import com.company.Farm.Foods.Meat;
import com.company.Farm.Foods.Vegetable;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        solve();
    }

    private static void solve() {
        Scanner scanner = new Scanner(System.in);
        String[] args = scanner.nextLine().split(" ");

        while (!args[0].equals("End")) {
            String animalType = args[0];
            String animalName = args[1];
            double animalWeight = Double.parseDouble(args[2]);
            String animalLivingRegion = args[3];

            Mammal mammal = getMammal(args, animalType, animalName, animalWeight, animalLivingRegion);

            args = scanner.nextLine().split(" ");
            String foodType = args[0];
            int foodQuantity = Integer.parseInt(args[1]);

            Food food = getFood(foodType, foodQuantity);

            mammal.makeSound();
            animalEatFood(mammal, food);
            System.out.println(mammal);

            args = scanner.nextLine().split(" ");
        }
    }

    private static void animalEatFood(Mammal mammal, Food food) {
        try {
            mammal.eat(food);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static Food getFood(String foodType, int foodQuantity) {
        Food food = null;

        switch (foodType) {
            case "Vegetable":
                food = new Vegetable(foodQuantity);
                break;
            case "Meat":
                food = new Meat(foodQuantity);
                break;
            default:
                break;
        }

        return food;
    }

    private static Mammal getMammal(String[] args, String animalType, String animalName, double animalWeight, String animalLivingRegion) {
        Mammal mammal = null;

        switch (animalType) {
            case "Mouse":
                mammal = new Mouse(animalName, animalType, animalWeight, animalLivingRegion);
                break;
            case "Zebra":
                mammal = new Zebra(animalName, animalType, animalWeight, animalLivingRegion);
                break;
            case "Cat":
                String animalBreed = args[4];
                mammal = new Cat(animalName, animalType, animalWeight, animalLivingRegion, animalBreed);
                break;
            case "Tiger":
                mammal = new Tiger(animalName, animalType, animalWeight, animalLivingRegion);
                break;
            default:
                break;
        }
        return mammal;
    }
}

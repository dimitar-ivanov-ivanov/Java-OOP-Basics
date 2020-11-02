package com.company.ShoppingSpree;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private double money;
    private List<Product> bagOfProducts;

    public Person(String name, double money) {
        setName(name);
        setMoney(money);
        this.bagOfProducts = new ArrayList<>();
    }

    private void setName(String name) {
        if (name.isEmpty() || name.trim().length() == 0) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        this.name = name;
    }

    public void setMoney(double money) {
        if (money < 0) {
            throw new IllegalArgumentException("Money cannot be negative.");
        }
        this.money = money;
    }

    public boolean tryToAddProduct(Product product) {
        if (money >= product.getCost()) {
            money -= product.getCost();
            bagOfProducts.add(product);
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(name + " - ");

        for (int i = 0; i < bagOfProducts.size() - 1; i++) {
            builder.append(bagOfProducts.get(i) + ", ");
        }

        if (bagOfProducts.size() > 0) {
            builder.append(bagOfProducts.get(bagOfProducts.size() - 1));
        } else {
            builder.append("Nothing bought");
        }

        return builder.toString();
    }
}

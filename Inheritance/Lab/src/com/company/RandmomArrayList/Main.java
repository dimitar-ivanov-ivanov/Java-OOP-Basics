package com.company.RandmomArrayList;

import com.company.RandmomArrayList.Models.RandomArrayList;

public class Main {
    public static void main(String[] args) {
        RandomArrayList<String> list = new RandomArrayList<String>();
        list.add("1");
        list.add("2");
        System.out.println((String) list.getRandomElement());
    }
}

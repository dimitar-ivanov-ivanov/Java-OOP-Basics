package com.company.RandmomArrayList.Models;

import java.util.ArrayList;
import java.util.Random;

public class RandomArrayList<I> extends ArrayList {
    public <T> T getRandomElement() {
        int min = 0;
        int max = size() - 1;
        int random = (int) (Math.random() * ((max + min) + 1)) + min;
        return (T) get(random);
    }
}

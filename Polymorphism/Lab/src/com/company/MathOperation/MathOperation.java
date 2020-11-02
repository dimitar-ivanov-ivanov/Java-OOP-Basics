package com.company.MathOperation;

public class MathOperation {
    public MathOperation() {
    }

    public int add(int... numbers) {
        int sum = 0;
        for (Integer num :
                numbers) {
            sum += num;
        }

        return sum;
    }
}

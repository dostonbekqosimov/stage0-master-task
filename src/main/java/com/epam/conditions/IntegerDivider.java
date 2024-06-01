package com.epam.conditions;

public class IntegerDivider {

    public void printCompletelyDivided(int dividend, int divider) {

        if(divider == 0) {
            System.out.println("division by zero");
            return;
        }
        int result = divideAndMultiply(dividend, divider);

        if (result == dividend) {
            System.out.println("can be divided completely");
        } else if (divider == 0) {
            System.out.println("division by zero");
        } else {
            System.out.println("cannot be divided completely");
        }
    }

    private static int divideAndMultiply(int dividend, int divider) {
        int result = dividend / divider;
        result *= divider;
        return result;

    }

}

package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {

        int reversedNumber = 0;
        while (number > 0) {
            reversedNumber = reversedNumber * 10 + number % 10;
            number /= 10;
        }
        System.out.println(reversedNumber);
    }

    public static void main(String[] args) {

        NumberReverter numberReverter = new NumberReverter();
        numberReverter.revert(32);
    }
}




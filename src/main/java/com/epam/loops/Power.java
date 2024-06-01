package com.epam.loops;

public class Power {

    public void printPower(int numberToPrint, int power) {

        int num = numberToPrint;
        for (int i = 1; i < power; i++) {

          num = num * numberToPrint;

        }

        System.out.println(num);

    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }

}

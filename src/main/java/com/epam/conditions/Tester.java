package com.epam.conditions;

public class Tester {
    public static void main(String[] args) {
        SeasonDeterminer seasonDeterminer = new SeasonDeterminer();
        seasonDeterminer.tellTheSeason(12);

        TriangleSidesValidator triangleSidesValidator = new TriangleSidesValidator();
        triangleSidesValidator.validate(5,5,3);

        DaysInMonth daysInMonth = new DaysInMonth();
        daysInMonth.printDays(2000, 7);

        IntegerDivider integerDivider = new IntegerDivider();
        integerDivider.printCompletelyDivided(29, 5);

        CoordinatePane coordinatePane  = new CoordinatePane();
        coordinatePane.printQuadrant(5, -5);

        BitwiseValuesSwap bitwiseValuesSwap = new BitwiseValuesSwap();
        bitwiseValuesSwap.swap(6,7);

    }
}

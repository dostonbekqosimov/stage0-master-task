package com.epam.algorithms;

public class ArrayTasks {

    /**
     * Return a String[] array that will list all the seasons of the year, starting with winter.
     */
    public String[] seasonsArray() {
        return new String[]{"winter", "spring", "summer", "autumn"};
    }

    /**
     * Generate an array of integers from 1 to `length`.
     */
    public int[] generateNumbers(int length) {
        int[] numbers = new int[length];
        for (int i = 0; i < length; i++) {
            numbers[i] = i + 1;
        }
        return numbers;
    }

    /**
     * Reverse the input array.
     */
    public String[] reverseArray(String[] arr) {
        int n = arr.length;
        String[] reversed = new String[n];
        for (int i = 0; i < n; i++) {
            reversed[i] = arr[n - 1 - i];
        }
        return reversed;
    }

    /**
     * Calculate the sum of all elements in the array.
     */
    public int totalSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    /**
     * Find the index of a number in the array.
     */
    public int findIndexOfNumber(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Return a new int[] array obtained from the input arr int[] array by choosing positive numbers only.
     * P.S. 0 is not a positive number =)
     */
    public int[] getOnlyPositiveNumbers(int[] arr) {
        // First, count the positive numbers
        int count = 0;
        for (int num : arr) {
            if (num > 0) {
                count++;
            }
        }

        // Create a new array with the size of the positive numbers count
        int[] result = new int[count];
        int index = 0;
        for (int num : arr) {
            if (num > 0) {
                result[index++] = num;
            }
        }

        return result;
    }

    /**
     * Sort a ragged array (an array of arrays) first by the length of each subarray,
     * and then by the elements within each subarray.
     */
    public int[][] sortRaggedArray(int[][] arr) {
        // Sort the outer array by the length of each subarray
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j].length > arr[j + 1].length) {
                    int[] temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Sort elements within each subarray
        for (int[] subArray : arr) {
            for (int i = 0; i < subArray.length - 1; i++) {
                for (int j = 0; j < subArray.length - 1 - i; j++) {
                    if (subArray[j] > subArray[j + 1]) {
                        int temp = subArray[j];
                        subArray[j] = subArray[j + 1];
                        subArray[j + 1] = temp;
                    }
                }
            }
        }

        return arr;
    }
}

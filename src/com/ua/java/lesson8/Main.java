package com.ua.java.lesson8;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int [] arr = createArray(10);
        printArray(arr);

        System.out.println("\nMinimum value from array is:");
        System.out.println(getMinValue(arr));

        System.out.println("\nMaximum value from array is:");
        System.out.println(getMaxValue(arr));

        System.out.println("\nAverage value from array is:");
        System.out.println(getAvgValue(arr));

        System.out.println("\nSum of elements of array is:");
        System.out.println(getArraySum(arr));

    }

    static int[] createArray(int length) {
        int arr[] = new int[length];

        Random random = new Random();

        for(int i=0; i < arr.length; i++ ) {
            arr[i] = random.nextInt(10);
        }

        return arr;
    }

    static void printArray(int [] arr) {
        for (int value: arr) {
            System.out.print(value + " ");
        }
    }

    static int getMinValue(int [] arr) {

        int min = Integer.MAX_VALUE;

        for(int i = 0; i< arr.length; i++ ) {

            if( min > arr[i] ) {
                min = arr[i];
            }
        }

        return min;
    }

    static int getMaxValue(int [] arr) {

        int max = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++ ) {

            if( max < arr[i] ) {
                max = arr[i];
            }
        }

        return max;
    }

    static double getAvgValue(int [] arr) {

        int sum = getArraySum(arr);

        return (double) sum / arr.length;
    }

    static int getArraySum(int [] arr) {
        int sum = 0;

        for(int i = 0; i< arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }
}

package com.ua.java.lesson10;

import java.util.Random;

public class Array {

    private int array[];

    private int length;

    public Array(int length) {

        if( length <= 0 ) {
            throw new RuntimeException("Array length must be > 0");
        }
        this.length = length;
        this.array = new int[length];

        Random rand = new Random();
        for(int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(this.length);
        }
    }

    public void printArray() {
        for(int value: this.array) {
            System.out.print(value);
        }
    }

    public int[] sortArrayAsc() {

        int arr [] = this.array;

        for(int i = 0; i < arr.length; i++ ) {
            for(int j=0; j<arr.length -1; j++ ) {

                if(arr[j+1] < arr[j]) {
                    int swap = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = swap;
                }
            }
        }

        return arr;
    }

    public int[] sortArrayDesc() {

        int arr [] = this.array;

        for(int i = 0; i < arr.length; i++ ) {
            for(int j=0; j < arr.length -1; j++ ) {

                if(arr[j+1] > arr[j]) {
                    int swap = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = swap;
                }
            }
        }

        return arr;
    }
}

package com.ua.java.lesson18;

public class ArrayList <T> implements List <T> {

    private static final int INITIAL_CAPACITY = 10;

    private int size = 0;

    private T[] array;

    public ArrayList() {
        array = (T[]) new Object[INITIAL_CAPACITY];
    }

    public ArrayList(int capacity) {
        if(capacity > 0 && capacity < 1000_000) {
            array = (T[]) new Object[capacity];
        } else {
            array = (T[]) new Object[INITIAL_CAPACITY];
        }
    }

    public boolean contains(T value) {
        for(int i = 0; i < size; i++) {
            if(value == array[i]) {
                return true;
            }
        }
        return false;
    }

    public void add(T value) {
        if(size == array.length - 1) {
            increaseArray();
        }
        this.add(size, value);

    }

    public Integer indexOf(T value) {

        for(int i = 0; i<size; i++) {
            if(value.equals(array[i])) {
                return i;
            }
        }
        return null;
    }

   // 0 [1]
   // [1,2,3,4,5, , , ,]
   // [1,2,3,4,5,5, , ,] i = 4
   // [1,2,3,4,4,5, , ,] i = 3
   public void add(int index, T value) {
        if(array.length == 0) {
            array = (T[]) new Object[INITIAL_CAPACITY];
        }

        for(int i = size; i >= index; i--) {
            array[i+1] = array[i];
        }
        array[index] = value;
        size++;
   }

   // [1,2,3,4, , , ,] 0
   // [2,3,4,4, , , ,] 0
   public void remove(int index) {

        for(int i = index; i< size; i++ ) {
            array[i] = array[i+1];
        }
        array[size-1] = null;
        size--;
   }

   public void clear() {
        array = (T[]) new Object[0];
        size = 0;
   }

   public void remove(T value) {
        for(int i=0; i < size; i++ ) {
            if(value.equals(array[i])) {
                this.remove(i);
            }
        }
   }

    private void increaseArray() {

        int newCapacity = size * 2;
        T[] newArray = (T[]) new Object[newCapacity];

        for(int i = 0; i<size; i++ ) {
            newArray[i] = array[i];
        }

        array = newArray;
    }

    public T get(int index) {

        if(index >= 0 && array.length > index) {
            return array[index];
        }

        return null;
    }

    public String toString() {

        if(isEmpty()) {
            return "[]";
        }

        String out = "[";
        for(int i=0; i< size; i++) {
            out += array[i] + ", ";
        }
        out = out.substring(0, out.length() -2);
        out += "]";
        return out;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        if(size == 0) {
            return true;
        }
        return false;
    }

}

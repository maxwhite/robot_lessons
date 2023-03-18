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
            array = createArray(capacity);
        } else {
            array = createArray(INITIAL_CAPACITY);
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

        for(int i = 0; i < size; i++) {
            if(value.equals(array[i])) {
                return i;
            }
        }
        return null;
    }

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

   public void remove(int index) {

        for(int i = index; i < size; i++ ) {
            array[i] = array[i+1];
        }
        array[size-1] = null;
        size--;
   }

   public void clear() {
        array = createArray(INITIAL_CAPACITY);
        size = 0;
   }

   public void remove(T value) {
        for(int i = 0; i < size; i++ ) {
            if(value.equals(array[i])) {
                this.remove(i);
                break;
            }
        }
   }

    private void increaseArray() {

        int newCapacity = size * 2;
        T[] newArray = createArray(newCapacity);

        for(int i = 0; i < size; i++ ) {
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

    public void set(int index, T value) {
        array[index] = value;
    }

    public String toString() {
        String out = "[";

        for(int i=0; i < size; i++) {
            out += array[i] + ", ";
        }
        if(out.length() > 1) {
            out = out.substring(0, out.length() -2);
        }
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

    private T[] createArray(int capacity) {
        array = (T[]) new Object[capacity];
        return array;
    }

}

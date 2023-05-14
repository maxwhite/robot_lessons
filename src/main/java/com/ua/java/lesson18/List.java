package com.ua.java.lesson18;

public interface List<T> {

        void add(T value);

        void set(int index, T value);

        void add(int index, T value);

        Integer indexOf(T value);

        void remove(int index);

        void clear();

        void remove(T value);

        public T get(int index);

        public String toString();

        public int size();

        public boolean isEmpty();

 }

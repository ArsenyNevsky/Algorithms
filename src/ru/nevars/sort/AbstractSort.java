package ru.nevars.sort;

import java.util.Arrays;

/**
 * Created by erafiil on 17.04.15.
 */
public abstract class AbstractSort {

    /**
     *
     * @param message
     */
    public void printArray(String message) {
        if (array == null) {
            throw new NullPointerException("Array is not initialized");
        }
        System.out.println(message + ":\n" + Arrays.toString(array));
    }

    /**
     *
     * @param array is required parametr for its sort
     */
    public void sort(int array[]) {
        SIZE = array.length;
        this.array = array;
        sort();
    }

    abstract void sort();

    /**
     *
     * @param i . First index of element of array
     * @param j . The same as @param i
     */
    void swap(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }


    protected int array[];
    protected int SIZE;
}

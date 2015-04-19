package ru.nevars.sort;

/**
 * Created by erafiil on 17.04.15.
 */
public abstract class AbstractSort {

    public void printArray(String message) {
        if (array == null) {
            throw new NullPointerException("Array is not initialized");
        }
        System.out.println(message + ":");
        for (int elem : array) {
            System.out.print(elem + " ");
        }
        System.out.println();
    }

    public void sort(int array[]) {
        SIZE = array.length;
        this.array = array;
        sort();
    }

    abstract void sort();

    void swap(int i, int j) {
        array[i] = array[i] + array[j];
        array[j] = array[i] - array[j];
        array[i] = array[i] - array[j];
    }


    protected int array[];
    protected int SIZE;
}

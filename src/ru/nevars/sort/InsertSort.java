package ru.nevars.sort;

/**
 * Created by erafiil on 08.05.15.
 *
 * This code is a implementations of the insert sort
 */
public class InsertSort extends AbstractSort {

    @Override
    void sort() {
        for (int i = 2; i < SIZE; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] < key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }
}

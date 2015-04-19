package ru.nevars.sort;

/**
 * Created by erafiil on 17.04.15.
 */
public class BubbleSort extends AbstractSort {


    @Override
    void sort() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (array[i] < array[j]) {
                    swap(i, j);
                }
            }
        }
    }
}

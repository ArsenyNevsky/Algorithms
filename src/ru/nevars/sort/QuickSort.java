package ru.nevars.sort;

/**
 * Created by erafiil on 09.05.15.
 */
public class QuickSort extends AbstractSort {

    @Override
    void sort() {
        quicksort(super.array, 0, SIZE - 1);
    }

    // 1 0 9 2 8 4 7 3 6 5
    private void quicksort(int array[], int left, int right) {
        int i = left;
        int j = right;
        int middle = array[(i + j) / 2];
        while (i < j) {
            while (array[i] < middle) {
                i++;
            }
            while (middle < array[j]) {
                j--;
            }
            if (i <= j) {
                swap(i, j);
                i++;
                j--;
            }
        }
        if (left < j) {
            quicksort(array, left, j);
        }
        if (i < right) {
            quicksort(array, i, right);
        }
    }

    private int pivot(int array[], int left, int right) {
        int i = left;
        int j = right;
        int middle = array[(i + j) / 2];
        return 0;
    }
}

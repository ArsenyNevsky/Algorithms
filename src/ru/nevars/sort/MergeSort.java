package ru.nevars.sort;

/**
 * Created by erafiil on 11.05.15.
 */
public class MergeSort extends AbstractSort {

    @Override
    void sort() {
        mergeSort(array, 0, SIZE - 1);
    }

    private void mergeSort(int array[], int left, int right) {
        if (left >= right) {
            return;
        }
        int middle = (left + right) / 2;
        mergeSort(array, 0, middle);
        mergeSort(array, middle + 1, right);
        merge(array, left, right);
    }

    // 1 3 5 6 2 4 7 8
    public int[] merge(int array[], int left, int right) {
        int temp[] = new int[right];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = array[i];
        }

        int ind = 0;
        int i = left;
        final int middle = (left + right) / 2;
        int j = middle;

        while (ind < right) {
            if (i == middle) {
                for (int k = j; k < right; k++) {
                    array[ind++] = temp[k];
                }
            } else if (j == right) {
                for (int k = i; k < middle; k++) {
                    array[ind++] = temp[k];
                }
            } else if (temp[i] < temp[j] && i < middle && j < right) {
                array[ind++] = temp[i];
                i++;
            } else if (temp[i] > temp[j] && j < right && i < middle) {
                array[ind++] = temp[j];
                j++;
            }
        }
        return array;
    }
}

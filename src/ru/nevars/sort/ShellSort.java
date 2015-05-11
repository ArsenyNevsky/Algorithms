package ru.nevars.sort;

/**
 * Created by erafiil on 11.05.15.
 */
public class ShellSort extends AbstractSort {

    // {9,0,1,8,2,7,3,6,5,4};
    @Override
    void sort() {
        for (int d = SIZE / 2; d >= 1; d /= 2) { // задаем d

            for (int i = 0; i < SIZE - d; i++) {
                for (int j = i; j < SIZE - d; j += d) {
                    if (array[j] > array[j + d]) {
                        swap(j, j + d);
                    }
                }
            }
        }
    }
}

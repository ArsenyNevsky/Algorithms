package ru.nevars;

import ru.nevars.sort.AbstractSort;
import ru.nevars.sort.ShellSort;

public class Main {

    public static void main(String[] args) {
        //int array[] = {9,0,1,8,2,7,3,6,5,4};
        //int array[] = {3,3,3,3,4,2,0,1};
        int array[] = {0,9,8,8,7,6,5,4,3,2,1};
        AbstractSort sort = new ShellSort();
        sort.sort(array);
        sort.printArray("Sorted array");
    }
}
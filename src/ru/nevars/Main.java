package ru.nevars;

import ru.nevars.tree.AbstractTree;
import ru.nevars.tree.BinaryTree;

public class Main {

    public static void main(String[] args) {
        //int array[] = {9,0,1,8,2,7,3,6,5,4};
        //int array[] = {3,3,3,3,4,2,0,1};
        /*int array[] = {0,9,8,8,7,6,5,4,3,2,1};
        AbstractSort sort = new ShellSort();
        sort.sort(array);
        sort.printArray("Sorted array");*/

        AbstractTree tree = new BinaryTree();
        tree.add(8);
        tree.add(3);
        tree.add(10);
        tree.add(1);
        tree.add(6);
        tree.add(14);
        tree.add(4);
        tree.add(7);
        tree.add(13);
        tree.add(-1);
        tree.add(0);

        tree.printTree();
    }
}
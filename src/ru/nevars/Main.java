package ru.nevars;

import ru.nevars.tree.AbstractTree;
import ru.nevars.tree.BinaryTree;

public class Main {

    public static void main(String[] args) {

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

        tree.printTree();
        tree.delete(3);

        System.out.println();
        tree.printTree();
    }
}

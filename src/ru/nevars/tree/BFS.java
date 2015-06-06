package ru.nevars.tree;

/**
 * Created by erafiil on 22.05.15.
 */
public class BFS {

    public BFS() {
        tree = new BinaryTree();
    }

    public void addValue(int value) {
        tree.add(value);
    }

    private AbstractTree tree;
}

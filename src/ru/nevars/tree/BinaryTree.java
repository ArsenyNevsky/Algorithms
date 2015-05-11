package ru.nevars.tree;

/**
 * Created by erafiil on 17.04.15.
 */
public class BinaryTree extends AbstractTree {

    @Override
    public void printTree() {
        printDirectly(root);
    }

    @Override
    public boolean isContains(int value) {
        Node tree = root;
        boolean result;
        if (tree == null) {
            return false;
        } else {
            while (true) {
                if (tree == null) {
                    result = false;
                    break;
                } else if (value == tree.getValue()) {
                    result = true;
                    break;
                } else if (value < tree.getValue()) {
                    tree = tree.getLeft();
                } else {
                    tree = tree.getRight();
                }
            }
        }
        return result;
    }

    @Override
    public void add(int value) {
        if (root == null) {
            root = new Node(value, level);
        } else {
            Node tree = root;
            while (true) {
                if (tree.getLeft() != null && value < tree.getValue()) {
                    tree = tree.getLeft();
                    level++;
                } else if (tree.getLeft() == null) {
                    Node leaf = new Node(value, ++level);
                    tree.setLeft(leaf);
                    break;
                } else if (tree.getRight() != null && value > tree.getValue()) {
                    tree = tree.getRight();
                    level++;
                } else {
                    Node leaf = new Node(value, ++level);
                    tree.setRight(leaf);
                    break;
                }
            }
        }
        level = 0;
    }

    @Override
    public void delete(int value) {

    }


    private void printDirectly(Node tree) {
        if (tree == null) {
            return;
        } else {
            System.out.println(tree.toString());
            printDirectly(tree.getLeft());
            printDirectly(tree.getRight());
        }
    }

    private Node root;
    private int level = 0;
}

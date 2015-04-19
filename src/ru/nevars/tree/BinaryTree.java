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
            root = new Node(value);
        } else {
            Node tree = root;
            while (true) {
                if (tree.getLeft() != null && value < tree.getValue()) {
                    tree = tree.getLeft();
                } else if (tree.getLeft() == null) {
                    Node leaf = new Node(value);
                    tree.setLeft(leaf);
                    return;
                } else if (tree.getRight() != null && value > tree.getValue()) {
                    tree = tree.getRight();
                } else {
                    Node leaf = new Node(value);
                    tree.setRight(leaf);
                    return;
                }
            }
        }
    }

    @Override
    public void delete(int value) {
        delete(root, value);
    }

    private void delete(Node tree, int value) {
        if (tree == null) {
            throw new NullPointerException("Tree is empty");
        } else {

            while (true) {
                if (value < tree.getValue() && tree.getLeft() != null) {
                    tree = tree.getLeft();
                } else if (value > tree.getValue() && tree.getRight() != null) {
                    tree = tree.getRight();
                } else if (value == tree.getValue()) {
                    tree.setLeft(null);
                    break;
                } else {
                    return;
                }
            }
        }
    }

    private void printDirectly(Node tree) {
        if (tree == null) {
            return;
        } else {
            System.out.print(tree.getValue() + " ");
            printDirectly(tree.getLeft());
            printDirectly(tree.getRight());
        }
    }

    private Node root;
}

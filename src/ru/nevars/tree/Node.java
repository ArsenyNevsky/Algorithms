package ru.nevars.tree;

/**
 * Created by erafiil on 17.04.15.
 */
class Node {

    Node() {

    }

    Node(int value, int level) {
        this.value = value;
        this.level = level;
    }

    Node(int value, Node left, Node right, int level) {
        this(value, level);
        this.left  = left;
        this.right = right;
    }

    Node getLeft() {
        return left;
    }

    void setLeft(Node left) {
        this.left = left;
    }

    Node getRight() {
        return right;
    }

    void setRight(Node right) {
        this.right = right;
    }

    int getValue() {
        return value;
    }

    void setValue(int value) {
        this.value = value;
    }

    int getParentLevel() {
        return level;
    }

    @Override
    public String toString() {
        StringBuilder stringRepresentValue = new StringBuilder();
        for (int i = 0; i < level; i++) {
            stringRepresentValue.append(SPACE);
        }
        return stringRepresentValue.append(value).toString();
    }

    private final String SPACE = "-";
    private Node left;
    private Node right;
    private int value;
    private int level;
}

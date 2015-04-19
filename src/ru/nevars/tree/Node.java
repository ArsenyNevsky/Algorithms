package ru.nevars.tree;

/**
 * Created by erafiil on 17.04.15.
 */
class Node {

    Node() {

    }

    Node(int value) {
        this.value = value;
    }

    Node(int value, Node left, Node right) {
        this(value);
        this.left  = left;
        this.right = right;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setNode(Node node) {

    }

    private Node parent;
    private Node left;
    private Node right;
    private int value;
}

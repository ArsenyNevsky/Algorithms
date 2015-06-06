package ru.nevars.list;

/**
 * Created by erafiil on 03.06.15.
 */
public class List {

    public List() {
        head = null;
    }

    public void add(int value) {
        if (head == null) {
            head = new Node();
            head.value = value;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            Node newNode = new Node();
            newNode.value = value;
            temp.next = newNode;
        }
    }

    public void printList() {
        for (Node temp = head; temp != null; temp = temp.next) {
            System.out.print(temp.value + " ");
        }
    }

    private Node head;

    private class Node {
        private int value;
        private Node next;
    }
}

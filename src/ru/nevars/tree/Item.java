package ru.nevars.tree;

import java.util.ArrayList;

/**
 * Created by erafiil on 23.05.15.
 */
class Item {

    public Item() {
        nodes = new ArrayList<>();
    }

    void add(int node) {
        nodes.add(node);
    }

    private ArrayList<Integer> nodes;
}

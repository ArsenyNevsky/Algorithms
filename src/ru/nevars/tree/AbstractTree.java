package ru.nevars.tree;

/**
 * Created by erafiil on 17.04.15.
 */
public abstract class AbstractTree {

    public abstract void printTree();

    public abstract boolean isContains(int value);

    public abstract void add(int value);

    public abstract void delete(int value);
}

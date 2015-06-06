package ru.nevars;

/**
 * Created by erafiil on 06.06.15.
 */
public class SuperClass {
    private int i = 11;
    int j = 11;

    public SuperClass() {
        System.out.println("Super class has been loaded");
    }

    public void show() {
        System.out.println("i = " + i + "\nj = " + j);
    }
}

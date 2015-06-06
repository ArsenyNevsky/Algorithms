package ru.nevars;

/**
 * Created by erafiil on 06.06.15.
 */
public class ExtendClass extends SuperClass {

    private int i = 12;
    int j = 12;

    public ExtendClass() {
        System.out.println("Extend class has beem loaded");
    }

    @Override
    public void show() {
        System.out.println("i = " + i + "\nj = " + j);
    }
}

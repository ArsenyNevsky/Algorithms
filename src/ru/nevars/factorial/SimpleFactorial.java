package ru.nevars.factorial;

/**
 * Created by erafiil on 10.05.15.
 */
public class SimpleFactorial {

    public long calculateFactorial(long n) {
        long accum = 1;
        for (int i = 1; i <= n; i++) {
            accum *= n;
        }
        return accum;
    }
}

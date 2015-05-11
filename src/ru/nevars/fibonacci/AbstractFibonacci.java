package ru.nevars.fibonacci;

/**
 * Created by erafiil
 */
public abstract class AbstractFibonacci {

    public long calculateFibonacci(long n) {
        return calculate(n - 1);
    }

    protected abstract long calculate(long n);
}

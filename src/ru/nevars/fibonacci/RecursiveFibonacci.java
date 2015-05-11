package ru.nevars.fibonacci;

/**
 * Created by erafiil on 10.05.15.
 */
public class RecursiveFibonacci extends AbstractFibonacci {

    @Override
    protected long calculate(long n) {
        return doRecursiveFibonacci(n + 1);
    }

    private long doRecursiveFibonacci(long n) {
        if (n > 1) {
            return doRecursiveFibonacci(n - 1) + doRecursiveFibonacci(n - 2);
        } else {
            return n;
        }
    }
}

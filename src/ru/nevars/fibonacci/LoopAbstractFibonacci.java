package ru.nevars.fibonacci;

/**
 * Created by erafiil
 */
public class LoopAbstractFibonacci extends AbstractFibonacci {

    // 0 1 1 2 3 5 8 13
    @Override
    protected long calculate(long n) {
        long accum    = 0;

        long previous = 0;
        long current  = 1;

        for (int i = 0; i < n; i++) {
            accum = previous + current;
            previous = current;
            current  = accum;
        }
        return accum;
    }
}

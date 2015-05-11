package ru.nevars.fibonacci;

import static java.lang.Math.round;

/**
 * Created by erafiil on 10.05.15.
 */
public class GoldFibonacci extends AbstractFibonacci {

    @Override
    protected long calculate(long n) {
        n++;
        final double sqrt5 = Math.sqrt(5);
        double a = Math.pow((1 + sqrt5) / 2, n);
        double b = Math.pow((1 - sqrt5) / 2, n);
        long result = round((a - b) / Math.sqrt(5));
        return result;
    }
}

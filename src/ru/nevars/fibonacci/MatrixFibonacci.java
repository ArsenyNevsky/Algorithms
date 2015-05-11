package ru.nevars.fibonacci;

/**
 * Created by erafiil on 10.05.15.
 */
public class MatrixFibonacci extends AbstractFibonacci {

    @Override
    protected long calculate(long n) {
        final long A11 = 1; final long A12 = 1;
        final long A21 = 1; final long A22 = 0;

        long a11 = 1; long a12 = 1;
        long a21 = 1; long a22 = 0;

        long r11 = 1; long r12 = 0;
        long r21 = 1; long r22 = 0;

        while (n > 0) {
            r11 = a11 * A11 + a12 * A21;    r12 = a11 * A12 + a12 * A22;
            r21 = a21 * A11 + a22 * A21;    r22 = a21 * A12 + a22 * A22;

            a11 = r11;
            a12 = r12;
            a21 = r21;
            a22 = r22;
            n--;
        }
        return r12;
    }
}

package ru.nevars.others;

import java.util.Arrays;

/**
 * Created by erafiil on 16.05.15.
 */
public class Eratosphen {

    public void eratopshen(final int n) {
        boolean primes[] = new boolean[n];
        Arrays.fill(primes, true);
        primes[0] = false;
        primes[1] = false;
        for (int i = 2; i < n; i++) {
            for (int j = i * i; j < n; j += i) {
                primes[j] = false;
            }
        }
        for (int i = 0; i < n; i++) {
            if (primes[i]) {
                System.out.print(i + " ");
            }
        }
    }
}

package tests.ru.nevars.fibonacci;

import org.junit.Before;
import org.junit.Test;
import ru.nevars.fibonacci.AbstractFibonacci;
import ru.nevars.fibonacci.RecursiveFibonacci;

import static org.junit.Assert.assertEquals;

/**
 * Created by erafiil on 10.05.15.
 */
public class RecursiveFibonacciTest {

    @Before
    public void setUp() throws Exception {
        fibonacci = new RecursiveFibonacci();
    }

    @Test
    public void testCalculate() throws Exception {
        n = 10;
        long expected = 55;
        long actual   = fibonacci.calculateFibonacci(n);
        assertEquals(expected, actual);
    }

    private long n;
    private AbstractFibonacci fibonacci;
}
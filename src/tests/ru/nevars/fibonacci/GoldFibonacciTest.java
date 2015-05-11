package tests.ru.nevars.fibonacci;

import org.junit.Before;
import org.junit.Test;
import ru.nevars.fibonacci.AbstractFibonacci;
import ru.nevars.fibonacci.GoldFibonacci;

import static org.junit.Assert.assertEquals;

/**
 * Created by erafiil on 10.05.15.
 */
public class GoldFibonacciTest {

    @Before
    public void setUp() throws Exception {
        fibonacci = new GoldFibonacci();
    }

    @Test
    public void testCalculate1() throws Exception {
        n = 10;
        long expected = 55;
        long actual   = fibonacci.calculateFibonacci(n);
        assertEquals(expected, actual);
    }

    @Test
    public void testCalculate2() throws Exception {
        n = 0;
        long expected = 0;
        long actual   = fibonacci.calculateFibonacci(n);
        assertEquals(expected, actual);
    }

    private long n;
    private AbstractFibonacci fibonacci;
}
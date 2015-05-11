package tests.ru.nevars.fibonacci;

import org.junit.Before;
import org.junit.Test;
import ru.nevars.fibonacci.AbstractFibonacci;
import ru.nevars.fibonacci.LoopAbstractFibonacci;

import static org.junit.Assert.assertEquals;

/**
 * Created by erafiil on 10.05.15.
 */
public class LoopAbstractFibonacciTest {

    @Before
    public void setUp() throws Exception {
        fibonacci = new LoopAbstractFibonacci();
    }

    @Test
    public void testCalculate1() throws Exception {
        System.out.println("Test 1");
        n = 10;
        long expected = 55;
        long actual   = fibonacci.calculateFibonacci(n);
        assertEquals(expected, actual);
    }

    @Test
    public void testCalculate2() throws Exception {
        System.out.println("Test 2");
        n = 0;
        long expected = 0;
        long actual   = fibonacci.calculateFibonacci(n);
        assertEquals(expected, actual);
    }

    @Test
    public void testCalculate3() throws Exception {
        System.out.println("Test 3");
        n = 5;
        long expected = 5;
        long actual   = fibonacci.calculateFibonacci(n);
        assertEquals(expected, actual);
    }

    private int n;
    private AbstractFibonacci fibonacci;
}
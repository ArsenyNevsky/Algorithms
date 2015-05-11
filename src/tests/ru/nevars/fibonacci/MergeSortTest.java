package tests.ru.nevars.fibonacci;

import org.junit.Before;
import org.junit.Test;
import ru.nevars.sort.MergeSort;

import static org.junit.Assert.assertEquals;

/**
 * Created by erafiil on 11.05.15.
 */
public class MergeSortTest {

    @Before
    public void setUp() throws Exception {
        mergeSort = new MergeSort();
    }

    @Test
    public void testMerge1() throws Exception {
        System.out.println("Test merge 1");
        int array[] = new int[]{1, 5, 3, 2, 4};
        int expected[] = {1,3,2,4,5};
        int actual[]   = mergeSort.merge(array, 0, array.length);
        for (int i = 0; i < array.length; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }

    @Test
    public void testMerge2() throws Exception {
        System.out.println("Test merge 2");
        int array[] = new int[]{2, 1};
        int expected[] = {1,2};
        int actual[]   = mergeSort.merge(array, 0, array.length);
        for (int i = 0; i < array.length; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }

    @Test
    public void testMerge3() throws Exception {
        System.out.println("Test merge 3");
        int array[] = new int[]{1};
        int expected[] = {1};
        int actual[]   = mergeSort.merge(array, 0, array.length);
        for (int i = 0; i < array.length; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }

    private MergeSort mergeSort;
}
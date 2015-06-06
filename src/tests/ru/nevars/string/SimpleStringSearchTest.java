package tests.ru.nevars.string;

import org.junit.Before;
import org.junit.Test;
import ru.nevars.stringSearch.AbstractStringSearch;
import ru.nevars.stringSearch.SimpleStringSearch;

import static org.junit.Assert.assertEquals;

/**
 * Created by erafiil on 12.05.15.
 */
public class SimpleStringSearchTest {

    @Before
    public void setUp() throws Exception {
        stringSearch = new SimpleStringSearch();
    }

    @Test
    public void testSearchIndex1() throws Exception {
        String sourceString = "abcdefgh";
        String subString = "abcdefh";
        int expectedIndex = -1;
        int actualIndex = stringSearch.indexOf(sourceString, subString);
        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void testSearchIndex2() throws Exception {
        String sourceString = "abcdefgh";
        String subString = "abc";
        int expectedIndex = 0;
        int actualIndex = stringSearch.indexOf(sourceString, subString);
        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void testSearchIndex3() throws Exception {
        String sourceString = "abcdefgh";
        String subString = "gh";
        int expectedIndex = 6;
        int actualIndex = stringSearch.indexOf(sourceString, subString);
        assertEquals(expectedIndex, actualIndex);
    }

    private AbstractStringSearch stringSearch;
}
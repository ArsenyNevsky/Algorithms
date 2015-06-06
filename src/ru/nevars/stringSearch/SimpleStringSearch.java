package ru.nevars.stringSearch;

/**
 * Created by erafiil on 12.05.15.
 */
public class SimpleStringSearch extends AbstractStringSearch {

    @Override
    protected int searchIndex(String sourceString, String subString, int beginIndex, int endIndex) {
        final int M = sourceString.length();
        final int N = subString.length();
        for (int i = 0; i <= M - N; i++) {
            if (sourceString.substring(i, i + N).equals(subString)) {
                return i;
            }
        }
        return -1;
    }
}

package ru.nevars.stringSearch;

/**
 * Created by erafiil on 12.05.15.
 */
public abstract class AbstractStringSearch {

    public int indexOf(String sourceString, String subString) {
        this.sourceString = sourceString;
        int index = searchIndex(sourceString, subString, beginIndex, endIndex);
        return index;
    }

    protected abstract int searchIndex(String sourceString, String subString,
                                       int beginIndex, int endIndex);

    protected String sourceString;
    protected int beginIndex;
    protected int endIndex;
}

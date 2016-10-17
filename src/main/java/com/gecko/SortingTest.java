package com.gecko;

/**
 * Created by hlieu on 10/16/16.
 */
public class SortingTest {
    public static void main(String[] args) {
        Integer[] i = new Integer[20];
        RandomUtils.populate(i, 1, 100);

        PrintUtils.display(i);
        InsertionSort.sort(i);

        PrintUtils.display(i);
    }
}

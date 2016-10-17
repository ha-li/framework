package com.gecko;

/**
 * Created by hlieu on 10/16/16.
 */
public class InsertionSort {
    public static void sort(Integer[] toSort){
        int key = 0;
        for(int i = 1; i < toSort.length; i++) {
            // this is what we are trying to place
            key = toSort[i];

            // starting at the location before i
            int j = i - 1;

            // j will iterate thru to the start of the array
            // until we find a value that is greater then key
            while(j >= 0 && toSort[j] > key) {
                toSort[j+1] = toSort[j];
                j--;
            }

            // we copied j+1 to j, so now j+1 is were key needs to go
            toSort[j+1] = key;
        }
    }
}

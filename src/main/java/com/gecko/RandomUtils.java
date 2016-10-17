package com.gecko;

import java.util.*;

/**
 * Created by hlieu on 10/16/16.
 */
public class RandomUtils {

    // populate the integer collection with random values [min, max]
    public static void populate(Integer[] collection, int min, int max) {

        Random r = new Random();
        for(int i = 0; i < collection.length; i++) {
            int tmp = r.nextInt(max-min) + min;
            collection[i] = tmp;
        }
    }
}

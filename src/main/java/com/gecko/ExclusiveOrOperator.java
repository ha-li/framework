package com.gecko;

/**
 * Created by hlieu on 11/7/16.
 */
public class ExclusiveOrOperator {
    public static void main(String[] args) {
        int x = 1;
        int y = 0;
        if ( ( x == 1 && y == 0 ) || ( x == 0 && y == 1) ) {
            System.out.println("true");
        }

        if( x == 1 ^ y == 1 ) {
            System.out.println("true");
        }

        int z = 1;
        System.out.println ( " x >>> 3 = " + (z >>> 3));
    }
}

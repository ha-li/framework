package com.gecko;

/**
 * Created by hlieu on 10/16/16.
 */
public class AssignmentOperator {
    public static void main(String[] args) {
        int i = 5;
        int j = 2;
        int x = 3;

        i = j = x;
        System.out.format("i = %d, j = %d, x = %d %n", i, j, x);
    }
}

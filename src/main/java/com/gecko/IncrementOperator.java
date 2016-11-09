package com.gecko;

/**
 * Created by hlieu on 11/8/16.
 */
public class IncrementOperator {
    public static void main(String[] args) {
        int x = 25;
        int y = x++ + x++;
        System.out.println(y + " & " + x);


        x = 25;
        y = ++x + ++x;
        System.out.println(y + " & " + x);


        x = 25;
        y = (x++) + (x++);
        System.out.println(y + " & " + x);

    }
}

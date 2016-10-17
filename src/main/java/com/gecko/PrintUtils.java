package com.gecko;

/**
 * Created by hlieu on 10/16/16.
 */
public class PrintUtils {
    public static void toString(Integer[] collection) {
        StringBuffer sb = new StringBuffer();
        // header
        sb.append("[");

        // these guys all have trailing commas
        for(int i = 0; i < collection.length-1; i++) {
            sb.append(collection[i]+",");
        }

        // last index, no comma
        sb.append(collection[collection.length-1]);

        //tail
        sb.append("]");
    }

    public static void display(Integer[] collection){
        System.out.print("[");

        for(int i = 0; i < collection.length-1; i++) {
            System.out.print(collection[i]+",");
        }

        System.out.println(collection[collection.length-1] + "]");
    }
}

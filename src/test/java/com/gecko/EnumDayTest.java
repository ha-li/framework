package com.gecko;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by hlieu on 11/10/16.
 */
public class EnumDayTest {

    @Test
    public void testDay() {
        Day today = Day.SUNDAY;
        System.out.println(today);
    }

    @Test
    public void test_valueOf(){
        Day to = Day.valueOf("MONDAY");
        System.out.println("MONDAY == to is " + (to == Day.MONDAY));
        System.out.println(to);
    }

    @Test
    public void test_length() {
        int count = Day.length;
        System.out.println(count);
    }

    @Test
    public void test_name() {
        String name = Day.TUESDAY.name();
        System.out.println(name);
    }

    @Test
    public void test_declaringclass() {
        Class clazz = Day.SUNDAY.getDeclaringClass();
        System.out.println(clazz);
    }

    @Test
    public void test_method() {
        Day we = Day.WEDNESDAY;
        System.out.println( we.getKey() );
    }
}
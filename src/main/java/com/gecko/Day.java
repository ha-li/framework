package com.gecko;

/**
 * Created by hlieu on 11/10/16.
 */
public enum Day {
    SUNDAY ("sun"),
    MONDAY ("mon"),
    TUESDAY ("tue"),
    WEDNESDAY ("wed"),
    THURSDAY ("thur"),
    FRIDAY ("fri"),
    SATURDAY ("sat");

    private String key;

    Day(String k) {
        key = k;
    }

    public String getKey() {
        return key;
    }
    public static final Integer length = 1 + SATURDAY.ordinal();


}

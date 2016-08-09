package com.gecko.addenda;

/**
 * Created by DevAdmin on 8/5/2016.
 */
public class MockReturnAddenda extends ReturnAddenda {
    public MockReturnAddenda() {super();}

    public MockReturnAddenda(String data) { super(data); }

    @Override
    public String getTraceNumber() {
        return "123";
    }
}

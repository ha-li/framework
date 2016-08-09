package com.gecko.addenda;

/**
 * Created by DevAdmin on 8/5/2016.
 */
public class ReturnAddenda {
    private String mData = null;

    public ReturnAddenda() {}

    public ReturnAddenda(String pData) { mData = pData; }

    public String getTraceNumber() { return mData.substring(1, 5); }
}

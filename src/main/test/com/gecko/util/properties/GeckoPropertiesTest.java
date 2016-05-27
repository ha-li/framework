package com.gecko.util.properties;

/**
 * Created by hlieu on 05/26/16.
 */
public class GeckoPropertiesTest {
    public static void main(String[] args) {
        GeckoProperties g = new GeckoProperties();
        g.readXmlProperties("/sys.properties.xml");
        g.readProperties("/sys.properties");
    }
}

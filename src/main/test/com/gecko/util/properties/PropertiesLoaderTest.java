package com.gecko.util.properties;

import java.util.Properties;

/**
 * Created by hlieu on 05/26/16.
 */
public class PropertiesLoaderTest {
    public static void main(String[] args) {
        //PropertiesLoader g = new PropertiesLoader();
        Properties p = PropertiesLoader.readXmlProperties("/sys.properties.xml");
        Properties p2 = PropertiesLoader.readProperties("/sys.properties");
    }
}
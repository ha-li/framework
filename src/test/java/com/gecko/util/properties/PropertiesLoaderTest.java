package com.gecko.util.properties;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.util.Properties;

/**
 * Created by hlieu on 05/26/16.
 */
public class PropertiesLoaderTest {
    @Test
    public void test1() throws FileNotFoundException{
        //PropertiesLoader g = new PropertiesLoader();
        Properties p = PropertiesLoader.readXmlProperties("/sys.properties.xml");
        Properties p2 = PropertiesLoader.readProperties("sys.properties");
    }
}

package com.gecko.util.properties;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by hlieu on 05/26/16.
 */
public class GeckoProperties {


    public void readProperties(String fileName) {
        InputStream fis = getClass().getResourceAsStream(fileName);
        Properties p = new Properties();
        try {
            p.load(fis);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            try {
                fis.close();
            }catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    public void readXmlProperties(String xmlFileName) {
        InputStream xfis = getClass().getResourceAsStream(xmlFileName);
        Properties p = new Properties();
        try {
            p.loadFromXML(xfis);
        } catch(IOException ioe) {
            ioe.printStackTrace();
        } finally {
            try {
                xfis.close();
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }
    }
}

package com.gecko.util.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;

/**
 * Created by hlieu on 05/26/16.
 */
public class PropertiesLoader {

    private static String ENVIRONMENT = "env";
    private static String env = System.getProperty(ENVIRONMENT, "local");

    public static Properties readProperties(String fileName) throws FileNotFoundException {
        URL path = ClassLoader.getSystemResource(env + "/" + fileName);
        if(path == null) {
            throw new FileNotFoundException("file not found: " + fileName);
        }
        FileInputStream fis = new FileInputStream(path.getFile());
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
        return p;
    }


    public static Properties readXmlProperties(String xmlFileName) {
        InputStream xfis = PropertiesLoader.class.getResourceAsStream(xmlFileName);
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
        return p;
    }
}

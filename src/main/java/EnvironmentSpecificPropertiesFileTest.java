import com.gecko.util.properties.PropertiesLoader;

import java.io.FileNotFoundException;
import java.util.Properties;

/**
 * Created by hlieu on 08/29/16.
 */
public class EnvironmentSpecificPropertiesFileTest {

    private String ENVIRONMENT = "env";

    public Properties getProperties(String fileName) throws NullPointerException, FileNotFoundException {
        String env = System.getProperty("env", "local");
        Properties properties = PropertiesLoader.readProperties(env + "/" + fileName);
        if(properties == null) {
            throw new NullPointerException("Empty properties: file not found.");
        }

        return properties;
    }

    public static void main(String[] args) {
        try {
            EnvironmentSpecificPropertiesFileTest test = new EnvironmentSpecificPropertiesFileTest();
            Properties properties = test.getProperties("framework.properties");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

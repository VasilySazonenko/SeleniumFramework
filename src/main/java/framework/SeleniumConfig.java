package framework;

import java.util.Properties;

import static utils.PropertyReader.getProperties;

public class SeleniumConfig {

    /*
    Getters and setters to get values from property files
     */

    private static final Properties properties;

    static {
        try {
            properties = getProperties("selenium.properties");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public String getPropertyValue(String name) {
        return properties.getProperty(name);
    }

    public String getBrowser(){
        return properties.getProperty("browser");
    }
}

package framework;

import java.util.Properties;

import static utils.PropertyReader.getProperties;

/*
Getters and setters to get values from property files
 */
public enum SeleniumConfig {
    INSTANCE;
    private final Properties properties;

    public static SeleniumConfig get() {
        return INSTANCE;
    }

    SeleniumConfig() {
        try {
            properties = getProperties("selenium.properties");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public String getBrowser(){
        return properties.getProperty("browser");
    }
    public String getURI(){
        return properties.getProperty("URI");
    }
    public String getAmazonURI(){
        return properties.getProperty("amazon");
    }
    public int getSeleniumWebDriverWait() {
        return Integer.parseInt("30"); //TODO move value to properties file
    }
}

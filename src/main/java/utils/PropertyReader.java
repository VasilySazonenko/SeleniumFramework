package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/*
Class to read property files
 */
public class PropertyReader {
    public static Properties getProperties(String fileName) throws Exception {
        Properties properties = new Properties();
        String pathToPropsFile = new File("src/main/resources", fileName).getAbsolutePath();
        try (FileInputStream fileStream = new FileInputStream(pathToPropsFile)) {
            properties.load(fileStream);
        } catch (IOException e) {
            throw new Exception("Properties file [" + pathToPropsFile + "] cannot be read.", e);
        }
        return properties;
    }
}

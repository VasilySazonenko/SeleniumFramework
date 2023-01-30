package driverFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeIDriverFactory implements IDriverFactory {

    /*
    Setting up Chrome driver
     */
    public WebDriver initDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vasily\\Projects\\drivers\\chromedriver.exe"); //TODO path to driver move to selenium.properties
        return new ChromeDriver();
    }
}
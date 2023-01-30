package driverFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverFactory implements DriverFactoryInterface {

    /*
    Setting up Chrome driver
     */
    public WebDriver initDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vasily\\Projects\\drivers\\chromedriver.exe");
        return new ChromeDriver();
    }
}
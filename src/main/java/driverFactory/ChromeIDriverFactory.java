package driverFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeIDriverFactory implements IDriverFactory {

    /*
    Setting up Chrome driver, opt does launch chromedriver without opening window
     */
    public WebDriver initDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vasily\\Projects\\drivers\\chromedriver.exe"); //TODO path to driver move to selenium.properties
        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("headless");
        return new ChromeDriver(opt);
    }
}
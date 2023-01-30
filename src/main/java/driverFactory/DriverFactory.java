package driverFactory;

import exceptions.BadConfigurationException;
import framework.SeleniumConfig;
import org.openqa.selenium.WebDriver;

public class DriverFactory {
    /*
    Chooses which browser to start
     */

    public WebDriver initializeBrowser() {
        SeleniumConfig seleniumConfig = new SeleniumConfig();
        String browser = seleniumConfig.getBrowser().toLowerCase();
        WebDriver driver;
        switch (browser){
            case "chrome":
                ChromeIDriverFactory chromeDriverFactory = new ChromeIDriverFactory();
                driver = chromeDriverFactory.initDriver();
                break;
            case "firefox":
                FirefoxIDriverFactory firefoxDriverFactory = new FirefoxIDriverFactory();
                driver = firefoxDriverFactory.initDriver();
                break;
            case "edge":
                EdgeIDriverFactory edgeDriverFactory = new EdgeIDriverFactory();
                driver =  edgeDriverFactory.initDriver();
                break;
            default:
                throw new BadConfigurationException(String.format("This browser [%s] do not support", browser));
        }
        return driver;
    }
}

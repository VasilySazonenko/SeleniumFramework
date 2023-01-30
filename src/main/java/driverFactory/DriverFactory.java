package driverFactory;

import framework.SeleniumConfig;
import org.openqa.selenium.WebDriver;

public class DriverFactory {
    /*
    Chooses which browser to start
     */

    public WebDriver initializeBrowser() {
        SeleniumConfig seleniumConfig = new SeleniumConfig();
        WebDriver driver = null;
        switch (seleniumConfig.getBrowser()){
            case "Chrome":
                ChromeDriverFactory chromeDriverFactory = new ChromeDriverFactory();
                driver = chromeDriverFactory.initDriver();
                break;
            case "Firefox":
                FirefoxDriverFactory firefoxDriverFactory = new FirefoxDriverFactory();
                driver = firefoxDriverFactory.initializeFirefoxDriver();
                break;
            case "Edge":
                EdgeDriverFactory  edgeDriverFactory = new EdgeDriverFactory();
                driver =  edgeDriverFactory.initDriver();
                break;
        }
        return driver;
    }
}

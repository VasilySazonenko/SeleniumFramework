package framework;

import driverFactory.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

/**
 * Class to initialize everything before and after tests
 */
public class SeleniumCommon {
    protected WebDriver driver;
    protected SeleniumObservable observable;
    protected TestContext testContext;

    @BeforeTest
    protected void testInit() {
        this.driver = new DriverFactory().initializeBrowser();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        testContext = new TestContext(driver);
        observable = new SeleniumObservable(testContext);
    }

    @AfterTest
    protected void testQuit() {
        driver.quit();
    }

    protected void getToPage(String URI) {
        driver.get(URI);
    }

}

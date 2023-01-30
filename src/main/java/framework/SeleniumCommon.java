package framework;

import driverFactory.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class SeleniumCommon {
    /*
    Class to initialize everything before and after tests
     */
    protected WebDriver driver;
    protected SeleniumObservable observable;

    protected TestContext testContext;

    @BeforeTest
    public void testInit() {
        this.driver = new DriverFactory().initializeBrowser();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        observable = new SeleniumObservable(driver);
        testContext = new TestContext();
    }

    @AfterTest
    public void testQuit() {
        driver.quit();
    }

    public void getToPage(String URI){
        driver.get(URI);
    }
}

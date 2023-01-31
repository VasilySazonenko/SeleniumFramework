package framework;

import driverFactory.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

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
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        observable = new SeleniumObservable(driver);
        testContext = new TestContext(driver, observable);

    }

    @AfterTest
    protected void testQuit() throws InterruptedException {
//        Thread.sleep(2000);
//        driver.quit();
    }

    protected void goToPage(String URI) {
        driver.get(URI);
    }

}

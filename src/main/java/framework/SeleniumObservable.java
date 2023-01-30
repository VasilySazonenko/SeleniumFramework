package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/*
Class for elements like waiters and other visibility things
 */
public class SeleniumObservable {

    private TestContext testContext;

    private WebDriver driver;

    public SeleniumObservable(TestContext testContext) {
        this.testContext = testContext;
        this.driver = testContext.getDriver();
    }

    public void visibilityOfWaiter(By byLocator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(byLocator));
    }

}

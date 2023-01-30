package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumObservable {

    /*
    Class for elements like waiters and other visibility things
     */
    WebDriver driver;

    public SeleniumObservable(WebDriver driver) {
        this.driver = driver;
    }

    public void visibilityOfWaiter(By byLocator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(byLocator));
    }

}

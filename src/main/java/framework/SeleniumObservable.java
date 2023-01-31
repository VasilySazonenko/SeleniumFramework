package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;
import java.util.NoSuchElementException;

/*
Class for elements like waiters and other visibility things
 */
public class SeleniumObservable {

    private final WebDriver driver;

    public SeleniumObservable(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public boolean isElementDisplayed(By by) {
        return driver.findElement(by).isDisplayed();
    }

    public boolean isElementVisible(By by) {
        try {
            return isElementPresent(by) && isElementDisplayed(by);
        } catch (WebDriverException e) {
            return false;
        }
    }

    public void waitForPageComponentElementPresent(By by, String failedMessage) {
        waitForCondition(ExpectedConditions.presenceOfElementLocated(by)).andAssert(failedMessage);
    }

    public void waitForPageComponentElementVisible(By by, String failedMessage) {
        waitForCondition(ExpectedConditions.visibilityOfElementLocated(by)).andAssert(failedMessage);
    }

    public AssertionPromise waitForCondition(ExpectedCondition<?> condition) {
        return waitForCondition(condition, SeleniumConfig.get().getSeleniumWebDriverWait());
    }

    public AssertionPromise waitForCondition(ExpectedCondition<?> condition, int timeInSeconds) {
        boolean waitResult;
        try {
            new FluentWait<>(driver)
                    .withTimeout(Duration.ofSeconds(timeInSeconds))
                    .pollingEvery(Duration.ofMillis(500))
                    .ignoring(StaleElementReferenceException.class, NoSuchElementException.class)
                    .until(condition);
            waitResult = true;
        } catch (WebDriverException e) {
            waitResult = false;
        }
        return new AssertionPromise(waitResult, timeInSeconds);
    }

    public FluentWait<WebDriver> getWait() {
        return new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(SeleniumConfig.get().getSeleniumWebDriverWait()))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(StaleElementReferenceException.class, NoSuchElementException.class);
    }
}

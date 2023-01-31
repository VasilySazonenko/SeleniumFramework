package pageObjects;

import framework.TestContext;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;
import java.util.Optional;

/*
Clicks, findelements and so on
 */
public abstract class Page {
    private final TestContext testContext;
    private final WebDriver driver;

    public Page(TestContext testContext) {
        this.testContext = testContext;
        this.driver = testContext.getDriver();
    }

    protected TestContext getContext() {
        return testContext;
    }

    protected WebElement findElement(By element) {
        return driver.findElement(element);
    }
    protected List<WebElement> findElements(By element) {
        return driver.findElements(element);
    }

    protected void typeText(By by, String input) {
        typeText(findElement(by), input);
    }

    protected void typeText(WebElement element, String input) {
        element.sendKeys(input);
    }

    protected void click(By by) {
        click(findElement(by));
    }

    protected void click(WebElement element) {
        getContext().getObservable().getWait().until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    protected void scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String script = "arguments[0].scrollIntoView({'block':'center','inline':'center'})";
        js.executeScript(script, element);
    }
}

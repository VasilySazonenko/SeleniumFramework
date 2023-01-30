package PageObjects;

import framework.TestContext;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class Page {
    /*
    Clicks, findelements and so on
     */
    private final TestContext testContext;
    private final WebDriver driver;

    public Page(TestContext testContext) {
        this.testContext = testContext;
        this.driver = testContext.getDriver();
    }

    public WebElement findElement(By element) {
        return driver.findElement(element);
    }

}

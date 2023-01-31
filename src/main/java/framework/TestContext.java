package framework;

import org.openqa.selenium.WebDriver;

/*
Class for everything, that is included into test data
 */
public class TestContext {

    private WebDriver driver;

    private SeleniumObservable observable;

    public TestContext(WebDriver driver, SeleniumObservable observable) {
        this.driver = driver;
        this.observable = observable;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public SeleniumObservable getObservable() {
        return observable;
    }

    public void setObservable(SeleniumObservable observable) {
        this.observable = observable;
    }
}
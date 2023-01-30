package framework;

import org.openqa.selenium.WebDriver;

/*
Class for everything, that is included into test data
 */
public class TestContext {

    private WebDriver driver;

    private String webPAgeURI = "https://www.rahulshettyacademy.com/AutomationPractice/";

    private String login = "VasilyQA";

    public TestContext(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getWebPageURI() {
        return webPAgeURI;
    }

    public void setWebPageURI(String webPAgeURI) {
        this.webPAgeURI = webPAgeURI;
    }
}

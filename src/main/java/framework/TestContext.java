package framework;

import org.openqa.selenium.WebDriver;

public class TestContext {

    private WebDriver driver;

    public TestContext(WebDriver driver) {
        this.driver = driver;
    }
    /*
    Class for everything, that is included into test data
     */

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    private String webPAgeURI = "https://www.rahulshettyacademy.com/AutomationPractice/";

    private String login = "VasilyQA";


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getWebPAgeURI() {
        return webPAgeURI;
    }

    public void setWebPAgeURI(String webPAgeURI) {
        this.webPAgeURI = webPAgeURI;
    }



}

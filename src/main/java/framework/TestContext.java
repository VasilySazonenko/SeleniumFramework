package framework;

import org.openqa.selenium.WebDriver;

public class TestContext {

    /*
    Class for everything, that is included into test data
     */

    private WebDriver driver;

    private String webPAgeURI = "https://www.rahulshettyacademy.com/AutomationPractice/";


    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public String getWebPAgeURI() {
        return webPAgeURI;
    }

    public void setWebPAgeURI(String webPAgeURI) {
        this.webPAgeURI = webPAgeURI;
    }



}

package driverFactory;

import org.openqa.selenium.WebDriver;

public interface IDriverFactory {

    /*
    Interface, which dictates what should be included into each declared driver factory
     */

    WebDriver initDriver();
}

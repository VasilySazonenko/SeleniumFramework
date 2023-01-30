package PageObjects;

import framework.TestContext;
import org.openqa.selenium.WebDriver;

public abstract class BasePage extends Page implements IPage{
    public BasePage(TestContext testContext) {
        super(testContext);
        verify();
    }
    /*
    Validations that page is opened and other validations if needed
     */


}

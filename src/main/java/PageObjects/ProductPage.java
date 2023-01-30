package PageObjects;

import framework.TestContext;
import org.openqa.selenium.By;

public class ProductPage extends BasePage {
    /*
    Any page that we need for a product
    Here we do a verify method for each page to make sure we loaded proper page
     */


    public ProductPage(TestContext testContext) {
        super(testContext);
        verify();
    }

    @Override
    public void verify() {

    }
    public By textField = By.cssSelector(".ui-autocomplete-input");

}

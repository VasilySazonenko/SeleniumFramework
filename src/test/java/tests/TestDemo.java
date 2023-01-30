package tests;

import PageObjects.ProductPage;
import framework.SeleniumCommon;
import org.testng.annotations.Test;

public class TestDemo extends SeleniumCommon {

    @Test
    public void Test1() {
        getToPage(testContext.getWebPageURI());
        ProductPage productPage = new ProductPage(testContext);
        productPage.findElement(productPage.textField).sendKeys(testContext.getLogin());
    }
}

package tests;

import framework.SeleniumCommon;
import framework.SeleniumConfig;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.amazonPage.AmazonAcceptCookiesPage;
import pageObjects.amazonPage.AmazonMainPage;
import pageObjects.amazonPage.AmazonNavBarPage;
import pageObjects.amazonPage.ProductPage;

import static pageObjects.amazonPage.AmazonAcceptCookiesPage.isCookieAcceptWindowPresent;

public class AmazonTest extends SeleniumCommon {
    @Test
    public void SearchKeyboard() {
        goToPage(SeleniumConfig.get().getAmazonURI());
        if (isCookieAcceptWindowPresent(testContext)) {
            new AmazonAcceptCookiesPage(testContext).closeCookieAcceptWindow();
            AmazonMainPage amazonMainPage = new AmazonNavBarPage(testContext)
                    .searchOnPage("EPOMAKER Monet TH80 Pro 75% Hotswap Keyboard")
                    .clickSearchBtn()
                    .getMainPage();

            ProductPage productPage = amazonMainPage
                    .clickByNameFromList("Wired Mechanical Gaming Keyboard with RGB Lighting")
                    .getProductPage();
            if (productPage.discountPresence() < 108) {
                Assert.assertTrue(true);
            }
            else Assert.fail("There is no discount");
        }
    }
}

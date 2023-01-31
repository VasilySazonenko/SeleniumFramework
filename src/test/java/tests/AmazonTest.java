package tests;

import framework.SeleniumCommon;
import framework.SeleniumConfig;
import org.testng.annotations.Test;
import pageObjects.amazonMainPage.AmazonAcceptCookies;
import pageObjects.amazonMainPage.AmazonMainPage;
import pageObjects.amazonMainPage.AmazonNavBarPage;

import static pageObjects.amazonMainPage.AmazonAcceptCookies.isCookieAcceptWindowPresent;

public class AmazonTest extends SeleniumCommon {
    @Test
    public void SearchKeyboard() {
        goToPage(SeleniumConfig.get().getAmazonURI());
        if (isCookieAcceptWindowPresent(testContext)) {
            new AmazonAcceptCookies(testContext).closeCookieAcceptWindow();
            AmazonMainPage amazonMainPage = new AmazonNavBarPage(testContext)
                    .searchOnPage("EPOMAKER Monet TH80 Pro 75% Hotswap Keyboard")
                    .clickSearchBtn()
                    .getMainPage();

            amazonMainPage.clickByNameFromList("Flamingo Switch");
        }
    }
}

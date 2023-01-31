package tests;

import pageObjects.oneA.Header1aPage;
import pageObjects.oneA.MainBodyPage;
import framework.SeleniumCommon;
import framework.SeleniumConfig;
import org.testng.annotations.Test;

public class MainPageTest extends SeleniumCommon {

    @Test
    public void SearchValidTest(){
        goToPage(SeleniumConfig.get().getURI());
        MainBodyPage mainBodyPage = new Header1aPage(testContext)
                .searchOnPage("zenbook")
                .clickSearch()
                .getMainBody();

        mainBodyPage.orderByPriceLowToHigh();
    }
}

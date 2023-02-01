package pageObjects.amazonPage;

import framework.TestContext;
import org.openqa.selenium.By;
import pageObjects.BasePage;

public class ProductPage extends BasePage {

    private static final By PRODUCT_PRICE = By.cssSelector(".a-padding-base .a-price.aok-align-center .a-price-whole");

    private static final By PRODUCT_PAGE = By.cssSelector(".pc.en_GB");

    public ProductPage(TestContext testContext) {
        super(testContext);
    }

    @Override
    public void verify() {
        getContext()
                .getObservable()
                .waitForPageComponentElementPresent(
                        PRODUCT_PAGE,
                        "Main page could not be found"
                );
    }

    public int discountPresence(){
        int text = Integer.parseInt(findElement(PRODUCT_PRICE).getText());
        System.out.println(text);
        return text;
    }
}

package pageObjects.amazonMainPage;

import framework.TestContext;
import org.openqa.selenium.By;
import pageObjects.BasePage;

/*
If we write static method and all it through child, then verify method is not run and we avoid
running constructor of BasePage with verify.
 */
public class AmazonAcceptCookies extends BasePage {


    private static final By PRODUCTS_CONTAINER = By.cssSelector("#sp-cc");

    private static final By ACCEPT_COOKIE = By.cssSelector("#sp-cc-accept");

    public AmazonAcceptCookies(TestContext testContext) {
        super(testContext);
    }


    @Override
    public void verify() {
        getContext()
                .getObservable()
                .waitForPageComponentElementPresent(
                        PRODUCTS_CONTAINER,
                        "Cookie page is not shown");
    }

    public static boolean isCookieAcceptWindowPresent(TestContext context) {
        return context.getObservable().isElementPresent(PRODUCTS_CONTAINER);
    }

    public void closeCookieAcceptWindow() {
        click(ACCEPT_COOKIE);
    }
}

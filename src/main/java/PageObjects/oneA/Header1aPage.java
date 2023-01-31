package PageObjects.oneA;

import PageObjects.BasePage;
import framework.TestContext;
import org.openqa.selenium.By;

public class Header1aPage extends BasePage {

    private static final By SITE_HEADER = By.cssSelector(".site-header-root");

    private static final By searchField = By.cssSelector(".site-header-root #q");

    private static final By searchBtn = By.cssSelector(".site-header-root .main-search-submit");
    public Header1aPage(TestContext testContext) {
        super(testContext);
    }

    @Override
    public void verify() {
        getContext()
                .getObservable()
                .waitForPageComponentElementPresent(
                        SITE_HEADER,
                        "Site header could not be found"
                );

        getContext()
                .getObservable()
                .waitForPageComponentElementPresent(
                        By.cssSelector("#cookiebanner"),
                        "Site header could not be found"
                );
    }

    public Header1aPage searchOnPage(String input) {
        typeText(searchField, input);
        return this;
    }

    public Header1aPage clickSearch() {
        click(searchBtn);
        return this;
    }

    public MainBodyPage getMainBody() {
        return new MainBodyPage(getContext());
    }
}


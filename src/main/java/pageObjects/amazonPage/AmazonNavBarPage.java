package pageObjects.amazonPage;

import framework.TestContext;
import org.openqa.selenium.By;
import pageObjects.BasePage;

public class AmazonNavBarPage extends BasePage {

    private static final By MAINPAGE_CONTAINER = By.cssSelector("#nav-cover");
    private static final String NAVIGATION_CONTAINER = "div#nav-belt";

    private static final By NAVIGATION_BAR = By.cssSelector(NAVIGATION_CONTAINER);

    private static final By SEARCH_TEXTFIELD = By.cssSelector(NAVIGATION_CONTAINER + " #twotabsearchtextbox");

    private static final By  SEARCH_BTN = By.cssSelector(NAVIGATION_CONTAINER + " #nav-search-submit-button");


    public AmazonNavBarPage(TestContext testContext) {
        super(testContext);
    }

    @Override
    public void verify() {
        getContext()
                .getObservable()
                .waitForPageComponentElementPresent(
                        NAVIGATION_BAR,
                        "Navigation bar could not be found");
    }
    public AmazonNavBarPage searchOnPage(String itemName){
        typeText(SEARCH_TEXTFIELD, itemName);
        return this;
    }
    public AmazonNavBarPage clickSearchBtn(){
        click(SEARCH_BTN);
        return this;
    }

    public AmazonMainPage getMainPage(){
        return new AmazonMainPage(getContext());
    }
}

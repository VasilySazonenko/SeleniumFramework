package pageObjects.amazonMainPage;

import framework.TestContext;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageObjects.BasePage;

public class AmazonMainPage extends BasePage {

    private static final By PRODUCTS_CONTAINER = By.cssSelector("#a-page");

    private static final By ITEM_TO_BUY = By.cssSelector(".s-card-container .a-text-normal");

    public AmazonMainPage(TestContext testContext) {
        super(testContext);
    }


    @Override
    public void verify() {
        getContext()
                .getObservable()
                .waitForPageComponentElementPresent(
                        PRODUCTS_CONTAINER,
                        "Main page could not be found"
                );
    }

    public void clickByNameFromList(String productName) {
        WebElement element = findElements(ITEM_TO_BUY)
                .stream()
                .filter(item -> item.getText().contains(productName))
                .findFirst()
                .orElseThrow(() -> new AssertionError(String.format("Element with the text %s is not found", productName)));
        click(element);
    }

}

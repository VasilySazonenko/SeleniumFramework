package pageObjects.oneA;

import pageObjects.BasePage;
import framework.TestContext;
import org.openqa.selenium.By;

public class MainBodyPage extends BasePage {

    private static final By PRODUCTS_CONTAINER = By.cssSelector(".site-center");

    private static final By selectProductSorting = By.cssSelector(".ks-js-sort-desktop .selection > span");

    private static final By SELECTION_GROUP = By.cssSelector("span.select2-results");
    private static final By selectProductByPriceLowToHigh =
            By.xpath("//*[@class='select2-results']//*[text()='Cenas, sākot no zemākās']");

    public MainBodyPage(TestContext testContext) {
        super(testContext);
    }

    @Override
    public void verify() {
        getContext()
                .getObservable()
                .waitForPageComponentElementPresent(
                        PRODUCTS_CONTAINER,
                        "Select product element could not be found"
                );
    }

    public void orderByPriceLowToHigh() {
        scrollToElement(findElement(selectProductSorting));
        click(selectProductSorting);
        click(selectProductByPriceLowToHigh);
    }
}

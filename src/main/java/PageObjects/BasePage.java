package PageObjects;

import framework.TestContext;

/*
Validations that page is opened and other validations if needed
 */
public abstract class BasePage extends Page implements IPage {
    public BasePage(TestContext testContext) {
        super(testContext);
        verify();
    }
}

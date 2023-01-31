package PageObjects;

import framework.TestContext;

/*
Empty, do not need to write here everything
 */
public abstract class BasePage extends Page implements IPage {
    public BasePage(TestContext testContext) {
        super(testContext);
        verify();
    }
}

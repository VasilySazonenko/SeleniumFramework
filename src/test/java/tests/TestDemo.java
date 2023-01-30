package tests;

import framework.SeleniumCommon;
import org.testng.annotations.Test;

public class TestDemo extends SeleniumCommon {

    @Test
    public void Test1() {
        getToPage(testContext.getWebPAgeURI());
    }
}

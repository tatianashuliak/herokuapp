package Tests;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TyposPage;


public class TyposTest extends BaseTest {

    @Test
    @Description("Checking first part of text on typo")
    public void typosTest1() {
        TyposPage typosPage = new TyposPage(driver);
        typosPage.openTyposPage();
        Assert.assertTrue(typosPage.isText1Correct(), "Text has typo");
    }

    @Test
    @Description("Checking second part of text on typo")
    public void typosTest2() {
        TyposPage typosPage = new TyposPage(driver);
        typosPage.openTyposPage();
        Assert.assertTrue(typosPage.isText2Correct(), "Text has typo");
    }
}

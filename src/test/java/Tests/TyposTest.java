package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TyposPage;

import static Constants.PageUrls.*;
public class TyposTest extends BaseTest {

    @Test
    public void typosTest1() {
        TyposPage typosPage = new TyposPage(driver);
        typosPage.openTyposPage();
        Assert.assertTrue(typosPage.isText1Correct(),"Text has typo");
    }

    @Test
    public void typosTest2() {
        TyposPage typosPage = new TyposPage(driver);
        typosPage.openTyposPage();
        Assert.assertTrue(typosPage.isText2Correct(),"Text has typo");
    }
}

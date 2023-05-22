package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TyposPage;


public class TyposTest extends BaseTest {

    @Test
    public void typosTest1() {
        TyposPage typosPage = new TyposPage(driver);
        typosPage.openTyposPage();
        Assert.assertTrue(typosPage.isText1Correct(), "Text has typo");
    }

    @Test
    public void typosTest2() {
        TyposPage typosPage = new TyposPage(driver);
        typosPage.openTyposPage();
        Assert.assertTrue(typosPage.isText2Correct(), "Text has typo");
    }
}

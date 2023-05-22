package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DropDownPage;

public class DropDownTest extends BaseTest {
    @Test
    public void isOption1Selected() {
        DropDownPage dropDownPage = new DropDownPage(driver);
        dropDownPage.openDropDownPage();
        Assert.assertTrue(dropDownPage.isOption1Selected(), "Option 1 isn't selected");
    }

    @Test
    public void isOption2Selected() {
        DropDownPage dropDownPage = new DropDownPage(driver);
        dropDownPage.openDropDownPage();
        Assert.assertTrue(dropDownPage.isOption2Selected(), "Option 2 isn't selected");
    }
}

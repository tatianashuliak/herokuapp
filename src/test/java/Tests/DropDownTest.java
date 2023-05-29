package Tests;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DropDownPage;
import steps.DropDownSteps;

public class DropDownTest extends BaseTest {
    @Test
    @Description("Selecting first option")
    public void isOption1Selected() {
        DropDownPage dropDownPage = new DropDownPage(driver);
        DropDownSteps.openDropDownPage(driver);
        Assert.assertTrue(dropDownPage.isOption1Selected(), "Option 1 isn't selected");
    }

    @Test
    @Description("Selecting second option")
    public void isOption2Selected() {
        DropDownPage dropDownPage = new DropDownPage(driver);
        DropDownSteps.openDropDownPage(driver);
        Assert.assertTrue(dropDownPage.isOption2Selected(), "Option 2 isn't selected");
    }
}

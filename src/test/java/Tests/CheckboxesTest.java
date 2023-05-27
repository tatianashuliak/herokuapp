package Tests;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CheckboxesPage;
import steps.CheckboxesSteps;


public class CheckboxesTest extends BaseTest {

    @Test
    @Description("Checking that the first checkbox isn't selected")
    public void firstCheckboxIsUncheckedTest() {
        CheckboxesPage checkboxesPage = new CheckboxesPage(driver);
        checkboxesPage.openCheckboxesPage();
        Assert.assertFalse(checkboxesPage.isFirstCheckboxSelected(), "First checkbox isn't unchecked");
    }

    @Test
    @Description("Selecting first checkbox")
    public void firstCheckboxIsCheckedTest() {
        CheckboxesPage checkboxesPage = new CheckboxesPage(driver);
        CheckboxesSteps.selectFirstCheckbox(driver);
        Assert.assertTrue(checkboxesPage.isFirstCheckboxSelected(), "First checkbox isn't checked");
    }

    @Test
    @Description("Checking that second checkbox is selected")
    public void secondCheckboxIsCheckedTest() {
        CheckboxesPage checkboxesPage = new CheckboxesPage(driver);
        checkboxesPage.openCheckboxesPage();
        Assert.assertTrue(checkboxesPage.isSecondCheckboxSelected(), "Second checkbox isn't checked");
    }

    @Test
    @Description("Unchecking second checkbox")
    public void secondCheckboxIsUncheckedTest() {
        CheckboxesPage checkboxesPage = new CheckboxesPage(driver);
        CheckboxesSteps.uncheckSecondCheckbox(driver);
        Assert.assertFalse(checkboxesPage.isSecondCheckboxSelected(), "Second checkbox isn't unchecked");
    }

}

package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CheckboxesPage;


public class CheckboxesTest extends BaseTest {

    @Test
    public void firstCheckboxIsUncheckedTest() {
        CheckboxesPage checkboxesPage = new CheckboxesPage(driver);
        checkboxesPage.openCheckboxesPage();
        Assert.assertFalse(checkboxesPage.isFirstCheckboxSelected(), "First checkbox isn't unchecked");
    }

    @Test
    public void firstCheckboxIsCheckedTest() {
        CheckboxesPage checkboxesPage = new CheckboxesPage(driver);
        checkboxesPage.openCheckboxesPage()
                .clickFirstCheckbox();
        Assert.assertTrue(checkboxesPage.isFirstCheckboxSelected(), "First checkbox isn't checked");
    }

    @Test
    public void secondCheckboxIsCheckedTest() {
        CheckboxesPage checkboxesPage = new CheckboxesPage(driver);
        checkboxesPage.openCheckboxesPage();
        Assert.assertTrue(checkboxesPage.isSecondCheckboxSelected(), "Second checkbox isn't checked");
    }

    @Test
    public void secondCheckboxIsUncheckedTest() {
        CheckboxesPage checkboxesPage = new CheckboxesPage(driver);
        checkboxesPage.openCheckboxesPage()
                .clickSecondCheckbox();
        Assert.assertFalse(checkboxesPage.isSecondCheckboxSelected(), "Second checkbox isn't unchecked");
    }

}

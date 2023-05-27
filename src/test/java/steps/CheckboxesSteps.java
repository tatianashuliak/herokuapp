package steps;

import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import pages.CheckboxesPage;
import utilities.AllureTool;
import utilities.Screenshoter;

public class CheckboxesSteps {
    private static CheckboxesPage checkboxesPage;

    @Step("User click and select first checkbox")
    @Attachment(value = "screenshot", type="image/png")
    public static byte[] selectFirstCheckbox (WebDriver driver) {
        checkboxesPage = new CheckboxesPage(driver);
        checkboxesPage.openCheckboxesPage();
        checkboxesPage.clickFirstCheckbox();
        AllureTool allureTool = new AllureTool();
        return allureTool.makeScreenShot(driver);
    }

    @Step ("User click and uncheck second checkbox")
    public static void uncheckSecondCheckbox (WebDriver driver) {
        checkboxesPage = new CheckboxesPage(driver);
        checkboxesPage.openCheckboxesPage();
        checkboxesPage.clickSecondCheckbox();
    }
}

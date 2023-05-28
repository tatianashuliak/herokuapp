package steps;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import pages.DropDownPage;

public class DropDownSteps {
    private static DropDownPage dropDownPage;

    @Step("User opens DropDown page")
    public static void openDropDownPage(WebDriver driver) {
        dropDownPage = new DropDownPage(driver);
        dropDownPage.openDropDownPage();
    }
}


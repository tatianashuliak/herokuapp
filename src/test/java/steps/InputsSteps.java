package steps;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import pages.InputsPage;

public class InputsSteps {
    private static InputsPage inputsPage;

    @Step("User opens Inputs Page")
    public static void openInputsPage(WebDriver driver) {
        inputsPage = new InputsPage(driver);
        inputsPage.openInputsPage();
    }
}

package steps;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import pages.AlertsPage;

public class AlertsSteps {
    private static AlertsPage alertsPage;

    @Step("User opens alerts page")
    public static void openAlertsPage(WebDriver driver){
        alertsPage = new AlertsPage(driver);
        alertsPage.openAlertsPage();
    }
}

package Tests;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlertsPage;

import static Constants.Texts.JS_ALERT_TEXT;
import static Constants.Texts.JS_CONFIRM_TEXT;

public class AlertsTest extends BaseTest {
    @Test
    @Description("Inducing JS Alert")
    public void jsAlertTest() {
        AlertsPage alertsPage = new AlertsPage(driver);
        alertsPage.openAlertsPage();
        Assert.assertTrue(alertsPage.getTextJSAlert().equals(JS_ALERT_TEXT), "JS Alert text incorrect");
    }

    @Test
    @Description("Inducing JS Confirm Alert")
    public void jsConfirmTest() {
        AlertsPage alertsPage = new AlertsPage(driver);
        alertsPage.openAlertsPage();
        Assert.assertTrue(alertsPage.getTextJSConfirm().equals(JS_CONFIRM_TEXT), "JS Confirm text is incorrect");
    }

    @Test
    @Description("Inducing JS Prompt Alert")
    public void jsPromptTest() {
        AlertsPage alertsPage = new AlertsPage(driver);
        alertsPage.openAlertsPage();
        String enteredText = alertsPage.inputTextJSPrompt();
        String resultText = alertsPage.getResultText();
        Assert.assertTrue(resultText.equals("You entered: ".concat(enteredText)));
    }
}

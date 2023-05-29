package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static Constants.PageUrls.ALERTS_PAGE;

public class AlertsPage extends BasePage {
    private By JS_ALERT_BUTTON = By.cssSelector("[onclick='jsAlert()']");
    private By JS_CONFIRM_BUTTON = By.cssSelector("[onclick='jsConfirm()'");
    private By JS_PROMPT_BUTTON = By.cssSelector("[onclick='jsPrompt()'");
    private By RESULT_TEXT = By.id("result");

    public AlertsPage(WebDriver driver) {
        super(driver);
    }

    public void openAlertsPage() {
        driver.get(ALERTS_PAGE);
    }

    public String getTextJSAlert() {
        driver.findElement(JS_ALERT_BUTTON).click();
        String jsAlertText = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        return jsAlertText;
    }

    public String getTextJSConfirm() {
        driver.findElement(JS_CONFIRM_BUTTON).click();
        String jsConfirmText = driver.switchTo().alert().getText();
        driver.switchTo().alert().dismiss();
        return jsConfirmText;
    }

    public String inputTextJSPrompt() {
        driver.findElement(JS_PROMPT_BUTTON).click();
        Faker faker = new Faker();
        String fakerText = faker.letterify("?????????");
        driver.switchTo().alert().sendKeys(fakerText);
        driver.switchTo().alert().accept();
        return fakerText;
    }

    public String getResultText() {
        String resultText = driver.findElement(RESULT_TEXT).getText();
        return resultText;
    }
}

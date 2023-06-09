package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static Constants.PageUrls.NOTIFICATION_MESSAGES_PAGE;

public class NotificationMessagesPage extends BasePage {
    private By MESSAGE = By.id("flash");
    private By LINK = By.xpath("//a[contains(text(), 'Click here')]");

    public NotificationMessagesPage(WebDriver driver) {
        super(driver);
    }

    public void openNotificationMessagePage() {
        driver.get(NOTIFICATION_MESSAGES_PAGE);
    }

    public void clickLink() {
        driver.findElement(LINK).click();
    }

    public boolean isMessageSuccessful() {
        boolean isMessageSuccessful = driver.findElement(MESSAGE).getText().contains("Action successful");
        return isMessageSuccessful;
    }

}

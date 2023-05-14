package loadablepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static Constants.PageUrls.NOTIFICATION_MESSAGES_PAGE;

public class NotificationMessagesPage extends BasePage {
    private By MESSAGE = By.id("flash");
    private By LINK = By.xpath("//a[contains(text(), 'Click here')]");

    public NotificationMessagesPage (WebDriver driver){
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        WebElement link = driver.findElement(LINK);
        return link.isDisplayed();
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

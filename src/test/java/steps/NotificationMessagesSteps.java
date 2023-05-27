package steps;

import io.qameta.allure.Step;
import loadablepage.NotificationMessagesPage;
import org.openqa.selenium.WebDriver;

public class NotificationMessagesSteps {
    private static NotificationMessagesPage notificationMessagesPage;

    @Step("User click link and induce notification message")
    public static void induceNotificationMessage (WebDriver driver){
        notificationMessagesPage = new NotificationMessagesPage(driver);
        notificationMessagesPage.openNotificationMessagePage();
        notificationMessagesPage.clickLink();
    }
}

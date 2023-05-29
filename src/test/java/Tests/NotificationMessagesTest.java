package Tests;

import io.qameta.allure.Description;
import loadablepage.NotificationMessagesPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import steps.NotificationMessagesSteps;

import static Constants.PageUrls.*;

public class NotificationMessagesTest extends BaseTest {

    @Test
    @Description("Inducing notification message")
    public void notificationMessagesTest() {
        NotificationMessagesSteps.induceNotificationMessage(driver);
        NotificationMessagesPage notificationMessagesPage = new NotificationMessagesPage(driver);
        Assert.assertTrue(notificationMessagesPage.isMessageSuccessful(), "'Action unsuccessful' message");
    }
}

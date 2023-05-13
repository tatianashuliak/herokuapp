package Tests;

import loadablepage.NotificationMessagesPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Constants.PageUrls.*;

public class NotificationMessagesTest extends BaseTest {
    @Test
    public void notificationMessagesTest() {
        NotificationMessagesPage notificationMessagesPage = new NotificationMessagesPage(driver);
        notificationMessagesPage.openNotificationMessagePage();
        notificationMessagesPage.isPageOpened();
        notificationMessagesPage.clickLink();
        notificationMessagesPage.isPageOpened();
        Assert.assertTrue(notificationMessagesPage.isMessageSuccessful(), "'Action unsuccessful' message");
    }
}

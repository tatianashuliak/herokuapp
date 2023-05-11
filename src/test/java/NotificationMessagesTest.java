import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Constants.PageUrls.*;
public class NotificationMessagesTest extends BaseTest {
    @Test
    public void notificationMessagesTest() {
        driver.get(NOTIFICATION_MESSAGES_PAGE);
        driver.findElement(By.linkText("Click here")).click();
        WebElement message = driver.findElement(By.id("flash"));
        Assert.assertTrue(message.getText().contains("Action successful"), "'Action unsuccessful' message");
    }
}

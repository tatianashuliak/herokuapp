import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import static Constants.PageUrls.*;
public class TyposTest extends BaseTest {
    @Test
    public void typosTest() {
        driver.get(TYPOS_PAGE);
        WebElement text = driver.findElement(By.xpath("//p[contains(text(), 'see')]"));
        Assert.assertTrue(text.getText().contains("won't"),"Text has typo");
    }
}

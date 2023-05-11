import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import static Constants.PageUrls.*;
public class TyposTest extends BaseTest {
    public static final String CORRECT_TEXT1 = "This example demonstrates a typo being introduced. It does it randomly on each page load.";
    public static final String CORRECT_TEXT2 = "" + "Sometimes you'll see a typo, other times you won't." + "";

    @Test
    public void typosTest1() {
        driver.get(TYPOS_PAGE);
        WebElement text = driver.findElement(By.xpath("//p[1]"));
        Assert.assertTrue(text.getText().equals(CORRECT_TEXT1),"Text has typo");
    }

    @Test
    public void typosTest2() {
        driver.get(TYPOS_PAGE);
        WebElement text = driver.findElement(By.xpath("//p[2]"));
        Assert.assertTrue(text.getText().equals(CORRECT_TEXT2),"Text has typo");
    }
}

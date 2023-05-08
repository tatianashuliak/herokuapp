import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import static Constants.PageUrls.*;
public class InputsTest extends BaseTest {
    @Test
    public void inputArrowUpTest() {
        driver.get(INPUTS_PAGE);
        WebElement input = driver.findElement(By.cssSelector("[type]"));
        input.sendKeys(Keys.ARROW_UP);
        Assert.assertTrue(input.getAttribute("value").length()==1, "Value wasn't entered");
    }

    @Test
    public void inputArrowDownTest() {
        driver.get(INPUTS_PAGE);
        WebElement input = driver.findElement(By.cssSelector("[type]"));
        input.sendKeys(Keys.ARROW_DOWN);
        Assert.assertTrue(input.getAttribute("value").length()==2, "Value wasn't entered");
    }
}

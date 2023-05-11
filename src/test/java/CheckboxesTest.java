import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import static Constants.PageUrls.*;

public class CheckboxesTest extends BaseTest{

@Test
public void firstCheckboxIsUncheckedTest() {
    driver.get(CHECKBOXES_PAGE);
    WebElement firstCheckbox = driver.findElement(By.xpath("//input[1]"));
    Assert.assertFalse(firstCheckbox.isSelected(), "First checkbox isn't unchecked");
}

@Test
public void firstCheckboxIsCheckedTest() {
    driver.get(CHECKBOXES_PAGE);
    WebElement firstCheckbox = driver.findElement(By.xpath("//input[1]"));
    firstCheckbox.click();
    Assert.assertTrue(firstCheckbox.isSelected(), "First checkbox isn't checked");
}

@Test
    public void secondCheckboxIsCheckedTest() {
    driver.get(CHECKBOXES_PAGE);
    WebElement secondCheckbox = driver.findElement(By.xpath("//input[2]"));
    Assert.assertTrue(secondCheckbox.isSelected(), "Second checkbox isn't checked");
}

    @Test
    public void secondCheckboxIsUncheckedTest() {
        driver.get(CHECKBOXES_PAGE);
        WebElement secondCheckbox = driver.findElement(By.xpath("//input[2]"));
        secondCheckbox.click();
        Assert.assertFalse(secondCheckbox.isSelected(), "Second checkbox isn't unchecked");
    }

}

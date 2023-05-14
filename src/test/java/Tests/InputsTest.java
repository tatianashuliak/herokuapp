package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.InputsPage;

import static Constants.PageUrls.*;
public class InputsTest extends BaseTest {
    @Test
    public void inputArrowUpTest() {
        InputsPage inputsPage = new InputsPage(driver);
        inputsPage.openInputsPage();
        inputsPage.inputArrowUp();
        Assert.assertTrue(inputsPage.isInputEquals1(), "Value wasn't entered");
    }

    @Test
    public void inputArrowDownTest() {
        InputsPage inputsPage = new InputsPage(driver);
        inputsPage.openInputsPage();
        inputsPage.inputArrowDown();
        Assert.assertTrue(inputsPage.isInputEqualsMinus1(), "Value wasn't entered");
    }
}

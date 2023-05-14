package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static Constants.PageUrls.INPUTS_PAGE;

public class InputsPage extends BasePage {
    private By INPUT = By.cssSelector("[type]");

    public InputsPage(WebDriver driver) {
        super(driver);
    }

    public void openInputsPage() {
        driver.get(INPUTS_PAGE);
    }
    public void inputArrowUp() {
        WebElement input = driver.findElement(INPUT);
        input.sendKeys(Keys.ARROW_UP);
    }

    public boolean isInputEquals1() {
        WebElement input = driver.findElement(INPUT);
        boolean isInputEquals1 = input.getAttribute("value").equals("1");
        return isInputEquals1;
    }

    public void inputArrowDown() {
        WebElement input = driver.findElement(INPUT);
        input.sendKeys(Keys.ARROW_DOWN);

    }
    public boolean isInputEqualsMinus1() {
        WebElement input = driver.findElement(INPUT);
        boolean isInputEqualsMinus1 = input.getAttribute("value").equals("-1");
        return isInputEqualsMinus1;
    }
}

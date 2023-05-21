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

    public boolean inputArrowUp(int numberOfInputs) {
        WebElement input = driver.findElement(INPUT);
        for (int i = 0; i < numberOfInputs; i++) {
            input.sendKeys(Keys.ARROW_UP);
        }
        String numberOfArrowUp = new String(Integer.toString(numberOfInputs));
        System.out.println(numberOfArrowUp);
        boolean isInputEqualsNumberOfArrowUp = input.getAttribute("value").equals(numberOfArrowUp);
        return isInputEqualsNumberOfArrowUp;
    }

    public boolean inputArrowDown(int numberOfInputs) {
        WebElement input = driver.findElement(INPUT);
        for (int i = 0; i < numberOfInputs; i++) {
            input.sendKeys(Keys.ARROW_DOWN);
        }
        String numberOfArrowDown = new String(Integer.toString(numberOfInputs));
        boolean isInputEqualsNumberOfArrowDown = input.getAttribute("value").equals("-" + numberOfArrowDown);
        return isInputEqualsNumberOfArrowDown;
    }
}

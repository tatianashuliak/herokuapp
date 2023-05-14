package pages;

import com.google.common.io.BaseEncoding;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static Constants.PageUrls.CHECKBOXES_PAGE;

public class CheckboxesPage extends BasePage {
    private By FIRST_CHECKBOX = By.xpath("//input[1]");
    private By SECOND_CHECKBOX = By.xpath("//input[2]");

    public CheckboxesPage (WebDriver driver) {
        super(driver);
    }

    public CheckboxesPage openCheckboxesPage(){
        driver.get(CHECKBOXES_PAGE);
        return this;
    }

    public CheckboxesPage clickFirstCheckbox() {
        driver.findElement(FIRST_CHECKBOX).click();
        return this;
    }

    public boolean isFirstCheckboxSelected() {
        WebElement firstCheckbox = driver.findElement(FIRST_CHECKBOX);
        return firstCheckbox.isSelected();
    }

    public boolean isSecondCheckboxSelected() {
        WebElement secondCheckbox = driver.findElement(SECOND_CHECKBOX);
        return secondCheckbox.isSelected();
    }

    public void clickSecondCheckbox() {
        driver.findElement(SECOND_CHECKBOX).click();
    }
}

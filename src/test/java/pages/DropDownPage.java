package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static Constants.PageUrls.DROPDOWN_PAGE;

public class DropDownPage extends BasePage {
    private By DROPDOWN_LIST = By.id("dropdown");

    public DropDownPage(WebDriver driver) {
        super(driver);
    }

    public void openDropDownPage() {
        driver.get(DROPDOWN_PAGE);
    }

    public boolean isOption1Selected() {
        WebElement dropdownlist = driver.findElement(DROPDOWN_LIST);
        Select select = new Select(dropdownlist);
        select.selectByValue("1");
        boolean option1isSelected = select.getFirstSelectedOption().isSelected();
        return option1isSelected;
    }

    public boolean isOption2Selected() {
        WebElement dropdownlist = driver.findElement(DROPDOWN_LIST);
        Select select = new Select(dropdownlist);
        select.selectByValue("2");
        boolean option2isSelected = select.getFirstSelectedOption().isSelected();
        return option2isSelected;
    }
}

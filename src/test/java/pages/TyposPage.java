package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static Constants.PageUrls.TYPOS_PAGE;

public class TyposPage extends BasePage {
    private static final String CORRECT_TEXT1 = "This example demonstrates a typo being introduced. It does it randomly on each page load.";
    private static final String CORRECT_TEXT2 = "" + "Sometimes you'll see a typo, other times you won't." + "";
    private By TEXT_1 = By.xpath("//p[1]");
    private By TEXT_2 = By.xpath("//p[2]");

    public TyposPage(WebDriver driver) {
        super(driver);
    }
    public void openTyposPage() {
        driver.get(TYPOS_PAGE);
    }

    public boolean isText1Correct() {
        return driver.findElement(TEXT_1).getText().equals(CORRECT_TEXT1);
    }

    public boolean isText2Correct() {
        return driver.findElement(TEXT_2).getText().equals(CORRECT_TEXT2);
    }
}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static Constants.PageUrls.DROPAABLE_JQUERYUI_PAGE;

public class DroppablePage extends BasePage {
    private By DRAGGABLE_ELEMENT = By.id("draggable");
    private By DROPPABLE_ELEMENT = By.id("droppable");
    private By IFRAME = By.className("demo-frame");

    public DroppablePage(WebDriver driver) {
        super(driver);
    }

    public void openDroppablePage() {
        driver.get(DROPAABLE_JQUERYUI_PAGE);
    }

    public String dragAndDrop() {
        WebElement iframe = driver.findElement(IFRAME);
        driver.switchTo().frame(iframe);
        Actions actions = new Actions(driver);
        WebElement draggable = driver.findElement(DRAGGABLE_ELEMENT);
        WebElement droppable = driver.findElement(DROPPABLE_ELEMENT);
        actions.dragAndDrop(draggable, droppable)
                .build()
                .perform();
        String textChangedToDropped = driver.findElement(DROPPABLE_ELEMENT).getText();
        driver.switchTo().parentFrame();
        return textChangedToDropped;
    }
}

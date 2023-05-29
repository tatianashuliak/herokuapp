package steps;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import pages.DroppablePage;

public class DragAndDropSteps {
    private static DroppablePage droppablePage;

    @Step("User opens Drag and drop page")
    public static void openDragAndDropPage(WebDriver driver){
        droppablePage = new DroppablePage(driver);
        droppablePage.dragAndDrop();
    }
}

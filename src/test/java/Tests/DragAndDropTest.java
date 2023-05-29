package Tests;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DroppablePage;
import steps.DragAndDropSteps;

import static Constants.Texts.DROPPED_TEXT;

public class DragAndDropTest extends BaseTest {
    @Test
    @Description("Dragging an object and dropping it to another place")
    public void dragAndDropTest() {
        DroppablePage droppablePage = new DroppablePage(driver);
        DragAndDropSteps.openDragAndDropPage(driver);
        String changedToDroppedText = droppablePage.dragAndDrop();
        Assert.assertTrue(changedToDroppedText.equals(DROPPED_TEXT));
    }
}

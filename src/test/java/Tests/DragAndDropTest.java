package Tests;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DroppablePage;

import static Constants.Texts.DROPPED_TEXT;

public class DragAndDropTest extends BaseTest {
    @Test
    @Description("Dragging an object and dropping it to another place")
    public void dragAndDropTest() {
        DroppablePage droppablePage = new DroppablePage(driver);
        droppablePage.openDroppablePage();
        String changedToDroppedText = droppablePage.dragAndDrop();
        System.out.println(changedToDroppedText);
        Assert.assertTrue(changedToDroppedText.equals(DROPPED_TEXT));
    }
}

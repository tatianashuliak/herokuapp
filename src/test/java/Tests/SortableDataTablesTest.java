package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SortableDataTablesPage;

import static Constants.PageUrls.*;

public class SortableDataTablesTest extends BaseTest {
    @Test
    public void table1LastNameTest() {
        SortableDataTablesPage sortableDataTablesPage = new SortableDataTablesPage(driver);
        sortableDataTablesPage.openSortableDataTablesPage();
        Assert.assertTrue(sortableDataTablesPage.isLastNameBach());
    }

    @Test
    public void table1FirstNameTest() {
        SortableDataTablesPage sortableDataTablesPage = new SortableDataTablesPage(driver);
        sortableDataTablesPage.openSortableDataTablesPage();
        Assert.assertTrue(sortableDataTablesPage.isFirstNameFrank());
    }

    @Test
    public void table2DueTest() {
        SortableDataTablesPage sortableDataTablesPage = new SortableDataTablesPage(driver);
        sortableDataTablesPage.openSortableDataTablesPage();
        Assert.assertTrue(sortableDataTablesPage.isDue51$());
    }

    @Test
    public void table2WebSiteTest() {
        SortableDataTablesPage sortableDataTablesPage = new SortableDataTablesPage(driver);
        sortableDataTablesPage.openSortableDataTablesPage();
        Assert.assertTrue(sortableDataTablesPage.isWebsiteCorrect());
    }
}

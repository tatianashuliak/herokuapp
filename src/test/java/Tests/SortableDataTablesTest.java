package Tests;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SortableDataTablesPage;

import static Constants.PageUrls.*;

public class SortableDataTablesTest extends BaseTest {
    @Test
    @Description("Checking that last name in table is correct")
    public void table1LastNameTest() {
        SortableDataTablesPage sortableDataTablesPage = new SortableDataTablesPage(driver);
        sortableDataTablesPage.openSortableDataTablesPage();
        Assert.assertTrue(sortableDataTablesPage.isLastNameBach());
    }

    @Test
    @Description("Checking that first name in table is correct")
    public void table1FirstNameTest() {
        SortableDataTablesPage sortableDataTablesPage = new SortableDataTablesPage(driver);
        sortableDataTablesPage.openSortableDataTablesPage();
        Assert.assertTrue(sortableDataTablesPage.isFirstNameFrank());
    }

    @Test
    @Description("Checking that due in table is correct")
    public void table2DueTest() {
        SortableDataTablesPage sortableDataTablesPage = new SortableDataTablesPage(driver);
        sortableDataTablesPage.openSortableDataTablesPage();
        Assert.assertTrue(sortableDataTablesPage.isDue51$());
    }

    @Test
    @Description("Checking that website in table is correct")
    public void table2WebSiteTest() {
        SortableDataTablesPage sortableDataTablesPage = new SortableDataTablesPage(driver);
        sortableDataTablesPage.openSortableDataTablesPage();
        Assert.assertTrue(sortableDataTablesPage.isWebsiteCorrect());
    }
}

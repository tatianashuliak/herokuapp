package steps;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import pages.SortableDataTablesPage;

public class SortableDataTablesSteps {
    private static SortableDataTablesPage sortableDataTablesPage;

    @Step("User opens Sortable Data Tables Page")
    public static void openSortableDataTablesPage(WebDriver driver){
        sortableDataTablesPage = new SortableDataTablesPage(driver);
        sortableDataTablesPage.openSortableDataTablesPage();
    }
}

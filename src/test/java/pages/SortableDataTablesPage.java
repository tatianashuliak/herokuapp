package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static Constants.PageUrls.SORTABLE_DATA_TABLES_PAGE;

public class SortableDataTablesPage extends BasePage {
    @FindBy(xpath = "//table[@id='table1']//td[text()='fbach@yahoo.com']/preceding-sibling::td[2]")
    private WebElement LAST_NAME;
    @FindBy(xpath = "//table[@id='table1']//td[text()='fbach@yahoo.com']/preceding-sibling::td[1]")
    private WebElement FIRST_NAME;
    @FindBy(xpath = "//table[@id='table2']//td[text()='fbach@yahoo.com']/following-sibling::td[1]")
    private WebElement DUE;
    @FindBy(xpath = "//table[@id='table2']//td[text()='fbach@yahoo.com']/following-sibling::td[2]")
    private WebElement WEBSITE;

    public SortableDataTablesPage(WebDriver driver) {
        super(driver);
    }

    public void openSortableDataTablesPage() {
        driver.get(SORTABLE_DATA_TABLES_PAGE);
    }

    public boolean isLastNameBach() {
        return LAST_NAME.getText().equals("Bach");
    }

    public boolean isFirstNameFrank() {
        return FIRST_NAME.getText().equals("Frank");
    }

    public boolean isDue51$() {
        return DUE.getText().equals("$51.00");
    }

    public boolean isWebsiteCorrect() {
        return WEBSITE.getText().equals("http://www.frank.com");
    }

}

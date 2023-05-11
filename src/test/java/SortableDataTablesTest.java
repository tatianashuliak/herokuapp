import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import static Constants.PageUrls.*;

public class SortableDataTablesTest extends BaseTest {
    @Test
    public void table1LastNameTest() {
        driver.get(SORTABLE_DATA_TABLES_PAGE);
        WebElement name = driver.findElement(By.xpath("//table[@id='table1']//td[text()='fbach@yahoo.com']/preceding-sibling::td[2]"));
        Assert.assertTrue(name.getText().contains("Bach"));
    }

    @Test
    public void table1FirstNameTest() {
        driver.get(SORTABLE_DATA_TABLES_PAGE);
        WebElement firstName = driver.findElement(By.xpath("//table[@id='table1']//td[text()='fbach@yahoo.com']/preceding-sibling::td[1]"));
        Assert.assertTrue(firstName.getText().contains("Frank"));
    }

    @Test
    public void table2DueTest() {
        driver.get(SORTABLE_DATA_TABLES_PAGE);
        WebElement due = driver.findElement(By.xpath("//table[@id='table2']//td[text()='fbach@yahoo.com']/following-sibling::td[1]"));
        Assert.assertTrue(due.getText().contains("$51.00"));
    }

    @Test
    public void table2WebSiteTest() {
        driver.get(SORTABLE_DATA_TABLES_PAGE);
        WebElement webSite = driver.findElement(By.xpath("//table[@id='table2']//td[text()='fbach@yahoo.com']/following-sibling::td[2]"));
        Assert.assertTrue(webSite.getText().contains("http://www.frank.com"));
    }

}

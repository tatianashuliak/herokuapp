package Tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.InputsPage;

import static Constants.PageUrls.*;
public class InputsTest extends BaseTest {
    @Test(dataProvider = "testData")
    public void inputArrowUpTest(int numberOfInputs) {
        InputsPage inputsPage = new InputsPage(driver);
        inputsPage.openInputsPage();
        Assert.assertTrue(inputsPage.inputArrowUp(numberOfInputs), "Value wasn't entered");
    }


    @Test(dataProvider = "testData")
    public void inputArrowDownTest(int numberOfInputs) {
        InputsPage inputsPage = new InputsPage(driver);
        inputsPage.openInputsPage();
        Assert.assertTrue(inputsPage.inputArrowDown(numberOfInputs), "Value wasn't entered");
    }
    @DataProvider(name = "testData")
    public Object[][] inputArrowUp(){
        return new Object[][]{
                {1},
                {2},
                {3},
                {4}
        };
    }
}

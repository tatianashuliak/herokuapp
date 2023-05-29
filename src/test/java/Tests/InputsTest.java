package Tests;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.InputsPage;
import steps.InputsSteps;

public class InputsTest extends BaseTest {
    @Test(dataProvider = "testData")
    @Description("Click and input ArrowUp")
    public void inputArrowUpTest(int numberOfInputs) {
        InputsPage inputsPage = new InputsPage(driver);
        InputsSteps.openInputsPage(driver);
        Assert.assertTrue(inputsPage.inputArrowUp(numberOfInputs), "Value wasn't entered");
    }


    @Test(dataProvider = "testData")
    @Description("Click and input ArrowDown")
    public void inputArrowDownTest(int numberOfInputs) {
        InputsPage inputsPage = new InputsPage(driver);
        InputsSteps.openInputsPage(driver);
        Assert.assertTrue(inputsPage.inputArrowDown(numberOfInputs), "Value wasn't entered");
    }

    @DataProvider(name = "testData")
    public Object[][] inputArrowUp() {
        return new Object[][]{
                {1},
                {2},
                {3},
                {4}
        };
    }
}

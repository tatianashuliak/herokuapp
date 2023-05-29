package Tests;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FileUploadPage;
import steps.FileUploadSteps;

import static Constants.Texts.FILE_NAME;

public class FileUploadTest extends BaseTest {
    @Test
    @Description("Upload file to page")
    public void isFileUploadedTest() {
        FileUploadPage fileUploadPage = new FileUploadPage(driver);
        FileUploadSteps.openFileUploadPage(driver);
        String fileName = fileUploadPage.getFileName();
        Assert.assertTrue(fileName.equals(FILE_NAME));
    }
}

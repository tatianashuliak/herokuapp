package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FileUploadPage;

import static Constants.Texts.FILE_NAME;

public class FileUploadTest extends BaseTest {
    @Test
    public void isFileUploadedTest() {
        FileUploadPage fileUploadPage = new FileUploadPage(driver);
        fileUploadPage.openFileUploadPage();
        String fileName = fileUploadPage.getFileName();
        Assert.assertTrue(fileName.equals(FILE_NAME));
    }
}
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static Constants.PageUrls.FILE_UPLOAD_PAGE;

public class FileUploadPage extends BasePage {
    private By UPLOAD_BUTTON = By.id("file-upload");
    private By SUBMIT_BUTTON = By.id("file-submit");
    private By UPLOADED_FILES = By.id("uploaded-files");

    public FileUploadPage(WebDriver driver) {
        super(driver);
    }

    public void openFileUploadPage() {
        driver.get(FILE_UPLOAD_PAGE);
    }

    public String getFileName() {
        driver.findElement(UPLOAD_BUTTON).sendKeys(System.getProperty("user.dir").concat("/src/test/resources/photos/Are there still attractions in Europe that are open_.jpg"));
        driver.findElement(SUBMIT_BUTTON).click();
        String uploadedFileName = driver.findElement(UPLOADED_FILES).getText();
        return uploadedFileName;
    }

}

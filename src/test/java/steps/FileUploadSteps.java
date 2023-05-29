package steps;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import pages.FileUploadPage;

public class FileUploadSteps {
    private static FileUploadPage fileUploadPage;

    @Step("User opens File Upload page")
    public static void openFileUploadPage (WebDriver driver) {
        fileUploadPage = new FileUploadPage(driver);
        fileUploadPage.openFileUploadPage();
    }
}

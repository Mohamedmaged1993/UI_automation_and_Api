package pageObjects;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.objectRepo;
import org.testng.Reporter;
import java.io.File;
import java.io.IOException;

public class herokuHomePage {

    WebDriver driver;
    WebDriverWait wait;

    //create constructor
    public herokuHomePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(this.driver, 30);
    }

    //access to click on file upload text
      public herokuFileUploadPage clickOnFileUpload() {
        wait.until(ExpectedConditions.elementToBeClickable(objectRepo.fileUploadText));
        WebElement fileUploadTXT = driver.findElement(objectRepo.fileUploadText);
        fileUploadTXT.click();
        return new herokuFileUploadPage(driver);
    }

    //access to click on file upload text
    public herokuFileUploadPage clickOnDynamicloading() {
        wait.until(ExpectedConditions.elementToBeClickable(objectRepo.fileUploadText));
        WebElement fileUploadTXT = driver.findElement(objectRepo.fileUploadText);
        fileUploadTXT.click();
        return new herokuFileUploadPage(driver);
}

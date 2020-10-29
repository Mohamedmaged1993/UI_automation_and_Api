package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.objectRepo;

public class herokuHomePage {
    WebDriver driver;
    WebDriverWait wait;

    //create constructor
    public herokuHomePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(this.driver, 30);
    }


    //access to click on file upload text
    public void clickOnFileUpload() {
        wait.until(ExpectedConditions.elementToBeClickable(objectRepo.fileUploadText));
        WebElement fileUploadTXT = driver.findElement(objectRepo.fileUploadText);
        fileUploadTXT.click();
    }
}
package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.objectRepo;

public class herokuFileUploadPage {
    WebDriver driver;
    WebDriverWait wait;

    //create constructor
    public herokuFileUploadPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(this.driver, 30);
    }
    public void clickChooseFile() {
        wait.until(ExpectedConditions.elementToBeClickable(objectRepo.chooseFileLink));
        WebElement imageFile = driver.findElement(objectRepo.chooseFileLink);
        imageFile.click();
    }
    public void clickUploadBTN() {
        wait.until(ExpectedConditions.elementToBeClickable(objectRepo.fileUploadBTN));
        WebElement uploadBTN = driver.findElement(objectRepo.fileUploadBTN);
        uploadBTN.click();
    }

}

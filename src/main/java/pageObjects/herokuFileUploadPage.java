package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.objectRepo;

public class herokuFileUploadPage {
    WebDriver driver;
    WebDriverWait wait;
    public By inputField = By.id("file-upload");
    public By uploadButton = By.id("file-submit");
    public By uploadedFiles = By.id("uploaded-files");


    //create constructor
    public herokuFileUploadPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(this.driver, 30);
    }
    public void clickUploadButton(){
        driver.findElement(uploadButton).click();
    }

    /**
     * Provides path of file to the form then clicks Upload button
     * @param absolutePathOfFile The complete path of the file to upload
     */

    public void uploadFile(String absolutePathOfFile){
        driver.findElement(inputField).sendKeys(absolutePathOfFile);
        clickUploadButton();
    }

    /*
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
    public void uploadFile(String absoluteImagePath){
        wait.until(ExpectedConditions.elementToBeClickable(objectRepo.chooseFileLink));
         driver.findElement(objectRepo.chooseFileLink).sendKeys("absoluteImagePath");
         clickUploadBTN();
    }
    public String getUploadedFiles() {
        return driver.findElement(objectRepo.uploadedFileCheck).getText();

    }

     */

    }




package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class herokuFileUploadPage {
    WebDriver driver;
    WebDriverWait wait;

    //create constructor
    public herokuFileUploadPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(this.driver, 30);
    }
}

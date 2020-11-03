package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.objectRepo;

import java.util.List;

public class googleTestDataCheckPage {
    WebDriver driver;
    WebDriverWait wait;

    //create constructor
    public googleTestDataCheckPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(this.driver, 30);
    }

    //create method to select second option

    public void getListOfSearchResults(int i ) {
       List<WebElement> li = driver.findElements(objectRepo.textSelection);
       li.get(i).click();;
    }
}

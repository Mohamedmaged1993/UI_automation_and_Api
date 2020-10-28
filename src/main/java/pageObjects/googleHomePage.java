package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static utilities.objectRepo.searchField;

public class googleHomePage {
    WebDriver driver;
    WebDriverWait wait;

    //create constructor
    public googleHomePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(this.driver, 30);
    }
    // access to fill search field
    public void fillSearchData(String name) {
        driver.findElement(searchField).sendKeys(name);

    }

    // click on enter keyboard
    public void selectSearchField() {
        driver.findElement(searchField).sendKeys(Keys.ENTER);
    }
}


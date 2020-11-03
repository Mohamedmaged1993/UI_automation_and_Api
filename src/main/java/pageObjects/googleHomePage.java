package pageObjects;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import java.io.File;
import java.io.IOException;

import static utilities.objectRepo.searchField;

public class googleHomePage {
    WebDriver driver;
    WebDriverWait wait;

    //create constructor
    public googleHomePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(this.driver, 30);
    }
    // method to access to fill search field
    public void fillSearchData(String name) {
        driver.findElement(searchField).sendKeys(name);

    }

    // method to click on enter keyboard
    public void selectSearchField() {
        driver.findElement(searchField).sendKeys(Keys.ENTER);

    }
    // Function To Take ScreenShoots
    public void screenCapture() throws IOException {
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File screenshotName = new File("E:\\UI_automation_and_Api\\UI_automation_and_Api\\ScreenShots"+driver.getTitle()+ ".png");
        FileUtils.copyFile(src,screenshotName);
        Reporter.log("<br><img src='"+screenshotName+"' height = '400' width = '400'/> <br>");

    }
}


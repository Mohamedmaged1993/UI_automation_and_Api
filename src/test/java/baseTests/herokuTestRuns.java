package baseTests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.herokuFileUploadPage;
import pageObjects.herokuHomePage;
import utilities.propertiesConfig;

public class herokuTestRuns {
    WebDriver driver;
    WebDriverWait wait;
    herokuHomePage herokuhomepage;
    herokuFileUploadPage herokufileuploadpage;
    propertiesConfig propertiesconfig;
    int timeOut = 10;

    @BeforeClass
    public void beforeclass() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, timeOut);
        herokuhomepage = new herokuHomePage(driver);
        herokufileuploadpage = new herokuFileUploadPage(driver);
        propertiesconfig = new propertiesConfig();
        driver.get(propertiesconfig.getProperty("herokuUrl"));
    }

    @Test(priority = 1)
    public void successfulTest() {

        herokuhomepage.clickOnFileUpload();
        var uploadPage = herokuhomepage.clickOnFileUpload();
        uploadPage.uploadFile("E:\\UI_automation_and_Api\\UI_automation_and_Api\\src\\main\\resources\\share-icon.png");

    }

    @Test(priority = 1)
    public void dynamicLoading() {

        herokuhomepage.clickOnFileUpload();
    }
}
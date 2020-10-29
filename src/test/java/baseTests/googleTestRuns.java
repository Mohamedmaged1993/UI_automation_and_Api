package baseTests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.googleHomePage;
import pageObjects.googleTestDataCheckPage;
import utilities.propertiesConfig;

public class googleTestRuns {

    WebDriver driver;
    WebDriverWait wait;
    googleHomePage googlehomepage;
googleTestDataCheckPage testdatacheckpage;
    int timeOut = 10;
    propertiesConfig propertiesconfig;

    @BeforeClass
    public void beforeclass() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, timeOut);
        googlehomepage = new googleHomePage(driver);
        testdatacheckpage = new googleTestDataCheckPage(driver);
        propertiesconfig = new propertiesConfig();
        driver.get(propertiesconfig.getProperty("googleUrl"));
    }

    @Test(priority = 1)
    public void successfulTest() {

        googlehomepage.fillSearchData(propertiesconfig.getProperty("validSearchInput"));
        googlehomepage.selectSearchField();

    }
    @Test(priority = 2)
    public void heroukoApp(){


    }
}
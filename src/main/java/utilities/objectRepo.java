package utilities;

import org.openqa.selenium.By;

// public class includes configuration for all element locators in project

public class objectRepo {
    //google Home Page element locators
    public static By searchField = By.xpath("// input[contains(@class,'gLFyf gsfi')]");

    //Google selenium webdriver element locators
    public static By textSelection = By.xpath("//div[@id='rso']/div[@class='g']//div//a/h3");
///h3[@class='LC20lb DKV0Md']/span[contains(text(), 'What is Selenium WebDriver' )]






   //heroku Home Page element locators
    public static By fileUploadText = By.linkText("File Upload");

    //heroku file upload element locators
    public static By chooseFileLink = By.xpath("// input[contains(@id,'file-upload')]");
    public static By fileUploadBTN = By.xpath("// input[contains(@id,'file-submit')]");
    public static By uploadedFileCheck = By.xpath("// div[contains(@id,'uploaded-files')]");
}

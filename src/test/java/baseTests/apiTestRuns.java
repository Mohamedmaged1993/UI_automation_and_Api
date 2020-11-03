package baseTests;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.restassured.RestAssured;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.googleHomePage;
import pageObjects.googleTestDataCheckPage;
import utilities.propertiesConfig;

import java.io.IOException;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

public class apiTestRuns {
    @Test(priority = 1)
    public void getRequest() {
        RestAssured.baseURI = "https://cat-fact.herokuapp.com";
        given().
                queryParam("animal_type", "cat")
                .queryParam("amount", "1").
        when().
                request("GET", "/facts/random").
                then().log().body().statusCode(200);
    }




    }



package com.revature.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


@CucumberOptions(
        glue="com.revature.steps",
        features={
//                "src/test/resources/homePage.feature",
//                "src/test/resources/login.feature",
//                "src/test/resources/bookPage.feature",
//                "src/test/resources/userPage.feature",
                "src/test/resources/addReview.feature"}
)
public class TestRunner extends AbstractTestNGCucumberTests {

    public static WebDriver driver;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");

        driver = new ChromeDriver();
    }

    @AfterMethod
    public void quit() {
        driver.quit();
    }

}

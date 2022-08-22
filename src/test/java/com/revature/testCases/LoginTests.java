//package com.revature.testCases;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.WebDriver;
//import org.testng.Assert;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//import com.revature.pages.LoginPage;
//
//public class LoginTests {
//    public WebDriver driver;
//
//    @BeforeMethod
//    public void setup() {
//
//        WebDriverManager.chromedriver().setup();
//    }
//
//    @AfterMethod
//    public void tearDown() {
//        driver.quit();
//    }
//
//    @Test
//    public void test1(){
//        driver.get("");
//        LoginPage page = new LoginPage(driver);
//        page.usn().sendKeys("Bren");
//        page.pwd().sendKeys("tabaxi");
//        page.loginBtn().click();
//
//    }
//
//    @Test
//    public void test2() {
//        Assert.assertEquals(10, 10);
//    }
//
//}

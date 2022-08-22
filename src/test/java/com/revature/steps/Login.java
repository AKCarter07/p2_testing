package com.revature.steps;

import com.revature.pages.HomePage;
import com.revature.pages.LoginPage;
import com.revature.pages.UserPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import static com.revature.runner.TestRunner.driver;

public class Login {

    public HomePage homePage;
    public LoginPage loginPage;
    private String url = "ec2-3-95-211-243.compute-1.amazonaws.com";


    @Given ("I am on the login page")
    public void onLogin() {
        driver.get(String.format("http://%s/login.html", url));
        loginPage = new LoginPage(driver);
    }
    @When ("I type {string} into the username input")
    public void typeUsn(String usn){
        loginPage.typeUsername(usn);
    }
    @And ("I type {string} into the password input")
    public void typePwd(String pwd) {
        loginPage.typePassword(pwd);
    }
    @And ("I click the login button")
    public void clickLogin(){
        loginPage.clickLogin();
    }

    @Then ("I should be redirected to the home page")
    public void redirectedToHome(){
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(10));
        wdw.until(ExpectedConditions.urlToBe(String.format("http://%s/home.html", url)));
        Assert.assertEquals(driver.getCurrentUrl(), String.format("http://%s/home.html", url));
    }

}

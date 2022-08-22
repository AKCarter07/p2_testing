package com.revature.steps;

import com.revature.pages.HomePage;
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

public class Home {

    public HomePage homePage;
    public UserPage userPage;
    private String url = "ec2-3-95-211-243.compute-1.amazonaws.com";

    @Given("I am on the home page")
    public void iAmOnTheHomePage(){
        driver.get(String.format("http://%s/home.html", url));
        homePage = new HomePage(driver);
    }

    @When("I type {string} into the Search Users Box")
    public void iTypeAUsernameOf(String usn) {homePage.typeUsername(usn);}

    @And ("I click the search users button")
    public void iClickUserSearch() {homePage.clickSearchUser();}

    @Then("I should be redirected to the user page")
    public void iShouldBeRedirectedToTheUserPage() {
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(10));
        wdw.until(ExpectedConditions.urlToBe(String.format("http://%s/user.html", url)));
        Assert.assertEquals(driver.getCurrentUrl(), String.format("http://%s/user.html", url));
    }

    @When("I type {string} into the Search by Isbn Box")
    public void iTypeAnIsbnOf(String isbn) {homePage.typeIsbn(isbn);}

    @And ("I click the search by isbn button")
    public void iClickIsbnSearch() {homePage.clickSearchIsbn();}

    @Then("I should be redirected to the book page")
    public void iShouldBeRedirectedToTheBookPage() {
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(10));
        wdw.until(ExpectedConditions.urlToBe(String.format("http://%s/book-reviews-1.html", url)));
        Assert.assertEquals(driver.getCurrentUrl(), String.format("http://%s/book-reviews-1.html", url));
    }

}

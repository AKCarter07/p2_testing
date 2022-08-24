package com.revature.steps;

import com.revature.pages.AddReviewPage;
import com.revature.pages.BookPage;
import com.revature.pages.HomePage;
import com.revature.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import static com.revature.runner.TestRunner.driver;

public class AddReviewSteps {

    public AddReviewPage addReviewPage;
    public LoginPage loginPage;
    public HomePage homePage;
    public BookPage bookPage;
    private String url = "ec2-3-95-211-243.compute-1.amazonaws.com";

    @Given ("I am logged in as test user")
    public void loginAsTestUser(){
        driver.get(String.format("http://%s/login.html", url));
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        addReviewPage = new AddReviewPage(driver);
        bookPage = new BookPage(driver);
        loginPage.typeUsername("Bren");
        loginPage.typePassword("tabaxi");
        loginPage.clickLogin();
    }

    @And  ("I am on the add review page for an existing book")
    public void goToAddReviewPage(){
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(10));
        wdw.until(ExpectedConditions.elementToBeClickable(homePage.getIsbnSearch()));
        homePage.typeIsbn("1001");
        homePage.clickSearchIsbn();

        wdw.until(ExpectedConditions.elementToBeClickable(bookPage.getAddReviewButton()));
        bookPage.clickAddReviewButton();
    }
    @When ("I input a rating")
    public void addRating(){
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(10));
        wdw.until(ExpectedConditions.elementToBeClickable(addReviewPage.getSubmit()));
        addReviewPage.typeRating();


    }
    @And ("I input a review")
    public void addReview(){addReviewPage.typeReview();}
    @And ("I click submit")
    public void clickSubmit(){addReviewPage.clickSubmit();}
    @Then ("my review will be added to the book")
    public void reviewAdded(){
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(10));
        wdw.until(ExpectedConditions.urlToBe(String.format("http://%s/book-reviews-1.html", url)));
        Assert.assertEquals(driver.getCurrentUrl(), String.format("http://%s/book-reviews-1.html", url));

    }
}

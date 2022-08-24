package com.revature.steps;

import com.revature.pages.BookPage;
import com.revature.pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import static com.revature.runner.TestRunner.driver;

public class BookSteps {

    public BookPage bookPage;
    public HomePage homePage;

    private String url = "ec2-3-95-211-243.compute-1.amazonaws.com";

    @Given("I am on the page for a book in the database")
    public void onBookPage(){
        driver.get(String.format("http://%s/home.html", url));
        homePage = new HomePage(driver);
        bookPage = new BookPage(driver);
        homePage.typeIsbn("9780786966912");
        homePage.clickSearchIsbn();

    }
    @When("I click the add review button")
    public void clickReview(){
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(10));
        wdw.until(ExpectedConditions.elementToBeClickable(bookPage.getAddReviewButton()));
        bookPage.clickAddReviewButton();

    }
    @Then("I should be redirected to the add review page")
    public void redirectedToAddReview(){
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(10));
        wdw.until(ExpectedConditions.urlToBe(String.format("http://%s/add-review.html", url)));
        Assert.assertEquals(driver.getCurrentUrl(), String.format("http://%s/add-review.html", url));

    }


    @When ("I click on the name of a reviewer")
    public void clickReviewer(){
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(10));
        wdw.until(ExpectedConditions.elementToBeClickable(bookPage.getFirstReviewer()));
        bookPage.clickFirstReviewer();
    }
}

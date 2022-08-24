package com.revature.steps;

import com.revature.pages.BookPage;
import com.revature.pages.HomePage;
import com.revature.pages.UserPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import static com.revature.runner.TestRunner.driver;

public class UserSteps {
    public BookPage bookPage;
    public UserPage userPage;
    public HomePage homePage;

    private String url = "ec2-3-95-211-243.compute-1.amazonaws.com";


    @Given ("I am on a valid user page")
    public void onUserPage() {
        driver.get(String.format("http://%s/home.html", url));
        homePage = new HomePage(driver);
        userPage = new UserPage(driver);
        homePage.typeUsername("Elwy");
        homePage.clickSearchUser();
    }
    @When ("I click on the title of a book that has been reviewed")
    public void clickReviewedBook() {
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(10));
        wdw.until(ExpectedConditions.elementToBeClickable(userPage.getFirstBook()));
        userPage.clickFirstBook();
    }
    @Then ("I will be redirected to the page for that book")
    public void redirectedToBookPage() {
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(10));
        wdw.until(ExpectedConditions.urlToBe(String.format("http://%s/book-reviews-1.html", url)));
        Assert.assertEquals(driver.getCurrentUrl(), String.format("http://%s/book-reviews-1.html", url));

    }
}

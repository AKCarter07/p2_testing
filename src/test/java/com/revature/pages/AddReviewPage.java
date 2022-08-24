package com.revature.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AddReviewPage {
    private WebDriver driver;
    private WebDriverWait wdw;

    @FindBy(id="rating-input")
    private WebElement rating;

    @FindBy(id="review-input")
    private WebElement review;

    @FindBy(id="submit-btn")
    private WebElement submit;

    public AddReviewPage(WebDriver driver){
        this.driver = driver;
        this.wdw = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }

    public WebElement getRating() { return rating;}

    public WebElement getReview() { return review; }

    public WebElement getSubmit() { return submit; }

    public void typeRating() {rating.sendKeys("5");}

    public void typeReview() {
        review.sendKeys("This is an automatically generated review for testing purposes");
    }

    public void clickSubmit() { submit.click(); }
}

package com.revature.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BookPage {
    private WebDriver driver;
    private WebDriverWait wdw;
    @FindBy(id="add-review")
    private WebElement addReviewButton;
    @FindBy(xpath="//tbody//tr[1]/td[3]")
    private WebElement firstReviewer;

    public BookPage(WebDriver driver){
        this.driver = driver;
        this.wdw = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }

    public WebElement getAddReviewButton(){ return addReviewButton;}

    public void clickAddReviewButton(){ addReviewButton.click();}

    public WebElement getFirstReviewer(){return firstReviewer;}

    public void clickFirstReviewer(){firstReviewer.click();}

}

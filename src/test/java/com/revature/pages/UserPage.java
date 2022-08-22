package com.revature.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UserPage {
    private WebDriver driver;
    private WebDriverWait wdw;

    @FindBy(id="title")
    private WebElement title;

    @FindBy(xpath = "//tbody//tr[1]/td[1]")
    private WebElement firstBook;

    @FindBy(xpath = "//tbody//tr[1]/td[1]/p[1]")
    private WebElement firstBookTitle;

    public UserPage(WebDriver driver){
        this.driver = driver;
        this.wdw = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }

    public String getUsername(){ return title.getText(); }
}
